package ClasesyObjetos;

/*
    Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados 
    por su marca, modelo y precio, imprima las propiedades del vehículo más barato. 
    Para ello, se deberán leer por teclado las características de cada vehículo y 
    crear una clase que represente a cada uno de ellos.
*/

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private float precio;
    
    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }
    
    public static int devolverBandera(Vehiculo[] v, int numVehiculos){
        int bandera = 0, i = 1;
        float precioBarato = v[0].getPrecio();
        
        while(i < numVehiculos){
            if (precioBarato > v[i].getPrecio()) {
                precioBarato = v[i].getPrecio();
                bandera = i;
            }
            i++;
        }
        return bandera;
    }
    
    public String imprimirCarro(){
        return "Auto Mas Barato\n"
                + "- Marca: "+marca+"\n"
                + "- Modelo: "+modelo+"\n"
                + "- Precio: "+precio;
    }
}