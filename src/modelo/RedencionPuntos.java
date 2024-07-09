
package modelo;

import java.util.Date;

public class RedencionPuntos {
    private Date fecha;
    private int puntosCanjeados;
    private double descuentoCanjeado;

    public RedencionPuntos() {
    }

    public RedencionPuntos(Date fecha, int puntosCanjeados, double descuentoCanjeado) {
        this.fecha = fecha;
        this.puntosCanjeados = puntosCanjeados;
        this.descuentoCanjeado = descuentoCanjeado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
