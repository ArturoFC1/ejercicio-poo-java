package ClasesyObjetos;
/*
    Ejercicio 8: Una empresa de envío de paquetes tiene varias
    sucursales en todo el país. Cada sucursal esta definida por su número de 
    sucursal, dirección y ciudad. Para calcular el precio que cuesta enviar cada 
    paquete, las sucursales tienen en cuenta el precio del paquete y la prioridad, 
    sabiendo que se cobra un dólar por kilo, 10 dólares más si la prioridad es alta 
    y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI 
    de la persona que lo envía.

    precio que cuesta enviar cada paquete
    imprimir dato con datos del paquete.
*/
public class Paquete {
    
    private String prioridad;
    private double precioPaquete;
    private double pesoPaquete;
    private int numeroReferencia;
    private int dniPersona;
    private static int numeroRef = 1111;
    public final static int normal = 1;
    public final static int prioridadAlta = 10;
    public final static int express = 20;

    public Paquete(double pesoPaquete, int dniPersona, String prioridad) {
        this.precioPaquete = 0;
        this.pesoPaquete = pesoPaquete;
        this.numeroReferencia = numeroRef;
        this.dniPersona = dniPersona;
        this.prioridad = prioridad;
        numeroRef++;
    }

    public double getPrecioPaquete() {
        return precioPaquete;
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public int getDniPersona() {
        return dniPersona;
    }
    
    public String getPrioridad(){
        return prioridad;
    }
    
    public void setPrioridad(String prioridad){
        this.prioridad = prioridad;
    }
    
    public double precioPrioridadNormal(){
        precioPaquete = pesoPaquete;
        this.prioridad = "Normal";
        return precioPaquete;
    }
    
    public double precioPrioridadAlta(){
        precioPaquete = pesoPaquete + prioridadAlta;
        this.prioridad = "Alta";
        return precioPaquete;
    }
    
    public double precioPrioridadExpress(){
        precioPaquete = pesoPaquete + express;
        this.prioridad = "Express";
        return precioPaquete;
    }
    
    @Override
    public String toString(){
        return "+Numero de referencia: "+numeroReferencia+"\n +DNI de emisor: "+dniPersona+
                "\n +Peso paquete: "+pesoPaquete+" kg\n +Precio de envio: "+precioPaquete +" $\n +Prioridad: "+prioridad;
    }
}