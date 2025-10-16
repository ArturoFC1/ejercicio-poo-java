package ClasesyObjetos;

public class Animal {
    
    private String nombre;
    private String especie;
    private int edad;
    
    public Animal(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
    
    public void hacerSonido(){
        System.out.println("Sonidos animales: ");
    }
    
    public void caracteristicaAnimal(){
        System.out.println("\nCaracteristica animal: ");
    }
}