
package modelo;

import java.time.LocalDate;

public class EncargadoInventario extends Usuario {

    public EncargadoInventario() {
    }

    public EncargadoInventario(String rol, int id, String email, String contrasena, int telefono, String nombre, 
            LocalDate fechaNacimiento, int edad) {
        super(rol, id, email, contrasena, telefono, nombre, fechaNacimiento, edad);
    }

    
}
