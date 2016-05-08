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

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import app.enums.ControlMethod;
import app.enums.DieselLocoType;
import app.enums.ElectricLocoType;
import app.enums.LocoModel;
import app.enums.LocoType;
import app.provider.CalcProvider;

/**
 * @author I310818
 *
 */
public class LocoTractionProviderImpl implements CalcProvider {
	private JTextField dieselTractionForce;
	private JTextField tunnelCorrectCoef;
	private JTextField airCorrectCoef;
	private JTextField locoCycleTractionForce;
	private JTextField altitudeCorrctCoef;
	private JTextField locoTractionForce;
	private JTextField curveRadius;
	private JTextField adhensionMass;
	private JTextField speed;
	private JTextField assistingVehCnt;
	private JTextField locoSum;
	private JTextField result_1;
	private JTextField result_2;
	private JTextField result_3;
	private JTextField result_4;
	private JTextField result_5;

	/*
	 * (non-Javadoc)
	 * 
	 * @see app.provider.CalcProvider#createInternalFrame()
	 */
	@Override
	public JInternalFrame createInternalFrame() {
		final JInternalFrame internalFrame = new JInternalFrame("机车牵引力与牵引特性", true, true, true, true);
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
		gbc_panel_1.gridheight = 6;
		gbc_panel_1.gridwidth = 20;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		internalFrame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE, 0.0, 0.0, 0.0 };
		gbl_panel_1.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel label = new JLabel("机车类型");
		label.setBounds(63, 18, 52, 16);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 4;
		gbc_label.gridy = 0;
		panel_1.add(label, gbc_label);
		JComboBox<String> locoType = new JComboBox<String>(LocoType.getNameList());
		locoType.setBounds(121, 13, 165, 28);
		GridBagConstraints gbc_locoType = new GridBagConstraints();
		gbc_locoType.insets = new Insets(0, 0, 5, 5);
		gbc_locoType.gridx = 5;
		gbc_locoType.gridy = 0;
		panel_1.add(locoType, gbc_locoType);
		locoType.setFocusable(false);
		locoType.setOpaque(false);
		locoType.setBackground(Color.white);

		JLabel lblNewLabel_16 = new JLabel("机车型号");
		lblNewLabel_16.setBounds(312, 18, 61, 16);
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 6;
		gbc_lblNewLabel_16.gridy = 0;
		panel_1.add(lblNewLabel_16, gbc_lblNewLabel_16);

