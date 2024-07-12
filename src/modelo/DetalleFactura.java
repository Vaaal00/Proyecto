
package modelo;

import java.io.Serializable;

public class DetalleFactura implements Serializable {
    
    private Producto producto;
    private int cantidad;

    public DetalleFactura() {
    }

    public DetalleFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
