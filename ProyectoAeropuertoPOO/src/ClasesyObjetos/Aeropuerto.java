package ClasesyObjetos;

public class Aeropuerto {
    
    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaCompañia[] = new Compañia[10];
    private int numeroCompañia;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numeroCompañia = 0;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Compañia[] c) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.listaCompañia = c;
        this.numeroCompañia = c.length;
    }
    
    public void insertarCompañia(Compañia comp){
        listaCompañia[numeroCompañia] = comp;
        numeroCompañia++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaCompañia() {
        return listaCompañia;
    }

    public int getNumeroCompañia() {
        return numeroCompañia;
    }
    
    public Compañia getCompañia(int i){
        return listaCompañia[i];
    }
    
    public Compañia getCompañia(String nombre){
        boolean encontrado = false;
        Compañia comp = null;
        int i = 0;
        while(encontrado == false && i < listaCompañia.length){
            if (nombre.equalsIgnoreCase(listaCompañia[i].getNombreCompañia())) {
                encontrado = true;
                comp = listaCompañia[i];
            }
            i++;
        }
        return comp;
    }
}