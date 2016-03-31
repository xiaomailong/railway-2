/**
 * 
 */
package app;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * @author I310818
 *
 */
public final class ChartUtil {
    private ChartUtil() {
        
    }
    
    public static ChartPanel drawChartPanel(double[][] coordinates, String title, String xAxisLabel, String yAxisLabel) {
        final XYSeries series = new XYSeries("");
        for (double[] coordinate : coordinates) {
            double x = coordinate[0];
            double y = coordinate[1];
            series.add(x, y);
        }
        final XYSeriesCollection data = new XYSeriesCollection(series);
        final JFreeChart chart = ChartFactory.createXYLineChart(title, xAxisLabel, yAxisLabel,
                data, PlotOrientation.VERTICAL, true, true, false);

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        return chartPanel;
    }
}
