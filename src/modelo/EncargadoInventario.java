
package modelo;

import java.time.LocalDate;

public class EncargadoInventario extends Usuario {
    private String formacion;
    

    public EncargadoInventario(String nombre, String rol, LocalDate cumple, String email, String contrasena, int id,  int telefono, String formacion) {
        super(nombre,  rol, cumple, email, contrasena, id,  telefono);
        this.formacion = formacion;
    }
    

}
