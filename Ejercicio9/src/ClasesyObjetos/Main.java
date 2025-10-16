package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static Poligono[] pedirDatosTriangulo(int numCreaciones){
        Poligono pa[] = new Triangulo[numCreaciones];
        for (int i = 0; i < pa.length; i++) {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese base del triangulo: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del triangulo: "));
            pa[i] = new Triangulo(base, altura);
        }
        return pa;
    }
    
    public static Poligono[] pedirDatosRectangulo(int numCreaciones){
        Poligono pa[] = new Rectangulo[numCreaciones];
        for (int i = 0; i < pa.length; i++) {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese base del triangulo: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del triangulo: "));
            pa[i] = new Rectangulo(base, altura);
        }
        return pa;
    }
    
    public static void main(String[] args) {
        
        int numeroTriangulos, numeroRectangulos;
        double base, altura;
        int opc;
        
        Poligono p1;
        Poligono pa[];
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("--CALCULADOR DE AREAS--\n"
                    + "1. Calcular area triangulos\n"
                    + "2. Calcular area de rectangulos\n"
                    + "3. Calcular area en arreglo de triangulos\n"
                    + "4. Calcular area en arreglo de rectangulos\n"
                    + "5. Salir\n"
                    + "Ingrese una opcion: "));
            
            switch(opc){
                case 1: 
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese base del triangulo: "));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del triangulo: "));
                    p1 = new Triangulo(base, altura);
                    p1.imprimirDatos();
                    p1.lineaSalto();
                    break;
                    
                case 2:
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese base del rectangulo: "));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del rectangulo: "));
                    p1 = new Rectangulo(base, altura);
                    p1.imprimirDatos();
                    p1.lineaSalto();
                    break;
                    
                case 3:
                    numeroTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de triangulos a medir: "));
                    pa = pedirDatosTriangulo(numeroTriangulos);
                    for (int i = 0; i < pa.length; i++) {
                        pa[i].imprimirDatos();
                        pa[i].lineaSalto();
                    }
                    break;
                case 4:
                    numeroRectangulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de rectangulos a medir"));
                    pa = pedirDatosRectangulo(numeroRectangulos);
                    for (int i = 0; i < pa.length; i++) {
                        pa[i].imprimirDatos();
                        pa[i].lineaSalto();
                    }
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, ingrese otra opcion");
            }
        } while (opc != 5);
    }
}