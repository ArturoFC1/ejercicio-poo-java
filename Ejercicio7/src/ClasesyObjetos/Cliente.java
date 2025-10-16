package ClasesyObjetos;
/*
    Ejercicio 7: Hacer un programa sencillo para realiza gestiones en un banco 
    para lo cual tendremos 2 clases (Cliente y Cuenta). Considerar que un cliente se 
    caracteriza por su nombre, apellido y DNI. EI cliente puede consultar saldo, así 
    como ingresar y retirar dinero de sus cuentas. Además cada cuenta se caracteriza 
    por un número de cuenta y un saldo.
*/
public class Cliente {
    
    private String nombre;
    private String apellido;
    private int DNI;
    private Cuenta cuentas [];
    
    public Cliente(String nombre, String apellido, int DNI, Cuenta [] cuentas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuentas = cuentas;
    }
    
    public Cuenta[] getCuentas() {
    return cuentas;
}

    @Override
    public String toString(){
        return "--Datos bancarios--\n"
                + "Nombre: "+nombre+"\n"
                + "Apellido: "+apellido+"\n"
                + "DNI: "+DNI+"\n"
                + "Numero de cuentas: "+cuentas.length;
        
    }
}