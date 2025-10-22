package Examen3;

public class Profesor extends Persona {
    
    private String cargo;
    
    public Profesor(String nombre, int edad){
        super(nombre, edad);
        this.cargo = "profesor";
    }

    public String getCargo() {
        return cargo;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nCargo: "+cargo);
    }
}
