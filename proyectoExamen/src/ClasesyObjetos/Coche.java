/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

public class Coche extends Vehiculo {
    
    @Override
    public void mover(){
        System.out.println("Vehiculo se mueve");
    }
    
    public void volar(){
        System.out.println("El vehiculo vuela");
    }
    
}
