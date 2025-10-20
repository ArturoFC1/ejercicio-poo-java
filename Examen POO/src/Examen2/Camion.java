package Examen2;

public class Camion extends Vehiculo {
    
    private int capacidad;
    private String color;
    private int velocidad;
    
    public Camion(String marca, String modelo, int velocidadMaxima, String color){
        super(marca, modelo, velocidadMaxima);
        this.capacidad = 2;
        this.color = color;
        this.velocidad = 0;
    }
    
    @Override
    public int acelerar(int aceleracion){
        return velocidad + aceleracion;
    }
    
    @Override
    public int frenar(){
        return velocidad = 0;
    }
}