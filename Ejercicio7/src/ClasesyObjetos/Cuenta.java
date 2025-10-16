package ClasesyObjetos;

public class Cuenta {
    
    private int numCuenta;
    private double saldo;
    private static int contadorCuentas = 1000;
    
    public Cuenta(){
        this.numCuenta = contadorCuentas;
        this.saldo = 0;
        contadorCuentas++;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public int getNumeroCuenta(){
        return numCuenta;
    }    
    
    public void ingresarSaldo(double saldo){
        this.saldo += saldo;
        System.out.println("Saldo actual: "+this.saldo);
    }
    
    public void retirarSaldo(double saldo){
        if (this.saldo >= saldo) {
            this.saldo -= saldo;
            System.out.println("Saldo actual: "+this.saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
