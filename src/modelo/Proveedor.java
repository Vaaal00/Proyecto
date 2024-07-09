
package modelo;

import java.time.LocalDate;


public class Proveedor extends Usuario {

    private Empresa empresa;

    public Proveedor() {
    }

    public Proveedor(Empresa empresa, String rol, int id, String email, String contrasena, int telefono, 
            String nombre, LocalDate fechaNacimiento, int edad) {
        super(rol, id, email, contrasena, telefono, nombre, fechaNacimiento, edad);
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
}
