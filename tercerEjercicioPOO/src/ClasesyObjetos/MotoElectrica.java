package ClasesyObjetos;

public class MotoElectrica extends VehiculosElectricos {
    
    private String tipo; //scotter, deportiva
    
    public MotoElectrica(String marca, String modelo, int autonomia, int porcentajeBateria, String tipo){
        super(marca, modelo, autonomia, porcentajeBateria);
        this.tipo = tipo;
    }
    
    @Override
    public void cargarBateria(int cantidadCarga){
        if (porcentajeBateria == 100) {
            System.out.println("Carga completa");
        }else if((porcentajeBateria + cantidadCarga) > 100){
            System.out.println("Bateria cargada al 100%");
            porcentajeBateria = 100;
        }else{
            porcentajeBateria += cantidadCarga;
            System.out.println("Carga exitosa, total de carga: "+porcentajeBateria);
        }
    }
    
    @Override
    public void conducirVehiculo(int kmRecorridos){
        double gastoBateria;
        gastoBateria = (kmRecorridos * 0.8);
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
                + "Tipo de moto: "+tipo);
        
    }

    
}