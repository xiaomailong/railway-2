/**
 * 
 */
package app.provider.impl;

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

import app.enums.BusType_2;
import app.enums.DieselLocoType_3;
import app.enums.ElectricLocoType_2;
import app.enums.EmuType_2;
import app.enums.LoadType;
import app.enums.LocoVehicleModel;
import app.enums.ShuntingOperType;
import app.enums.TrunkType_2;
import app.provider.CalcProvider;

/**
 * @author I310818
 *
 */
public class LocoEnergeCalcProviderImpl implements CalcProvider {
	private JTextField textField_2;
	private JTextField textField_7;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;

	/*
	 * (non-Javadoc)
	 * 
	 * @see app.provider.CalcProvider#createInternalFrame()
	 */
	@Override
	public JInternalFrame createInternalFrame() {
		final JInternalFrame internalFrame = new JInternalFrame("机车能耗量的计算", true, true, true, true);
		internalFrame.setBounds(20, 20, 1160, 720);
		internalFrame.setVisible(true);
		internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

		Container internalContainer = internalFrame.getContentPane();
		GridBagLayout gridbag = new GridBagLayout();
		gridbag.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0 };
		gridbag.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		internalContainer.setLayout(gridbag);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "电力机车耗电量的计算", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 5;
		gbc_panel_1.gridwidth = 19;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		internalContainer.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 28, 28, 28, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, 8.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblNewLabel = new JLabel("最高/部分负荷");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);

		JComboBox<String> comboBox_4 = new JComboBox<String>(LoadType.getNameList());
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 0;
		panel_1.add(comboBox_4, gbc_comboBox_4);

		JLabel lblNewLabel_8 = new JLabel("受电弓处网压(KV)");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 0;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("自有电有功电流(A)");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 4;
		gbc_lblNewLabel_5.gridy = 0;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 5;
		gbc_textField_1.gridy = 0;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("时间间隔(min)");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 1;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("牵引力使用系数");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 1;
		panel_1.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 1;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lbla = new JLabel("时间间隔内机车最高/部分负荷的平均有功电流(A)");
		GridBagConstraints gbc_lbla = new GridBagConstraints();
		gbc_lbla.insets = new Insets(0, 0, 5, 5);
		gbc_lbla.anchor = GridBagConstraints.EAST;
		gbc_lbla.gridx = 4;
		gbc_lbla.gridy = 1;
		panel_1.add(lbla, gbc_lbla);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 5;
		gbc_textField_4.gridy = 1;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
				
						JLabel lblNewLabel_3 = new JLabel("结果:");
						GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
						gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
						gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel_3.gridx = 1;
						gbc_lblNewLabel_3.gridy = 2;
						panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
				JLabel lblkpa_3 = new JLabel("电力机车牵引运行耗电量(kw*h)");
				GridBagConstraints gbc_lblkpa_3 = new GridBagConstraints();
				gbc_lblkpa_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblkpa_3.anchor = GridBagConstraints.EAST;
				gbc_lblkpa_3.gridx = 2;
				gbc_lblkpa_3.gridy = 2;
				panel_1.add(lblkpa_3, gbc_lblkpa_3);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 2;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblkn_5 = new JLabel("机车最高/部分负荷牵引运行耗电量(kw*h)");
		GridBagConstraints gbc_lblkn_5 = new GridBagConstraints();
		gbc_lblkn_5.anchor = GridBagConstraints.EAST;
		gbc_lblkn_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_5.gridx = 4;
		gbc_lblkn_5.gridy = 2;
		panel_1.add(lblkn_5, gbc_lblkn_5);

		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 5;
		gbc_textField_6.gridy = 2;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
				
				JLabel lblkn = new JLabel("自有电有功电流(A)");
				GridBagConstraints gbc_lblkn = new GridBagConstraints();
				gbc_lblkn.anchor = GridBagConstraints.EAST;
				gbc_lblkn.insets = new Insets(0, 0, 5, 5);
				gbc_lblkn.gridx = 0;
				gbc_lblkn.gridy = 3;
				panel_1.add(lblkn, gbc_lblkn);
				
				textField_7 = new JTextField();
				GridBagConstraints gbc_textField_7 = new GridBagConstraints();
				gbc_textField_7.insets = new Insets(0, 0, 5, 5);
				gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_7.gridx = 1;
				gbc_textField_7.gridy = 3;
				panel_1.add(textField_7, gbc_textField_7);
				textField_7.setColumns(10);
		
				JLabel lblkpa_2 = new JLabel("相应工况时间(min)");
				GridBagConstraints gbc_lblkpa_2 = new GridBagConstraints();
				gbc_lblkpa_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblkpa_2.anchor = GridBagConstraints.EAST;
				gbc_lblkpa_2.gridx = 2;
				gbc_lblkpa_2.gridy = 3;
				panel_1.add(lblkpa_2, gbc_lblkpa_2);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 3;
		gbc_textField_8.gridy = 3;
		panel_1.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);

		JLabel lblt_4 = new JLabel("结果: 惰性、制动及停站自用电量(kw*h)");
		GridBagConstraints gbc_lblt_4 = new GridBagConstraints();
		gbc_lblt_4.anchor = GridBagConstraints.EAST;
		gbc_lblt_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_4.gridx = 4;
		gbc_lblt_4.gridy = 3;
		panel_1.add(lblt_4, gbc_lblt_4);

		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setEditable(false);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 5;
		gbc_textField_9.gridy = 3;
		panel_1.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel label = new JLabel("出入段/途中调车作业");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 4;
		panel_1.add(label, gbc_label);
		
		JComboBox<String> comboBox = new JComboBox<String>(ShuntingOperType.getNameList());
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		panel_1.add(comboBox, gbc_comboBox);
		
		JLabel lblh = new JLabel("相应时间间隔(h)");
		GridBagConstraints gbc_lblh = new GridBagConstraints();
		gbc_lblh.anchor = GridBagConstraints.EAST;
		gbc_lblh.insets = new Insets(0, 0, 5, 5);
		gbc_lblh.gridx = 2;
		gbc_lblh.gridy = 4;
		panel_1.add(lblh, gbc_lblh);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 3;
		gbc_textField_10.gridy = 4;
		panel_1.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JLabel label_1 = new JLabel("结果:");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 5;
		panel_1.add(label_1, gbc_label_1);
		
		JLabel lblkwh_1 = new JLabel("电力机车的区段耗电量(kw*h)");
		GridBagConstraints gbc_lblkwh_1 = new GridBagConstraints();
		gbc_lblkwh_1.anchor = GridBagConstraints.EAST;
		gbc_lblkwh_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkwh_1.gridx = 2;
		gbc_lblkwh_1.gridy = 5;
		panel_1.add(lblkwh_1, gbc_lblkwh_1);
		
		textField_11 = new JTextField();
		textField_11.setEnabled(false);
		textField_11.setEditable(false);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 3;
		gbc_textField_11.gridy = 5;
		panel_1.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JLabel lblkwh = new JLabel("出入段/途中调车作业耗电量(kw*h)");
		GridBagConstraints gbc_lblkwh = new GridBagConstraints();
		gbc_lblkwh.anchor = GridBagConstraints.EAST;
		gbc_lblkwh.insets = new Insets(0, 0, 5, 5);
		gbc_lblkwh.gridx = 4;
		gbc_lblkwh.gridy = 5;
		panel_1.add(lblkwh, gbc_lblkwh);
		
		textField_12 = new JTextField();
		textField_12.setEnabled(false);
		textField_12.setEditable(false);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 5;
		gbc_textField_12.gridy = 5;
		panel_1.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JLabel lblkm = new JLabel("牵引区段长度(km)");
		GridBagConstraints gbc_lblkm = new GridBagConstraints();
		gbc_lblkm.anchor = GridBagConstraints.EAST;
		gbc_lblkm.insets = new Insets(0, 0, 5, 5);
		gbc_lblkm.gridx = 0;
		gbc_lblkm.gridy = 6;
		panel_1.add(lblkm, gbc_lblkm);
		
		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 6;
		panel_1.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);
		
		JLabel lblt = new JLabel("牵引质量(t)");
		GridBagConstraints gbc_lblt = new GridBagConstraints();
		gbc_lblt.anchor = GridBagConstraints.EAST;
		gbc_lblt.insets = new Insets(0, 0, 5, 5);
		gbc_lblt.gridx = 2;
		gbc_lblt.gridy = 6;
		panel_1.add(lblt, gbc_lblt);
		
		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 3;
		gbc_textField_14.gridy = 6;
		panel_1.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);
		
		JLabel lblkwh_2 = new JLabel("结果: 电力机车每总重万吨公里耗电量(kw*h)");
		GridBagConstraints gbc_lblkwh_2 = new GridBagConstraints();
		gbc_lblkwh_2.anchor = GridBagConstraints.EAST;
		gbc_lblkwh_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkwh_2.gridx = 4;
		gbc_lblkwh_2.gridy = 6;
		panel_1.add(lblkwh_2, gbc_lblkwh_2);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setEditable(false);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 5;
		gbc_textField_15.gridy = 6;
		panel_1.add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);
		
		JButton button_2 = new JButton("开始计算");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 7;
		panel_1.add(button_2, gbc_button_2);
		
		JButton button = new JButton("电力机车有功电流曲线图");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 7;
		panel_1.add(button, gbc_button);
		
		JLabel lblgtgkm = new JLabel("(单位耗电量)(gtgkm)");
		GridBagConstraints gbc_lblgtgkm = new GridBagConstraints();
		gbc_lblgtgkm.anchor = GridBagConstraints.EAST;
		gbc_lblgtgkm.insets = new Insets(0, 0, 5, 5);
		gbc_lblgtgkm.gridx = 4;
		gbc_lblgtgkm.gridy = 7;
		panel_1.add(lblgtgkm, gbc_lblgtgkm);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setEditable(false);
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 5;
		gbc_textField_16.gridy = 7;
		panel_1.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);
		
				JComboBox<String> locoVehicleModel = new JComboBox<String>(LocoVehicleModel.getNameList());
				final JComboBox<String> locoVehicleTypeByModel = new JComboBox<String>();
				locoVehicleModel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						@SuppressWarnings("unchecked")
						JComboBox<String> source = (JComboBox<String>) e.getSource();
						if (LocoVehicleModel.ELECTRIC.getName().equals(source.getSelectedItem())) {
							locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(ElectricLocoType_2.getNameList()));
						}
						if (LocoVehicleModel.DIESEL.getName().equals(source.getSelectedItem())) {
							locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(DieselLocoType_3.getNameList()));
						}
						if (LocoVehicleModel.BUS.getName().equals(source.getSelectedItem())) {
							locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(BusType_2.getNameList()));
						}
						if (LocoVehicleModel.TRUNK.getName().equals(source.getSelectedItem())) {
							locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(TrunkType_2.getNameList()));
						}
						if (LocoVehicleModel.EMU.getName().equals(source.getSelectedItem())) {
							locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(EmuType_2.getNameList()));
						}
					}
				});
				
							
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "内燃机车燃油消耗量的计算", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 6;
		gbc_panel_2.gridwidth = 19;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 5;
		internalContainer.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 28, 28, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 0.0, 8.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);
		
		JLabel label_3 = new JLabel("最高/部分负荷");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 0;
		panel_2.add(label_3, gbc_label_3);
		
				JComboBox<String> comboBox_1 = new JComboBox<String>(LoadType.getNameList());
				GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
				gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_1.gridx = 1;
				gbc_comboBox_1.gridy = 0;
				panel_2.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblkn_1 = new JLabel("时间间隔(min)");
		GridBagConstraints gbc_lblkn_1 = new GridBagConstraints();
		gbc_lblkn_1.anchor = GridBagConstraints.EAST;
		gbc_lblkn_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_1.gridx = 2;
		gbc_lblkn_1.gridy = 0;
		panel_2.add(lblkn_1, gbc_lblkn_1);
		
		textField_17 = new JTextField();
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 3;
		gbc_textField_17.gridy = 0;
		panel_2.add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);
		
		JLabel lblkgmin = new JLabel("机车最高/部分负荷时的单位时间燃油消耗量(kg/min)");
		GridBagConstraints gbc_lblkgmin = new GridBagConstraints();
		gbc_lblkgmin.anchor = GridBagConstraints.EAST;
		gbc_lblkgmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin.gridx = 4;
		gbc_lblkgmin.gridy = 0;
		panel_2.add(lblkgmin, gbc_lblkgmin);
		
		textField_18 = new JTextField();
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 5;
		gbc_textField_18.gridy = 0;
		panel_2.add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);
		
		JLabel label_2 = new JLabel("机车牵引力使用系数");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 1;
		panel_2.add(label_2, gbc_label_2);
		
		textField_19 = new JTextField();
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 1;
		gbc_textField_19.gridy = 1;
		panel_2.add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);
		
		JLabel label_4 = new JLabel("海拔高度修正系数");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 1;
		panel_2.add(label_4, gbc_label_4);
		
		textField_20 = new JTextField();
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 3;
		gbc_textField_20.gridy = 1;
		panel_2.add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);
		
		JLabel label_5 = new JLabel("周围空气温度修正系数");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 4;
		gbc_label_5.gridy = 1;
		panel_2.add(label_5, gbc_label_5);
		
		textField_21 = new JTextField();
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 5;
		gbc_textField_21.gridy = 1;
		panel_2.add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);
		
		JLabel lblkgmin_1 = new JLabel("结果: 修正后的单位时间");
		GridBagConstraints gbc_lblkgmin_1 = new GridBagConstraints();
		gbc_lblkgmin_1.anchor = GridBagConstraints.EAST;
		gbc_lblkgmin_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_1.gridx = 0;
		gbc_lblkgmin_1.gridy = 2;
		panel_2.add(lblkgmin_1, gbc_lblkgmin_1);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setEnabled(false);
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 1;
		gbc_textField_22.gridy = 2;
		panel_2.add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);
		
		JLabel lblkg = new JLabel("内燃机车牵引运行");
		GridBagConstraints gbc_lblkg = new GridBagConstraints();
		gbc_lblkg.anchor = GridBagConstraints.EAST;
		gbc_lblkg.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg.gridx = 2;
		gbc_lblkg.gridy = 2;
		panel_2.add(lblkg, gbc_lblkg);
		
		textField_23 = new JTextField();
		textField_23.setEnabled(false);
		textField_23.setEditable(false);
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 3;
		gbc_textField_23.gridy = 2;
		panel_2.add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);
		
		JLabel lblkg_2 = new JLabel("机车最高/部分负荷牵引运行燃油消耗量(kg)");
		GridBagConstraints gbc_lblkg_2 = new GridBagConstraints();
		gbc_lblkg_2.anchor = GridBagConstraints.EAST;
		gbc_lblkg_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_2.gridx = 4;
		gbc_lblkg_2.gridy = 2;
		panel_2.add(lblkg_2, gbc_lblkg_2);
		
		textField_24 = new JTextField();
		textField_24.setEnabled(false);
		textField_24.setEditable(false);
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.insets = new Insets(0, 0, 5, 5);
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.gridx = 5;
		gbc_textField_24.gridy = 2;
		panel_2.add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("燃油消耗量(kg/min)");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblkg_1 = new JLabel("燃油消耗量(kg)");
		GridBagConstraints gbc_lblkg_1 = new GridBagConstraints();
		gbc_lblkg_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblkg_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_1.gridx = 2;
		gbc_lblkg_1.gridy = 3;
		panel_2.add(lblkg_1, gbc_lblkg_1);
		
		JLabel label_6 = new JLabel("出入段及途中调车作业单位");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 4;
		panel_2.add(label_6, gbc_label_6);
		
		textField_25 = new JTextField();
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 1;
		gbc_textField_25.gridy = 4;
		panel_2.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		JLabel lblmin = new JLabel("相应工作时间(min)");
		GridBagConstraints gbc_lblmin = new GridBagConstraints();
		gbc_lblmin.anchor = GridBagConstraints.EAST;
		gbc_lblmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin.gridx = 2;
		gbc_lblmin.gridy = 4;
		panel_2.add(lblmin, gbc_lblmin);
		
		textField_26 = new JTextField();
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 3;
		gbc_textField_26.gridy = 4;
		panel_2.add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);
		
		JLabel lblkgmin_3 = new JLabel("结果: 机车出入段及途中调车作业燃油消耗量(kg)");
		GridBagConstraints gbc_lblkgmin_3 = new GridBagConstraints();
		gbc_lblkgmin_3.anchor = GridBagConstraints.EAST;
		gbc_lblkgmin_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_3.gridx = 4;
		gbc_lblkgmin_3.gridy = 4;
		panel_2.add(lblkgmin_3, gbc_lblkgmin_3);
		
		textField_27 = new JTextField();
		textField_27.setEnabled(false);
		textField_27.setEditable(false);
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 5, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 5;
		gbc_textField_27.gridy = 4;
		panel_2.add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);
		
		JLabel lblkgmin_2 = new JLabel("时间燃油消耗量(kg/min)");
		GridBagConstraints gbc_lblkgmin_2 = new GridBagConstraints();
		gbc_lblkgmin_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblkgmin_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_2.gridx = 0;
		gbc_lblkgmin_2.gridy = 5;
		panel_2.add(lblkgmin_2, gbc_lblkgmin_2);
		
		JLabel lblkgmin_4 = new JLabel("电阻制动工况单位时间");
		GridBagConstraints gbc_lblkgmin_4 = new GridBagConstraints();
		gbc_lblkgmin_4.anchor = GridBagConstraints.EAST;
		gbc_lblkgmin_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_4.gridx = 0;
		gbc_lblkgmin_4.gridy = 6;
		panel_2.add(lblkgmin_4, gbc_lblkgmin_4);
		
		textField_28 = new JTextField();
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(0, 0, 5, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 1;
		gbc_textField_28.gridy = 6;
		panel_2.add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);
		
		JLabel lblmin_1 = new JLabel("相应工作时间(min)");
		GridBagConstraints gbc_lblmin_1 = new GridBagConstraints();
		gbc_lblmin_1.anchor = GridBagConstraints.EAST;
		gbc_lblmin_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin_1.gridx = 2;
		gbc_lblmin_1.gridy = 6;
		panel_2.add(lblmin_1, gbc_lblmin_1);
		
		textField_29 = new JTextField();
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 3;
		gbc_textField_29.gridy = 6;
		panel_2.add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);
		
		JLabel lblkg_3 = new JLabel("结果: 机车电阻制动工况的燃油消耗量(kg)");
		GridBagConstraints gbc_lblkg_3 = new GridBagConstraints();
		gbc_lblkg_3.anchor = GridBagConstraints.EAST;
		gbc_lblkg_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_3.gridx = 4;
		gbc_lblkg_3.gridy = 6;
		panel_2.add(lblkg_3, gbc_lblkg_3);
		
		textField_30 = new JTextField();
		textField_30.setEnabled(false);
		textField_30.setEditable(false);
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 5;
		gbc_textField_30.gridy = 6;
		panel_2.add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);
		
		JLabel lblkgmin_5 = new JLabel("燃油消耗量(kg/min)");
		GridBagConstraints gbc_lblkgmin_5 = new GridBagConstraints();
		gbc_lblkgmin_5.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblkgmin_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_5.gridx = 0;
		gbc_lblkgmin_5.gridy = 7;
		panel_2.add(lblkgmin_5, gbc_lblkgmin_5);
		
		JLabel lblkgmin_6 = new JLabel("柴油机空转单位时间");
		GridBagConstraints gbc_lblkgmin_6 = new GridBagConstraints();
		gbc_lblkgmin_6.anchor = GridBagConstraints.EAST;
		gbc_lblkgmin_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_6.gridx = 0;
		gbc_lblkgmin_6.gridy = 8;
		panel_2.add(lblkgmin_6, gbc_lblkgmin_6);
		
		textField_31 = new JTextField();
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 5, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 1;
		gbc_textField_31.gridy = 8;
		panel_2.add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);
		
		JLabel lblmin_2 = new JLabel("相应工作时间(min)");
		GridBagConstraints gbc_lblmin_2 = new GridBagConstraints();
		gbc_lblmin_2.anchor = GridBagConstraints.EAST;
		gbc_lblmin_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin_2.gridx = 2;
		gbc_lblmin_2.gridy = 8;
		panel_2.add(lblmin_2, gbc_lblmin_2);
		
		textField_32 = new JTextField();
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 3;
		gbc_textField_32.gridy = 8;
		panel_2.add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);
		
		JLabel lblkg_4 = new JLabel("结果: 区段内柴油机空转燃油消耗量(kg)");
		GridBagConstraints gbc_lblkg_4 = new GridBagConstraints();
		gbc_lblkg_4.anchor = GridBagConstraints.EAST;
		gbc_lblkg_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_4.gridx = 4;
		gbc_lblkg_4.gridy = 8;
		panel_2.add(lblkg_4, gbc_lblkg_4);
		
		textField_33 = new JTextField();
		textField_33.setEnabled(false);
		textField_33.setEditable(false);
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 5;
		gbc_textField_33.gridy = 8;
		panel_2.add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("油耗量(kg/min)");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 9;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblkg_5 = new JLabel("机车全区段的燃油消耗量(kg)");
		GridBagConstraints gbc_lblkg_5 = new GridBagConstraints();
		gbc_lblkg_5.anchor = GridBagConstraints.EAST;
		gbc_lblkg_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_5.gridx = 4;
		gbc_lblkg_5.gridy = 9;
		panel_2.add(lblkg_5, gbc_lblkg_5);
		
		textField_34 = new JTextField();
		textField_34.setEnabled(false);
		textField_34.setEditable(false);
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.insets = new Insets(0, 0, 5, 5);
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 5;
		gbc_textField_34.gridy = 9;
		panel_2.add(textField_34, gbc_textField_34);
		textField_34.setColumns(10);
		
		JLabel lblt_1 = new JLabel("牵引重量(t)");
		GridBagConstraints gbc_lblt_1 = new GridBagConstraints();
		gbc_lblt_1.anchor = GridBagConstraints.EAST;
		gbc_lblt_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_1.gridx = 0;
		gbc_lblt_1.gridy = 10;
		panel_2.add(lblt_1, gbc_lblt_1);
		
		textField_35 = new JTextField();
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 5, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 1;
		gbc_textField_35.gridy = 10;
		panel_2.add(textField_35, gbc_textField_35);
		textField_35.setColumns(10);
		
		JLabel lblkm_1 = new JLabel("牵引区段长度(km)");
		GridBagConstraints gbc_lblkm_1 = new GridBagConstraints();
		gbc_lblkm_1.anchor = GridBagConstraints.EAST;
		gbc_lblkm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkm_1.gridx = 2;
		gbc_lblkm_1.gridy = 10;
		panel_2.add(lblkm_1, gbc_lblkm_1);
		
		textField_36 = new JTextField();
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.insets = new Insets(0, 0, 5, 5);
		gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_36.gridx = 3;
		gbc_textField_36.gridy = 10;
		panel_2.add(textField_36, gbc_textField_36);
		textField_36.setColumns(10);
		
		JLabel lblkg_6 = new JLabel("结果: 内燃机车每总重万吨公里燃油消耗量(kg)");
		GridBagConstraints gbc_lblkg_6 = new GridBagConstraints();
		gbc_lblkg_6.anchor = GridBagConstraints.EAST;
		gbc_lblkg_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_6.gridx = 4;
		gbc_lblkg_6.gridy = 10;
		panel_2.add(lblkg_6, gbc_lblkg_6);
		
		textField_37 = new JTextField();
		textField_37.setEnabled(false);
		textField_37.setEditable(false);
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.insets = new Insets(0, 0, 5, 5);
		gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_37.gridx = 5;
		gbc_textField_37.gridy = 10;
		panel_2.add(textField_37, gbc_textField_37);
		textField_37.setColumns(10);
		
		JButton button_3 = new JButton("开始计算");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 11;
		panel_2.add(button_3, gbc_button_3);
		
		JButton button_1 = new JButton("内燃机车燃油消耗量曲线图");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 11;
		panel_2.add(button_1, gbc_button_1);
		
		JLabel lblgtgkm_1 = new JLabel("(单位燃油消耗量)(gtgkm)");
		GridBagConstraints gbc_lblgtgkm_1 = new GridBagConstraints();
		gbc_lblgtgkm_1.anchor = GridBagConstraints.EAST;
		gbc_lblgtgkm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblgtgkm_1.gridx = 4;
		gbc_lblgtgkm_1.gridy = 11;
		panel_2.add(lblgtgkm_1, gbc_lblgtgkm_1);
		
		textField_38 = new JTextField();
		textField_38.setEnabled(false);
		textField_38.setEditable(false);
		GridBagConstraints gbc_textField_38 = new GridBagConstraints();
		gbc_textField_38.insets = new Insets(0, 0, 5, 5);
		gbc_textField_38.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_38.gridx = 5;
		gbc_textField_38.gridy = 11;
		panel_2.add(textField_38, gbc_textField_38);
		textField_38.setColumns(10);

		return internalFrame;
	}

}
