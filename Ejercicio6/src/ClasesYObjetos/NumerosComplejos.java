package ClasesYObjetos;
/*
    Ejercicio 6: Construir un programa para trabajar con 2 números complejos, 
    implemente el siguiente menú:
        1. Sumar dos números complejos
        2. Multiplicar 2 números complejos
        3. Comparar 2 números complejos (iguales o no)
        4. Multiplicar un número complejos por un entero
*/
public class NumerosComplejos {
    
    private int numeroReal,numeroImaginario;
    private int numeroReal2,numeroImaginario2;

    //Constructor sumar, multiplicar y comparar
    public NumerosComplejos(int numeroReal, int numeroImaginario, int numeroReal2, int numeroImaginario2) {
        this.numeroReal = numeroReal;
        this.numeroImaginario = numeroImaginario;
        this.numeroReal2 = numeroReal2;
        this.numeroImaginario2 = numeroImaginario2;
    }
    
    //Constructor un numero complejo
    public NumerosComplejos(int numeroReal, int numeroImaginario){
        this.numeroReal = numeroReal;
        this.numeroImaginario = numeroImaginario;
    }
    
    public String sumaComplejos(){
        return (numeroReal + numeroReal2)+" + "+(numeroImaginario+numeroImaginario2)+"i";
    }
    
    public String multiplicacionComplejos(){
        int reales = numeroReal * numeroReal2;
        int imaginarios1 = numeroReal * numeroImaginario2;
        int imaginarios2 = numeroImaginario * numeroReal2;
        int imaginariosCuadrado = numeroImaginario * numeroImaginario2;
        
        return (imaginariosCuadrado)+"iº + "+(imaginarios1+imaginarios2)+"i + "+reales;
    }
    
    public boolean comparacionComplejos(){
        boolean iguales = false;
        if (numeroReal == numeroReal2) {
            if (numeroImaginario == numeroImaginario2) {
                iguales = true;
            }
        }
        return iguales;
    }
    
    public String multiplicarEntero(int numero){
        int reales = numeroReal * numero;
        int imaginarios = numeroImaginario * numero;
        
        return (reales)+" + "+imaginarios+"i";
    }    
}