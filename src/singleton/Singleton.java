
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Usuario;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private ArrayList<Usuario> usuarios;
    

    private Singleton() {
        
        usuarios = leerUsuarios();
    }
    
    public static Singleton getINSTANCE() {
        return INSTANCE;
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void guardarUsuario(){
        try{
            FileOutputStream file = new  FileOutputStream("usuarios.dat");
            ObjectOutputStream writer = new ObjectOutputStream(file);
            writer.writeObject(usuarios);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    private ArrayList<Usuario> leerUsuarios(){
        try{
            FileInputStream file = new  FileInputStream("usuarios.dat");
            ObjectInputStream reader = new ObjectInputStream(file);
            return (ArrayList<Usuario>)reader.readObject();
        } catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return new ArrayList<>();
            
        }
        
    }
    
    

}
