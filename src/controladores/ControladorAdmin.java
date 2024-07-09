
package controladores;

public class ControladorAdmin {
    
     public ControladorAdmin(){        
    }
    
    public boolean validarAdmin(String nombre, String contrasena){
        if (nombre.equals("admin") && contrasena.equals("admin")) {
            return true;
        }
        return false;
    }

}
