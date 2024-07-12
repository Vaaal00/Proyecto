
package controladores;

import java.util.ArrayList;
import modelo.Usuario;
import singleton.Singleton;

public class ControladorLogin {
   
    ArrayList<Usuario> usuarios;
    int idAdmin;
    String contraAdmin;

    public ControladorLogin() {
        idAdmin = 123;
        contraAdmin = "admin";
        usuarios = Singleton.getINSTANCE().getUsuarios();
    }
    
     public ArrayList<Usuario> getUsuarios() {
        return usuarios;        
    }
 
      public int getIdAdmin() {
        return idAdmin;
    }
    
      public String getContraAdmin() {
        return contraAdmin;
    }
           
    public boolean inicio(Usuario usuario, int id, String contrasena) {
        if (id == idAdmin && contrasena == contraAdmin) {
            return true;
        }
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getId() == id && usuarios.get(i).getContrasena() == contrasena) {
                return true;
            }
        }
        return false;
    }
    
}
