
package modelo;

import java.time.LocalDate;


public class Proveedor extends Usuario {

    private Empresa empresa;

    public Proveedor() {
    }

    public Proveedor(String nombre, String apellido, String cedula, String edad, Empresa empresa) {
        super(nombre, apellido, cedula, edad);
        this.empresa = empresa;
        
        
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
}
