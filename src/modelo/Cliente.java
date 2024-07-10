package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Cliente extends Usuario implements Serializable {

    public Cliente() {
    }

    public Cliente(String nombre, String email, String contrasena, String rol, LocalDate cumple,int id) {
        super(nombre,  rol, cumple, email, contrasena, id);

    }

}
