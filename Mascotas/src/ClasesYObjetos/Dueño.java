package ClasesYObjetos;

public class Dueño {
    
    private String nombreDueño;
    private long telefono;
    private Mascota m;

    public Dueño(String nombreDueño, long telefono, Mascota m) {
        this.nombreDueño = nombreDueño;
        this.telefono = telefono;
        this.m = m;
    }
    
    @Override
    public String toString(){
        return "El dueño "+nombreDueño+" cuida de "+m.getNombreMascota()+"\n"
                + "Detalles: \n"+m.toString()+"\n* contactarse al numero: "+telefono+" *";
    }
}