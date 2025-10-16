package ClasesYObjetos;

import javax.swing.JOptionPane;

public class MainCarrera {
    
    public static int corredorGanador(Carrera runing[]){
        int indice = 1;
        int bandera = 0;
        float corredorVeloz = runing[0].getTiempoCarrea();
        
        while(indice < runing.length){
            if (runing[indice].getTiempoCarrea() < corredorVeloz) {
                corredorVeloz = runing[indice].getTiempoCarrea();
                bandera = indice;
            }
            indice ++;
        }
        return bandera;
    }
    
    public static void main(String[] args) {
        
        //Cosntruimos variables
        int numeroAtleta, numeroCorredores;
        String nombreAtleta;
        float tiempoCarrera;
        int runWinner;
        
        numeroCorredores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuemero total de corredores a participar"));
        Carrera runing[] = new Carrera[numeroCorredores];
        
        for (int i = 0; i < runing.length; i++) {
            numeroAtleta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de atleta"));
            nombreAtleta = JOptionPane.showInputDialog("Ingrese nombre del atleta");
            tiempoCarrera = Float.parseFloat(JOptionPane.showInputDialog("Ingrese tiempo de carrera"));
            
            runing[i] = new Carrera(numeroAtleta, nombreAtleta, tiempoCarrera);
        }
        
        runWinner = corredorGanador(runing);
        
        System.out.println(runing[runWinner].imprimirGanador());
    }
}