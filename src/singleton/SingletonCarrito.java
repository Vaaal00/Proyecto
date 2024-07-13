package singleton;

import java.io.*;
import java.util.ArrayList;
import modelo.Inventario;

public class SingletonCarrito {

    private static final SingletonCarrito INSTANCIA = new SingletonCarrito();
    private ArrayList<Inventario> carrito;

    private SingletonCarrito() {
        carrito = leerCarrito();
    }

    public static SingletonCarrito getINSTANCIA() {
        return INSTANCIA;
    }

    public ArrayList<Inventario> getCarrito() {
        return carrito;
    }

    public void escribirCarrito() {
        try (FileOutputStream archivo = new FileOutputStream("carrito.dat");
             ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
            escritor.writeObject(carrito);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Inventario> leerCarrito() {
        try (FileInputStream archivo = new FileInputStream("carrito.dat");
             ObjectInputStream lector = new ObjectInputStream(archivo)) {
            return (ArrayList<Inventario>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
}
