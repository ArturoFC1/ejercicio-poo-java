package ClasesyObjetos;

public class Sedan extends Automovil {
    
    @Override
    public void abrirMaletero(){
        System.out.println("El auto sedan abre maletero");
    }
    
    @Override
    public void cerrarMaletero(){
        System.out.println("El auto sedan cierra maletero");
    }
    
    @Override
    public void arrancar(){
        System.out.println("El auto sedan arranca");
    }
    
    public void autoAcelera(){
        System.out.println("El auto sedan acelera");
    }
    
    @Override
    public void frenar(){
        System.out.println("El auto sedan frena");
    }
    
    @Override
    public void apagar(){
        System.out.println("El auto sedan se apaga");
    }
}