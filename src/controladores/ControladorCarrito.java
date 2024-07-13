package controladores;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.Inventario;
import singleton.SingletonInventario;
import singleton.SingletonCarrito;

public class ControladorCarrito {

    private ArrayList<Inventario> carrito;
    private ControladorInventario controladorInventario;

    public ControladorCarrito() {
        carrito = SingletonCarrito.getINSTANCIA().getCarrito(); // Usar el singleton
        controladorInventario = new ControladorInventario();
    }

    public ArrayList<Inventario> getCarrito() {
        return carrito;
    }

    public boolean agregarAlCarrito(Producto producto, int cantidad) {
       
        if (controladorInventario.restarStock(producto, cantidad)) {
            // Verificar si el producto ya está en el carrito
            for (Inventario item : carrito) {
                if (item.getProducto().getCodigo() == producto.getCodigo()) {
                    // Si el producto ya está en el carrito, solo aumentar la cantidad
                    item.setCantidad(item.getCantidad() + cantidad);
                    SingletonCarrito.getINSTANCIA().escribirCarrito(); // Actualizar el carrito
                    return true;
                }
            }
            // Si el producto no está en el carrito, agregarlo
            carrito.add(new Inventario(producto, cantidad));
            SingletonCarrito.getINSTANCIA().escribirCarrito(); // Actualizar el carrito
            return true;
        }
        return false; // No se pudo agregar al carrito debido a stock insuficiente
    }

    public boolean eliminarDelCarrito(Producto producto, int cantidad) {
    for (int i = 0; i < carrito.size(); i++) {
        Inventario item = carrito.get(i);
        
        // Comprobar si el producto en el carrito coincide con el producto a eliminar
        if (item.getProducto().getCodigo() == producto.getCodigo()) {
            // Validar que la cantidad a quitar no sea mayor que la que hay en el carrito
            if (cantidad > item.getCantidad()) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar más cantidad de la que hay en el carrito. Solo hay " + item.getCantidad() + " en el carrito."); // Mensaje de error
                return false; // No se puede eliminar
            }
            
            if (cantidad >= item.getCantidad()) {
                // Si se está eliminando toda la cantidad, quitar el producto del carrito
                carrito.remove(i);
            } else {
                // Si solo se reduce la cantidad, restar del carrito
                item.setCantidad(item.getCantidad() - cantidad);
            }
            // Actualizar el inventario agregando la cantidad de vuelta
            controladorInventario.agregarProducto(item.getProducto(), cantidad);
            return true; // Producto eliminado o cantidad ajustada en el carrito
        }
    }
    return false; // Producto no encontrado en el carrito
}

    public void vaciarCarrito() {
        carrito.clear(); // Vaciar el carrito
        SingletonCarrito.getINSTANCIA().escribirCarrito(); // Actualizar el carrito
    }
    
    public float calcularTotal() {
        float total = 0;
        for (Inventario item : carrito) {
            total += item.getProducto().getPrecio() * item.getCantidad();
        }
        return total; // Retornar el total del carrito
    }
    
    public ArrayList<Inventario> obtenerInventariosDelCarrito() {
    return SingletonCarrito.getINSTANCIA().getCarrito();
}
}
