package ClasesyObjetos;

public class Programador extends Empleado {
    
    private double salario = 4000;
    private int horasExtra;
    private int pagoXHoraExtra = 10;
    
    public Programador(String nombre, int edad, int horasExtra){
        super(nombre, edad);
        this.horasExtra = horasExtra;
    }
    
    @Override
    public double calcularSalario(){
        salario += salarioBase + (horasExtra*pagoXHoraExtra);
        return salario;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\n"
                + "Salario: "+salario);
    }
}
