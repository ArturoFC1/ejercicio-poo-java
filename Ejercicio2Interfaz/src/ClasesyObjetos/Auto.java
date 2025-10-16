package ClasesyObjetos;

public class Auto implements Vehiculo {
    
    private String marca;
    
    public Auto(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    @Override
    public void encender(){
        System.out.println("El auto "+marca+" se enciende");
    }
    
    @Override
    public void apagar(){
        System.out.println("El auto "+marca+" se apaga");
    }
    
    @Override
    public void velocidadMaxima(){
        System.out.println("La velocidad maxima del "+marca+" es de 100km/h");
    }
    
    public void cantidadPasajeros(){
        System.out.println("Le caben 5 cabrones");
    }
}