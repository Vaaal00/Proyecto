
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


public class Producto implements Serializable {

    private String nombre;
    private int codigo;
    private Categoria categoria;
    private float precio;
    private LocalDate fechaVencimiento;
    private Proveedor proveedor;

    public Producto() {       
    }

    public Producto(String nombre, int codigo, Categoria categoria, float precio, LocalDate fechaVencimiento, 
            Proveedor proveedor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
