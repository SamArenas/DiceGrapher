package ModeloDado;

import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Samuel Arenas
 */
public class Histograma {

    private Frecuencia frecuencias;

    public Histograma(int caras, int lados) {
        this.frecuencias = new Frecuencia(caras, lados);
    }

    public JFreeChart mostrarResultados() {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        int tiros = frecuencias.getTiros();
        int min = frecuencias.getMin();

        ArrayList<Integer> frec = frecuencias.getValores();

        for (int a : frec) {
            double porcentaje = (double) a / tiros * 100;

            datos.setValue(porcentaje, String.format("%.2f", porcentaje) + "%", String.valueOf(min));
            ++min;
        }

        JFreeChart grafica = ChartFactory.createBarChart3D(
                "Simulador de Dados de " + tiros + " Tiros",
                "Suma de Dados",
                "Porcentaje (%)",
                datos,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
        grafica.setAntiAlias(true);
        grafica.setTextAntiAlias(true);
        return grafica;
    }

    public void actualizar(int num) {
        frecuencias.incrementar(num);
    }

    public Frecuencia getFrecuencias() {
        return frecuencias;
    }
}
