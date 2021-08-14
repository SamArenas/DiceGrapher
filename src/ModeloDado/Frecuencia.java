package ModeloDado;

import java.util.ArrayList;

/**
 *
 * @author Samuel Arenas
 */
public class Frecuencia {

    private int tiros;
    private final int max;
    private final int min;
    private ArrayList<Integer> valores = new ArrayList<>();

    public Frecuencia(int caras, int dados) {
        max = caras * dados;
        min = dados;
        this.tiros = 0;
        for (int i = min; i < max + 1; i++) {
            this.valores.add(0);
        }
    }

    public void incrementar(int num) {
        int update = valores.get(num - min);
        valores.set(num - min, update + 1);
        tiros++;
    }

    public int getTiros() {
        return tiros;
    }

    public ArrayList getValores() {
        return valores;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

}
