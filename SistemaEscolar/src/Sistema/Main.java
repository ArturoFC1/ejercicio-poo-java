package Sistema;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String nombre, nombreCurso;
        int edad, duracion;
        Curso curso;
        Estudiante estudiante;
        
        nombre = JOptionPane.showInputDialog("Ingrese nombre de estudiante: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
        nombreCurso = JOptionPane.showInputDialog("Ingrese nombre del curso: ");
        duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese duracion: "));
        
        curso = new Curso(nombreCurso, duracion);
        estudiante = new Estudiante(nombre, edad, curso);
        
        System.out.println(estudiante);
    }
}