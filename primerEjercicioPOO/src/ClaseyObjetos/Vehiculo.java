package ClaseyObjetos;

public abstract class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected double precio;
    
    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public abstract double calcularCostoMantenimiento();
    public abstract void mostrarInformacion();
}