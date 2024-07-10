
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
      
      
      public boolean login(int id, String password){
        
        if(id == idAdmin && password.equals(contraAdmin)){
            return true;
        }
        
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario aux = usuarios.get(i);
            if(id == aux.getId() && password.equals(aux.getContrasena())){
                Singleton.getINSTANCE().getUsuarios();
                return true;
            }
        }
        return false;
    }
    
    

}
