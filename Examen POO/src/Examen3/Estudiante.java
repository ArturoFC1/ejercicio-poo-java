package Examen3;

public class Estudiante extends Persona implements Evaluable {
    
    private String cargo;
    private double promedioFinal = 0;
    private Curso c;
    private double calificacion1, calificacion2, calificacion3;
    
    public Estudiante(String nombre, int edad,double calificacion1,double calificacion2,double calificacion3){
        super(nombre, edad);
        this.cargo = "estudiante";
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.id = idIncremental;
        idIncremental++;
    }

    public String getCargo() {
        return cargo;
    }
    
    public String getMaterias(){
        return c.getMaterias();
    } 

    public double getPromedioFinal() {
        return promedioFinal;
    }
    
    public double getCalificacionMatematicas() {
        return c.getCalificacionMatematicas();
    }

    public double getCalificacionEspañol() {
        return c.getCalificacionEspañol();
    }

    public double getCalificacionIngles() {
        return c.getCalificacionIngles();
    }
    
    @Override        
    public double calcularPromedio(){
        c = new Curso(calificacion1, calificacion2, calificacion3);
        promedioFinal = c.calcularCalificacion();
        return promedioFinal;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nCargo: "+cargo+"\nCalificacion: "+promedioFinal);
    }
}
