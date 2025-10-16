package ClasesyObjetos;

public class PagoEfectivo extends Pago {
    
        private String lugarPago;
        private double pagoRealizado;
    
        PagoEfectivo(String servicio, String lugarPago){
        super(servicio);
        this.lugarPago = lugarPago;
        }   
    
        @Override
        public void montoPago(double montoPago){
            if (montoPago <= 0 || montoPago > montoDeuda) {
                System.out.println("El pago realizado es menor a 0 o excede a la deuda de 389$");
            }else{
                montoDeuda -= montoPago;
                System.out.println("Se ha realizado el pago con tarjeta "+lugarPago+" saldo pendiente: "+montoDeuda+"$");
            }
            pagoRealizado = montoPago;
        }
        @Override
        public void detallesPago(){
            System.out.println("--Pagos efectivo OXXO--\n"
                    + "Lugar donde se pago: "+lugarPago+"\nServicio: "+servicio+"\nCosto servicio: "+costoServicio+"\n"
                            + "Pago realizado: "+pagoRealizado+"\nDeuda final: "+montoDeuda);
        }
        
        public void detallesPersonaRecibio(){
            System.out.println("Recibio el dinero doña toña");
        }
}
