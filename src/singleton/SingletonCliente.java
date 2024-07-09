
package singleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import modelo.Cliente;

public class SingletonCliente {
    private final String NOMBRE_ARCHIVO = "Clientes.ax";
    private static SingletonCliente INSTANCIA;
    public ArrayList<Cliente> clientes;

    public SingletonCliente() {
        clientes = new ArrayList<>();
    }

    public static SingletonCliente getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new SingletonCliente();

        }
        return INSTANCIA;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void escribirObjeto() {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO));
            salida.writeObject(clientes);
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(SingletonCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Cliente> leerObjeto() {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO));
            clientes = (ArrayList<Cliente>) entrada.readObject();
            entrada.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(SingletonCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

}
