
package controladores;

import excepciones.CategoriaEx;
import java.util.ArrayList;
import modelo.Categoria;
import singleton.SingletonCategoria;


public class ControladorCategoria {

    private ArrayList<Categoria> categorias;

    public ControladorCategoria() {
        categorias = SingletonCategoria.getINSTANCIA().getCategorias();             
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    
    public Categoria buscarCategoria(int id) {
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getId()== id) {
                return categorias.get(i);
            }
        }
        return null;
    }
    
    public void agregarCategoria(Categoria categoria) 
            throws CategoriaEx {                   
        Categoria aux = buscarCategoria(categoria.getId());
        if (aux == null) {
            categorias.add(categoria);
            SingletonCategoria.getINSTANCIA().escribirCategoria();
        }else{
            throw new CategoriaEx();
        }
    }
    
    public boolean editarCategoria(Categoria categoria) {
        Categoria aux = buscarCategoria(categoria.getId());
        if (aux != null) {
            aux.setDescripcion(categoria.getDescripcion());
            aux.setNombre(categoria.getNombre());
            SingletonCategoria.getINSTANCIA().escribirCategoria();
            return true;
        }
        return false;
    }
    
    public boolean eliminarCategoria(int id) {
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getId()== id) {
                categorias.remove(i);
                SingletonCategoria.getINSTANCIA().escribirCategoria();
                return true;
            }
        }
        return false;
    }
}
