package ClasesyObjetos;

public class AutoElectrico extends VehiculosElectricos {
    
    private int numeroPuertas;
    
    public AutoElectrico(String marca, String modelo, int autonomia, int porcentajeBateria, int numeroPuertas){
        super(marca, modelo, autonomia, porcentajeBateria);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void cargarBateria(int cantidadCarga){
        if (porcentajeBateria == 100) {
            System.out.println("Carga completa");
        }else if((porcentajeBateria + cantidadCarga) > 100){
            System.out.println("Exceso de carga de bateria limite 100%");
        }else{
            porcentajeBateria += cantidadCarga;
            System.out.println("Carga exitosa, total de carga: "+porcentajeBateria);
        }
    }
    
    @Override
    public void conducirVehiculo(int kmRecorridos){
        double gastoBateria;
        gastoBateria = (kmRecorridos * 0.5);
        if (porcentajeBateria < gastoBateria) {
            System.out.println("Esos km no alcanzaran para el porcentaje de bateria");
        }else{
            porcentajeBateria -= gastoBateria;
            System.out.println("Km recorridos: "+kmRecorridos+"km, bateria restante: "+porcentajeBateria+"%");
        }
    }
    
    @Override
    public void mostrarInformacionBase(){
        System.out.println("\nMarca: "+marca+"\nModelo: "+modelo+"\nAutonomia: "+autonomia+"\nPorcentaje bateria: "+porcentajeBateria+"\n"
                + "Numero de puertas: "+numeroPuertas);
        
    }
}