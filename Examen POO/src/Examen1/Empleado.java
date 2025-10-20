package Examen1;
//Ejercicio1 Sistemas de empleados de uns empresa Salario Mensual
public abstract class Empleado {
    
    protected String nombre;
    protected int edad;
    protected double salario;
    
    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
    
    public abstract double calcularSalario();
    public abstract double calcularSalarioFinal();
    public abstract String mostrarInformacion();
}