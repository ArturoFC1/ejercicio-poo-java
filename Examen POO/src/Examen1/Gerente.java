package Examen1;

public class Gerente extends Empleado implements Bonificacion {
    
    private final String cargo = "Gerente";
    private int id;
    private double porcentajeBonificacion;
    
    public Gerente(String nombre, int edad, double salario){
        super(nombre, edad, salario);
        this.id = 1;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public double getSalario() {
        return salario;
    }
    
    public int getId(){
        return id;
    }
    
    public double getSalarioFinal(){
        return calcularSalarioFinal();
    }
    
    
    public void setPorcentajeBonificacion(int porcentajeBonificacion){
        double porcentaje = porcentajeBonificacion * 0.01;
        this.porcentajeBonificacion = porcentaje;
    }
        
    @Override
    public double calcularSalario(){
        return (salario * 30);
    }
    
    @Override
    public double calcularBonificacion(){
        return calcularSalario() * porcentajeBonificacion;
    }
    
    @Override
    public double calcularSalarioFinal(){
        return calcularSalario() + calcularBonificacion();
    }
    
    @Override
    public String mostrarInformacion(){
        return "Cargo: "+cargo+"\n-Nombre: "+nombre+"\n-Edad: "+edad+"\n-Salario diario: "+salario+"$\n"
                + "-Salario mensual: "+calcularSalario()+"$\n-Bonificacion: "+calcularBonificacion()+"$\nSalario final mensual: "+calcularSalarioFinal()+"$";
    }
}