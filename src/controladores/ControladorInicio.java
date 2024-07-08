
package controladores;

import java.util.ArrayList;
import modelo.Usuario;
import serializadora.Singleton;


public class ControladorInicio {

    private ArrayList<Usuario> usuarios;
    private int idAdmin;
    private String contrasenaAdmin;

    public ControladorInicio() {
        idAdmin = 123;
        contrasenaAdmin = "admin";
        usuarios = Singleton.getINSTANCIA().getUsuarios();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public String getContrasenaAdmin() {
        return contrasenaAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }
     
    public boolean inicio(Usuario usuario, int id, String contrasena) {
        if (id == idAdmin && contrasena == contrasenaAdmin) {
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
