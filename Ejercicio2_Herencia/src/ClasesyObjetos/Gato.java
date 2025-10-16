package ClasesyObjetos;

public class Gato extends Animal {
    
    private String color;
    
    public Gato(String nombre, String especie, int edad, String color){
        super(nombre, especie, edad);
        this.color = color;
    }    
    
    @Override
    public void hacerSonido(){
        System.out.println("MIAU MIAU");
    }
    
    public void trepar(){
        System.out.println("- El gato puede trepar");
    }
}
