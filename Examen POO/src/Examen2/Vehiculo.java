package Examen2;

public abstract class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    
    public Vehiculo(String marca, String modelo, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public abstract int acelerar(int aceleracion);
    public abstract int frenar();
}