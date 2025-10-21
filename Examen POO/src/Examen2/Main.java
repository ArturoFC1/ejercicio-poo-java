package Examen2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    
    public static Vehiculo pedirVehiculos(int identificador){
        String marca = JOptionPane.showInputDialog("Ingrese marca de vehiculo: ");
        String modelo = JOptionPane.showInputDialog("Ingrese modelo de vehiculo: ");
        int velocidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima del vehiculo: "));
        String color = JOptionPane.showInputDialog("Ingrese color del vehiculo: ");
        
        Vehiculo vehiculo;
        if (identificador == 1) {
            vehiculo = new Coche(marca, modelo, velocidadMaxima, color);
        }else if(identificador == 2){
            vehiculo = new Moto(marca, modelo, velocidadMaxima, color);
        }else{
            vehiculo = new Camion(marca, modelo, velocidadMaxima, color);
        }
        return vehiculo;
    }
    
    public static int buscarVehiculo(int idBuscar){
        boolean encontrado = false;
        int idEncontrado = -1;
        int i = 0;
        
        while(i < vehiculos.size() && encontrado == false){
            if (idBuscar == vehiculos.get(i).getId()) {
                encontrado = true;
                idEncontrado = i;
            }
            i++;
        }
        return idEncontrado;
    }
    
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>(); 
    
    public static void main(String[] args) {
        
        int opcion = 0, subopcion1= 0, subopcion2 = 0 ;
        int idVehiculo, idBuscado, aceleracion;
        
        do {
            try{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("-Menu Vehiculos-\n"
                + "1. Ingresar vehiculos\n"
                + "2. Conducir vehiculo\n"
                + "3. Imprimir informacion vehiculos\n"
                + "4. Salir\n"
                + "Ingrese una opcion: "));
            
            switch(opcion){
                case 1:
                    subopcion1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que vehiculo ingresar: \n"
                            + "1. Coche\n"
                            + "2. Moto\n"
                            + "3. Camion\n"
                            + "4. Volver a menu"));
                    switch(subopcion1){
                        case 1:
                            Vehiculo Coche = pedirVehiculos(1);
                            vehiculos.add(Coche);
                            break;
                        case 2:
                            Vehiculo Moto = pedirVehiculos(2);
                            vehiculos.add(Moto);
                            break;
                        case 3:
                            Vehiculo Camion = pedirVehiculos(3);
                            vehiculos.add(Camion);
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opcion invalida");
                    }
                    break;
                    
                case 2:
                    subopcion2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese accion que desea realizar\n"
                            + "1. Acelerar\n"
                            + "2. Frenar\n"
                            + "3. Volver al menu\n"
                            + "Ingrese una opcion: "));
                    
                    switch(subopcion2){
                        case 1:
                            idVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id de vehiculo"));
                            idBuscado = buscarVehiculo(idVehiculo);
                    
                            if (idBuscado == -1) {
                                JOptionPane.showMessageDialog(null, "El id no esta registrado");
                            }else{
                                aceleracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese aceleracion a realizar"));
                                if (aceleracion < vehiculos.get(idBuscado).getVelocidadMaxima()) {
                                    vehiculos.get(idBuscado).acelerar(aceleracion);
                                    JOptionPane.showMessageDialog(null, "El auto a acelerado "+aceleracion+" km/h");
                                }else{
                                    JOptionPane.showMessageDialog(null, "La aceleracion es mayor a la velocidad maxima");
                                }
                            }
                            break;
                        case 2:
                            idVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id de vehiculo"));
                            idBuscado = buscarVehiculo(idVehiculo);
                    
                            if (idBuscado == -1) {
                                JOptionPane.showMessageDialog(null, "El id no esta registrado");
                            }else{
                                vehiculos.get(idBuscado).frenar();
                                JOptionPane.showMessageDialog(null, "El auto se ha detendio");
                            }
                            break;
                        case 3:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                    }
                    break;
                case 3:
                    for(Vehiculo ve: vehiculos){
                        System.out.println(ve);
                    }
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                }
            }catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese valor numerico");
            }
        } while (opcion != 4);
    }
}