package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static int busquedaIndiceAuto(VehiculosElectricos ve[], int idAuto){
        int bandera = -1;
        for (int i = 0; i < 2; i++) {
            if (ve[i].getIDCarro() == idAuto) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }
    
    public static int busquedaIndiceMoto(VehiculosElectricos ve[], int idMoto){
        int bandera = -1;
        for (int i = 2; i < 4; i++) {
            if (ve[i].getIDCarro() == idMoto) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }
    
    public static void main(String[] args) {
        
        VehiculosElectricos ve [] = new VehiculosElectricos[4];
        
        String marca,modelo, tipo;
        int autonomia, porcentajeBateria, numeroPuertas, opc, id, kmRecorridos, cantidadCarga;
        int resultadoIndiceMoto, resultadoIndiceAuto;
        
        for (int i = 0; i < 2; i++) {
            marca = JOptionPane.showInputDialog("Ingrese marca de auto "+(i+1)+": ");
            modelo = JOptionPane.showInputDialog("Ingrese modelo de auto "+(i+1)+": ");
            autonomia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Autonomia del auto "+(i+1)+": "));
            porcentajeBateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese porcentaje de bateria: "));
            numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de puertas: "));
            
            ve[i] = new AutoElectrico(marca, modelo, autonomia, porcentajeBateria, numeroPuertas);
        }
        
        for (int i = 2; i < 4; i++) {
            marca = JOptionPane.showInputDialog("Ingrese marca de la moto "+(i+1)+": ");
            modelo = JOptionPane.showInputDialog("Ingrese modelo de la moto "+(i+1)+": ");
            autonomia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Autonomia de la moto "+(i+1)+": "));
            porcentajeBateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese porcentaje de bateria: "));
            tipo = JOptionPane.showInputDialog("Ingrese tipo de moto electrica: ");
            
            ve[i] = new MotoElectrica(marca, modelo, autonomia, porcentajeBateria, tipo);
        }
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("--Menu Autos Electricos\n"
                    + "1. Consultar estado de todos los vehiculos\n"
                    + "2. Correr autos electricos\n"
                    + "3. Correr motos electricas\n"
                    + "4. Cargar autos electricos\n"
                    + "5. Cargar motos electricas\n"
                    + "6. Salir\n"
                    + "Ingrese una opcion: "));
            
            switch(opc){
                case 1: 
                    for (int i = 0; i < ve.length; i++) {
                        ve[i].mostrarInformacionBase();
                    }
                    break;
                    
                case 2:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id de auto a correr"));
                    resultadoIndiceAuto = busquedaIndiceAuto(ve, id);
                    if (resultadoIndiceAuto == -1) {
                        JOptionPane.showMessageDialog(null, "El ID del auto no existe");
                    }else{
                        kmRecorridos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de kilometros a correr"));
                        ve[resultadoIndiceAuto].conducirVehiculo(kmRecorridos);
                    }
                    break;
                    
                case 3:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id de moto a correr"));
                    resultadoIndiceMoto = busquedaIndiceMoto(ve, id);
                    if (resultadoIndiceMoto == -1) {
                        JOptionPane.showMessageDialog(null, "El ID de la moto no existe");
                    }else{
                    kmRecorridos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de kilometros a correr"));
                    ve[resultadoIndiceMoto].conducirVehiculo(kmRecorridos);
                    }
                    break;
                    
                case 4:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id de auto a cargar"));
                    resultadoIndiceAuto = busquedaIndiceAuto(ve, id);
                    if (resultadoIndiceAuto == -1) {
                        JOptionPane.showMessageDialog(null, "El ID del auto no existe");
                    }else{
                        cantidadCarga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de carga a poner"));
                        ve[resultadoIndiceAuto].cargarBateria(cantidadCarga);
                    }
                    break;

                case 5:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id de moto a cargar"));
                    resultadoIndiceMoto = busquedaIndiceMoto(ve, id);
                    if (resultadoIndiceMoto == -1) {
                        JOptionPane.showMessageDialog(null, "El ID de la moto no existe");
                    }else{
                        cantidadCarga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de carga a poner"));
                        ve[resultadoIndiceMoto].cargarBateria(cantidadCarga);
                    }
                    break;
                    
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta ingrese otra opcion");
            }
        } while (opc != 6);
    }
}
