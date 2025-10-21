package Examen2;

public class Coche extends Vehiculo implements Electricidad {
    
    private int capacidad;
    private String color;
    private int velocidad;
    private int porcentajeBateria;
    
    
    public Coche(String marca, String modelo,int velocidadMaxima, String color){
        super(marca, modelo, velocidadMaxima);
        this.capacidad = 5;
        this.color = color;
        this.velocidad = 0;
        this.porcentajeBateria = 10;
        this.id = idIncremental;
        idIncremental++;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    @Override
    public int acelerar(int aceleracion){
        porcentajeBateria -= 1;
        velocidad += aceleracion;
        return velocidad;
    }
    
    @Override
    public int frenar(){
        return velocidad = 0;
    } 
    
    @Override
    public int cargarBateria(int carga){
        porcentajeBateria += carga;
        return porcentajeBateria;
    }
    
    @Override
    public String toString(){
        return "\nId: "+id+"\nMarca: "+marca+"\nModelo: "+modelo+"\nVelocidad Maxima: "+velocidadMaxima+"\n- Color: "+color+"\n"
                + "- Capacidad: "+capacidad+"\n- Velocidad actual: "+velocidad+"\n- Porcentaje bateria: "+porcentajeBateria+"\n";
    }
}