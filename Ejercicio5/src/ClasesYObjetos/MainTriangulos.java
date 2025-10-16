package ClasesYObjetos;

import javax.swing.JOptionPane;

public class MainTriangulos {
    
    public static int trianguloMayorSuperficie (Triangulo triangulos[]){
        int bandera = 0;
        int i = 1;
        double trianguloMayor = triangulos[0].calculoArea();
        
        while(i < triangulos.length){
            if (triangulos[i].calculoArea() > trianguloMayor) {
                trianguloMayor = triangulos[i].calculoArea();
                bandera = i;
            }
            i++;
        }
        return bandera;
    }

    public static void main(String[] args) {
        
        double lado,base;
        int cantidadTriangulos, indiceTrianguloMayor;
        
        cantidadTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de triangulos"));
        Triangulo triangulos[] = new Triangulo[cantidadTriangulos];
        
        for (int i = 0; i < triangulos.length; i++) {
            lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida del lado del triangulo "+(i+1)));
            base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida de la base del triangulo "+(i+1)));
            
            triangulos[i] = new Triangulo(lado,base);
        }
        
        indiceTrianguloMayor = trianguloMayorSuperficie(triangulos);
        
        System.out.println("Triangulo "+(indiceTrianguloMayor+1)+" es el de mayor superficie\n"
                + triangulos[indiceTrianguloMayor]);
    }
}