package ClasesyObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Arturo", 23, 5000);
        Gerente ger1 = new Gerente("Alejandro", 24, 24000, "Jefe");
        Programador pro1 = new Programador("Selomi", 19, 50000, "Python");
        Diseñador dis1 = new Diseñador ("Ernesto", 43, 15000, "Figma");
        
        
        System.out.println(emp1.toString()+"\n");
        System.out.println(ger1.toString()+"\n");
        System.out.println(pro1.toString()+"\n");
        System.out.println(dis1.toString());
        
        System.out.println(ger1.holaPrueba());
    }
    
    
}