package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        double n1, n2;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida lado 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida lado 2"));
        Cuadrilatero cuadrilatero = new Cuadrilatero(n1,n2);
        
        System.out.println(cuadrilatero);
    }
}
