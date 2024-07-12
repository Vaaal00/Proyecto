
package controladores;

import java.util.ArrayList;
import modelo.Inventario;
import modelo.Producto;
import singleton.SingletonInventario;
import singleton.SingletonProducto;


public class ControladorInventario {

    private ArrayList<Inventario> inventarios;
    private ArrayList<Producto> productos;

    public ControladorInventario() {
        inventarios = SingletonInventario.getINSTANCIA().getInventarios(); 
        productos = SingletonProducto.getINSTANCIA().getProductos();
    }

    public ArrayList<Inventario> getInventarios() {
        return inventarios;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public boolean agregarProducto(Producto producto, int cantidad) {                   
        for (int i = 0; i < inventarios.size(); i++) {
            if (inventarios.get(i).getProducto().getCodigo() == producto.getCodigo()) {
                inventarios.get(i).setCantidad(cantidad);
            }
        }
        return false;        
    }
    
}
