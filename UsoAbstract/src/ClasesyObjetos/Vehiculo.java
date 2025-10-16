package ClasesyObjetos;

public abstract class Vehiculo {
    
    public abstract void arrancar();
    public abstract void apagar();
    
    public void frenar(){
        System.out.println("El auto frena");
    }
}