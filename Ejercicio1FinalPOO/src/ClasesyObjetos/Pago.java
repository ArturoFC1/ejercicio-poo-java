package ClasesyObjetos;

public abstract class Pago {
    
    public static final int costoServicio = 389;
    protected double montoDeuda;
    protected long numeroTarjeta;
    protected String servicio;
    public static long numberTarjet = 100;
    
    
    public Pago(String servicio){
        this.servicio = servicio;
        this.montoDeuda = costoServicio;
        this.numeroTarjeta = numberTarjet;
        numberTarjet++;
    }
    
    public abstract void montoPago(double montoPago);
    public abstract void detallesPago();
}