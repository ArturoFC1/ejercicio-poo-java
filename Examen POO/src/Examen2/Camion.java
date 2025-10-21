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
        this.id = idIncremental;
        idIncremental++;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    @Override
    public int acelerar(int aceleracion){
        velocidad += aceleracion;
        return velocidad;
    }
    
    @Override
    public int frenar(){
        return velocidad = 0;
    }
    
    @Override
    public String toString(){
        return "\nId: "+id+"\nMarca: "+marca+"\nModelo: "+modelo+"\nVelocidad Maxima: "+velocidadMaxima+"\n- Color: "+color+"\n"
                + "- Capacidad: "+capacidad+"\n- Velocidad actual: "+velocidad+"\n";
    }
    
}