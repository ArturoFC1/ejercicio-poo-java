package ClasesyObjetos;

public class Principal {
    
    public static void main(String[] args) {
        
        Estudiante es1 = new Estudiante("Arturo", "CCH", 2009);
        Persona pe1 = new Persona("Hidalo", "Costilla", 49);
        
        es1.mostrarDatos();
        System.out.println("");
        System.out.println(es1.toString());
        System.out.println("");
        System.out.println(pe1.toString());
        System.out.println("");
        System.out.println(pe1.getNombre());
        System.out.println("");
        es1.mostrarDatos();
        
    }
}
