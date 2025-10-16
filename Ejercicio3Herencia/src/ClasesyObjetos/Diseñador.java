package ClasesyObjetos;

public class Diseñador extends Empleado {
    
    private String herramientaPrincipal;

    public Diseñador(String nombre, int edad, double salario,String herramientaPrincipal) {
        super(nombre, edad, salario);
        this.herramientaPrincipal = herramientaPrincipal;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"º\nEdad: "+getEdad()+"\nSalario: "+getSalario()+"\nHerramienta Principal: "+herramientaPrincipal;
    }
    
}
