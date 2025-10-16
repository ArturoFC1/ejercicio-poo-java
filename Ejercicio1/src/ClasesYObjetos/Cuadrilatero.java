    /*
    Ejercicio 1: Construir un programa que calcule el área y el perímetro de un 
    cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud 
    deberán introducirse por línea de ordenes. Si es un cuadrado, sólo se proporcionará 
    la longitud de uno de los lados al constructor.
    */

package ClasesYObjetos;

public class Cuadrilatero {
    
    private double lado1;
    private double lado2;
    
    public Cuadrilatero(double lado1){
        this.lado1 = lado1;
        this.lado2 = lado1;
    }
    
    public Cuadrilatero(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double calculoPerimetro(){
        if (lado1 == lado2) {
            return (4*lado1);
        }else{
            return (2*(lado1+lado2));
        }
    }
    
    public double calculoArea(){
        return lado1*lado2;
    }
    
    @Override
    public String toString(){
        return "--Calculo de Area y Perimetro--\n"
                + "Medidas\n"
                + "-Lado 1: "+lado1+"\n"
                + "-Lado 2: "+lado2+"\n"
                + "-------------\n"
                + "- Perimetro: "+calculoPerimetro()+"\n"
                + "- Area: "+calculoArea();
    }
}