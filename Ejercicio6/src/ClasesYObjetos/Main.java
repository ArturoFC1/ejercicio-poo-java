package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static NumerosComplejos pedirNumeros(){
        JOptionPane.showMessageDialog(null, "Ingrese datos de el primer numero complejo");
        int numeroReal1 = Integer.parseInt(JOptionPane.showInputDialog("1. Ingrese numero real"));
        int numeroImaginario1 = Integer.parseInt(JOptionPane.showInputDialog("1. Ingrese solo numero imaginario"));
        
        JOptionPane.showMessageDialog(null, "Ingrese datos de el segundo numero complejo");
        int numeroReal2 = Integer.parseInt(JOptionPane.showInputDialog("2. Ingrese numero real "));
        int numeroImaginario2 = Integer.parseInt(JOptionPane.showInputDialog("2. Ingrese numero imaginario: "));
        
        return new NumerosComplejos(numeroReal1, numeroImaginario1, numeroReal2, numeroImaginario2);
    }
    public static NumerosComplejos pedirNumero(){
        int numeroReal1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero real: "));
        int numeroImaginario1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero imaginario"));
        
        return new NumerosComplejos(numeroReal1, numeroImaginario1);
    }
    
    public static void main(String[] args) {
        NumerosComplejos nc;
        int opc;
        
        do {
        opc = Integer.parseInt(JOptionPane.showInputDialog("---Menu Complejos---\n"
                + "1. Suma de numeros complejos\n"
                + "2. Multiplicacion de numeros complejos\n"
                + "3. Comparar dos numeros complejos\n"
                + "4. Multiplicar complejo por entero\n"
                + "5. Salir\n"
                + "Ingrese una opcion: "));
            switch(opc){
                
                case 1:
                    nc = pedirNumeros();
                    System.out.println("La suma de complejos es: \n"
                            + nc.sumaComplejos());
                    break;
                case 2:
                    nc = pedirNumeros();
                    System.out.println("La multiplicacion de complejos es: \n"
                            + nc.multiplicacionComplejos());
                    break;
                case 3: 
                    nc = pedirNumeros();
                    if (nc.comparacionComplejos() == true) {
                        System.out.println("Numeros complejos iguales");
                    }else{
                        System.out.println("Numeros complejos diferentes");
                    }
                    break;
                case 4:
                    nc = pedirNumero();
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor entero"));
                    System.out.println("La multiplicacion con entero es: \n"
                            + nc.multiplicarEntero(numero));
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (opc != 5);
    }
}