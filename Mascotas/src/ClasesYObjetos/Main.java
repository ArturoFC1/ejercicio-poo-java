package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String nombreDueño, nombreMascota, tipoMascota;
        long telefono;
        int edadMascota;
        Dueño d;
        Mascota m;
        
        nombreDueño = JOptionPane.showInputDialog("Ingrese nombre del dueño: ");
        telefono = Long.parseLong(JOptionPane.showInputDialog("Ingrese telefono de dueño"));
        nombreMascota = JOptionPane.showInputDialog("Ingrese nombre de mascota");
        tipoMascota = JOptionPane.showInputDialog("Ingrese tipo de mascota");
        edadMascota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad de la mascota"));
        
        m = new Mascota(nombreMascota, tipoMascota, edadMascota);
        d = new Dueño(nombreDueño, telefono, m);
        
        System.out.println(d.toString());
    }
}