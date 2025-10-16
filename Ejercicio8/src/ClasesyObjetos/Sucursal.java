package ClasesyObjetos;
/*
    Ejercicio 8: Una empresa de envío de paquetes tiene varias
    sucursales en todo el país. Cada sucursal esta definida por su número de 
    sucursal, dirección y ciudad. Para calcular el precio que cuesta enviar cada 
    paquete, las sucursales tienen en cuenta el precio del paquete y la prioridad, 
    sabiendo que se cobra un dólar por kilo, 10 dólares más si la prioridad es alta 
    y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI 
    de la persona que lo envía.
*/
public class Sucursal {
    
    private int numeroSucursal;
    private String direccionSucursal;
    private String ciudadSucursal;
    private Paquete paquetito [];

    public Sucursal(int numeroSucursal, String direccionSucursal, String ciudadSucursal, Paquete[] paquetito) {
        this.numeroSucursal = numeroSucursal;
        this.direccionSucursal = direccionSucursal;
        this.ciudadSucursal = ciudadSucursal;
        this.paquetito = paquetito;
    }
    
    @Override
    public String toString(){
        return "-Numero de Sucursal: "+numeroSucursal
                +"\n -Direccion Sucursal: "+direccionSucursal+"\n -Ciudad: "+ciudadSucursal;
    }
    
    public String mostrarPaquete(int id){
        return "NOTA FINAL\n -Numero de Sucursal: "+numeroSucursal
                +"\n -Direccion Sucursal: "+direccionSucursal+"\n -Ciudad: "+ciudadSucursal +"\n-----------\n"+paquetito[id];
    }
}