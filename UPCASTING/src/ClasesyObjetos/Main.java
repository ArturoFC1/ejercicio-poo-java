package ClasesyObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        
        //UPCASTING
        Figura fg = new Circulo();
        Figura fig = new Cuadrado();
        
        fg.dibujar();
        fig.dibujar();
        
        System.out.println(fg);
        System.out.println(fig);
        
        //DOWNCASTING
        Circulo figurilla = (Circulo) fg;
        System.out.println(figurilla);
        
        Cuadrado figuero = (Cuadrado) fig;
        System.out.println(figuero);
        
    }
}