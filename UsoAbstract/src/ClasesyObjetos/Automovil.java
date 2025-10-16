package ClasesyObjetos;

public abstract class Automovil extends Vehiculo {
    
    public abstract void abrirMaletero();
    public abstract void cerrarMaletero();
    
    public void tocarBocina(){
        System.out.println("Bocina tocando");
    }
}