
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Inventario;


public class SingletonInventario {

    private static final SingletonInventario INSTANCIA = new SingletonInventario();
    
    private ArrayList<Inventario> inventarios;

    private SingletonInventario() {
        inventarios = leerInventario();
    }

    public static SingletonInventario getINSTANCIA() {
        return INSTANCIA;
    }

    public ArrayList<Inventario> getInventarios() {
        return inventarios;
    }
    
        public void escribirInventario() {
        try {
            FileOutputStream archivo
                   = new FileOutputStream("inventarios.dat");
            ObjectOutputStream escritor
                   = new ObjectOutputStream(archivo);
            escritor.writeObject(inventarios);
        } catch (IOException ex) {
//           ex.printStackTrace();
        }
    }
    
    public ArrayList<Inventario> leerInventario() {
        try {
            FileInputStream archivo
                    = new FileInputStream("inventarios.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Inventario>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}
