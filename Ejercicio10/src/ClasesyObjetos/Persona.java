package ClasesyObjetos;

public abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void entrenamientoEquipo();
    public abstract void partidoFutbol();
    
    public static void viajeEquipo(){
        System.out.println("Todos los miembros viajan con el quipo");
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad;
    }
}