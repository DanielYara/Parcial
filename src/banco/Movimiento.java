/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Jose Daniel Yara Sepulveda
 */
public class Movimiento {
    private String fecha;
    private double saldoAnterior;
    private double cantidad = 0.0;
    private Tipo tipo = null;

    public Movimiento(String fecha, double saldoAnterior, double cantidad, Tipo tipo) {
        this.fecha = fecha;
        this.saldoAnterior = saldoAnterior;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
   

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "fecha=" + fecha + ", saldoAnterior=" + saldoAnterior + ", cantidad=" + cantidad + ", tipo=" + this.tipo.toString() + '}';
    }
    
    
    
    
}
