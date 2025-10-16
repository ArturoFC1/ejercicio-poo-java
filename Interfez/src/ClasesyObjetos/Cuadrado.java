package ClasesyObjetos;

public class Cuadrado implements Figura {
    
    private double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
        
    }
    
    public double getLado(){
        return lado;
    }
    
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return lado * 4;
    }
    
    @Override
    public String toString(){
        return "- Area cuadrado: "+calcularArea()+"\n- Perimetro cuadrado: "+calcularPerimetro();
    }
}