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
public class Banco {
    private String codigo;
    private ArrayList<Cuenta> cuentas = null;
    private ArrayList<Tipo> tipos = null;

    public Banco(String codigo) {
        this.codigo = codigo;
        this.cuentas = new ArrayList<>();
        this.tipos = new ArrayList<>();
    }
    
    public void crearTipoTrans(String code){
        Tipo tipo = new Tipo(code);
        this.tipos.add(tipo);
    }
    
    public void anadirCuenta(int numCuenta, double saldo, String fecha, String nomCliente, int cant, String type){
        Cuenta cuenta = new Cuenta(numCuenta, saldo, fecha, nomCliente, cant, type);
        this.cuentas.add(cuenta);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }
    
    
    
    
    
    
    
}
