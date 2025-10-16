package ClasesyObjetos;

public class Estudiante extends Persona {
    private String escuela;
    private int matricula;
    
    public Estudiante(String nombre, String escuela, int matricula){
        super(nombre);
        this.escuela = escuela;
        this.matricula = matricula;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nEscuela: "+escuela+"\nMatricula: "+matricula);
    }
}