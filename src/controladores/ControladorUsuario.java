
package controladores;

import excepciones.IdEx;
import excepciones.MenorEdadEx;
import excepciones.UsuarioNoEncontradoEx;
import java.util.ArrayList;
import modelo.Usuario;
import singleton.Singleton;

public class ControladorUsuario {
    
    private ArrayList<Usuario> usuarios;

    public ControladorUsuario() {
        
        usuarios = Singleton.getINSTANCE().getUsuarios();
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public Usuario buscarUsuario(int id) {
        
        for (Usuario user : usuarios) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }
    
    public void agregarUsuario(Usuario usuario) throws MenorEdadEx, IdEx{
        Usuario aux = buscarUsuario(usuario.getId());
        if (aux == null) {
            if((usuario.getRol().equals("Cajero") || usuario.getRol().equals("Administrador inventario")) && usuario.getEdad(usuario.getCumple()) < 18){
                throw new MenorEdadEx();
            }
            usuarios.add(usuario);
            Singleton.getINSTANCE().guardarUsuario();
        }else{
            throw new IdEx();
        }
        
        
        
    }
    
    public void actualizarUsuario(Usuario usuario) throws UsuarioNoEncontradoEx {
        Usuario aux = buscarUsuario(usuario.getId());

        if (aux == null) {
            throw new UsuarioNoEncontradoEx();
        }

        aux.setNombre(usuario.getNombre());
        
        aux.setRol(usuario.getRol());
        aux.setCumple(usuario.getCumple());
        aux.setEmail(usuario.getEmail());
        aux.setContrasena(usuario.getContrasena());
        Singleton.getINSTANCE().guardarUsuario();

    }
    
    public boolean eliminarUsuario(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId()== id) {
                usuarios.remove(i);
                Singleton.getINSTANCE().guardarUsuario();
                return true;
            }
        }
        return false;
    }


  

}
