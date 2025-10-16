package ClasesyObjetos;

public class Pajaro extends Animal {
    
    private String tipoPlumas;
    
    public Pajaro(String nombre, String especie, int edad, String tipoPlumas){
        super(nombre, especie, edad);
        this.tipoPlumas = tipoPlumas;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("PIO PIO");
    }
    
    public void volar(){
        System.out.println("- El pajaro pouede volar");
    }
}