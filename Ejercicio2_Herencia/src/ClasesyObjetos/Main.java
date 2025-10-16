package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        Animal animal = new Animal("Pancho", "Colibri", 1);
        Perro perro = new Perro("Cocky", "Perro", 9,"Schnauser");
        Gato gato = new Gato("Gatis", "Gato", 4, "Blanco");
        Pajaro pajaro = new Pajaro("LocoBird", "Carpintero", 2, "Rayadas");
        
        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();
        animal.caracteristicaAnimal();
        perro.correr();
        gato.trepar();
        pajaro.volar();
        

    }
}