
package controladores;

import excepciones.ProductoEx;
import java.util.ArrayList;
import modelo.Producto;
import singleton.SingletonProducto;


public class ControladorProducto {

    private ArrayList<Producto> productos;
    private ControladorInventario controladorInventario;

    public ControladorProducto(ControladorInventario controladorInventario) {
        this.controladorInventario = controladorInventario;
        productos = SingletonProducto.getINSTANCIA().getProductos();             
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public Producto buscarProducto(int codigo) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo()== codigo) {
                return productos.get(i);
            }
        }
        return null;
    }
    
    public void agregarProducto(Producto producto) 
            throws ProductoEx {                   
        Producto aux = buscarProducto(producto.getCodigo());
        if (aux == null) {
            productos.add(producto);
            SingletonProducto.getINSTANCIA().escribirProducto();
        }else{
            throw new ProductoEx();
        }
    }
    
    public boolean editarProducto(Producto producto) {
        Producto aux = buscarProducto(producto.getCodigo());
        if (aux != null) {
            aux.setNombre(producto.getNombre());
            aux.setFechaVencimiento(producto.getFechaVencimiento());
            aux.setPrecio(producto.getPrecio());
            aux.setProveedor(producto.getProveedor());
            SingletonProducto.getINSTANCIA().escribirProducto();
            return true;
        }
        return false;
    }
    
    public boolean eliminarProducto(int codigo) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                productos.remove(i);
                SingletonProducto.getINSTANCIA().escribirProducto();
                controladorInventario.eliminarProducto(codigo);
                return true;
            }
        }
        return false;
    }
}
