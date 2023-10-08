/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebacuenta;
import java.util.*;
/**
 *
 * @author d0ubt
 */
public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.print("Ingrese saldo inicial = ");
        float saldoInicialAhorros = entrada.nextFloat();
        System.out.print("Ingrese tasa de interes = ");
        float tasaAhorros = entrada.nextFloat();
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros,tasaAhorros);
        System.out.print("Ingrese cantidad a consignar: ");
        float cantidadDepositar = entrada.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.print("Ingrese cantidad a retirar: ");
        float cantidadRetirar = entrada.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
        
        
        
    }
    
}
