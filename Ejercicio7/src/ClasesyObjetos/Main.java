package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String nombre, apellido;
        int DNI, numCuentas, opc, numCuenta;
        double cantidadDeposito, cantidadRetiro;
        boolean encontrado = false;
        
        JOptionPane.showMessageDialog(null, "WELCOME TO BANCMEXA");
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese apellido");
        DNI = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI"));
        
        numCuentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cuentas que tiene"));
        Cuenta c [] = new Cuenta[numCuentas];
        
        for (int i = 0; i < c.length; i++) {
            c[i] = new Cuenta();            
        }
        
        Cliente cliente = new Cliente(nombre, apellido, DNI, c);
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("---MENU BANCAMEX--\n"
                    + "1. Consultar datos de usuario\n"
                    + "2. Gestionar cuentas\n"
                    + "3. Salir\n"
                    + "Seleccione una opcion: "));
            
            switch(opc){
                case 1: 
                    System.out.println(cliente.toString());
                    break;
                case 2:
                    do {
                        opc = Integer.parseInt(JOptionPane.showInputDialog("CUENTAS\n"
                            + "1. Consultar saldo\n"
                            + "2. Ingresar saldo\n"
                            + "3. Retirar saldo\n"
                            + "4. Salir\n"
                            + "Eliga una opcion: "));
                        
                        switch(opc){
                            case 1: 
                                numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta"));
                                for (int i = 0; i < c.length; i++) {
                                    if (numCuenta == c[i].getNumeroCuenta()) {
                                        System.out.println("Cantidad de saldo en la cuenta "+c[i].getNumeroCuenta()+":\n"
                                                + "- Saldo: "+c[i].getSaldo());
                                        encontrado = true;
                                    }
                                }
                                if (encontrado == false) {
                                    System.out.println("Numero de cuenta no encontrado");
                                }
                                break;
                            
                            case 2:
                                encontrado = false;
                                numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta"));
                                for (int i = 0; i < c.length; i++) {
                                    if (numCuenta == c[i].getNumeroCuenta()) {
                                        cantidadDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad a depositar en cuenta "+c[i].getNumeroCuenta()+":"));
                                        c[i].ingresarSaldo(cantidadDeposito);
                                        encontrado = true;
                                    }
                                }
                                if (encontrado == false) {
                                    System.out.println("Numero de cuenta no encontrado");
                                }
                                break;
                            
                            case 3:
                                encontrado = false;
                                numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta"));
                                for (int i = 0; i < c.length; i++) {
                                    if (numCuenta == c[i].getNumeroCuenta()) {
                                        cantidadRetiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad a retirar en cuenta "+c[i].getNumeroCuenta()+":"));
                                        c[i].retirarSaldo(cantidadRetiro);
                                        encontrado = true;
                                    }
                                }
                                if (encontrado == false) {
                                    System.out.println("Numero de cuenta no encontrado");
                                }
                                break;
                            
                            case 4: 
                                break;
                            
                            default:
                                System.out.println("Opcion incorrecta seleccione otra opcion");
                        }
                    } while (opc != 4);
            }
        } while (opc != 3);
    }
}