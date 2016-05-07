package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import app.pojo.MenuItem;
import app.pojo.ToolBarBtn;
import app.provider.impl.BrakeProblemCalcProviderImpl;
import app.provider.impl.BrakingProviderImpl;
import app.provider.impl.LocoTractionProviderImpl;
import app.provider.impl.MotionEquationProviderImpl;
import app.provider.impl.RailAbilityCalcProviderImpl;
import app.provider.impl.ResistanceProviderImpl;
import app.provider.impl.SampleCalcProviderImpl;
import app.provider.impl.SampleChartProviderImpl;
import app.provider.impl.SpeedAndTimeCalcProviderImpl;

public class Main {
	private JFrame frame;
	private JDesktopPane desktopPane;
	private JTextField main_2_textField_23;
	private JTextField main_2_textField_24;
	private JTextField main_2_textField_25;
	private JTextField main_2_textField_26;
	private JTextField main_2_textField_27;
	private JTextField main_2_textField;
	private JTextField main_2_textField_1;
	private JTextField main_2_textField_2;
	private JTextField main_2_textField_3;
	private JTextField main_2_textField_8;
	private JTextField main_2_textField_9;
	private JTextField main_2_textField_11;
	private JTextField main_2_textField_12;
	private JTextField main_2_textField_13;
	private JTextField main_2_textField_15;
	private JTextField main_2_textField_16;
	private JTextField main_2_textField_18;
	private JTextField main_2_textField_19;
	private JTextField main_2_textField_20;
	private JTextField main_2_textField_21;
	private JTextField main_2_textField_22;
	private JTextField main_2_textField_4;
	private JTextField main_2_textField_5;
	private JTextField main_2_textField_6;
	private JTextField main_2_textField_7;
	private JTextField main_2_textField_10;
	private JTextField main_2_textField_14;
	private JTextField main_2_textField_17;
	
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
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		desktopPane = new JDesktopPane();
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu_function = new JMenu("功能");
		menuBar.add(menu_function);
		
		menu_function.add(new MenuItem("机车牵引力与牵引特性", desktopPane, new LocoTractionProviderImpl()));
		menu_function.add(new MenuItem("列车阻力", desktopPane, new ResistanceProviderImpl()));
		menu_function.add(new MenuItem("列车制动力", desktopPane, new BrakingProviderImpl()));
		menu_function.add(new MenuItem("列车运动方程式及应用", desktopPane, new MotionEquationProviderImpl()));
		menu_function.add(new MenuItem("列车制动问题的解算", desktopPane, new BrakeProblemCalcProviderImpl()));
		menu_function.add(new MenuItem("列车运行速度和时间的计算", desktopPane, new SpeedAndTimeCalcProviderImpl()));
		menu_function.add(new MenuItem("机车能耗量的计算", desktopPane, new SampleCalcProviderImpl()));
		menu_function.add(new MenuItem("牵引质量计算", desktopPane, new SampleCalcProviderImpl()));
		menu_function.add(new MenuItem("铁路能力计算", desktopPane, new RailAbilityCalcProviderImpl()));
		
		JMenu menu_exit = new JMenu("退出");
		menuBar.add(menu_exit);
		
		JMenuItem menuItem = new JMenuItem("退出");
		menuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
		    
		});
		menu_exit.add(menuItem);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		toolBar.setBorder(new LineBorder(Color.DARK_GRAY));
		
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/rail.png"), desktopPane, new SampleChartProviderImpl(false)));
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/save.png"), desktopPane, null));
		toolBar.addSeparator();
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/pause.png"), desktopPane, null));
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/play.png"), desktopPane, new SampleChartProviderImpl(true)));
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/stop.png"), desktopPane, null));
		
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);

		JInternalFrame internalFrame = new JInternalFrame("铁路能力计算", true, true, true, true);
		internalFrame.setBounds(20, 20, 860, 710);
		internalFrame.setVisible(true);
		internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        desktopPane.add(internalFrame);
        
        Container internalContainer = internalFrame.getContentPane();
		GridBagLayout gridbag = new GridBagLayout();
		gridbag.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridbag.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		internalContainer.setLayout(gridbag);
		
		
		
		        
	}
}
