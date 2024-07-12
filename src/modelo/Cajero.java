package modelo;

import java.time.LocalDate;

public class Cajero extends Usuario {
    
    private String tiempoExperiencia;

    public Cajero() {       
    }
    
    public Cajero(String nombre, String rol, String email, String contrasena, LocalDate cumple, int id, 
            String tiempoExperiencia,  int telefono) {
        super(nombre,  rol, cumple, email, contrasena, id,  telefono);
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

}
