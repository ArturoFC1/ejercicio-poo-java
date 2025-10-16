package ClaseyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo vh [] = new Vehiculo[3];
        
        vh[0] = new Moto("Italika", "itl09", 189000, 85000, 0.3);
        vh[1] = new Camion("Mercedez", "ab2076", 590000, 2008);
        vh[2] = new Auto("Volkswagen", "Vento",180000, 4, 2020);
        
        vh[0].calcularCostoMantenimiento();
        vh[1].calcularCostoMantenimiento();
        vh[2].calcularCostoMantenimiento();
        
        for (int i = 0; i < vh.length; i++) {
            vh[i].mostrarInformacion();
            System.out.println("");
        }
    }
}