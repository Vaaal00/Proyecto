package modelo;

import java.time.LocalDate;


public class Proveedor extends Usuario {

    private Empresa empresa;

    public Proveedor() {
    }

    public Proveedor(String nombre,   Empresa empresa,String contrasena, String email, LocalDate cumple, String rol, int id, int edad, int telefono) {
        super(nombre, rol, cumple, email, contrasena, id, edad, telefono);
        this.empresa = empresa;
        
        
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
}