package ClasesYObjetos;

public class Cliente {
    
    private String nombre;
    private int edad;
    private CuentaBancaria cuenta;
    
    public Cliente(String nombre, int edad, CuentaBancaria cuenta){
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
    }
    
    public void depositarSaldo(double deposito){
        cuenta.depositarSaldo(deposito);
    }
    
    public void retirarSaldo(double retiro){
        cuenta.retirarSaldo(retiro);
    }
    
    @Override
    public String toString(){
        return "Nombre cliente: "+nombre+"\n"+"Edad: "+edad+"\n"+cuenta;
    }
}