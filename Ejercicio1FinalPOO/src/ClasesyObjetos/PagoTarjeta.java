package ClasesyObjetos;

public class PagoTarjeta extends Pago {
    
        private String nombreBanco;
        private double pagoRealizado;
        
        public PagoTarjeta(String servicio, String nombreBanco){
            super(servicio);
            this.nombreBanco = nombreBanco;
        }
        
        @Override
        public void montoPago(double montoPago){
            if (montoPago <= 0 || montoPago > montoDeuda) {
                System.out.println("El pago realizado es menor a 0 o excede a la deuda de 389$");
            }else{
                montoDeuda -= montoPago;
                System.out.println("Se ha realizado el pago con tarjeta "+nombreBanco+" saldo pendiente: "+montoDeuda+"$");
            }
            pagoRealizado = montoPago;
        }
        
        @Override
        public void detallesPago(){
            System.out.println("--Pagos OXXO--\n"
                    + "Nombre banco: "+nombreBanco+"\nServicio: "+servicio+"\nCosto servicio: "+costoServicio+"\nNumero de tarjeta: "+numeroTarjeta+"\n"
                            + "Pago realizado: "+pagoRealizado+"\nDeuda final: "+montoDeuda);
        }
        
        public void detallesBanco(){
            System.out.println("Es un banco muy bonito en CDMX");
        }
}