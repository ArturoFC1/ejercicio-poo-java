package ClasesyObjetos;

public class AeropuertoPrivado extends Aeropuerto {
    
    private String listaEmpresas[];
    private int numEmpresas;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String[] empresas, int numEmpresas, String nombre, String ciudad, String pais, Compañia[] c) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = empresas;
        this.numEmpresas = empresas.length;
    }
    
    public void insertarEmpresas(String empresa[]){
        this.listaEmpresas = empresa;
        this.numEmpresas = empresa.length;
    }
    
    public void insertarEmpresa(String e){
        listaEmpresas[numEmpresas] = e;
        numEmpresas++;
    }

    public String[] getEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }
}