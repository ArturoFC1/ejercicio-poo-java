package ClasesyObjetos;

public class Diseñador extends Empleado {
    
    private double salario = 4000;
    private int cantidadProyectos;
    private final int comisionProyecto = 50;
    
    public Diseñador(String nombre, int edad, int cantidadProyectos){
        super(nombre, edad);
        this.cantidadProyectos = cantidadProyectos;
    }
    
    @Override
    public double calcularSalario(){
        salario += salarioBase + (cantidadProyectos * comisionProyecto);
        return salario;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\n"
                + "Salario: "+salario);
    }
}