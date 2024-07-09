
package modelo;

import java.io.Serializable;
import java.util.Date;


public class Producto implements Serializable {

    private String nombre;
    private int codigo;
    private Categoria categoria;
    private float precio;
    private Date fechaVencimiento;
    private Proveedor proveedor;

    public Producto() {       
    }

    public Producto(String nombre, int codigo, Categoria categoria, float precio, Date fechaVencimiento, 
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

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    
}
