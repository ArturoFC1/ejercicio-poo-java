package ClasesYObejetos;

public class Biblioteca {
    
    private String nombreBiblioteca;
    private String direccion;
    private Libro lb [];

    public Biblioteca(String nombreBiblioteca, String direccion, Libro[] lb) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;
        this.lb = lb;
    }
    
    
    @Override
    public String toString(){
        return "Biblioteca: "+nombreBiblioteca+"\n"+"Direccion: "+direccion+"\n";
    }
    
    public void imprimirLibros(){
        for(Libro libro: lb){
            System.out.println(libro);
        }
    }
}