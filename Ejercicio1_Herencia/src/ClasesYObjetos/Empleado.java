package ClasesYObjetos;

public class Empleado extends Persona {
    
    private double salario;
    private String puesto;
    
    public Empleado(double salario, String puesto, String nombre, int edad){
        super(nombre, edad);
        this.salario = salario;
        this.puesto = puesto;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nSalario: "+salario+"\nPuesto: "+puesto);
    }
}