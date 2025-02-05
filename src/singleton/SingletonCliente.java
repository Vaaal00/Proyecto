
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Cliente;


public class SingletonCliente {

    private static final SingletonCliente INSTANCIA = new SingletonCliente();
    
    private ArrayList<Cliente> clientes;

    private SingletonCliente() {
        clientes = leerCliente();
    }

    public static SingletonCliente getINSTANCIA() {
        return INSTANCIA;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
        public void escribirCliente() {
        try {
            FileOutputStream archivo
                   = new FileOutputStream("clientes.dat");
            ObjectOutputStream escritor
                   = new ObjectOutputStream(archivo);
            escritor.writeObject(clientes);
        } catch (IOException ex) {
//           ex.printStackTrace();
        }
    }
    
    public ArrayList<Cliente> leerCliente() {
        try {
            FileInputStream archivo
                    = new FileInputStream("clientes.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Cliente>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
    
    
}
