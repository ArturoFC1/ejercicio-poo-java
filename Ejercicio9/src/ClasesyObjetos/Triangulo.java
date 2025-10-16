package ClasesyObjetos;

public class Triangulo extends Poligono {
    
    private String tipoPoligono;
    private double areaTriangulo;
    
    public Triangulo(double base, double altura){
        super(base, altura);
        this.tipoPoligono = "Triangulo";
    }
    
    @Override
    public double calcularArea(){
        areaTriangulo = 0.5*base*altura;
        return areaTriangulo;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Area del "+tipoPoligono+"\n-Base: "+base+"\n-Altura: "+altura+"\n--Area: "+calcularArea()+"cm2");
    }
}