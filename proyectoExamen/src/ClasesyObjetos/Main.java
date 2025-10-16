/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Coche();
        v1.mover();
        System.out.println(v1);
        
        Coche c1 = (Coche) v1;
        c1.mover();
        c1.volar();
        System.out.println(c1);
    }
}