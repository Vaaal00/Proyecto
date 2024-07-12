
package modelo;

import java.time.LocalDate;

public class EncargadoInventario extends Usuario {
    

    public EncargadoInventario(String nombre, String rol, LocalDate cumple, String email, String contrasena, int id, int edad, int telefono) {
        super(nombre,  rol, cumple, email, contrasena, id, edad, telefono);
    }
    

}
