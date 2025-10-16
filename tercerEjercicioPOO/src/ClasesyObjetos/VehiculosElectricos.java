package ClasesyObjetos;

public abstract class VehiculosElectricos {
    
    protected String marca;
    protected String modelo;
    protected int autonomia;
    protected int porcentajeBateria;
    private int contador;
    private static int contadorNumeros = 0;
    
    public VehiculosElectricos(String marca, String modelo, int autonomia, int porcentajeBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.autonomia = autonomia;
        this.porcentajeBateria = porcentajeBateria;
        this.contador = contadorNumeros++;
    }
    
    public abstract void cargarBateria(int cantidadCarga); 
    
    public abstract void conducirVehiculo(int kmRecorridos);
    
    public abstract void mostrarInformacionBase();
    
    public int getIDCarro(){
        return contador;
        
    }
}