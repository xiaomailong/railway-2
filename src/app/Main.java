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
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "高速铁路通过能力-2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridheight = 7;
		gbc_panel_5.gridwidth = 20;
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 5;
		internalContainer.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0, 0, 0 };
		gbl_panel_5.rowHeights = new int[] { 0, 28, 28, 28, 0, 0, 0, 0 };
		gbl_panel_5.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_5.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel_5.setLayout(gbl_panel_5);
		
		JLabel label = new JLabel("高速列车扣除系数");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_5.add(label, gbc_label);
										
										main_2_textField_22 = new JTextField();
										GridBagConstraints gbc_main_2_textField_22 = new GridBagConstraints();
										gbc_main_2_textField_22.insets = new Insets(0, 0, 5, 5);
										gbc_main_2_textField_22.fill = GridBagConstraints.HORIZONTAL;
										gbc_main_2_textField_22.gridx = 1;
										gbc_main_2_textField_22.gridy = 1;
										panel_5.add(main_2_textField_22, gbc_main_2_textField_22);
										main_2_textField_22.setColumns(10);
										
										JLabel main_2_lblmin_4 = new JLabel("全高速列车的区间通过能力(对/d)");
										GridBagConstraints gbc_main_2_lblmin_4 = new GridBagConstraints();
										gbc_main_2_lblmin_4.anchor = GridBagConstraints.EAST;
										gbc_main_2_lblmin_4.insets = new Insets(0, 0, 5, 5);
										gbc_main_2_lblmin_4.gridx = 2;
										gbc_main_2_lblmin_4.gridy = 1;
										panel_5.add(main_2_lblmin_4, gbc_main_2_lblmin_4);
										
												main_2_textField_25 = new JTextField();
												main_2_textField_25.setEnabled(false);
												main_2_textField_25.setEditable(false);
												GridBagConstraints gbc_locoTractionCoef = new GridBagConstraints();
												gbc_locoTractionCoef.fill = GridBagConstraints.HORIZONTAL;
												gbc_locoTractionCoef.insets = new Insets(0, 0, 5, 5);
												gbc_locoTractionCoef.gridx = 3;
												gbc_locoTractionCoef.gridy = 1;
												panel_5.add(main_2_textField_25, gbc_locoTractionCoef);
												main_2_textField_25.setColumns(10);
								
										JLabel lblNewLabel_2 = new JLabel("计算时间内高速列车扣除系数");
										GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
										gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
										gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
										gbc_lblNewLabel_2.gridx = 0;
										gbc_lblNewLabel_2.gridy = 2;
										panel_5.add(lblNewLabel_2, gbc_lblNewLabel_2);
								
										main_2_textField_23 = new JTextField();
										GridBagConstraints gbc_tunnelCorrectCoef = new GridBagConstraints();
										gbc_tunnelCorrectCoef.fill = GridBagConstraints.HORIZONTAL;
										gbc_tunnelCorrectCoef.insets = new Insets(0, 0, 5, 5);
										gbc_tunnelCorrectCoef.gridx = 1;
										gbc_tunnelCorrectCoef.gridy = 2;
										panel_5.add(main_2_textField_23, gbc_tunnelCorrectCoef);
										main_2_textField_23.setColumns(10);
						
								JLabel lblNewLabel_9 = new JLabel("全高速列车的小时区间最大通过能力(对/d)");
								GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
								gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
								gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
								gbc_lblNewLabel_9.gridx = 2;
								gbc_lblNewLabel_9.gridy = 2;
								panel_5.add(lblNewLabel_9, gbc_lblNewLabel_9);
				
						main_2_textField_26 = new JTextField();
						main_2_textField_26.setEnabled(false);
						main_2_textField_26.setEditable(false);
						GridBagConstraints gbc_altitudeCorrctCoef = new GridBagConstraints();
						gbc_altitudeCorrctCoef.fill = GridBagConstraints.HORIZONTAL;
						gbc_altitudeCorrctCoef.insets = new Insets(0, 0, 5, 5);
						gbc_altitudeCorrctCoef.gridx = 3;
						gbc_altitudeCorrctCoef.gridy = 2;
						panel_5.add(main_2_textField_26, gbc_altitudeCorrctCoef);
						main_2_textField_26.setColumns(10);
		
				JLabel lblNewLabel_3 = new JLabel("区间通过能力使用系数");
				GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
				gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_3.gridx = 0;
				gbc_lblNewLabel_3.gridy = 3;
				panel_5.add(lblNewLabel_3, gbc_lblNewLabel_3);
				
						main_2_textField_24 = new JTextField();
						GridBagConstraints gbc_airCorrectCoef = new GridBagConstraints();
						gbc_airCorrectCoef.fill = GridBagConstraints.HORIZONTAL;
						gbc_airCorrectCoef.insets = new Insets(0, 0, 5, 5);
						gbc_airCorrectCoef.gridx = 1;
						gbc_airCorrectCoef.gridy = 3;
						panel_5.add(main_2_textField_24, gbc_airCorrectCoef);
						main_2_textField_24.setColumns(10);
		
				JLabel lblNewLabel_10 = new JLabel("全高速列车的区间使用能力(对/d)");
				GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
				gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_10.gridx = 2;
				gbc_lblNewLabel_10.gridy = 3;
				panel_5.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
				main_2_textField_27 = new JTextField();
				main_2_textField_27.setEnabled(false);
				main_2_textField_27.setEditable(false);
				GridBagConstraints gbc_locoTractionForce = new GridBagConstraints();
				gbc_locoTractionForce.insets = new Insets(0, 0, 5, 5);
				gbc_locoTractionForce.fill = GridBagConstraints.HORIZONTAL;
				gbc_locoTractionForce.gridx = 3;
				gbc_locoTractionForce.gridy = 3;
				panel_5.add(main_2_textField_27, gbc_locoTractionForce);
				main_2_textField_27.setColumns(10);
		
		JLabel label_1 = new JLabel("中速列车扣除系数");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 4;
		panel_5.add(label_1, gbc_label_1);
		
		main_2_textField_4 = new JTextField();
		GridBagConstraints gbc_main_2_textField_4 = new GridBagConstraints();
		gbc_main_2_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_4.gridx = 1;
		gbc_main_2_textField_4.gridy = 4;
		panel_5.add(main_2_textField_4, gbc_main_2_textField_4);
		main_2_textField_4.setColumns(10);
		
		JLabel label_2 = new JLabel("列车运行图中的中速列车比重");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 4;
		panel_5.add(label_2, gbc_label_2);
		
		main_2_textField_5 = new JTextField();
		GridBagConstraints gbc_main_2_textField_5 = new GridBagConstraints();
		gbc_main_2_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_5.gridx = 3;
		gbc_main_2_textField_5.gridy = 4;
		panel_5.add(main_2_textField_5, gbc_main_2_textField_5);
		main_2_textField_5.setColumns(10);
		
		JLabel label_4 = new JLabel("高、中速列车的平均扣除系数");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 5;
		panel_5.add(label_4, gbc_label_4);
		
		main_2_textField_6 = new JTextField();
		main_2_textField_6.setEditable(false);
		main_2_textField_6.setEnabled(false);
		GridBagConstraints gbc_main_2_textField_6 = new GridBagConstraints();
		gbc_main_2_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_6.gridx = 1;
		gbc_main_2_textField_6.gridy = 5;
		panel_5.add(main_2_textField_6, gbc_main_2_textField_6);
		main_2_textField_6.setColumns(10);
		
		JLabel label_6 = new JLabel("不同速度等级列车混运条件下的区间最大通过能力(对/列)");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 2;
		gbc_label_6.gridy = 5;
		panel_5.add(label_6, gbc_label_6);
		
		main_2_textField_7 = new JTextField();
		GridBagConstraints gbc_main_2_textField_7 = new GridBagConstraints();
		gbc_main_2_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_7.gridx = 3;
		gbc_main_2_textField_7.gridy = 5;
		panel_5.add(main_2_textField_7, gbc_main_2_textField_7);
		main_2_textField_7.setColumns(10);
		
		JLabel label_10 = new JLabel("指定铺画的中速列车数(对/列)");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.EAST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 0;
		gbc_label_10.gridy = 6;
		panel_5.add(label_10, gbc_label_10);
		
		main_2_textField_10 = new JTextField();
		GridBagConstraints gbc_main_2_textField_10 = new GridBagConstraints();
		gbc_main_2_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_10.gridx = 1;
		gbc_main_2_textField_10.gridy = 6;
		panel_5.add(main_2_textField_10, gbc_main_2_textField_10);
		main_2_textField_10.setColumns(10);
		
		JLabel label_11 = new JLabel("不同速度等级列车混运的区间使用能力(对/列)");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.EAST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 2;
		gbc_label_11.gridy = 6;
		panel_5.add(label_11, gbc_label_11);
		
		main_2_textField_14 = new JTextField();
		main_2_textField_14.setEnabled(false);
		main_2_textField_14.setEditable(false);
		GridBagConstraints gbc_main_2_textField_14 = new GridBagConstraints();
		gbc_main_2_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_14.gridx = 3;
		gbc_main_2_textField_14.gridy = 6;
		panel_5.add(main_2_textField_14, gbc_main_2_textField_14);
		main_2_textField_14.setColumns(10);
		
		JButton main_2_button_1 = new JButton("开始计算");
		GridBagConstraints gbc_main_2_button_1 = new GridBagConstraints();
		gbc_main_2_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_button_1.gridx = 3;
		gbc_main_2_button_1.gridy = 7;
		panel_5.add(main_2_button_1, gbc_main_2_button_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "高速铁路客运能力", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.gridwidth = 20;
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 1;
		gbc_panel_6.gridy = 12;
		internalFrame.getContentPane().add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{130, 169, 117, 169, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{28, 28, 28, 28};
		gbl_panel_6.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lbld_3 = new JLabel("列车平均定员(人/列)");
		GridBagConstraints gbc_lbld_3 = new GridBagConstraints();
		gbc_lbld_3.anchor = GridBagConstraints.EAST;
		gbc_lbld_3.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_3.gridx = 0;
		gbc_lbld_3.gridy = 0;
		panel_6.add(lbld_3, gbc_lbld_3);
		
		main_2_textField_8 = new JTextField();
		main_2_textField_8.setColumns(10);
		GridBagConstraints gbc_main_2_textField_8 = new GridBagConstraints();
		gbc_main_2_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_8.gridx = 1;
		gbc_main_2_textField_8.gridy = 0;
		panel_6.add(main_2_textField_8, gbc_main_2_textField_8);
		
		JLabel label_18 = new JLabel("列车平均载客率(%)");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.anchor = GridBagConstraints.EAST;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 2;
		gbc_label_18.gridy = 0;
		panel_6.add(label_18, gbc_label_18);
		
		main_2_textField_9 = new JTextField();
		main_2_textField_9.setColumns(10);
		GridBagConstraints gbc_main_2_textField_9 = new GridBagConstraints();
		gbc_main_2_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_9.gridx = 3;
		gbc_main_2_textField_9.gridy = 0;
		panel_6.add(main_2_textField_9, gbc_main_2_textField_9);
		
		JLabel lbld_4 = new JLabel("月间客流波动系数");
		GridBagConstraints gbc_lbld_4 = new GridBagConstraints();
		gbc_lbld_4.anchor = GridBagConstraints.EAST;
		gbc_lbld_4.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_4.gridx = 0;
		gbc_lbld_4.gridy = 1;
		panel_6.add(lbld_4, gbc_lbld_4);
		
		main_2_textField_12 = new JTextField();
		GridBagConstraints gbc_main_2_textField_12 = new GridBagConstraints();
		gbc_main_2_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_12.gridx = 1;
		gbc_main_2_textField_12.gridy = 1;
		panel_6.add(main_2_textField_12, gbc_main_2_textField_12);
		main_2_textField_12.setColumns(10);
		
		JLabel lbla = new JLabel("一列旅客列车的年运量(万人/a)");
		GridBagConstraints gbc_lbla = new GridBagConstraints();
		gbc_lbla.anchor = GridBagConstraints.EAST;
		gbc_lbla.insets = new Insets(0, 0, 5, 5);
		gbc_lbla.gridx = 2;
		gbc_lbla.gridy = 1;
		panel_6.add(lbla, gbc_lbla);
		
		main_2_textField_15 = new JTextField();
		main_2_textField_15.setEditable(false);
		main_2_textField_15.setEnabled(false);
		GridBagConstraints gbc_main_2_textField_15 = new GridBagConstraints();
		gbc_main_2_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_15.gridx = 3;
		gbc_main_2_textField_15.gridy = 1;
		panel_6.add(main_2_textField_15, gbc_main_2_textField_15);
		main_2_textField_15.setColumns(10);
		
		JLabel lbld_5 = new JLabel("全高速列车的区间通过能力(对/d)");
		GridBagConstraints gbc_lbld_5 = new GridBagConstraints();
		gbc_lbld_5.anchor = GridBagConstraints.EAST;
		gbc_lbld_5.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_5.gridx = 0;
		gbc_lbld_5.gridy = 2;
		panel_6.add(lbld_5, gbc_lbld_5);
		
		main_2_textField_13 = new JTextField();
		GridBagConstraints gbc_main_2_textField_13 = new GridBagConstraints();
		gbc_main_2_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_13.gridx = 1;
		gbc_main_2_textField_13.gridy = 2;
		panel_6.add(main_2_textField_13, gbc_main_2_textField_13);
		main_2_textField_13.setColumns(10);
		
		JLabel lbld_1 = new JLabel("一列高速列车的年输送能力(对/d)");
		GridBagConstraints gbc_lbld_1 = new GridBagConstraints();
		gbc_lbld_1.anchor = GridBagConstraints.EAST;
		gbc_lbld_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_1.gridx = 2;
		gbc_lbld_1.gridy = 2;
		panel_6.add(lbld_1, gbc_lbld_1);
		
		main_2_textField_16 = new JTextField();
		GridBagConstraints gbc_main_2_textField_16 = new GridBagConstraints();
		gbc_main_2_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_16.gridx = 3;
		gbc_main_2_textField_16.gridy = 2;
		panel_6.add(main_2_textField_16, gbc_main_2_textField_16);
		main_2_textField_16.setColumns(10);
		
		JLabel lbla_1 = new JLabel("全高速列车运行的线路输送能力(万人/a)");
		GridBagConstraints gbc_lbla_1 = new GridBagConstraints();
		gbc_lbla_1.anchor = GridBagConstraints.EAST;
		gbc_lbla_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbla_1.gridx = 0;
		gbc_lbla_1.gridy = 3;
		panel_6.add(lbla_1, gbc_lbla_1);
		
		main_2_textField_18 = new JTextField();
		main_2_textField_18.setEnabled(false);
		main_2_textField_18.setEditable(false);
		GridBagConstraints gbc_main_2_textField_18 = new GridBagConstraints();
		gbc_main_2_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_18.gridx = 1;
		gbc_main_2_textField_18.gridy = 3;
		panel_6.add(main_2_textField_18, gbc_main_2_textField_18);
		main_2_textField_18.setColumns(10);
		
		JLabel lbld_2 = new JLabel("一列中速和普通列车的年输送能力(对/d)");
		GridBagConstraints gbc_lbld_2 = new GridBagConstraints();
		gbc_lbld_2.anchor = GridBagConstraints.EAST;
		gbc_lbld_2.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_2.gridx = 0;
		gbc_lbld_2.gridy = 4;
		panel_6.add(lbld_2, gbc_lbld_2);
		
		main_2_textField_19 = new JTextField();
		GridBagConstraints gbc_main_2_textField_19 = new GridBagConstraints();
		gbc_main_2_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_19.gridx = 1;
		gbc_main_2_textField_19.gridy = 4;
		panel_6.add(main_2_textField_19, gbc_main_2_textField_19);
		main_2_textField_19.setColumns(10);
		
		JLabel lbld_6 = new JLabel("不同速度等级列车混运条件下高速");
		GridBagConstraints gbc_lbld_6 = new GridBagConstraints();
		gbc_lbld_6.anchor = GridBagConstraints.EAST;
		gbc_lbld_6.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_6.gridx = 2;
		gbc_lbld_6.gridy = 4;
		panel_6.add(lbld_6, gbc_lbld_6);
		
		JLabel lbld_8 = new JLabel("、中速和普通列车的使用能力(对/d)");
		GridBagConstraints gbc_lbld_8 = new GridBagConstraints();
		gbc_lbld_8.anchor = GridBagConstraints.WEST;
		gbc_lbld_8.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_8.gridx = 3;
		gbc_lbld_8.gridy = 4;
		panel_6.add(lbld_8, gbc_lbld_8);
		
		JLabel lbla_2 = new JLabel("不同速度等级列车混运的");
		GridBagConstraints gbc_lbla_2 = new GridBagConstraints();
		gbc_lbla_2.anchor = GridBagConstraints.EAST;
		gbc_lbla_2.insets = new Insets(0, 0, 5, 5);
		gbc_lbla_2.gridx = 0;
		gbc_lbla_2.gridy = 5;
		panel_6.add(lbla_2, gbc_lbla_2);
		
		JButton main_2_button_2 = new JButton("开始计算");
		main_2_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lbla_3 = new JLabel("线路输送能力(万人/a)");
		GridBagConstraints gbc_lbla_3 = new GridBagConstraints();
		gbc_lbla_3.anchor = GridBagConstraints.WEST;
		gbc_lbla_3.insets = new Insets(0, 0, 5, 5);
		gbc_lbla_3.gridx = 1;
		gbc_lbla_3.gridy = 5;
		panel_6.add(lbla_3, gbc_lbla_3);
		
		main_2_textField_20 = new JTextField();
		GridBagConstraints gbc_main_2_textField_20 = new GridBagConstraints();
		gbc_main_2_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_20.gridx = 3;
		gbc_main_2_textField_20.gridy = 5;
		panel_6.add(main_2_textField_20, gbc_main_2_textField_20);
		main_2_textField_20.setColumns(10);
		
		main_2_textField_17 = new JTextField();
		main_2_textField_17.setEnabled(false);
		main_2_textField_17.setEditable(false);
		GridBagConstraints gbc_main_2_textField_17 = new GridBagConstraints();
		gbc_main_2_textField_17.insets = new Insets(0, 0, 0, 5);
		gbc_main_2_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_17.gridx = 1;
		gbc_main_2_textField_17.gridy = 6;
		panel_6.add(main_2_textField_17, gbc_main_2_textField_17);
		main_2_textField_17.setColumns(10);
		GridBagConstraints gbc_main_2_button_2 = new GridBagConstraints();
		gbc_main_2_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_main_2_button_2.gridx = 3;
		gbc_main_2_button_2.gridy = 6;
		panel_6.add(main_2_button_2, gbc_main_2_button_2);
        
        JButton main_2_button_3 = new JButton("第一页");
        main_2_button_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        GridBagConstraints gbc_main_2_button_3 = new GridBagConstraints();
        gbc_main_2_button_3.insets = new Insets(0, 0, 0, 5);
        gbc_main_2_button_3.gridx = 4;
        gbc_main_2_button_3.gridy = 6;
        panel_6.add(main_2_button_3, gbc_main_2_button_3);
        
	}
}
