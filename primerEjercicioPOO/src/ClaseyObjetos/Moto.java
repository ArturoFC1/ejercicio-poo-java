package ClaseyObjetos;

public class Moto extends Vehiculo {
    
    private int kmConsumidos;
    private double precioXKilometro;
    private double costoMantenimiento;
    
    public Moto(String marca, String modelo, double precio, int kmConsumidos, double precioXKilometro){
        super(marca, modelo, precio);
        this.kmConsumidos = kmConsumidos;
        this.precioXKilometro = precioXKilometro;
    }
    
    @Override
    public double calcularCostoMantenimiento(){
        costoMantenimiento = (kmConsumidos*precioXKilometro);
        return costoMantenimiento;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"\n"
                + "Costo Mantenimeinto: "+costoMantenimiento);
    }
}