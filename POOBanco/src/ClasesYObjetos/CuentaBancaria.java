package ClasesYObjetos;

import javax.swing.JOptionPane;

public class CuentaBancaria {
    
    private int numeroCuenta;
    private double saldo;
    
    public CuentaBancaria(){
        this.numeroCuenta = 0001;
        this.saldo = 0;
    }
    
    public void depositarSaldo(double deposito){
        if (deposito > 0) {
            saldo += deposito;
        }else{
            JOptionPane.showMessageDialog(null, "Deposito no puede ser menor a 0");
        }
    }
    
    public void retirarSaldo(double retiro){
        if (saldo > retiro) {
            saldo -= retiro;
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }
    
    @Override
    public String toString(){
        return "Cuenta: "+numeroCuenta+"\n"
                + "Saldo: "+saldo;
    }
}