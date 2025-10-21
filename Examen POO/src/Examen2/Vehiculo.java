package Examen2;

public abstract class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    protected int id;
    public static int idIncremental = 100;
    
    public Vehiculo(String marca, String modelo, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getId() {
        return id;
    }
    
    public abstract int acelerar(int aceleracion);
    public abstract int frenar();
    
    @Override
    public abstract String toString();
}