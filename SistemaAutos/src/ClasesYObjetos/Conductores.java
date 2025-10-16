package ClasesYObjetos;

public class Conductores {
    
    private String nombreConductor;
    private int edadConductor;
    Autos auto;

    public Conductores(String nombreConductor, int edadConductor, Autos auto) {
        this.nombreConductor = nombreConductor;
        this.edadConductor = edadConductor;
        this.auto = auto;
    }
    
    @Override
    public String toString(){
        return nombreConductor+" de "+edadConductor+" años tiene un "+auto;
    }
}