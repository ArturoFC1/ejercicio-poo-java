package ClasesyObjetos;

public class Diseñador extends Empleado {
    
    private int totalProyectos;
    private double bonoTotal;
    
    public Diseñador(String nombre, double salarioBase, int totalProyectos){
        super(nombre, salarioBase);
        this.totalProyectos = totalProyectos;
    }
    
    @Override
    public double calcularBono(){
        bonoTotal = (totalProyectos*2) + salarioBase;
        return bonoTotal;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre+"\nSalario: "+salarioBase+"\n"
                + "Total proyectos: "+totalProyectos+"\nBono total: "+bonoTotal);
    }
}