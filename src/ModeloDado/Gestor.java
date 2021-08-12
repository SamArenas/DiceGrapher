package ModeloDado;

import java.util.ArrayList;
/**
 *
 * @author Samuel Arenas
 */
public class Gestor {
    
    private ArrayList<Dado> dados;
    private Histograma histograma;

    public Gestor() {
    }
    /**
     * 
     * @param numDados numero de dados
     * @param caras numero de caras
     */
    public void lanzar(int numDados, int caras, int tiros){
        if(caras<3 || caras>8){
            System.out.println("Elige entre 3 y 8 caras");
            return;
        }
        if(numDados<2 || numDados>5){
            System.out.println("Elige entre 2 y 5 dados");
            return;
        }
        
        asignarDados(numDados,caras);
        
        for(int i = 0; i<tiros; ++i){
            int suma = 0;
            
            for(Dado a: dados){
                  suma += a.girar();
            }
            histograma.actualizar(suma);
        }
        histograma.mostrarResultados();
    }
    
    private void asignarDados(int numDados, int caras){
        this.histograma = new Histograma(caras, numDados);
        this.dados = new ArrayList<>();
         for(int i = 0; i<numDados; i++){
            dados.add(new Dado(caras));
        }
    }
}
