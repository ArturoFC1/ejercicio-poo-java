package Examen1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    
    public static Empleado pedirDatos(int referencia){
        
        int porcentajeBonificacion;
        
        String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario: "));
        porcentajeBonificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese porcentaje de bonificacion: "));
        
        Empleado emp;
        
        if (referencia == 1) {
            emp = new Gerente(nombre, edad, salario);
            Gerente gerente = (Gerente)emp;
            gerente.setPorcentajeBonificacion(porcentajeBonificacion);
            
        }else{
            int añosExperiencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de experiencia: "));
            emp = new Programador(nombre, edad,salario,añosExperiencia);
            Programador programador = (Programador)emp;
            programador.setPorcentajeBonificacion(porcentajeBonificacion);
        }
        return emp;
    }
    
    public static void main(String[] args) {
       
       ArrayList<Empleado> arrayempleado = new ArrayList<>();
        
       int opcion = 0;
       do {
           try{
       opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU DE EMPLEADOS DON TOÑO\n"
               + "1. Agregar Gerentes\n"
               + "2. Agregar Programadores\n"
               + "3. Listar Gerentes y Programdores\n"
               + "4  Listar todo\n"
               + "5. Salir"));
           
       switch(opcion){
            case 1:
               Empleado gerente = pedirDatos(1);
               arrayempleado.add(gerente);
               JOptionPane.showMessageDialog(null, "Empleado gerente agregado");
               break;
           
            case 2:
               Empleado programador = pedirDatos(2);
               arrayempleado.add(programador);
               JOptionPane.showMessageDialog(null, "Empleado programador agregado");
               break;
            
            case 3:
               for(Empleado emp:arrayempleado){
                   System.out.println("Nombre: "+emp.getNombre()+" - "+"Salario: "+emp.calcularSalarioFinal()+"$");
                   System.out.println("------------");
               }
               break;
           
            case 4:
               for(Empleado emp:arrayempleado){
                   System.out.println(emp.mostrarInformacion());
                   System.out.println("------------");
               }
               break;
           
            case 5:
               break;
               
            default:
               JOptionPane.showMessageDialog(null, "Opcion incorrecta ingrese otra opcion");
            }
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Dato ingresado no valido, ingrese numeros");
        }
        } while (opcion != 5);
    }
}