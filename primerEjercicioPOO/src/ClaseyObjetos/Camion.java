package ClaseyObjetos;

public class Camion extends Vehiculo {
    
    private int añoCamion;
    private final int mantenimiento = 580;
    private double costoMantenimiento;
    
    public Camion(String marca, String modelo, double precio,int añoCamion){
        super(marca, modelo, precio);
        this.añoCamion = añoCamion;
    }
    
    @Override
    public double calcularCostoMantenimiento(){
        costoMantenimiento = ((añoCamion * mantenimiento) - añoCamion);
        return costoMantenimiento;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"\n"
                + "Costo Mantenimeinto: "+costoMantenimiento);
    }
}