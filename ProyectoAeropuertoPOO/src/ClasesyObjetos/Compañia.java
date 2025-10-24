package ClasesyObjetos;

public class Compañia {
    
    private String nombreCompañia;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelo=0;

    public Compañia(String nombreCompañia) {
        this.nombreCompañia = nombreCompañia;
    }

    public Compañia(String nombreCompañia, Vuelo[] v) {
        this.nombreCompañia = nombreCompañia;
        this.listaVuelos = v;
        numVuelo = v.length;
    }
    
    public void insertarVuelo(Vuelo v){
        listaVuelos[numVuelo] = v;
        numVuelo ++;
    }

    public String getNombreCompañia() {
        return nombreCompañia;
    }

    public int getNumVuelo() {
        return numVuelo;
    }
    
    public Vuelo getVuelo(int i){
        return listaVuelos[i];
    }
    
    public Vuelo getVuelo(String identificador){
        Vuelo v = null;
        boolean encontrado = false;
        int i = 0;
        
        while(encontrado == false && i < listaVuelos.length){
            if (identificador.equalsIgnoreCase(listaVuelos[i].getIndentificador())) {
                encontrado = true;
                v = listaVuelos[i];
            }
            i++;
        }
        return v;
    }
}