package modelo;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Inventario> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public ArrayList<Inventario> getItems() {
        return items;
    }

    public void agregarProducto(Inventario inventario) {
        items.add(inventario);
    }

    public void quitarProducto(Inventario inventario) {
        items.remove(inventario);
    }
}