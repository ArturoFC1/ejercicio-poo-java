package ClasesyObjetos;

public class AeropuertoPublico extends Aeropuerto {
    
    private double apoyoEconomico;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(double apoyoEconomico, String nombre, String ciudad, String pais, Compañia[] c) {
        super(nombre, ciudad, pais, c);
        this.apoyoEconomico = apoyoEconomico;
    }

    public AeropuertoPublico(double apoyoEconomico, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.apoyoEconomico = apoyoEconomico;
    }

    public double getApoyoEconomico() {
        return apoyoEconomico;
    }
}