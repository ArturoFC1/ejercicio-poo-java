package ClaseyObjetos;

public class Auto extends Vehiculo {
    
    private int ultimoNumeroPlaca;
    private int año;
    private double costoMantenimiento;
    
    public Auto(String marca, String modelo, double precio, int ultimoNumeroPlaca, int año){
        super(marca, modelo, precio);
        this.ultimoNumeroPlaca = ultimoNumeroPlaca;
        this.año = año;
    }    
    
    @Override
    public double calcularCostoMantenimiento(){
        costoMantenimiento = ultimoNumeroPlaca * año;
        return costoMantenimiento;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"\n"
                + "Costo Mantenimeinto: "+costoMantenimiento);
        
    }
    
}
    