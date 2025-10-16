package ClasesyObjetos;

public class Desarrollador extends Empleado {
    
    private int añosLaborando;
    private double bonoTotal;
    
    public Desarrollador(String nombre, double salarioBase, int añosLaborando){
        super(nombre, salarioBase);
        this.añosLaborando = añosLaborando;
    }
    
    @Override
    public double calcularBono(){
        bonoTotal = (añosLaborando * salarioBase);
        return bonoTotal;
    }    
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre+"\nSalario: "+salarioBase+"\n"
                + "Años laborando: "+añosLaborando+"\nBono total: "+bonoTotal);
    }
}