package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String nombre, carrera;
        int matricula;
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        carrera = JOptionPane.showInputDialog("Ingrese carrera");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su matricula"));
        
        Universidad universidad = new Universidad(carrera);
        Estudiante estudiante = new Estudiante(nombre, matricula, universidad);
        
        System.out.println(estudiante);
    }
}