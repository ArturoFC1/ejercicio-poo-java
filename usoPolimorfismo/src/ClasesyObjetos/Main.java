package ClasesyObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        Empleado arturo [] = new Empleado[3];
        
        System.out.println("Polimorfismo Gerente");
        //Polimorfismo Gerente
        arturo[0] = new Gerente("Arturo", 24);
        arturo[0].calcularSalario();
        arturo[0].mostrarDatos();
        
        System.out.println("\nPolimorfismo Porgrmador");
        //Polimorfismo Programador
        
        arturo[1] = new Programador("Arturo", 24, 5);
        arturo[1].calcularSalario();
        arturo[1].mostrarDatos();
        
        
        System.out.println("\nPolimorfismo Diseñador");
        //Polimorfismo Diseñador
        
        arturo[2] = new Diseñador("Arturo", 24, 10);
        arturo[2].calcularSalario();
        arturo[2].mostrarDatos();
    }
}