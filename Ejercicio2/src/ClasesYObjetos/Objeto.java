/*
    Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto
    dentro de un tablero y actualice su posición dentro del mismo. Los movimientos 
    posibles son ARRIBA, ABAJO, IZQUIERDA Y DERECHA. Tras cada movimiento el programa 
    mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
*/
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Objeto {
    
   private int ejeX;
   private int ejeY;
   
   public Objeto(){
       this.ejeX = 0;
       this.ejeY = 0;
   }
   
   public int moverArriba(){
       ejeY += 1;
       return ejeX;
   }
   
   public int moverAbajo(){
       ejeY -= 1;
       return ejeX;
   }
   
   public int moverDerecha(){
       ejeX += 1;
       return ejeX;
   }
   
   public int moverIzquierda(){
       ejeX -= 1;
       return ejeY;
   }
   
   public void imprimirIndicaciones(){
       JOptionPane.showMessageDialog(null, "---INDICACIONES---\n"
               + "Arriba: *w*\n"
               + "Abajo: *s*\n"
               + "Derecha: *d*\n"
               + "Izquierda: *a*");
   }
   
   @Override
   public String toString(){
       return "Coordenadas Finales: \n"
               + "- Eje X: "+ejeX+"\n"
               + "- Eje Y: "+ejeY;
   }
   
   public String coordenadasActuales(){
       return "["+ejeX+" , "+ejeY+"]";
   }
}