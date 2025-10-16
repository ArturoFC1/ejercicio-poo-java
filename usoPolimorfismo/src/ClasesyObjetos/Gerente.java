package ClasesyObjetos;

public class Gerente extends Empleado {
    
    private double salario = 4000;
    public Gerente(String nombre, int edad){
        super(nombre, edad);
    }
    
    @Override
    public double calcularSalario(){
        salario += salarioBase + (salarioBase*0.2);
        return salario;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\n"
                + "Salario: "+salario);
    }
}