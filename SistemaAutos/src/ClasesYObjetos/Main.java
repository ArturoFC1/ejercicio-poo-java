package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
    
    String marca, modelo, nombreConductor;
    int año, edadConductor;
    
    marca = JOptionPane.showInputDialog(null,"Ingrese marca del auto: ");
    modelo = JOptionPane.showInputDialog("Ingrese modelo del auto: ");
    año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año del auto: "));
    nombreConductor = JOptionPane.showInputDialog("Ingrese nombre del conductor: ");
    edadConductor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad de conductor: "));
    
    Autos auto = new Autos(marca, modelo, año);
    Conductores conductor = new Conductores(nombreConductor, edadConductor, auto);
    
        System.out.println(conductor);
    }
}