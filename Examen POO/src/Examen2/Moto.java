package Examen2;

public class Moto extends Vehiculo implements Electricidad {
    
    private int capacidad;
    private String color;
    private int velocidad;
    private int porcentajeBateria;
    
    public Moto(String marca, String modelo,int velocidadMaxima, String color){
        super(marca, modelo, velocidadMaxima);
        this.capacidad = 2;
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
        velocidad += aceleracion;
        return velocidad;
    }
    
    @Override
    public int frenar(){
        return velocidad = 0;
    }    
    
    @Override
    public int cargarBateria(int carga){
        return porcentajeBateria + carga;
    }
    
    @Override
    public String toString(){
        return "\nId: "+id+"\nMarca: "+marca+"\nModelo: "+modelo+"\nVelocidad Maxima: "+velocidadMaxima+"\n- Color: "+color+"\n"
                + "- Capacidad: "+capacidad+"\n- Velocidad actual: "+velocidad+"\n- Porcentaje bateria: "+porcentajeBateria+"\n";
    }
    
}
