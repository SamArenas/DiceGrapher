package ModeloDado;

import java.util.ArrayList;
/**
 *
 * @author Samuel Arenas
 */
public class Histograma {
    private Frecuencia frecuencias;

    public Histograma(int caras, int lados) {
        this.frecuencias = new Frecuencia(caras, lados);
    }
    
    public void mostrarResultados(){
        int tiros  = frecuencias.getTiros();
        int min = frecuencias.getMin();
        
        ArrayList<Integer> frec = frecuencias.getValores();
        System.out.println("\nTOTAL DE TIROS: " + tiros);
        System.out.println("SUMA   %   VECES");
        
        for(int a: frec){
            double porcentaje = (double)a/tiros;
            String asterisco="";
            for(int i =0; i<(porcentaje*100); ++i){
                asterisco+="*";
            }
            System.out.println(min +"  " + String.format("%.2f",porcentaje) + "%  " + asterisco);
            ++min;
        }
    }

    public void actualizar(int num){
        frecuencias.incrementar(num);
    }
    
    public Frecuencia getFrecuencias() {
        return frecuencias;
    }
    
    
    
}
