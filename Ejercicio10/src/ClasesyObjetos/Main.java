package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        Persona p1 = new Futbolista("Cristiano","Ronaldo", 39, 7, "Delantero");
        Persona p2 = new Entrenador("Javier", "Aguirre", 52, "Defender");
        Persona p3 = new Doctor("Jonhy", "Sinz", 48, "Otorrino", 29);
        
        int opc;
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Equipo de Soccer\n"
                    + "1. Viaje de equipo\n"
                    + "2. Entrenamiento\n"
                    + "3. Partido futbol\n"
                    + "4. Planificar entrenamiento\n"
                    + "5. Entrevista\n"
                    + "6. Curar lesion\n"
                    + "7. Salir\n"
                    + "Ingrese una opcion: "));
            
            switch(opc){
                case 1: 
                    Persona.viajeEquipo();
                    break;
                case 2:
                    p1.entrenamientoEquipo();
                    p2.entrenamientoEquipo();
                    p3.entrenamientoEquipo();
                    break;
                case 3:
                    p1.partidoFutbol();
                    p2.partidoFutbol();
                    p3.partidoFutbol();
                    break;
                case 4:
                    Entrenador entrenador = (Entrenador)p2;
                    entrenador.estrategiaEstablecida();
                    break;
                case 5:
                    Futbolista futbolista = (Futbolista)p1;
                    futbolista.ofreceEntrevista();
                    break;
                case 6:
                    Doctor doctor = (Doctor)p3;
                    doctor.curarLesion();
                    break;
                case 7:
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, ingrese otra opcion");
            }
        } while (opc != 7);
    }
}