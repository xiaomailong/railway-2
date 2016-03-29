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

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import javax.swing.border.LineBorder;

import formula.Six;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Main {

	private JFrame frame;
	private JInternalFrame internalFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_2;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
		frame.setBounds(100, 100, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("数据准备");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("数据准备");
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("牵引计算");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("牵引计算");
		menu_1.add(menuItem_1);
		
		JMenu menu_2 = new JMenu("结果数据");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_2 = new JMenuItem("结果数据");
		menu_2.add(menuItem_2);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		toolBar.setBorder(new LineBorder(Color.DARK_GRAY));
		
		JButton railBtn = new JButton("");
		toolBar.add(railBtn);
		railBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/rail.png")));
		
		JButton saveBtn = new JButton("");
		toolBar.add(saveBtn);
		saveBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/save.png")));
		toolBar.addSeparator();
		
		JButton pauseBtn = new JButton("");
		toolBar.add(pauseBtn);
		pauseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pauseBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/pause.png")));
		
		JButton playBtn = new JButton("");
		toolBar.add(playBtn);
		playBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/play.png")));
		
		JButton stopBtn = new JButton("");
		toolBar.add(stopBtn);
		stopBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		stopBtn.setIcon(new ImageIcon(Main.class.getResource("/icon/stop.png")));
		
		JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		internalFrame = new JInternalFrame("机车类型维护", true, true, true, true);
		internalFrame.setBounds(20, 20, 860, 600);
		desktopPane.add(internalFrame);
		internalFrame.setVisible(true);
		
		Container internalContainer = internalFrame.getContentPane();
		GridBagLayout gridbag = new GridBagLayout();
		gridbag.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		gridbag.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		internalContainer.setLayout(gridbag);
						
						JPanel panel_6 = new JPanel();
						panel_6.setLayout(null);
						GridBagConstraints gbc_panel_6 = new GridBagConstraints();
						gbc_panel_6.gridheight = 3;
						gbc_panel_6.gridwidth = 7;
						gbc_panel_6.insets = new Insets(0, 0, 5, 5);
						gbc_panel_6.fill = GridBagConstraints.BOTH;
						gbc_panel_6.gridx = 1;
						gbc_panel_6.gridy = 0;
						internalFrame.getContentPane().add(panel_6, gbc_panel_6);
						JLabel label = new JLabel("机车类型名");
						label.setBounds(21, 13, 65, 16);
						panel_6.add(label);
				JComboBox<String> comboBox = new JComboBox<String>(Six.Type.getModelNameList());
				comboBox.setBounds(98, 9, 165, 27);
				panel_6.add(comboBox);
				comboBox.setFocusable(false);
				comboBox.setOpaque(false);
				comboBox.setBackground(Color.white);
				
						JButton btnNewButton = new JButton("修改机车名称");
						btnNewButton.setBounds(86, 37, 122, 29);
						panel_6.add(btnNewButton);
						
						JLabel label_1 = new JLabel("参数数据存盘文件名");
						label_1.setBounds(5, 78, 117, 16);
						panel_6.add(label_1);
						
						textField = new JTextField();
						textField.setBounds(134, 72, 168, 28);
						panel_6.add(textField);
						textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u673A\u8F66\u63CF\u8FF0\u53C2\u6570", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 3;
		gbc_panel_1.gridwidth = 13;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 8;
		gbc_panel_1.gridy = 0;
		internalFrame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		panel_1.add(panel_3, gbc_panel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("电力");
		rdbtnNewRadioButton.setSelected(true);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("内燃");
		panel_3.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_16 = new JLabel("牵引手柄位数");
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 3;
		gbc_lblNewLabel_16.gridy = 1;
		panel_1.add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 1;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridwidth = 2;
		gbc_panel_5.insets = new Insets(0, 0, 0, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 2;
		panel_1.add(panel_5, gbc_panel_5);
		
		JRadioButton radioButton = new JRadioButton("有级");
		radioButton.setSelected(true);
		panel_5.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("无级");
		panel_5.add(radioButton_1);
		
		JLabel label_2 = new JLabel("动力制动手柄位数");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 2;
		panel_1.add(label_2, gbc_label_2);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 4;
		gbc_textField_7.gridy = 2;
		panel_1.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u673A\u8F66\u7ED3\u6784\u53C2\u6570", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 7;
		gbc_panel_2.gridwidth = 15;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 4;
		internalFrame.getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("制动筒瓦类型");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"中磷铸铁"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 0;
		panel_2.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblNewLabel_8 = new JLabel("制动系数");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 1;
		panel_2.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 1;
		panel_2.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("车长(米)");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		panel_2.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("最大计算牵引力");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 2;
		panel_2.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 0);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 3;
		gbc_textField_10.gridy = 2;
		panel_2.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("计算重量(吨)");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		panel_2.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("最低计算速度");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 3;
		panel_2.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 0);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 3;
		gbc_textField_11.gridy = 3;
		panel_2.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("心盘中心距(米)");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		panel_2.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("计算起动牵引力");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 2;
		gbc_lblNewLabel_11.gridy = 4;
		panel_2.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 0);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 3;
		gbc_textField_12.gridy = 4;
		panel_2.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("轮数(个)");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		panel_2.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("计算起动阻力");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 2;
		gbc_lblNewLabel_12.gridy = 5;
		panel_2.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 0);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 3;
		gbc_textField_13.gridy = 5;
		panel_2.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("轮径(毫米)");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 6;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		panel_2.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("内燃:燃油消耗量\n电力:电流");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 2;
		gbc_lblNewLabel_13.gridy = 6;
		panel_2.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 0);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 3;
		gbc_textField_14.gridy = 6;
		panel_2.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("制动机型号");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 7;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"机车用"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 7;
		panel_2.add(comboBox_2, gbc_comboBox_2);
		
		JLabel lblNewLabel_14 = new JLabel("牵引运行时自用电有功电流(A)");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 2;
		gbc_lblNewLabel_14.gridy = 7;
		panel_2.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		textField_15 = new JTextField();
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 0);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 3;
		gbc_textField_15.gridy = 7;
		panel_2.add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("制动缸直径(厘米)");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 8;
		panel_2.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 0, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 8;
		panel_2.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("受电弓处网压");
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_15.gridx = 2;
		gbc_lblNewLabel_15.gridy = 8;
		panel_2.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		textField_16 = new JTextField();
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 3;
		gbc_textField_16.gridy = 8;
		panel_2.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridheight = 3;
		gbc_panel_4.gridwidth = 14;
		gbc_panel_4.insets = new Insets(0, 0, 0, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 11;
		internalFrame.getContentPane().add(panel_4, gbc_panel_4);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u673A\u8F66\u7279\u6027\u53C2\u6570", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints constraints_3 = new GridBagConstraints();
		constraints_3.gridx = 16;
		constraints_3.gridy = 4;
		constraints_3.gridwidth = 5;
		constraints_3.gridheight = 10;
		constraints_3.fill = GridBagConstraints.BOTH;
		internalFrame.getContentPane().add(panel, constraints_3);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{117, 0};
		gbl_panel.rowHeights = new int[]{60, 60, 60, 60, 60, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton_1 = new JButton("牵引特性曲线");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 0;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("动力制动特性曲线");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 1;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("牵引能耗曲线");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 2;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("动力制动能耗曲线");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 3;
		panel.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("重建曲线文件");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 4;
		panel.add(btnNewButton_5, gbc_btnNewButton_5);

		
	}
}
