
package controladores;

import excepciones.IdExcepcion;
import java.util.ArrayList;
import modelo.Usuario;
import serializadora.Singleton;


public class ControladorUsuario {

    private ArrayList<Usuario> usuarios;
    
    public ControladorUsuario() {
        usuarios = Singleton.getINSTANCIA().getUsuarios();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public Usuario buscarUsuario(int codigo) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == codigo) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    public void agregarUsuario(Usuario usuario)
        throws IdExcepcion {
        Usuario aux = buscarUsuario(usuario.getId());
        if (aux == null) {
            usuarios.add(usuario);           
            Singleton.getINSTANCIA().escribirUsuario();
        }else{
            throw new IdExcepcion();
        }
    }

    public boolean editarUsuario(Usuario usuario) {
        Usuario aux = buscarUsuario(usuario.getId());
        if (aux != null) {
            aux.setId(usuario.getId());
            aux.setContrasena(usuario.getContrasena());
            aux.setNombre(usuario.getNombre());
            aux.setFechaNacimiento(usuario.getFechaNacimiento());
            if (usuario.getRol() == "Docente") {
                Docente docente = (Docente) usuario;
                docente.setProfesion(docente.getProfesion());
            }else if (usuario.getRol() == "Estudiante") {
                Estudiante estudiante = (Estudiante) usuario;
                estudiante.setPrograma(estudiante.getPrograma());
            }else if (usuario.getRol() == "AdministradorLaboratorio") {
                AdministradorLaboratorio administradorLaboratorio = (AdministradorLaboratorio) usuario;
                administradorLaboratorio.setTipoContrato(administradorLaboratorio.getTipoContrato());
            }
            Singleton.getINSTANCIA().escribirUsuario();
            return true;
        }
        return false;
    }

    public boolean eliminarUsuario(int codigo) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == codigo) {
                usuarios.remove(i);
                Singleton.getINSTANCIA().escribirUsuario();
                return true;
            }
        }
        return false;
    }  
}
