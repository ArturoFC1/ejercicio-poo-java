package ClasesyObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        Empleado emp1 [] = new Empleado[3];
        
        emp1[0] = new Desarrollador("Arturo", 4000, 2);
        emp1[1] = new Diseñador("Alexo", 4000, 10);
        emp1[2] = new Gerente("Alejandro", 4000, 10, 50);
        
        emp1[0].calcularBono();
        emp1[1].calcularBono();
        emp1[2].calcularBono();
        
        
        emp1[0].imprimirDatos();
        System.out.println("");
        emp1[1].imprimirDatos();
        System.out.println("");
        emp1[2].imprimirDatos();
    }
}
