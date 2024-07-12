package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario {
    
    private int puntos;
    private ArrayList<Factura> historialFacturas;
    
    public Cliente() {
    }

    public Cliente(String nombre, String email, String contrasena, String rol, LocalDate cumple,int id) {
        super(nombre,  rol, cumple, email, contrasena, id);
        historialFacturas = new ArrayList<>();
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Factura> getHistorialFacturas() {
        return historialFacturas;
    }

    public void setHistorialFacturas(ArrayList<Factura> historialFacturas) {
        this.historialFacturas = historialFacturas;
    }

}
