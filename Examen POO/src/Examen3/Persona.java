package Examen3;

public abstract class Persona {
    
   protected String nombre;
   protected int edad;
   protected int id;
   public static int idIncremental = 100;
   
    public Persona(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
   }
   
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }
   
    public abstract void mostrarDatos();
    
}
