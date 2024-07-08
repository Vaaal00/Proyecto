
package serializadora;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Usuario;


public class Serializadora {

    public Serializadora() {       
    }
    
    public void escribirUsuario(ArrayList<Usuario> usuarios) {
        try {
           FileOutputStream archivo
                   = new FileOutputStream("usuarios.dat");
           ObjectOutputStream escritor
                   = new ObjectOutputStream(archivo);
           escritor.writeObject(usuarios);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    
    public ArrayList<Usuario> leerUsuario() {
        try {
            FileInputStream archivo
                    = new FileInputStream("usuarios.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Usuario>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}
