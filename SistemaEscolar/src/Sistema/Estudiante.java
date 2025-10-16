package Sistema;

public class Estudiante {
    
    private String nombre;
    private int edad;
    private Curso curso;

    public Estudiante(String nombre, int edad, Curso curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    
    @Override
    public String toString(){
        return nombre+" se ha inscrito en el curso "+curso;
    }
}