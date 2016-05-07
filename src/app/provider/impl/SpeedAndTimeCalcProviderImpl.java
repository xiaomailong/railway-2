/**
 * 
 */
package app.provider.impl;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import app.provider.CalcProvider;

/**
 * @author I310818
 *
 */
public class SpeedAndTimeCalcProviderImpl implements CalcProvider {

    /* (non-Javadoc)
     * @see app.provider.CalcProvider#createInternalFrame()
     */
    @Override
    public JInternalFrame createInternalFrame() {
		JInternalFrame internalFrame = new JInternalFrame("列车运行速度和时间的计算", true, true, true, true);
		internalFrame.setBounds(20, 20, 260, 300);
		internalFrame.setVisible(true);
		internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        
		Container internalContainer = internalFrame.getContentPane();
        internalContainer.setLayout(null);
        
        JLabel label = new JLabel("生成图形");
        label.setBounds(29, 30, 100, 30);
        internalFrame.getContentPane().add(label);
        
        JButton button = new JButton("区间速度曲线");
        button.setBounds(29, 60, 150, 50);
        internalFrame.getContentPane().add(button);
        
        JButton button_1 = new JButton("区间时间曲线");
        button_1.setBounds(29, 120, 150, 50);
        internalFrame.getContentPane().add(button_1);
        
        return internalFrame;
    }

}
