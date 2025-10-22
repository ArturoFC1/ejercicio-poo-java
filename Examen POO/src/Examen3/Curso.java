package Examen3;

public class Curso{
    
    static String curso1 = "Matematicas";
    static String curso2 = "Español";
    static String curso3 = "Ingles";
    private double calificacionMatematicas = 0;
    private double calificacionEspañol = 0;
    private double calificacionIngles = 0;

    public Curso(double calificacionMatematicas, double calificacionEspañol, double calificacionIngles) {
        this.calificacionMatematicas = calificacionMatematicas;
        this.calificacionEspañol = calificacionEspañol;
        this.calificacionIngles = calificacionIngles;
    }

    public double getCalificacionMatematicas() {
        return calificacionMatematicas;
    }

    public double getCalificacionEspañol() {
        return calificacionEspañol;
    }

    public double getCalificacionIngles() {
        return calificacionIngles;
    }
    
    public double calcularCalificacion(){
        double calificacion = ((calificacionMatematicas + calificacionEspañol+calificacionIngles) / 3);
        return calificacion;
    }
    
    public String getMaterias(){
        return "- Curso1: "+curso1+"\n- Curso2: "+curso2+"\n- Curso3: "+curso3;
    }
}