package ClasesYObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        Libro l1 = new Libro("Don quijote", "Leonardo");
        Personas p1 = new Personas("Arturo Figueroa", l1);
        
        System.out.println(p1);
        
    }
}
