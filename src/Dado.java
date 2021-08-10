
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel Arenas
 */
public class Dado {
    
    private ArrayList<Cara> caras;

    public Dado(int numCaras) {
        this.caras = new ArrayList<>();
   
        for(int i = 0; i<numCaras; ++i){
            caras.add(new Cara(i+1));
        }
    } 
    
    public int girar(){
        Random rand = new Random();
        int random = rand.nextInt(caras.size());
        return caras.get(random).getValor();
    }
}
