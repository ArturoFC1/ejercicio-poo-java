package ClasesyObjetos;

public class Perro extends Animal {
    
    private String raza;
    
    public Perro(String nombre, String especie, int edad, String raza){
        super(nombre, especie, edad);
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("GUAU GUAU");
    }
    
    public void correr(){
        System.out.println("- El perro puede correr");
    }
}