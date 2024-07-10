package modelo;

import java.time.LocalDate;

public class Cajero extends Usuario {

    public Cajero() {
    }

    public Cajero(String nombre, String rol, String email, String contrasena, LocalDate cumple, int id) {
        super(nombre,  rol, cumple, email, contrasena, id);
    }

}
