package ClasesyObjetos;

public class Motocicleta implements Vehiculo {
    
    private int cilindraje;
    
    public Motocicleta(int cilindraje){
        this.cilindraje = cilindraje;
    }
    
    public int getCilindraje(){
        return cilindraje;
    }
    
     @Override
    public void encender(){
        System.out.println("La moto de cilindraje "+cilindraje+" enciende");
    }
    
    @Override
    public void apagar(){
        System.out.println("La moto de cilindraje "+cilindraje+" se apaga");
    }
    
    @Override
    public void velocidadMaxima(){
        System.out.println("La moto de cilindraje "+cilindraje+" arranca a velocidad maxima de 200km/h");
    }
}