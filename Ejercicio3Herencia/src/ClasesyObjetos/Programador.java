package ClasesyObjetos;

public class Programador extends Empleado {
    
    private String lenguajeFavorito;

    public Programador(String nombre, int edad, double salario, String lenguajeFavorito) {
        super(nombre, edad, salario);
        this.lenguajeFavorito = lenguajeFavorito;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"º\nEdad: "+getEdad()+"\nSalario: "+getSalario()+"\nLenguaje favorito: "+lenguajeFavorito;
    }
}