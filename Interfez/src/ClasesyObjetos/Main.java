package ClasesyObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        Cuadrado c1 = new Cuadrado(4);
        Circulo cir1 = new Circulo(5);
        
        Figura f = new Cuadrado(3); 
        
        System.out.println(c1 + "\n" + cir1);
    }
}