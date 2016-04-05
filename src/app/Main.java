package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import app.provider.CalcProvider;
import app.provider.impl.SampleProviderImpl;

public class Main {
	private JFrame frame;
	private JDesktopPane desktopPane;
	private JInternalFrame charInternalFrame;
    private JInternalFrame char2InternalFrame;
	private JInternalFrame electricPowerFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
            public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("退出");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("退出");
		menuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
		    
		});
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("耗电量计算");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("电力机车");
		menuItem_1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (electricPowerFrame == null) {
                    CalcProvider provider = new SampleProviderImpl();
                    electricPowerFrame = provider.createInternalFrame();
                    desktopPane.add(electricPowerFrame);
                } else {
                    electricPowerFrame.show();
                    electricPowerFrame.toFront();
                }
            }
            
        });
		menu_1.add(menuItem_1);
		
		JMenu menu_2 = new JMenu("牵引计算");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_2 = new JMenuItem("电力机车");
		menu_2.add(menuItem_2);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		toolBar.setBorder(new LineBorder(Color.DARK_GRAY));
		
		JButton railBtn = new JButton("");
		toolBar.add(railBtn);
		railBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/rail.png")));
		railBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (charInternalFrame == null) {
                    double[][] data = {{1.0, 500.2},{5.0, 694.1},{4.0, 100.0},{12.5, 734.4},{17.3, 453.2},{21.2, 500.2},{21.9, 600},{25.6, 734.4},{30.0, 453.2}};
                    JPanel chartPanel = ChartUtil.createXYLineChartPanel(data, "XY Series Demo", "X", "Y");
                    charInternalFrame = new JInternalFrame("机车类型维护", true, true, true, true);
                    charInternalFrame.setBounds(20, 20, 860, 600);
                    desktopPane.add(charInternalFrame);
                    charInternalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                    charInternalFrame.setVisible(true);
                    charInternalFrame.getContentPane().add(chartPanel);
                } else {
                    charInternalFrame.show();
                    charInternalFrame.toFront();
                }
            }
        });
		
		JButton saveBtn = new JButton("");
		toolBar.add(saveBtn);
		saveBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/save.png")));
		toolBar.addSeparator();
		
		JButton pauseBtn = new JButton("");
		toolBar.add(pauseBtn);
		pauseBtn.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
			}
		});
		pauseBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/pause.png")));
		
		JButton playBtn = new JButton("");
		toolBar.add(playBtn);
		playBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/play.png")));
		playBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (char2InternalFrame == null) {
                    double[][] data = {{1.0, 500.2},{5.0, 694.1},{4.0, 100.0},{12.5, 734.4},{17.3, 453.2},{21.2, 500.2},{21.9, 600},{25.6, 734.4},{30.0, 453.2}};
                    double[][] data2 = {{1.0, 600.2},{5.0, 794.1},{4.0, 200.0},{12.5, 834.4},{17.3, 553.2},{21.2, 600.2},{21.9, 700},{25.6, 834.4},{30.0, 553.2}};
                    JPanel chartPanel = ChartUtil.createMultiXYLineChartPanel(new double[][][]{data, data2}, "XY Series Demo", "X", "Y");
                    char2InternalFrame = new JInternalFrame("机车类型维护", true, true, true, true);
                    char2InternalFrame.setBounds(20, 20, 860, 600);
                    desktopPane.add(char2InternalFrame);
                    char2InternalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                    char2InternalFrame.setVisible(true);
                    char2InternalFrame.getContentPane().add(chartPanel);
                } else {
                    char2InternalFrame.show();
                    char2InternalFrame.toFront();
                }
            }
        });
		
		JButton stopBtn = new JButton("");
		toolBar.add(stopBtn);
		stopBtn.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
			}
		});
		stopBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/stop.png")));
		
		desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
	}
}
