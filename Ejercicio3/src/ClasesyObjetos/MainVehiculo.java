package ClasesyObjetos;

import javax.swing.JOptionPane;

public class MainVehiculo {
    
    public static void main(String[] args) {
              
        String marca,modelo;
        float precio;
        int indiceBarato;
        int numVehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de vehiculos a ingresar: "));
        Vehiculo[] v = new Vehiculo[numVehiculos];
        
        for (int i = 0; i < v.length; i++) {
            marca = JOptionPane.showInputDialog(i+1+"). Ingrese la marca del vehiculo: ");
            modelo = JOptionPane.showInputDialog(i+1+"). Ingrese el modelo del vehiculo: ");
            precio = Float.parseFloat(JOptionPane.showInputDialog(i+1+"). Ingrese precio del vehiculo: "));
            
            v[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceBarato = Vehiculo.devolverBandera(v, numVehiculos);
        
        System.out.println(v[indiceBarato].imprimirCarro());
    }
}