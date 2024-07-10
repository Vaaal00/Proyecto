
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Usuario;


public class Serializadora {

    private Serializadora() {
    }
    
    public void escribirCliente(ArrayList<Cliente> clientes) {
        try {
           FileOutputStream archivo
                   = new FileOutputStream("clientes.dat");
           ObjectOutputStream escritor
                   = new ObjectOutputStream(archivo);
           escritor.writeObject(clientes);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    
    private ArrayList<Cliente> leerCliente() {
        try {
            FileInputStream archivo
                    = new FileInputStream("clientes.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Cliente>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
    
    
}
