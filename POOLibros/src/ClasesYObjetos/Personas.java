package ClasesYObjetos;

public class Personas {
    
    private String nombre;
    private Libro libro;
    
    public Personas(String nombre, Libro libro){
        this.nombre = nombre;
        this.libro = libro;
    }
    
    @Override
    public String toString(){
        return "Usuario: "+nombre+"\n"+libro;
    }
}