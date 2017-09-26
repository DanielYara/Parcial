/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldoActual;
    private String fechaCreacion;
    private String nomCliente;
    private ArrayList<Movimiento> movimientos;
    private int cantidad;
    private String type;

    public Cuenta(int numeroCuenta, double saldoActual, String fechaCreacion, String nomCliente, int cantidad, String type) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.fechaCreacion = fechaCreacion;
        this.nomCliente = nomCliente;
        this.movimientos = movimientos;
        this.cantidad = cantidad;
        this.type = type;
        Tipo tipo = new Tipo(type);
        Movimiento movimiento;
        movimiento = new Movimiento("26/09/2017", this.saldoActual, cantidad, tipo);
        this.movimientos.add(movimiento);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
    
}
