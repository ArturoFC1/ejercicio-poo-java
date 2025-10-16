package ClasesyObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo v1 [] = new Vehiculo[5];
        
        v1[0] = new Auto("Jetta");
        v1[1] = new Motocicleta(4);
        v1[2] = new Motocicleta(2);
        v1[3] = new Auto("Audi");
        v1[4] = new Auto("Toyota");
        
        for(Vehiculo p : v1){
            p.encender();
            p.apagar();
            p.velocidadMaxima();
            System.out.println("");
        }
    }
}