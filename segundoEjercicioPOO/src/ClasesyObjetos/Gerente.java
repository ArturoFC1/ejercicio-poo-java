package ClasesyObjetos;

public class Gerente extends Empleado{
    
    private int numeroProyectos;
    private int genteACargo;
    private double bonoTotal;

    public Gerente(String nombre, double salarioBase,int numeroProyectos, int genteACargo) {
        super(nombre, salarioBase);
        this.numeroProyectos = numeroProyectos;
        this.genteACargo = genteACargo;
    }
    
    @Override
    public double calcularBono(){
        bonoTotal = ((salarioBase * genteACargo)/numeroProyectos);
        return bonoTotal;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre+"\nSalario: "+salarioBase+"\n"
                + "Numero proyectos: "+numeroProyectos+"\nGenre a cargo: "+genteACargo+"\nBono total: "+bonoTotal);
    }
}