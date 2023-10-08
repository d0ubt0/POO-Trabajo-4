/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author d0ubt
 */
public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;
    
    public Contrarrelojista(int identificador,String nombre,double velocidaMaxima){
        super(identificador,nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    protected double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    protected void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Velocidad Maxima: " + velocidadMaxima);
    }
    
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}
