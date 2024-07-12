package controladores;

import java.util.ArrayList;
import modelo.Inventario;
import modelo.Producto;
import singleton.SingletonInventario;
import singleton.SingletonProducto;

public class ControladorInPru {

    private ArrayList<Inventario> inventarios;
    private ArrayList<Producto> productos;

    public ControladorInPru() {
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
                inventarios.get(i).setCantidad(inventarios.get(i).getCantidad() + cantidad);
                return true;
            }
        }
        // Si el producto no está en el inventario, agregarlo
        inventarios.add(new Inventario(producto, cantidad));
        return true;
    }
}