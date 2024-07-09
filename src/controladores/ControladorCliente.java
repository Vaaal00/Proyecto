package controladores;


import modelo.Cliente;
import singleton.SingletonCliente;

public class ControladorCliente {

    SingletonCliente instancia;

    public ControladorCliente() {
        instancia = SingletonCliente.getInstancia();
    }

    public boolean guardarCliente(Cliente cliente) {
        Cliente aux = buscarCliente(cliente.getCedula());
        if (aux == null) {
            instancia.getClientes().add(cliente);
            instancia.escribirObjeto();
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String cedula) {
        for (int i = 0; i < instancia.leerObjeto().size(); i++) {
            if (instancia.leerObjeto().get(i).getCedula().equals(cedula)) {
                return instancia.leerObjeto().get(i);
            }
        }
        return null;
    }

    public boolean editarCliente(Cliente cliente) {
        for (int i = 0; i < instancia.leerObjeto().size(); i++) {
            if (instancia.leerObjeto().get(i).getCedula().equals(cliente.getCedula())) {
                instancia.leerObjeto().set(i, cliente);
                instancia.escribirObjeto();
                return true;
            }
        }
        return false;
    }

    public boolean eliminarCliente(String cedula) {
        for (int i = 0; i < instancia.leerObjeto().size(); i++) {
            if (instancia.leerObjeto().get(i).getCedula().equals(cedula)) {
                instancia.leerObjeto().remove(i);
                instancia.escribirObjeto();
                return true;
            }
        }
        return false;
    }

    public boolean validarIngresoCliente(String nombre, String contrasena) {
        for (int i = 0; i < instancia.leerObjeto().size(); i++) {
            if (instancia.leerObjeto().get(i).getNombre().equals(nombre)
                    && instancia.leerObjeto().get(i).getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarCedulaCliente(String cedula) {
        for (int i = 0; i < instancia.leerObjeto().size(); i++) {
            if (instancia.leerObjeto().get(i).getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public Cliente buscarPacienteSolo() {
        for (int i = 0; i < instancia.leerObjeto().size(); i++) {
            return instancia.leerObjeto().get(i);
        }
        return null;
    }

}
