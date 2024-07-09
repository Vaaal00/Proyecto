package controladores;


import excepciones.YaRegistradoException;
import java.util.ArrayList;
import modelo.Cliente;
import singleton.SingletonCliente;

public class ControladorCliente {

    private ArrayList<Cliente> clientes;

    public ControladorCliente() {
        clientes = SingletonCliente.getINSTANCIA().getClientes();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void guardarCliente(Cliente cliente)
        throws YaRegistradoException {
        Cliente aux = buscarCliente(cliente.getCedula());
        if (aux == null) {
            clientes.add(cliente);
            SingletonCliente.getINSTANCIA().escribirCliente();
        } else {
            throw new YaRegistradoException();
        }
    }

    public Cliente buscarCliente(int cedula) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula() == cedula) {
                return clientes.get(i);
            }
        }
        return null;
    }

    public boolean editarCliente(Cliente cliente) {
        Cliente aux = buscarCliente(cliente.getCedula());
        if (aux != null) {
            aux.setNombre(cliente.getNombre());
            aux.setApellido(cliente.getApellido());
            aux.setEdad(cliente.getEdad());
            aux.setEmail(cliente.getEmail());
            aux.setContrasena(cliente.getContrasena());
            SingletonCliente.getINSTANCIA().escribirCliente();
            return true;
        }
        return false;
    }

    public boolean eliminarCliente(int cedula) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula() == cedula) {
                clientes.remove(i);
                SingletonCliente.getINSTANCIA().escribirCliente();
                return true;
            }
        }
        return false;
    }

    public boolean validarIngresoCliente(String nombre, String contrasena) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(nombre)
                    && clientes.get(i).getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarCedulaCliente(int cedula) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula() == cedula) {
                return true;
            }
        }
        return false;
    }

    public Cliente buscarClienteSolo() {
        for (int i = 0; i < clientes.size(); i++) {
            return clientes.get(i);
        }
        return null;
    }

}
