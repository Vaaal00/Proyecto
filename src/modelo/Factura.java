
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Factura implements Serializable {

    private Cajero cajero;
    private Cliente cliente;
    private LocalDate fecha;
    private int numeroVenta;
    private float total;
    private ArrayList<DetalleFactura> detalles;

    public Factura() {
    }

    public Factura(Cajero cajero, Cliente cliente, LocalDate fecha, int numeroVenta, float total, 
            ArrayList<DetalleFactura> detalles) {
        this.cajero = cajero;
        this.cliente = cliente;
        this.fecha = fecha;
        this.numeroVenta = numeroVenta;
        this.total = total;
        this.detalles = detalles;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<DetalleFactura> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleFactura> detalles) {
        this.detalles = detalles;
    }
    
    
}
