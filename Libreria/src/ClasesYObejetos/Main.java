package ClasesYObejetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String titulo, autor, nombreBiblioteca, direccion;
        int cantidadLibros;
        Libro lb [];
        Biblioteca bt;
        
        nombreBiblioteca = JOptionPane.showInputDialog("Ingrese nombre de la biblioteca");
        direccion = JOptionPane.showInputDialog("Ingrese direccion de la biblioteca");
        
        cantidadLibros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de libros a guardar"));
        lb = new Libro[cantidadLibros];
        
        for (int i = 0; i < lb.length; i++) {
            titulo = JOptionPane.showInputDialog((i+1)+". Ingrese titulo libro: ");
            autor = JOptionPane.showInputDialog((i+1)+". Ingrese autor del libro: ");
            lb[i] = new Libro(titulo, autor);
        }
        
        bt = new Biblioteca(nombreBiblioteca, direccion, lb);
        
        System.out.println(bt.toString());
        bt.imprimirLibros();
        
    }
    
}
