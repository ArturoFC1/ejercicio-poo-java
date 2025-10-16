package ClasesyObjetos;

public class Rectangulo extends Poligono {
    
    private String tipoPoligono;
    private double areaRectangulo;
    
    public Rectangulo(double base, double altura){
        super(base, altura);
        this.tipoPoligono = "Rectangulo";
    }
    
    @Override
    public double calcularArea(){
        areaRectangulo = base * altura;
        return areaRectangulo;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Area del "+tipoPoligono+"\n-Base: "+base+"\n-Altura: "+altura+"\n--Area: "+calcularArea()+"cm2");
    }
}