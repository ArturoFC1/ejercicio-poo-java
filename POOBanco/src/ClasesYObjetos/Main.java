package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        
        CuentaBancaria cuenta = new CuentaBancaria();
        Cliente cliente = new Cliente(nombre, edad, cuenta);
        
        int opc = 0;
        double cantidad;
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "--BANCO BIENESTAR--\n"
                    + "1. Consultar datos\n"
                    + "2. Ingresar saldo\n"
                    + "3. Retirar saldo\n"
                    + "4. Salir\n"
                    + "Elija una opcion: "));
            
            switch(opc){
                case 1:
                    System.out.println(cliente);
                    break;
                case 2:
                    cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar: "));
                    cliente.depositarSaldo(cantidad);
                    break;
                case 3:
                    cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
                    cliente.retirarSaldo(cantidad);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        } while (opc != 4);
    }
}