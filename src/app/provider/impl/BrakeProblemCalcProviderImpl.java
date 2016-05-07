/**
 * 
 */
package app.provider.impl;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import app.enums.BrakingType;
import app.enums.TrainType_2;
import app.provider.CalcProvider;

/**
 * @author I310818
 *
 */
public class BrakeProblemCalcProviderImpl implements CalcProvider {
	private JTextField locoMass;
	private JTextField tractionMass;
	private JTextField brakeInitSpeed;
	private JTextField lastSpeed;
	private JTextField initSpeed;
	private JTextField result_1;
	private JTextField result_2;
	private JTextField result_3;
	private JTextField result_4;
	private JTextField result_5;
	private JTextField brakeLastSpeed;
	private JTextField trainConvertBrakeRatio;
	private JTextField locoElectricBrake;
	private JTextField unitResultantForce;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField result_6;
	private JTextField result_7;

	/*
	 * (non-Javadoc)
	 * 
	 * @see app.provider.CalcProvider#createInternalFrame()
	 */
	@Override
	public JInternalFrame createInternalFrame() {
		JInternalFrame internalFrame = new JInternalFrame("列车制动问题的解算", true, true, true, true);
		internalFrame.setBounds(20, 20, 860, 600);
		internalFrame.setVisible(true);
		internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

		Container internalContainer = internalFrame.getContentPane();
		GridBagLayout gridbag = new GridBagLayout();
		gridbag.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0 };
		gridbag.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		internalContainer.setLayout(gridbag);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 3;
		gbc_panel_1.gridwidth = 20;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		internalFrame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE, 0.0, 0.0, 0.0 };
		gbl_panel_1.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel label = new JLabel("列车类型");
		label.setBounds(63, 18, 52, 16);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 6;
		gbc_label.gridy = 0;
		panel_1.add(label, gbc_label);
		JComboBox<String> locoType = new JComboBox<String>(TrainType_2.getNameList());
		locoType.setBounds(121, 13, 165, 28);
		GridBagConstraints gbc_locoType = new GridBagConstraints();
		gbc_locoType.insets = new Insets(0, 0, 5, 5);
		gbc_locoType.gridx = 8;
		gbc_locoType.gridy = 0;
		panel_1.add(locoType, gbc_locoType);
		locoType.setFocusable(false);
		locoType.setOpaque(false);
		locoType.setBackground(Color.white);

		JLabel lblkmh_7 = new JLabel("制动末速(km/h)");
		GridBagConstraints gbc_lblkmh_7 = new GridBagConstraints();
		gbc_lblkmh_7.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_7.gridx = 12;
		gbc_lblkmh_7.gridy = 0;
		panel_1.add(lblkmh_7, gbc_lblkmh_7);

		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 13;
		gbc_textField_5.gridy = 0;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblkmh = new JLabel("制动类型");
		lblkmh.setBounds(37, 46, 78, 16);
		GridBagConstraints gbc_lblkmh = new GridBagConstraints();
		gbc_lblkmh.anchor = GridBagConstraints.EAST;
		gbc_lblkmh.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh.gridx = 6;
		gbc_lblkmh.gridy = 1;
		panel_1.add(lblkmh, gbc_lblkmh);

		JComboBox<String> vehicleType = new JComboBox<String>(BrakingType.getNameList());
		GridBagConstraints gbc_vehicleType = new GridBagConstraints();
		gbc_vehicleType.insets = new Insets(0, 0, 5, 5);
		gbc_vehicleType.fill = GridBagConstraints.HORIZONTAL;
		gbc_vehicleType.gridx = 8;
		gbc_vehicleType.gridy = 1;
		panel_1.add(vehicleType, gbc_vehicleType);

		JLabel lblNewLabel_16 = new JLabel("换算摩擦系数");
		lblNewLabel_16.setBounds(312, 18, 61, 16);
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 12;
		gbc_lblNewLabel_16.gridy = 1;
		panel_1.add(lblNewLabel_16, gbc_lblNewLabel_16);

		trainConvertBrakeRatio = new JTextField();
		GridBagConstraints gbc_trainConvertBrakeRatio = new GridBagConstraints();
		gbc_trainConvertBrakeRatio.insets = new Insets(0, 0, 5, 5);
		gbc_trainConvertBrakeRatio.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainConvertBrakeRatio.gridx = 13;
		gbc_trainConvertBrakeRatio.gridy = 1;
		panel_1.add(trainConvertBrakeRatio, gbc_trainConvertBrakeRatio);
		trainConvertBrakeRatio.setColumns(10);

		JLabel lblm = new JLabel("牵引辆数(辆)");
		lblm.setBounds(63, 75, 52, 16);
		GridBagConstraints gbc_lblm = new GridBagConstraints();
		gbc_lblm.anchor = GridBagConstraints.EAST;
		gbc_lblm.insets = new Insets(0, 0, 5, 5);
		gbc_lblm.gridx = 6;
		gbc_lblm.gridy = 2;
		panel_1.add(lblm, gbc_lblm);

		locoMass = new JTextField();
		GridBagConstraints gbc_locoMass = new GridBagConstraints();
		gbc_locoMass.insets = new Insets(0, 0, 5, 5);
		gbc_locoMass.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoMass.gridx = 8;
		gbc_locoMass.gridy = 2;
		panel_1.add(locoMass, gbc_locoMass);
		locoMass.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("列车换算制动率");
		lblNewLabel_18.setBounds(312, 46, 61, 16);
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 12;
		gbc_lblNewLabel_18.gridy = 2;
		panel_1.add(lblNewLabel_18, gbc_lblNewLabel_18);

		locoElectricBrake = new JTextField();
		GridBagConstraints gbc_locoElectricBrake = new GridBagConstraints();
		gbc_locoElectricBrake.insets = new Insets(0, 0, 5, 5);
		gbc_locoElectricBrake.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoElectricBrake.gridx = 13;
		gbc_locoElectricBrake.gridy = 2;
		panel_1.add(locoElectricBrake, gbc_locoElectricBrake);
		locoElectricBrake.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("列车管减压量(kPa)");
		lblNewLabel_17.setBounds(11, 103, 104, 16);
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 6;
		gbc_lblNewLabel_17.gridy = 3;
		panel_1.add(lblNewLabel_17, gbc_lblNewLabel_17);

		tractionMass = new JTextField();
		GridBagConstraints gbc_tractionMass = new GridBagConstraints();
		gbc_tractionMass.insets = new Insets(0, 0, 5, 5);
		gbc_tractionMass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tractionMass.gridx = 8;
		gbc_tractionMass.gridy = 3;
		panel_1.add(tractionMass, gbc_tractionMass);
		tractionMass.setColumns(10);

		JLabel lblNewLabel_19 = new JLabel("常用制动系数");
		lblNewLabel_19.setBounds(312, 75, 61, 16);
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 12;
		gbc_lblNewLabel_19.gridy = 3;
		panel_1.add(lblNewLabel_19, gbc_lblNewLabel_19);

		unitResultantForce = new JTextField();
		GridBagConstraints gbc_unitResultantForce = new GridBagConstraints();
		gbc_unitResultantForce.insets = new Insets(0, 0, 5, 5);
		gbc_unitResultantForce.fill = GridBagConstraints.HORIZONTAL;
		gbc_unitResultantForce.gridx = 13;
		gbc_unitResultantForce.gridy = 3;
		panel_1.add(unitResultantForce, gbc_unitResultantForce);
		unitResultantForce.setColumns(10);

		JLabel lblkmh_1 = new JLabel("制动地段加算坡度千分数");
		GridBagConstraints gbc_lblkmh_1 = new GridBagConstraints();
		gbc_lblkmh_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_1.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_1.gridx = 6;
		gbc_lblkmh_1.gridy = 4;
		panel_1.add(lblkmh_1, gbc_lblkmh_1);

		brakeInitSpeed = new JTextField();
		GridBagConstraints gbc_brakeInitSpeed = new GridBagConstraints();
		gbc_brakeInitSpeed.insets = new Insets(0, 0, 5, 5);
		gbc_brakeInitSpeed.fill = GridBagConstraints.HORIZONTAL;
		gbc_brakeInitSpeed.gridx = 8;
		gbc_brakeInitSpeed.gridy = 4;
		panel_1.add(brakeInitSpeed, gbc_brakeInitSpeed);
		brakeInitSpeed.setColumns(10);

		JLabel lblkmh_4 = new JLabel("列车单位基本阻力(N/KN)");
		lblkmh_4.setBounds(312, 103, 61, 16);
		GridBagConstraints gbc_lblkmh_4 = new GridBagConstraints();
		gbc_lblkmh_4.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_4.gridx = 12;
		gbc_lblkmh_4.gridy = 4;
		panel_1.add(lblkmh_4, gbc_lblkmh_4);

		initSpeed = new JTextField();
		GridBagConstraints gbc_initSpeed = new GridBagConstraints();
		gbc_initSpeed.insets = new Insets(0, 0, 5, 5);
		gbc_initSpeed.fill = GridBagConstraints.HORIZONTAL;
		gbc_initSpeed.gridx = 13;
		gbc_initSpeed.gridy = 4;
		panel_1.add(initSpeed, gbc_initSpeed);
		initSpeed.setColumns(10);

		JLabel lblkmh_2 = new JLabel("制动初速(km/h)");
		GridBagConstraints gbc_lblkmh_2 = new GridBagConstraints();
		gbc_lblkmh_2.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_2.gridx = 6;
		gbc_lblkmh_2.gridy = 5;
		panel_1.add(lblkmh_2, gbc_lblkmh_2);

		brakeLastSpeed = new JTextField();
		GridBagConstraints gbc_brakeLastSpeed = new GridBagConstraints();
		gbc_brakeLastSpeed.insets = new Insets(0, 0, 5, 5);
		gbc_brakeLastSpeed.fill = GridBagConstraints.HORIZONTAL;
		gbc_brakeLastSpeed.gridx = 8;
		gbc_brakeLastSpeed.gridy = 5;
		panel_1.add(brakeLastSpeed, gbc_brakeLastSpeed);
		brakeLastSpeed.setColumns(10);

		JLabel lblkmh_3 = new JLabel("计算制动距离(m)");
		GridBagConstraints gbc_lblkmh_3 = new GridBagConstraints();
		gbc_lblkmh_3.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_3.gridx = 12;
		gbc_lblkmh_3.gridy = 5;
		panel_1.add(lblkmh_3, gbc_lblkmh_3);

		lastSpeed = new JTextField();
		GridBagConstraints gbc_lastSpeed = new GridBagConstraints();
		gbc_lastSpeed.insets = new Insets(0, 0, 5, 5);
		gbc_lastSpeed.fill = GridBagConstraints.HORIZONTAL;
		gbc_lastSpeed.gridx = 13;
		gbc_lastSpeed.gridy = 5;
		panel_1.add(lastSpeed, gbc_lastSpeed);
		lastSpeed.setColumns(10);

		JButton calc = new JButton("开始计算");
		GridBagConstraints gbc_calc = new GridBagConstraints();
		gbc_calc.insets = new Insets(0, 0, 5, 5);
		gbc_calc.gridx = 12;
		gbc_calc.gridy = 6;
		panel_1.add(calc, gbc_calc);

		JButton btnNewButton_1 = new JButton("单位合力曲线");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 13;
		gbc_btnNewButton_1.gridy = 6;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "列车换算制动率的计算", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 8;
		gbc_panel_2.gridwidth = 7;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 3;
		internalFrame.getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 130, 0, 169, 0, 0, 0, 117, 169, 0 };
		gbl_panel_2.rowHeights = new int[] { 28, 28, 28, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblkmh_5 = new JLabel("制动初速(km/h)");
		GridBagConstraints gbc_lblkmh_5 = new GridBagConstraints();
		gbc_lblkmh_5.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_5.gridx = 1;
		gbc_lblkmh_5.gridy = 0;
		panel_2.add(lblkmh_5, gbc_lblkmh_5);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panel_2.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblkmh_6 = new JLabel("制动末速(km/h)");
		GridBagConstraints gbc_lblkmh_6 = new GridBagConstraints();
		gbc_lblkmh_6.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_6.gridx = 1;
		gbc_lblkmh_6.gridy = 1;
		panel_2.add(lblkmh_6, gbc_lblkmh_6);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		panel_2.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel label_2 = new JLabel("制动地段计算坡度千分数");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 2;
		panel_2.add(label_2, gbc_label_2);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 2;
		panel_2.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		JLabel label_8 = new JLabel("换算摩擦系数");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 3;
		panel_2.add(label_8, gbc_label_8);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panel_2.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblnkn_1 = new JLabel("列车基本单位阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_1 = new GridBagConstraints();
		gbc_lblnkn_1.anchor = GridBagConstraints.EAST;
		gbc_lblnkn_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblnkn_1.gridx = 1;
		gbc_lblnkn_1.gridy = 4;
		panel_2.add(lblnkn_1, gbc_lblnkn_1);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		panel_2.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "结果", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 8;
		gbc_panel_3.gridwidth = 12;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 8;
		gbc_panel_3.gridy = 3;
		internalFrame.getContentPane().add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 130, 169, 117, 169, 0 };
		gbl_panel_3.rowHeights = new int[] { 28, 28, 28, 0, 0, 0, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JLabel lblmss = new JLabel("列车空走时间(s)");
		GridBagConstraints gbc_lblmss = new GridBagConstraints();
		gbc_lblmss.anchor = GridBagConstraints.EAST;
		gbc_lblmss.insets = new Insets(0, 0, 5, 5);
		gbc_lblmss.gridx = 0;
		gbc_lblmss.gridy = 0;
		panel_3.add(lblmss, gbc_lblmss);

		result_1 = new JTextField();
		result_1.setEnabled(false);
		result_1.setEditable(false);
		GridBagConstraints gbc_result_1 = new GridBagConstraints();
		gbc_result_1.insets = new Insets(0, 0, 5, 0);
		gbc_result_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_1.gridx = 1;
		gbc_result_1.gridy = 0;
		panel_3.add(result_1, gbc_result_1);
		result_1.setColumns(10);

		JLabel lbls = new JLabel("列车空走距离(m)");
		GridBagConstraints gbc_lbls = new GridBagConstraints();
		gbc_lbls.anchor = GridBagConstraints.EAST;
		gbc_lbls.insets = new Insets(0, 0, 5, 5);
		gbc_lbls.gridx = 0;
		gbc_lbls.gridy = 1;
		panel_3.add(lbls, gbc_lbls);

		result_2 = new JTextField();
		result_2.setEnabled(false);
		result_2.setEditable(false);
		GridBagConstraints gbc_result_2 = new GridBagConstraints();
		gbc_result_2.insets = new Insets(0, 0, 5, 0);
		gbc_result_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_2.gridx = 1;
		gbc_result_2.gridy = 1;
		panel_3.add(result_2, gbc_result_2);
		result_2.setColumns(10);

		JLabel lblm_1 = new JLabel("列车单位合力(N/KN)");
		GridBagConstraints gbc_lblm_1 = new GridBagConstraints();
		gbc_lblm_1.anchor = GridBagConstraints.EAST;
		gbc_lblm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_1.gridx = 0;
		gbc_lblm_1.gridy = 2;
		panel_3.add(lblm_1, gbc_lblm_1);

		result_3 = new JTextField();
		result_3.setEnabled(false);
		result_3.setEditable(false);
		GridBagConstraints gbc_result_3 = new GridBagConstraints();
		gbc_result_3.insets = new Insets(0, 0, 5, 0);
		gbc_result_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_3.gridx = 1;
		gbc_result_3.gridy = 2;
		panel_3.add(result_3, gbc_result_3);
		result_3.setColumns(10);

		JLabel lblnkn = new JLabel("列车有效制动距离(m)");
		GridBagConstraints gbc_lblnkn = new GridBagConstraints();
		gbc_lblnkn.anchor = GridBagConstraints.EAST;
		gbc_lblnkn.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn.gridx = 0;
		gbc_lblnkn.gridy = 3;
		panel_3.add(lblnkn, gbc_lblnkn);

		result_4 = new JTextField();
		result_4.setEditable(false);
		result_4.setEnabled(false);
		GridBagConstraints gbc_result_4 = new GridBagConstraints();
		gbc_result_4.insets = new Insets(0, 0, 5, 0);
		gbc_result_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_4.gridx = 1;
		gbc_result_4.gridy = 3;
		panel_3.add(result_4, gbc_result_4);
		result_4.setColumns(10);

		JLabel lblm_2 = new JLabel("实际列车制动距离(m)");
		GridBagConstraints gbc_lblm_2 = new GridBagConstraints();
		gbc_lblm_2.anchor = GridBagConstraints.EAST;
		gbc_lblm_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_2.gridx = 0;
		gbc_lblm_2.gridy = 4;
		panel_3.add(lblm_2, gbc_lblm_2);

		result_5 = new JTextField();
		result_5.setEnabled(false);
		result_5.setEditable(false);
		GridBagConstraints gbc_result_5 = new GridBagConstraints();
		gbc_result_5.insets = new Insets(0, 0, 5, 0);
		gbc_result_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_5.gridx = 1;
		gbc_result_5.gridy = 4;
		panel_3.add(result_5, gbc_result_5);
		result_5.setColumns(10);

		JLabel lblkmh_8 = new JLabel("列车紧急制动限速(km/h)");
		GridBagConstraints gbc_lblkmh_8 = new GridBagConstraints();
		gbc_lblkmh_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_8.gridx = 0;
		gbc_lblkmh_8.gridy = 5;
		panel_3.add(lblkmh_8, gbc_lblkmh_8);

		result_6 = new JTextField();
		result_6.setEnabled(false);
		result_6.setEditable(false);
		GridBagConstraints gbc_result_6 = new GridBagConstraints();
		gbc_result_6.insets = new Insets(0, 0, 5, 0);
		gbc_result_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_6.gridx = 1;
		gbc_result_6.gridy = 5;
		panel_3.add(result_6, gbc_result_6);
		result_6.setColumns(10);

		JLabel label_1 = new JLabel("列车换算制动率");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 6;
		panel_3.add(label_1, gbc_label_1);

		result_7 = new JTextField();
		result_7.setEnabled(false);
		result_7.setEditable(false);
		GridBagConstraints gbc_result_7 = new GridBagConstraints();
		gbc_result_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_7.gridx = 1;
		gbc_result_7.gridy = 6;
		panel_3.add(result_7, gbc_result_7);
		result_7.setColumns(10);

		return internalFrame;
	}

}
