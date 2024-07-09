
package modelo;

import java.time.LocalDate;

public class RedencionPuntos {
    
    private LocalDate fecha;
    private int puntosCanjeados;
    private double descuentoCanjeado;

    public RedencionPuntos() {
    }

    public RedencionPuntos(LocalDate fecha, int puntosCanjeados, double descuentoCanjeado) {
        this.fecha = fecha;
        this.puntosCanjeados = puntosCanjeados;
        this.descuentoCanjeado = descuentoCanjeado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPuntosCanjeados() {
        return puntosCanjeados;
    }

    public void setPuntosCanjeados(int puntosCanjeados) {
        this.puntosCanjeados = puntosCanjeados;
    }

    public double getDescuentoCanjeado() {
        return descuentoCanjeado;
    }

    public void setDescuentoCanjeado(double descuentoCanjeado) {
        this.descuentoCanjeado = descuentoCanjeado;
    }
    
    

}
