/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author d0ubt
 */
public class Escalador extends Ciclista {
    private double aceleracionPromedio;
    private double gradoRampa;
    
    public Escalador(int identificador,String nombre,double aceleracionPromedio,double gradoRampa){
        super(identificador,nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }
    
    protected double getAceleracionPromedio(){
        return aceleracionPromedio;
    }
    
    protected void setAceleracionPromedio(double aceleracionPromedio){
        this.aceleracionPromedio = aceleracionPromedio;
    }
    
    protected double getGradoRampa(){
        return gradoRampa;
    }
    
    protected void setGradoRampa(){
        this.gradoRampa = gradoRampa;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion Promedio: " + aceleracionPromedio);
        System.out.println("Grado rampa: " + gradoRampa);
    }
    
    protected String imprimirTipo(){
        return "Es un escalador";
    }
}
