package Examen2;

public class Moto extends Vehiculo implements Electricidad {
    
    private int capacidad;
    private String color;
    private int velocidad;
    private int porcentajeBateria;
    
    public Moto(String marca, String modelo,int velocidadMaxima, int capacidad, String color){
        super(marca, modelo, velocidadMaxima);
        this.capacidad = 2;
        this.color = color;
        this.velocidad = 0;
        this.porcentajeBateria = 10;
    }
    
    @Override
    public int acelerar(int aceleracion){
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
