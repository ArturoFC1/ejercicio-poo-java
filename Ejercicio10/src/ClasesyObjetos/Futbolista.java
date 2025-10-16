package ClasesyObjetos;

public class Futbolista extends Persona {
    
    private int dorsal;
    private String posicion;
    
    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion){
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    @Override
    public void entrenamientoEquipo(){
        System.out.println("El jugador numero "+dorsal+" entrenan en cancha profesional con el equipo");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("El jugador "+nombre+" de "+edad+" años esta jugando de titular");
    }
    
    public void ofreceEntrevista(){
        System.out.println("El jugador "+nombre+" "+apellido +" que juega de "+posicion+" dara una entrevista");
    }
}
