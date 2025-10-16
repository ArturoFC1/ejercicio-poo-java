package ClasesYObjetos;

public class Universidad {
    
    private String nombre;
    private String direccion;
    private String carrera;
    
    public Universidad(String carrera){
        this.nombre = "TECNM";
        this.direccion = "Huixquilucan";
        this.carrera = carrera;
    }
    @Override
    public String toString(){
        return "- Escuela: "+nombre+"\n"+"- Direccion: "+direccion+"\n"+"- Carrera: "+carrera;
    }
}