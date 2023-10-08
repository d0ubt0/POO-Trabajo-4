/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author d0ubt
 */
public class CasaIndependiente extends CasaUrbana {
    public CasaIndependiente(int identificadorInmobiliario,int area,String direccion,int numeroHabitaciones,int numeroBaños,int numeroPisos){
        super(identificadorInmobiliario,area,direccion,numeroHabitaciones,numeroBaños,numeroPisos);
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println();
    }
    
}
