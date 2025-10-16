package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        Objeto obj1 = new Objeto();
        
        int opc;
       
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU DE COORDENADAS\n"
                    + "Coordenadas: "+obj1.coordenadasActuales()+"\n"
                    + "1. Arriba\n"
                    + "2. Abajo\n"
                    + "3. Izquierda\n"
                    + "4. Derecha\n"
                    + "5. Salir\n"
                    + "Seleccione una opcion: "));
            
            switch(opc){
                case 1: 
                    obj1.moverArriba();
                    break;
                case 2: 
                    obj1.moverAbajo();
                    break;
                case 3:
                    obj1.moverIzquierda();
                    break;
                case 4: 
                    obj1.moverDerecha();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        } while (opc != 5);
        
        JOptionPane.showMessageDialog(null, obj1);
    }
}