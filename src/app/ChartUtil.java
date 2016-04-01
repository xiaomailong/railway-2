/**
 * 
 */
package app;

import java.awt.Color;
import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;

/**
 * @author I310818
 *
 */
public final class ChartUtil {
    private ChartUtil() {
        
    }
    
    public static ChartPanel createXYLineChartPanel(double[][] coordinates, String title, String xAxisLabel, String yAxisLabel) {
        final XYSeries series = new XYSeries("系列1");
        for (double[] coordinate : coordinates) {
            double x = coordinate[0];
            double y = coordinate[1];
            series.add(x, y);
        }
        final XYSeriesCollection data = new XYSeriesCollection(series);
        final JFreeChart chart = ChartFactory.createXYLineChart(title, xAxisLabel, yAxisLabel,
                data, PlotOrientation.VERTICAL, true, true, false);

        final ChartPanel chartPanel = new ChartPanel(chart);
        chart.getLegend().setItemFont(new Font("黑体", 12, 12));
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        return chartPanel;
    }
    
    public static ChartPanel createMultiXYLineChartPanel(double[][][] coordinates, String title, String xAxisLabel, String yAxisLabel) {
        XYSeriesCollection[] datasets = new XYSeriesCollection[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            final XYSeries series = new XYSeries(new String("系列" + i));
            for (double[] coordinate : coordinates[i]) {
                double x = coordinate[0];
                double y = coordinate[1];
                series.add(x, y);
            }
            datasets[i] = new XYSeriesCollection(series);
        }
        final JFreeChart chart = ChartFactory.createXYLineChart(title, xAxisLabel, yAxisLabel,
                datasets[0], PlotOrientation.VERTICAL, true, true, false);
        XYPlot plot = chart.getXYPlot();
        NumberAxis axis2 = new NumberAxis("Second Axis");
        axis2.setAxisLinePaint(Color.BLUE);
        axis2.setLabelPaint(Color.BLUE);
        axis2.setTickLabelPaint(Color.BLUE);
        
        plot.setRangeAxis(1, axis2);
        plot.setDataset(1, datasets[1]);
        plot.mapDatasetToRangeAxis(1, 1);
        XYLineAndShapeRenderer render2 =  new XYLineAndShapeRenderer(); 
        render2.setSeriesPaint(0, Color.BLUE);
        plot.setRenderer(1, render2);
        TextTitle copyright = new TextTitle(" 电算系统  ");
        copyright.setPosition(RectangleEdge.BOTTOM);
        copyright.setHorizontalAlignment(HorizontalAlignment.RIGHT);
        copyright.setFont(new Font("黑体", 12, 12));
        chart.addSubtitle(copyright);
        chart.getLegend().setItemFont(new Font("黑体", 12, 12));
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        return chartPanel;
    }
}
