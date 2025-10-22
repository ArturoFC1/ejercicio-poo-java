package Examen3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    
    public static Persona pedirInformacion(int indicador){
        Persona p;
        String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
        if (indicador == 1) {
            p = new Profesor(nombre, edad);
            profesores.add(p);
        }else{
            double calificacion1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion de "+Curso.curso1));
            double calificacion2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion de "+Curso.curso2));
            double calificacion3= Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion de "+Curso.curso3));
            p = new Estudiante(nombre, edad, calificacion1, calificacion2, calificacion3);
            ((Estudiante)p).calcularPromedio();
            estudiantes.add(p);
        }
        return p;
    }
    
    public static int buscarIdAlumno(int idBuscar){
        boolean encontrado = false;
        int i = 0;
        int idEncontrado = -1;
        
        while(i < estudiantes.size() && encontrado == false){
            if (idBuscar == estudiantes.get(i).getId()) {
                encontrado = true;
                idEncontrado = i;
            }
            i++;
        }
        return idEncontrado;
    }
    
    public static ArrayList<Persona> estudiantes = new ArrayList();
    public static ArrayList<Persona> profesores = new ArrayList();
    
    public static void menu(){
        Persona p;
        int opcion = 0, subopcion1 = 0, i=1, idBuscar, idEncontrado;
        double notaEspañol=0,notaMatematicas=0,notaIngles=0;
        
        do {
            try{
                

            opcion = Integer.parseInt(JOptionPane.showInputDialog("--MENU ESCOLAR--\n"
                    + "1. Añadir Usuarios\n"
                    + "2. Consultar Alumnos\n"
                    + "3. Consutar Maestros\n"
                    + "4. Consultar Calificaciones\n"
                    + "5. Consultar Materias\n"
                    + "6. Salir\n"
                    + "Ingrese una opcion: "));
            
            switch(opcion){
                case 1:
                    subopcion1 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione tipo de usuario a ingresar\n"
                            + "1. Alumno\n"
                            + "2. Maestro\n"
                            + "3. Volver al menu\n"
                            + "Ingrese una opcion: "));
                    switch(subopcion1){
                        case 1: 
                            p = pedirInformacion(2);
                            break;
                        case 2:
                            p = pedirInformacion(1);
                            break;
                        case 3:
                            break;
                        default: 
                            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                    }
                    break;
                case 2:
                    System.out.println("  Nombre - Edad - Calificacion");
                    i = 1;
                    for(Persona alumnos : estudiantes){
                        if (alumnos instanceof Estudiante) {
                            Estudiante e = (Estudiante)alumnos;
                            System.out.println(i+") "+e.getNombre()+" - "+e.getEdad()+" - "+e.getPromedioFinal());
                        }
                        i++;
                    }
                    break;
                case 3:
                    System.out.println("  Nombre - Edad");
                    i = 1;
                    for(Persona maestros : profesores){
                        System.out.println(i+") "+maestros.getNombre()+" - "+maestros.getEdad());
                        i++;
                    }
                    break;
                case 4:
                    idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id a buscar: "));
                    idEncontrado = buscarIdAlumno(idBuscar);
                    
                    if (idEncontrado == -1) {
                        JOptionPane.showMessageDialog(null, "El id ingresado no existe");
                    }else{
                        for(Persona estudiante : estudiantes){
                            if (estudiante instanceof Estudiante && estudiantes.get(idEncontrado).getId() == idBuscar) {
                                Estudiante e = (Estudiante)estudiante;
                                notaEspañol = e.getCalificacionEspañol();
                                notaIngles = e.getCalificacionIngles();
                                notaMatematicas = e.getCalificacionMatematicas();
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Alumno: "+estudiantes.get(idEncontrado).getNombre()+"\n"
                                + "Nota matematicas: "+notaMatematicas+"\nNota español: "+notaEspañol+"\nNota ingles: "+notaIngles);
                    }
                    break;
                case 5:
                    for(Persona alumnos : estudiantes){
                        if (alumnos instanceof Estudiante) {
                            Estudiante es = (Estudiante)alumnos;
                            JOptionPane.showMessageDialog(null, es.getMaterias());
                        }
                    }
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                }
            }catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese numeros para seleccionar una opcion");
            }
            i = 0;
        } while (opcion != 6);
    }
    
    public static void main(String[] args) {
        menu();
    }
}