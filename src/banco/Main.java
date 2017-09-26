/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco = new Banco("BB");
        banco.crearTipoTrans("Consignacion");
        banco.crearTipoTrans("Retiro");
        banco.anadirCuenta(1, 324000, "23/08/2000", "Juan Parra", 100000, "Consignacion");
        banco.anadirCuenta(2, 1000000, "15/02/1992", "Maria Torrez", 50000, "Retiro");
        
        
    }
    
}
