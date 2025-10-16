package ClasesYObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        Coche c = new Coche("Audi", "R8");
        Persona p = new Persona("Arturo", c);
        
        p.imprimirDatos();
    }
}