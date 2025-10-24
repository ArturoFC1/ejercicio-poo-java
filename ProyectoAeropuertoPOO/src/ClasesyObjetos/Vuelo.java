package ClasesyObjetos;

public class Vuelo {
    
    private String indentificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precioVuelo;
    private int numMaxPasajeros;
    private int numActPasajeros;
    private Pasajero listaPasajeros[];

    public Vuelo(String indentificador, String ciudadOrigen, String ciudadDestino, double precioVuelo, int numMaxPasajeros) {
        this.indentificador = indentificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precioVuelo = precioVuelo;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaxPasajeros];
    }
    
    public void insertarPasajero(Pasajero p){
        listaPasajeros[numActPasajeros] = p;
        numActPasajeros++;
    }

    public String getIndentificador() {
        return indentificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecioVuelo() {
        return precioVuelo;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActPasajeros() {
        return numActPasajeros;
    }
    
    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
    }
    
    public Pasajero getPasajero(String pasaporte){
        Pasajero p = null;
        boolean encontrado = false;
        int i = 0;
        while(encontrado == false && i < listaPasajeros.length){
            if (pasaporte.equalsIgnoreCase(p.getPasaporte())) {
                encontrado = true;
                p = listaPasajeros[i];
            }
            i++;
        }
        return p;
    }
    
    


    
    
    
}
