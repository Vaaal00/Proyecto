
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Categoria;


public class SingletonCategoria {

    private static final SingletonCategoria INSTANCIA = new SingletonCategoria();
    
    private ArrayList<Categoria> categorias;

    private SingletonCategoria() {
        categorias = leerCategoria();
    }

    public static SingletonCategoria getINSTANCIA() {
        return INSTANCIA;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    
        public void escribirCategoria() {
        try {
            FileOutputStream archivo
                   = new FileOutputStream("categorias.dat");
            ObjectOutputStream escritor
                   = new ObjectOutputStream(archivo);
            escritor.writeObject(categorias);
        } catch (IOException ex) {
//           ex.printStackTrace();
        }
    }
    
    public ArrayList<Categoria> leerCategoria() {
        try {
            FileInputStream archivo
                    = new FileInputStream("categorias.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Categoria>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
