package ClasesyObjetos;

/**
 * Ejercicio 9: Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
 * el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y al final 
 * mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:
    -Una super clase llamada Polígono.
    -Una sub clase llamada Rectángulo.
    -Una sub clase llamada Triángulo.
 * @author artur
 */

public abstract class Poligono {
    
    protected double base;
    protected double altura;
    
    public Poligono(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void lineaSalto(){
        System.out.println("---------");
    }
    
    public abstract double calcularArea();
    public abstract void imprimirDatos();
}