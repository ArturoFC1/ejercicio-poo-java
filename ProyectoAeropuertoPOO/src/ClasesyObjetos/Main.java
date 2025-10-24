package ClasesyObjetos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    
    static Scanner entrada = new Scanner(System.in);
    final static int num = 4;
    final static Aeropuerto aeropuertos[] = new Aeropuerto[num];
    
    
    public static void main(String[] args) {
        
        //Insertar datos aeropuerto
        insertarDatosAerupuerto(aeropuertos);
        
    }
    
    public static void insertarDatosAerupuerto(Aeropuerto aero[]){
        aero[0] = new AeropuertoPublico(40000,"AIFA","CDMX","Mexico");
        aero[0].insertarCompañia(new Compañia("AeroMexico"));
        aero[0].insertarCompañia(new Compañia("AirCanada"));
        aero[0].insertarCompañia(new Compañia("VivaAerobus"));
        aero[0].getCompañia("AirCanada").insertarVuelo(new Vuelo("AIRCAN78DA","Burnaby","CDMX",245909,140));
        aero[0].getCompañia("AeroMexico").insertarVuelo(new Vuelo("AERO0902","CDMX","Vancouver",20000,150));
        aero[0].getCompañia("AeroMexico").getVuelo("AERO0902").insertarPasajero(new Pasajero("Arturo","FICA0108MX", "Mexicana"));
        
        aero[0].insertarCompañia(new Compañia("Volaris"));
        aero[0].getCompañia("Volaris").insertarVuelo(new Vuelo("VOL892","CDMX","Toronto",23502,167));
        aero[0].getCompañia("Volaris").getVuelo("VOL892").insertarPasajero(new Pasajero("Alexis","AL267MX", "Mexicana"));
        aero[0].getCompañia("AirCanada").getVuelo("AIRCAN78DA").insertarPasajero(new Pasajero("Selomi","SEL0926J","Mexicana"));
        
    }
    
    public static void menu(){
        int opc;
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                    + "1. Ver aeropuertos gestionados (publicos o privados)\n"
                    + "2. Ver empresas(privado) o (publico)\n"
                    + "3. Lista de compañias de un aeropuerto\n"
                    + "4. Lista de vuelos por compañia\n"
                    + "5. Listar posibles vuelos de origen a destino\n"
                    + "6. Salir\n"
                    + "Ingrese una opcion "));
            
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            }
        } while (opc != 6);
        
    }
}
