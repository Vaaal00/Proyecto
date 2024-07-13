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
                inventarios.get(i).setCantidad(inventarios.get(i).getCantidad() + cantidad);
                SingletonInventario.getINSTANCIA().escribirInventario();
                return true;
            }
        }
        // Si el producto no está en el inventario, agregarlo
        inventarios.add(new Inventario(producto, cantidad));
        SingletonInventario.getINSTANCIA().escribirInventario();
        return true;
    }
    
    public boolean eliminarProducto(int codigoProducto) {
        for (int i = 0; i < inventarios.size(); i++) {
            if (inventarios.get(i).getProducto().getCodigo() == codigoProducto) {
                inventarios.remove(i);
                SingletonInventario.getINSTANCIA().escribirInventario();
                return true;
            }
        }
        return false;
    }
    
    public boolean restarStock(Producto producto, int cantidad) {
        for (Inventario inventario : inventarios) {
            if (inventario.getProducto().getCodigo() == producto.getCodigo()) {
                if (inventario.getCantidad() >= cantidad) {
                    inventario.setCantidad(inventario.getCantidad() - cantidad);
                    SingletonInventario.getINSTANCIA().escribirInventario(); // Guardar cambios
                    return true;
                }
            }
        }
        return false; // No hay suficiente stock
    }
}