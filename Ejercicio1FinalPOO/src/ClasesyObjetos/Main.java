package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String modoPago;
        double cantidadPagar;

        modoPago = JOptionPane.showInputDialog("Ingrese modo pago (efectivo o tarjeta)");
        
        if (modoPago.equalsIgnoreCase("efectivo")) {
            Pago payE = new PagoEfectivo("SKY", "Tienda jarceria");
            cantidadPagar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad para pagar"));
            payE.montoPago(cantidadPagar);
            payE.detallesPago();
            PagoEfectivo payEfectiv = (PagoEfectivo) payE;
            payEfectiv.detallesPersonaRecibio();
            
        }else if(modoPago.equalsIgnoreCase("tarjeta")){
            Pago payT = new PagoTarjeta("Telmex", "BBVA");
            cantidadPagar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese dinero para pagar"));
            payT.montoPago(cantidadPagar);
            payT.detallesPago();
            PagoTarjeta payTarjet = (PagoTarjeta) payT;
            payTarjet.detallesBanco();
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un modo de pago valido");
        }
    }
}