		JComboBox<String> locoModel = new JComboBox<String>(LocoModel.getNameList());
		final JComboBox<String> locoTypeByModel = new JComboBox<String>();
		locoModel.setBounds(385, 14, 128, 27);
		locoModel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unchecked")
				JComboBox<String> source = (JComboBox<String>) e.getSource();
				if (LocoModel.ELECTRIC.getName().equals(source.getSelectedItem())) {
					locoTypeByModel.setModel(new DefaultComboBoxModel<String>(ElectricLocoType.getNameList()));
				}
				if (LocoModel.DIESEL.getName().equals(source.getSelectedItem())) {
					locoTypeByModel.setModel(new DefaultComboBoxModel<String>(DieselLocoType.getNameList()));
				}
			}

		});
		GridBagConstraints gbc_locoModel = new GridBagConstraints();
		gbc_locoModel.insets = new Insets(0, 0, 5, 5);
		gbc_locoModel.gridx = 7;
		gbc_locoModel.gridy = 0;
		panel_1.add(locoModel, gbc_locoModel);
		locoModel.setSelectedIndex(0);
		locoTypeByModel.setMaximumRowCount(16);

		locoTypeByModel.setBounds(525, 14, 228, 27);
		GridBagConstraints gbc_locoTypeByModel = new GridBagConstraints();
		gbc_locoTypeByModel.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoTypeByModel.gridwidth = 7;
		gbc_locoTypeByModel.insets = new Insets(0, 0, 5, 5);
		gbc_locoTypeByModel.gridx = 8;
		gbc_locoTypeByModel.gridy = 0;
		panel_1.add(locoTypeByModel, gbc_locoTypeByModel);

		JLabel lblkmh = new JLabel("机车运行速度(km/h)");
		lblkmh.setBounds(37, 46, 78, 16);
		GridBagConstraints gbc_lblkmh = new GridBagConstraints();
		gbc_lblkmh.anchor = GridBagConstraints.EAST;
		gbc_lblkmh.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh.gridx = 4;
		gbc_lblkmh.gridy = 1;
		panel_1.add(lblkmh, gbc_lblkmh);

		speed = new JTextField();
		GridBagConstraints gbc_speed = new GridBagConstraints();
		gbc_speed.insets = new Insets(0, 0, 5, 5);
		gbc_speed.fill = GridBagConstraints.HORIZONTAL;
		gbc_speed.gridx = 5;
		gbc_speed.gridy = 1;
		panel_1.add(speed, gbc_speed);
		speed.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("机车总数");
		lblNewLabel_18.setBounds(312, 46, 61, 16);
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 6;
		gbc_lblNewLabel_18.gridy = 1;
		panel_1.add(lblNewLabel_18, gbc_lblNewLabel_18);

		locoSum = new JTextField();
		GridBagConstraints gbc_locoSum = new GridBagConstraints();
		gbc_locoSum.insets = new Insets(0, 0, 5, 5);
		gbc_locoSum.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoSum.gridx = 7;
		gbc_locoSum.gridy = 1;
		panel_1.add(locoSum, gbc_locoSum);
		locoSum.setColumns(10);

		JLabel lblm = new JLabel("曲线半径(m)");
		lblm.setBounds(63, 75, 52, 16);
		GridBagConstraints gbc_lblm = new GridBagConstraints();
		gbc_lblm.anchor = GridBagConstraints.EAST;
		gbc_lblm.insets = new Insets(0, 0, 5, 5);
		gbc_lblm.gridx = 4;
		gbc_lblm.gridy = 2;
		panel_1.add(lblm, gbc_lblm);

		curveRadius = new JTextField();
		GridBagConstraints gbc_curveRadius = new GridBagConstraints();
		gbc_curveRadius.insets = new Insets(0, 0, 5, 5);
		gbc_curveRadius.fill = GridBagConstraints.HORIZONTAL;
		gbc_curveRadius.gridx = 5;
		gbc_curveRadius.gridy = 2;
		panel_1.add(curveRadius, gbc_curveRadius);
		curveRadius.setColumns(10);

		JLabel lblNewLabel_19 = new JLabel("补机数量");
		lblNewLabel_19.setBounds(312, 75, 61, 16);
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 6;
		gbc_lblNewLabel_19.gridy = 2;
		panel_1.add(lblNewLabel_19, gbc_lblNewLabel_19);

		assistingVehCnt = new JTextField();
		GridBagConstraints gbc_assistingVehCnt = new GridBagConstraints();
		gbc_assistingVehCnt.insets = new Insets(0, 0, 5, 5);
		gbc_assistingVehCnt.fill = GridBagConstraints.HORIZONTAL;
		gbc_assistingVehCnt.gridx = 7;
		gbc_assistingVehCnt.gridy = 2;
		panel_1.add(assistingVehCnt, gbc_assistingVehCnt);
		assistingVehCnt.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("机车计算黏着质量(t)");
		lblNewLabel_17.setBounds(11, 103, 104, 16);
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 4;
		gbc_lblNewLabel_17.gridy = 3;
		panel_1.add(lblNewLabel_17, gbc_lblNewLabel_17);

		adhensionMass = new JTextField();
		GridBagConstraints gbc_adhensionMass = new GridBagConstraints();
		gbc_adhensionMass.insets = new Insets(0, 0, 5, 5);
		gbc_adhensionMass.fill = GridBagConstraints.HORIZONTAL;
		gbc_adhensionMass.gridx = 5;
		gbc_adhensionMass.gridy = 3;
		panel_1.add(adhensionMass, gbc_adhensionMass);
		adhensionMass.setColumns(10);

		JLabel label_2 = new JLabel("操纵方式");
		label_2.setBounds(312, 103, 61, 16);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 6;
		gbc_label_2.gridy = 3;
		panel_1.add(label_2, gbc_label_2);

		JComboBox<String> ctrlMethod = new JComboBox<String>(ControlMethod.getNameList());
		ctrlMethod.setBounds(385, 99, 128, 27);
		GridBagConstraints gbc_ctrlMethod = new GridBagConstraints();
		gbc_ctrlMethod.insets = new Insets(0, 0, 5, 5);
		gbc_ctrlMethod.anchor = GridBagConstraints.WEST;
		gbc_ctrlMethod.gridx = 7;
		gbc_ctrlMethod.gridy = 3;
		panel_1.add(ctrlMethod, gbc_ctrlMethod);
		
		JLabel lblNewLabel_8 = new JLabel("电力/内燃机车轮周牵引力(KN)");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 4;
		gbc_lblNewLabel_8.gridy = 4;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);

		locoCycleTractionForce = new JTextField();
		GridBagConstraints gbc_locoCycleTractionForce = new GridBagConstraints();
		gbc_locoCycleTractionForce.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoCycleTractionForce.insets = new Insets(0, 0, 5, 0);
		gbc_locoCycleTractionForce.gridx = 5;
		gbc_locoCycleTractionForce.gridy = 4;
		panel_1.add(locoCycleTractionForce, gbc_locoCycleTractionForce);
		locoCycleTractionForce.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "内燃机车牵引力的修正", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 2;
		gbc_panel_2.gridwidth = 15;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 6;
		internalFrame.getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 130, 169, 117, 169, 0 };
		gbl_panel_2.rowHeights = new int[] { 28, 28, 28, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblNewLabel = new JLabel("内燃机车牵引力(KN)");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);

		dieselTractionForce = new JTextField();
		GridBagConstraints gbc_dieselTractionForce = new GridBagConstraints();
		gbc_dieselTractionForce.fill = GridBagConstraints.HORIZONTAL;
		gbc_dieselTractionForce.insets = new Insets(0, 0, 5, 5);
		gbc_dieselTractionForce.gridx = 1;
		gbc_dieselTractionForce.gridy = 0;
		panel_2.add(dieselTractionForce, gbc_dieselTractionForce);
		dieselTractionForce.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("隧道影响修正系数");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 0;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);

		tunnelCorrectCoef = new JTextField();
		GridBagConstraints gbc_tunnelCorrectCoef = new GridBagConstraints();
		gbc_tunnelCorrectCoef.fill = GridBagConstraints.HORIZONTAL;
		gbc_tunnelCorrectCoef.insets = new Insets(0, 0, 5, 5);
		gbc_tunnelCorrectCoef.gridx = 3;
		gbc_tunnelCorrectCoef.gridy = 0;
		panel_2.add(tunnelCorrectCoef, gbc_tunnelCorrectCoef);
		tunnelCorrectCoef.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("海拔修正系数");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 1;
		panel_2.add(lblNewLabel_9, gbc_lblNewLabel_9);

		altitudeCorrctCoef = new JTextField();
		GridBagConstraints gbc_altitudeCorrctCoef = new GridBagConstraints();
		gbc_altitudeCorrctCoef.fill = GridBagConstraints.HORIZONTAL;
		gbc_altitudeCorrctCoef.insets = new Insets(0, 0, 5, 0);
		gbc_altitudeCorrctCoef.gridx = 1;
		gbc_altitudeCorrctCoef.gridy = 1;
		panel_2.add(altitudeCorrctCoef, gbc_altitudeCorrctCoef);
		altitudeCorrctCoef.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("周围空气温度修正系数");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 1;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);

		airCorrectCoef = new JTextField();
		GridBagConstraints gbc_airCorrectCoef = new GridBagConstraints();
		gbc_airCorrectCoef.fill = GridBagConstraints.HORIZONTAL;
		gbc_airCorrectCoef.insets = new Insets(0, 0, 0, 5);
		gbc_airCorrectCoef.gridx = 3;
		gbc_airCorrectCoef.gridy = 1;
		panel_2.add(airCorrectCoef, gbc_airCorrectCoef);
		airCorrectCoef.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("机车轮周牵引力(KN)");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 2;
		panel_2.add(lblNewLabel_10, gbc_lblNewLabel_10);

		locoTractionForce = new JTextField();
		GridBagConstraints gbc_locoTractionForce = new GridBagConstraints();
		gbc_locoTractionForce.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoTractionForce.gridx = 1;
		gbc_locoTractionForce.gridy = 2;
		panel_2.add(locoTractionForce, gbc_locoTractionForce);
		locoTractionForce.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "结果", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 3;
		gbc_panel_3.gridwidth = 15;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 8;
		internalFrame.getContentPane().add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 130, 169, 117, 169, 0 };
		gbl_panel_3.rowHeights = new int[] { 28, 28, 28, 0, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JLabel label_1 = new JLabel("计算黏着系数");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 0;
		panel_3.add(label_1, gbc_label_1);

		result_1 = new JTextField();
		result_1.setEnabled(false);
		result_1.setEditable(false);
		GridBagConstraints gbc_result_1 = new GridBagConstraints();
		gbc_result_1.insets = new Insets(0, 0, 5, 5);
		gbc_result_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_1.gridx = 1;
		gbc_result_1.gridy = 0;
		panel_3.add(result_1, gbc_result_1);
		result_1.setColumns(10);

		JLabel label_3 = new JLabel("机车黏着牵引力(KN)");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		panel_3.add(label_3, gbc_label_3);

		result_2 = new JTextField();
		result_2.setEnabled(false);
		result_2.setEditable(false);
		GridBagConstraints gbc_result_2 = new GridBagConstraints();
		gbc_result_2.insets = new Insets(0, 0, 5, 5);
		gbc_result_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_2.gridx = 1;
		gbc_result_2.gridy = 1;
		panel_3.add(result_2, gbc_result_2);
		result_2.setColumns(10);

		JLabel label_4 = new JLabel("机车总的轮周牵引力(KN)");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 2;
		panel_3.add(label_4, gbc_label_4);

		result_3 = new JTextField();
		result_3.setEnabled(false);
		result_3.setEditable(false);
		GridBagConstraints gbc_result_3 = new GridBagConstraints();
		gbc_result_3.insets = new Insets(0, 0, 5, 5);
		gbc_result_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_3.gridx = 1;
		gbc_result_3.gridy = 2;
		panel_3.add(result_3, gbc_result_3);
		result_3.setColumns(10);

		JLabel label_5 = new JLabel("修正后的内燃机车牵引力(KN)");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 3;
		panel_3.add(label_5, gbc_label_5);

		result_4 = new JTextField();
		result_4.setEditable(false);
		result_4.setEnabled(false);
		GridBagConstraints gbc_result_4 = new GridBagConstraints();
		gbc_result_4.insets = new Insets(0, 0, 5, 5);
		gbc_result_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_4.gridx = 1;
		gbc_result_4.gridy = 3;
		panel_3.add(result_4, gbc_result_4);
		result_4.setColumns(10);

		JLabel label_6 = new JLabel("机车轮周功率(KW)");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.insets = new Insets(0, 0, 0, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 4;
		panel_3.add(label_6, gbc_label_6);

		result_5 = new JTextField();
		result_5.setEnabled(false);
		result_5.setEditable(false);
		GridBagConstraints gbc_result_5 = new GridBagConstraints();
		gbc_result_5.insets = new Insets(0, 0, 0, 5);
		gbc_result_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_5.gridx = 1;
		gbc_result_5.gridy = 4;
		panel_3.add(result_5, gbc_result_5);
		result_5.setColumns(10);

		JButton calc = new JButton("开始计算");
        GridBagConstraints gbc_calc = new GridBagConstraints();
        gbc_calc.gridx = 3;
        gbc_calc.gridy = 4;
        panel_3.add(calc, gbc_calc);
        
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "生成图形", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints constraints_3 = new GridBagConstraints();
		constraints_3.gridx = 16;
		constraints_3.gridy = 6;
		constraints_3.gridwidth = 5;
		constraints_3.gridheight = 5;
		constraints_3.fill = GridBagConstraints.BOTH;
		internalFrame.getContentPane().add(panel, constraints_3);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 117, 0 };
		gbl_panel.rowHeights = new int[] { 60, 60, 60, 60, 60, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton btnNewButton_1 = new JButton("电力机车牵引特性曲线");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 0;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton_2 = new JButton("内燃机车牵引特性曲线");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 1;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_3 = new JButton("电力机车功率特性曲线");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 2;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);

		JButton btnNewButton_4 = new JButton("内燃机车功率特性曲线");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 3;
		panel.add(btnNewButton_4, gbc_btnNewButton_4);

		return internalFrame;
	}

}
