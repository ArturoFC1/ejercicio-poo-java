package Sistema;

public class Curso {
    
    private String nombreCurso;
    private int duracionHoras;

    public Curso(String nombreCurso, int duracionHoras) {
        this.nombreCurso = nombreCurso;
        this.duracionHoras = duracionHoras;
    }
    
    @Override
    public String toString(){
        return nombreCurso +" de "+duracionHoras+" horas";
    }
}
