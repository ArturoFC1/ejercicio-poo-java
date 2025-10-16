package ClasesYObjetos;
/*
    Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. 
    Para ello defina los atributos necesarios que se requieren, proporcione métodos 
    de consulta, un método constructor e implemente métodos para calcular el perímetro 
    y el área de un triángulo, además implementar un método que a partir de un arreglo 
    de triángulos devuelva el área del triángulo de mayor superficie.
*/
public class Triangulo {
    
    private double lado;
    private double base;
    
    public Triangulo(double lado, double base){
        this.lado = lado;
        this.base = base;
    }
    
    public double calculoPerimetro(){
        return ((2*lado)+base);
    }
    
    public double calculoArea(){
        return ((base*(Math.sqrt((lado*lado)-(Math.pow(base/2, 2)))))/2);

    }
    
    @Override
    public String toString(){
        return "-Area: "+calculoArea()+"\n"
                + "-Perimetro: "+calculoPerimetro();
    }
}