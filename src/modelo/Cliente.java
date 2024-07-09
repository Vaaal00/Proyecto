
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class Cliente extends Usuario  {
    private int puntosAcumulados;
    ArrayList<RedencionPuntos> historialRedenciones = new ArrayList<>();

    public Cliente(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public Cliente(int puntosAcumulados, String rol, int id, String email, String contrasena, int telefono, String nombre, LocalDate fechaNacimiento, int edad) {
        super(rol, id, email, contrasena, telefono, nombre, fechaNacimiento, edad);
        this.puntosAcumulados = puntosAcumulados;
    }
    
    
   
    

}
