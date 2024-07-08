
package serializadora;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Usuario;


public class Singleton {

    private static final Singleton INSTANCIA = new Singleton();
    
    private ArrayList<Usuario> usuarios;
    
    private Singleton() {
        usuarios = leerUsuario();
    }
        
    public static Singleton getINSTANCIA() {
        return INSTANCIA;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void escribirUsuario() {
        try {
            FileOutputStream archivo
                   = new FileOutputStream("usuarios.dat");
            ObjectOutputStream escritor
                   = new ObjectOutputStream(archivo);
            escritor.writeObject(usuarios);
        } catch (IOException ex) {
//           ex.printStackTrace();
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
//            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}
