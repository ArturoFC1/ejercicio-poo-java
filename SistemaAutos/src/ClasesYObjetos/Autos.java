package ClasesYObjetos;

public class Autos {
    
    private String marca;
    private String modelo;
    private int año;

    public Autos(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    @Override
    public String toString(){
        return marca+" "+modelo+" "+año;
    }
}