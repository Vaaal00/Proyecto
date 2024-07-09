
package modelo;

public class DetalleFactura {
    
    private int id;
    private Producto producto;
    private int cantidad;

    public DetalleFactura() {
    }

    public DetalleFactura(int id, Producto producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    
    

}
