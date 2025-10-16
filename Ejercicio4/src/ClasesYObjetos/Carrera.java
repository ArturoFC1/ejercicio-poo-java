package ClasesYObjetos;

/*
    Ejercicio 4: Construir un programa para una competencia de atletismo, 
    el programa debe gestionar una serie de atletas caracterizados por su número de 
    atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos 
    del atleta ganador de la carrera.
*/

public class Carrera {
    
    private int numeroAtleta;
    private String nombreAtleta;
    private float tiempoCarrera;
    
    public Carrera(int numeroAtleta, String nombreAtleta, float tiempoCarrera){
        this.numeroAtleta = numeroAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    public float getTiempoCarrea(){
        return tiempoCarrera;
    }
    
    public String imprimirGanador(){
        return "---GANADOR---\n"
                + "Numero: "+numeroAtleta+"\n"
                + "Nombre: "+nombreAtleta+"\n"
                + "Tiempo: "+tiempoCarrera;
    }
}