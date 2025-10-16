package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static int retornoID(Paquete paquete1 [], int id){
        int i = 0;
        boolean encontrado = false;
        int retornID = -1;
        
        while(i < paquete1.length && encontrado == false){
            if (paquete1[i].getNumeroReferencia() == id) {
                encontrado = true;
                retornID = i;
            }
            i++;
        }
        return retornID;
    }
    
    public static void main(String[] args) {
        
        int numPaquetes, dniPersona, numeroSucursal, opc, idPaquete, idRetorno;
        double pesoPaquete;
        String direccionSucursal, ciudadSucursal, prioridad;
        
        numeroSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de la sucursal: "));
        direccionSucursal = JOptionPane.showInputDialog("Ingrese direccion de la sucursal: ");
        ciudadSucursal = JOptionPane.showInputDialog("Ingrese ciudad de la sucursal: ");
        
        numPaquetes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de paquetes a enviar: "));
        Paquete paquete1 [] = new Paquete[numPaquetes];
        
        for (int i = 0; i < paquete1.length; i++) {
            pesoPaquete = Double.parseDouble(JOptionPane.showInputDialog((i+1)+". Ingrese peso del pquete: "));
            dniPersona = Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Ingrese DNI del emisor: "));
            prioridad = JOptionPane.showInputDialog("Ingrese prioridad del paquete: {normal, alta, express}");
            
            paquete1[i] = new Paquete(pesoPaquete, dniPersona, prioridad);
            
            if (paquete1[i].getPrioridad().equalsIgnoreCase("normal")) {
                paquete1[i].precioPrioridadNormal();
            }else if(paquete1[i].getPrioridad().equalsIgnoreCase("alta")){
                paquete1[i].precioPrioridadAlta();
            }else if(paquete1[i].getPrioridad().equalsIgnoreCase("express")){
                paquete1[i].precioPrioridadExpress();
            }else{
                prioridad = JOptionPane.showInputDialog("Prioridad incorrecta ingrese de nuevo la prioridad: ");
                paquete1[i].setPrioridad(prioridad);
                
                i--;
            }
        }
        Sucursal sucursal1 = new Sucursal(numeroSucursal, direccionSucursal, ciudadSucursal, paquete1);
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("---FEDEX---\n"
                    + "1. Consultar ticket de envio\n"
                    + "2. Detalles de la sucursal\n"
                    + "3. Salir\n"
                    + "Ingrese una opcion: "));
            
            switch (opc){
                case 1: 
                    idPaquete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID de Paquete: "));
                    idRetorno = retornoID(paquete1, idPaquete);
                    
                    if (idRetorno == -1) {
                        JOptionPane.showMessageDialog(null, "No se encontro el id ingresado");
                    }else{
                        JOptionPane.showMessageDialog(null,  sucursal1.mostrarPaquete(idRetorno) );
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, sucursal1);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        } while (opc != 3);
    }
}