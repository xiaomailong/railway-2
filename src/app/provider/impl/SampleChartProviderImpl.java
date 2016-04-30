package app.provider.impl;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import app.ChartUtil;
import app.provider.ChartProvider;

public class SampleChartProviderImpl implements ChartProvider {
	private boolean isMultiXY;
	
	public SampleChartProviderImpl(boolean isMultiXY) {
		this.isMultiXY = isMultiXY;
	}

	@Override
	public JInternalFrame createInternalFrame() {
        JInternalFrame internalFrame = new JInternalFrame("机车类型维护", true, true, true, true);
        internalFrame.setBounds(20, 20, 860, 600);
        internalFrame.setVisible(true);
        internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        
        JPanel chartPanel = null;
        if (isMultiXY) {
        	double[][] data = {{1.0, 500.2},{5.0, 694.1},{4.0, 100.0},{12.5, 734.4},{17.3, 453.2},{21.2, 500.2},{21.9, 600},{25.6, 734.4},{30.0, 453.2}};
            double[][] data2 = {{1.0, 600.2},{5.0, 794.1},{4.0, 200.0},{12.5, 834.4},{17.3, 553.2},{21.2, 600.2},{21.9, 700},{25.6, 834.4},{30.0, 553.2}};
            chartPanel = ChartUtil.createMultiXYLineChartPanel(new double[][][]{data, data2}, "XY Series Demo", "X", "Y");
            
        } else {
        	double[][] data = {{1.0, 500.2},{5.0, 694.1},{4.0, 100.0},{12.5, 734.4},{17.3, 453.2},{21.2, 500.2},{21.9, 600},{25.6, 734.4},{30.0, 453.2}};
        	chartPanel = ChartUtil.createXYLineChartPanel(data, "XY Series Demo", "X", "Y");
        }
        internalFrame.getContentPane().add(chartPanel);
        return internalFrame;
	}

}
