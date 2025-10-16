package ClasesyObjetos;

public class Doctor extends Persona {
    
    private String titulo;
    private int añosExperiencia;
    
    public Doctor(String nombre, String apellido, int edad, String titulo, int añosExperiencia){
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.añosExperiencia = añosExperiencia;
    }
    
    public void curarLesion(){
        System.out.println("El doctor "+nombre+" "+apellido+" cura a los jugadores del equipo");
    }
    
    @Override
    public void entrenamientoEquipo(){
        System.out.println("El doctor "+nombre+" de "+edad+" con "+añosExperiencia+" años de experiencia estudia para curar jugadores");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("El doctor titulado de "+titulo+" visualiza jugadas en en campo");
    }
}