package Examen2;

public class Coche extends Vehiculo implements Electricidad {
    
    private int capacidad;
    private String color;
    private int velocidad;
    private int porcentajeBateria;
    
    public Coche(String marca, String modelo,int velocidadMaxima, int capacidad, String color){
        super(marca, modelo, velocidadMaxima);
        this.capacidad = 5;
        this.color = color;
        this.velocidad = 0;
        this.porcentajeBateria = 10;
    }
    
    @Override
    public int acelerar(int aceleracion){
        porcentajeBateria =- 1;
        return velocidad + aceleracion;
    }
    
    @Override
    public int frenar(){
        return velocidad = 0;
    } 
    
    @Override
    public int cargarBateria(int carga){
        return porcentajeBateria + carga;
    }
}