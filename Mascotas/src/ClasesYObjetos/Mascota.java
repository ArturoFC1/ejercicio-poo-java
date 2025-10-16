package ClasesYObjetos;

public class Mascota {
    
    private String nombreMascota;
    private String tipoMascota;
    private int edadMascota;

    public Mascota(String nombreMascota, String tipoMascota, int edadMascota) {
        this.nombreMascota = nombreMascota;
        this.tipoMascota = tipoMascota;
        this.edadMascota = edadMascota;
    }
    
    public String getNombreMascota(){
        return nombreMascota;
    }
    
    @Override
    public String toString(){
        return "\n-Tipo mascota: "+tipoMascota+"\n-Edad: "+edadMascota+" años";
    }
}