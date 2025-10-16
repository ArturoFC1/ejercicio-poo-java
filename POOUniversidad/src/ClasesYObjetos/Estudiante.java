package ClasesYObjetos;

public class Estudiante {
    
    private String nombreEstudiante;
    private int matricula;
    private Universidad universidad;
    
    public Estudiante(String nombreEstudiante, int matricula, Universidad universidad){
        this.nombreEstudiante = nombreEstudiante;
        this.matricula = matricula;
        this.universidad = universidad;
    }
    
    @Override
    public String toString(){
        return "--Datos de estudiante--\n"+"- Alumno: "+nombreEstudiante+"\n"+"- Matricula: "+matricula+"\n"+universidad;
    }
}