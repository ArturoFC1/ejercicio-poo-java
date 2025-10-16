package ClasesyObjetos;

public class Entrenador extends Persona {
    
    private String estartegia;
    
    public Entrenador(String nombre, String apellido, int edad, String estrategia){
        super(nombre, apellido, edad);
        this.estartegia = estrategia;
    }
    
    public void estrategiaEstablecida(){
        System.out.println("El entrenador "+nombre+" "+apellido+ "esta dirigiendo el equipo con una estrategia "+estartegia);
    }
    
    @Override
    public void entrenamientoEquipo(){
        System.out.println("El entrenador "+nombre+" de "+edad+" entrena al equipo de 8am a 6pm");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("El entrenador "+nombre+" dirige a su equipo desde la banca");
    }
}    