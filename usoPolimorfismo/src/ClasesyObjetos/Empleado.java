package ClasesyObjetos;

public abstract class Empleado {
    
    protected String nombre;
    protected int edad;
    public final static int salarioBase = 100;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract double calcularSalario();
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\n"
                + "Salario: "+salarioBase);
    }
}