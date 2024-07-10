
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Producto;


public class SingletonProducto {

    private static final SingletonProducto INSTANCIA = new SingletonProducto();
    
    private ArrayList<Producto> productos;

    private SingletonProducto() {
        productos = leerProducto();
    }

    public static SingletonProducto getINSTANCIA() {
        return INSTANCIA;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
        public void escribirProducto() {
        try {
            FileOutputStream archivo
                   = new FileOutputStream("productos.dat");
            ObjectOutputStream escritor
                   = new ObjectOutputStream(archivo);
            escritor.writeObject(productos);
        } catch (IOException ex) {
//           ex.printStackTrace();
        }
    }
    
    public ArrayList<Producto> leerProducto() {
        try {
            FileInputStream archivo
                    = new FileInputStream("productos.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Producto>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}
