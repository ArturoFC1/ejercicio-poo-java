package ClasesYObjetos;

public class Persona {
    
    private String nombre;
    private Coche c1;
    
    public Persona(String nombre, Coche c1){
        this.nombre = nombre;
        this.c1 = c1;
    }
    public void imprimirDatos(){
        System.out.println("--Datos de factura--\n"
                + "Nombre del propietario: "+nombre+"\n"
                        + "Marca del vehiculo: "+c1.getMarca()+"\n"
                                + "Modelo del vehiculo: "+c1.getModelo());
    }
}