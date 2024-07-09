
package modelo;

import java.io.Serializable;


public class Cliente extends Usuario implements Serializable{
    
    private String email;
    private String contrasena;

    public Cliente(String nombre, String apellido, String cedula, String edad, String email, String contrasena) {
        super(nombre, apellido, cedula, edad);
        this.email = email;
        this.contrasena = contrasena;
        
                
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.contrasena = Contrasena;
    }
    
    
    
    

}
