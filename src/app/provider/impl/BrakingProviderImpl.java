/**
 * 
 */
package app.provider.impl;

import java.awt.CardLayout;
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

import app.enums.BrakeShoeType;
import app.enums.BrakeShoeType_2;
import app.enums.BrakerType;
import app.enums.BrakerType_2;
import app.enums.BrakingRatioType;
import app.enums.BrakingType;
import app.enums.BusType_2;
import app.enums.ConvertType;
import app.enums.DieselLocoType_3;
import app.enums.ElectricLocoType_2;
import app.enums.EmuType_2;
import app.enums.LocoVehicleModel;
import app.enums.PressureType;
import app.enums.TractionType;
import app.enums.TrainBrakingType;
import app.enums.TrunkOrBus;
import app.enums.TrunkType_2;
import app.provider.CalcProvider;

/**
 * @author I310818
 *
 */
public class BrakingProviderImpl implements CalcProvider {
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see app.provider.CalcProvider#createInternalFrame()
	 */
	@Override
	public JInternalFrame createInternalFrame() {
		final JInternalFrame internalFrame = new JInternalFrame("列车制动力", true, true, true, true);
		internalFrame.setBounds(20, 20, 1160, 720);
		internalFrame.setVisible(true);
		internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		final Container internalContainer = internalFrame.getContentPane();
		final CardLayout cardLayout = new CardLayout();
        internalContainer.setLayout(cardLayout);
        
        JPanel brakingPanel_1 = new JPanel();
        internalContainer.add(brakingPanel_1);
        JPanel brakingPanel_2 = new JPanel();
        internalContainer.add(brakingPanel_2);
		GridBagLayout gridbag = new GridBagLayout();
		gridbag.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0 };
		gridbag.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		brakingPanel_1.setLayout(gridbag);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "实算法求列车制动力", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 6;
		gbc_panel_1.gridwidth = 20;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		brakingPanel_1.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE, 0.0, 0.0, 0.0 };
		gbl_panel_1.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel label = new JLabel("制动类型");
		label.setBounds(63, 18, 52, 16);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		panel_1.add(label, gbc_label);
		JComboBox<String> locoType = new JComboBox<String>(BrakingType.getNameList());
		locoType.setBounds(121, 13, 165, 28);
		GridBagConstraints gbc_locoType = new GridBagConstraints();
		gbc_locoType.anchor = GridBagConstraints.WEST;
		gbc_locoType.insets = new Insets(0, 0, 5, 5);
		gbc_locoType.gridx = 2;
		gbc_locoType.gridy = 1;
		panel_1.add(locoType, gbc_locoType);
		locoType.setFocusable(false);
		locoType.setOpaque(false);
		locoType.setBackground(Color.white);

		JLabel lblkmh = new JLabel("制动缸空气压力(kPa)");
		lblkmh.setBounds(37, 46, 78, 16);
		GridBagConstraints gbc_lblkmh = new GridBagConstraints();
		gbc_lblkmh.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh.gridx = 3;
		gbc_lblkmh.gridy = 1;
		panel_1.add(lblkmh, gbc_lblkmh);

		textField_33 = new JTextField();
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 4;
		gbc_textField_33.gridy = 1;
		panel_1.add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("列车运行速度(km/h)");
		lblNewLabel_18.setBounds(312, 46, 61, 16);
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 7;
		gbc_lblNewLabel_18.gridy = 1;
		panel_1.add(lblNewLabel_18, gbc_lblNewLabel_18);

		textField_35 = new JTextField();
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 5, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 8;
		gbc_textField_35.gridy = 1;
		panel_1.add(textField_35, gbc_textField_35);
		textField_35.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("制动机类型");
		lblNewLabel_16.setBounds(312, 18, 61, 16);
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 1;
		gbc_lblNewLabel_16.gridy = 2;
		panel_1.add(lblNewLabel_16, gbc_lblNewLabel_16);

		JComboBox<String> locoModel = new JComboBox<String>(BrakerType.getNameList());
		locoModel.setBounds(385, 14, 128, 27);
		GridBagConstraints gbc_locoModel = new GridBagConstraints();
		gbc_locoModel.anchor = GridBagConstraints.WEST;
		gbc_locoModel.insets = new Insets(0, 0, 5, 5);
		gbc_locoModel.gridx = 2;
		gbc_locoModel.gridy = 2;
		panel_1.add(locoModel, gbc_locoModel);
		locoModel.setSelectedIndex(0);

		JLabel lblm = new JLabel("制动倍率");
		lblm.setBounds(63, 75, 52, 16);
		GridBagConstraints gbc_lblm = new GridBagConstraints();
		gbc_lblm.anchor = GridBagConstraints.EAST;
		gbc_lblm.insets = new Insets(0, 0, 5, 5);
		gbc_lblm.gridx = 3;
		gbc_lblm.gridy = 2;
		panel_1.add(lblm, gbc_lblm);

		textField_31 = new JTextField();
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 5, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 4;
		gbc_textField_31.gridy = 2;
		panel_1.add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);

		JLabel lblkmh_1 = new JLabel("制动初速度(km/h)");
		GridBagConstraints gbc_lblkmh_1 = new GridBagConstraints();
		gbc_lblkmh_1.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_1.gridx = 7;
		gbc_lblkmh_1.gridy = 2;
		panel_1.add(lblkmh_1, gbc_lblkmh_1);

		textField_34 = new JTextField();
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.insets = new Insets(0, 0, 5, 5);
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 8;
		gbc_textField_34.gridy = 2;
		panel_1.add(textField_34, gbc_textField_34);
		textField_34.setColumns(10);

		JLabel label_7 = new JLabel("列车管空气压力");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 3;
		panel_1.add(label_7, gbc_label_7);

		JComboBox<String> comboBox = new JComboBox<String>(PressureType.getNameList());
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 3;
		panel_1.add(comboBox, gbc_comboBox);

		JLabel lblNewLabel_17 = new JLabel("制动缸数");
		lblNewLabel_17.setBounds(11, 103, 104, 16);
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 3;
		gbc_lblNewLabel_17.gridy = 3;
		panel_1.add(lblNewLabel_17, gbc_lblNewLabel_17);

		textField_32 = new JTextField();
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 4;
		gbc_textField_32.gridy = 3;
		panel_1.add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);

		JLabel label_11 = new JLabel("闸瓦/片类型");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.EAST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 7;
		gbc_label_11.gridy = 3;
		panel_1.add(label_11, gbc_label_11);

		JComboBox<String> ctrlMethod = new JComboBox<String>(BrakeShoeType.getNameList());
		ctrlMethod.setBounds(385, 99, 128, 27);
		GridBagConstraints gbc_ctrlMethod = new GridBagConstraints();
		gbc_ctrlMethod.insets = new Insets(0, 0, 5, 5);
		gbc_ctrlMethod.anchor = GridBagConstraints.WEST;
		gbc_ctrlMethod.gridx = 8;
		gbc_ctrlMethod.gridy = 3;
		panel_1.add(ctrlMethod, gbc_ctrlMethod);

		JLabel label_8 = new JLabel("制动机类型2");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 4;
		panel_1.add(label_8, gbc_label_8);

		JComboBox<String> comboBox_1 = new JComboBox<String>(BrakerType_2.getNameList());
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.WEST;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 4;
		panel_1.add(comboBox_1, gbc_comboBox_1);

		JLabel lblNewLabel_1 = new JLabel("闸瓦数");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 4;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 4;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		JLabel lblt = new JLabel("列车质量(t)");
		GridBagConstraints gbc_lblt = new GridBagConstraints();
		gbc_lblt.anchor = GridBagConstraints.EAST;
		gbc_lblt.insets = new Insets(0, 0, 5, 5);
		gbc_lblt.gridx = 7;
		gbc_lblt.gridy = 4;
		panel_1.add(lblt, gbc_lblt);

		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 8;
		gbc_textField_8.gridy = 4;
		panel_1.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);

		JLabel lblkpa = new JLabel("列车管减压量(kPa)");
		GridBagConstraints gbc_lblkpa = new GridBagConstraints();
		gbc_lblkpa.anchor = GridBagConstraints.EAST;
		gbc_lblkpa.insets = new Insets(0, 0, 5, 5);
		gbc_lblkpa.gridx = 1;
		gbc_lblkpa.gridy = 5;
		panel_1.add(lblkpa, gbc_lblkpa);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 5;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("列车制动类型");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 3;
		gbc_lblNewLabel_4.gridy = 5;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);

		JComboBox<String> comboBox_2 = new JComboBox<String>(TrainBrakingType.getNameList());
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 4;
		gbc_comboBox_2.gridy = 5;
		panel_1.add(comboBox_2, gbc_comboBox_2);

		JLabel lblNewLabel_19 = new JLabel("制动率类型");
		lblNewLabel_19.setBounds(312, 75, 61, 16);
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 7;
		gbc_lblNewLabel_19.gridy = 5;
		panel_1.add(lblNewLabel_19, gbc_lblNewLabel_19);

		JComboBox<String> comboBox_3 = new JComboBox<String>(BrakingRatioType.getNameList());
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 8;
		gbc_comboBox_3.gridy = 5;
		panel_1.add(comboBox_3, gbc_comboBox_3);

		JLabel label_9 = new JLabel("机车、车辆型号");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.EAST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 6;
		panel_1.add(label_9, gbc_label_9);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 6;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblmm_1 = new JLabel("制动盘摩擦半径(mm)");
		GridBagConstraints gbc_lblmm_1 = new GridBagConstraints();
		gbc_lblmm_1.anchor = GridBagConstraints.EAST;
		gbc_lblmm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblmm_1.gridx = 3;
		gbc_lblmm_1.gridy = 6;
		panel_1.add(lblmm_1, gbc_lblmm_1);

		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 6;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblkn_2 = new JLabel("一辆车的全部闸瓦压力(KN)");
		lblkn_2.setBounds(312, 103, 61, 16);
		GridBagConstraints gbc_lblkn_2 = new GridBagConstraints();
		gbc_lblkn_2.anchor = GridBagConstraints.EAST;
		gbc_lblkn_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_2.gridx = 7;
		gbc_lblkn_2.gridy = 6;
		panel_1.add(lblkn_2, gbc_lblkn_2);

		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 8;
		gbc_textField_9.gridy = 6;
		panel_1.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);

		JLabel label_10 = new JLabel("台/辆数(辆)");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.EAST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 7;
		panel_1.add(label_10, gbc_label_10);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 7;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblbanj = new JLabel("车辆车轮半径(mm)");
		GridBagConstraints gbc_lblbanj = new GridBagConstraints();
		gbc_lblbanj.anchor = GridBagConstraints.EAST;
		gbc_lblbanj.insets = new Insets(0, 0, 5, 5);
		gbc_lblbanj.gridx = 3;
		gbc_lblbanj.gridy = 7;
		panel_1.add(lblbanj, gbc_lblbanj);

		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 4;
		gbc_textField_6.gridy = 7;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);

		JLabel lblt_1 = new JLabel("一辆车的质量(t)");
		GridBagConstraints gbc_lblt_1 = new GridBagConstraints();
		gbc_lblt_1.anchor = GridBagConstraints.EAST;
		gbc_lblt_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_1.gridx = 7;
		gbc_lblt_1.gridy = 7;
		panel_1.add(lblt_1, gbc_lblt_1);

		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 8;
		gbc_textField_10.gridy = 7;
		panel_1.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);

		JLabel lblmm = new JLabel("制动缸直径(mm)");
		GridBagConstraints gbc_lblmm = new GridBagConstraints();
		gbc_lblmm.anchor = GridBagConstraints.EAST;
		gbc_lblmm.insets = new Insets(0, 0, 5, 5);
		gbc_lblmm.gridx = 1;
		gbc_lblmm.gridy = 8;
		panel_1.add(lblmm, gbc_lblmm);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 8;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblkn = new JLabel("每块闸瓦的压力(KN)");
		GridBagConstraints gbc_lblkn = new GridBagConstraints();
		gbc_lblkn.anchor = GridBagConstraints.EAST;
		gbc_lblkn.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn.gridx = 3;
		gbc_lblkn.gridy = 8;
		panel_1.add(lblkn, gbc_lblkn);

		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 4;
		gbc_textField_7.gridy = 8;
		panel_1.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);

		JLabel lblkn_1 = new JLabel("列车全部实算闸瓦压力(KN)");
		GridBagConstraints gbc_lblkn_1 = new GridBagConstraints();
		gbc_lblkn_1.anchor = GridBagConstraints.EAST;
		gbc_lblkn_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_1.gridx = 7;
		gbc_lblkn_1.gridy = 8;
		panel_1.add(lblkn_1, gbc_lblkn_1);

		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 8;
		gbc_textField_11.gridy = 8;
		panel_1.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);

		JLabel lblt_2 = new JLabel("列车质量2(t)");
		GridBagConstraints gbc_lblt_2 = new GridBagConstraints();
		gbc_lblt_2.anchor = GridBagConstraints.EAST;
		gbc_lblt_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblt_2.gridx = 7;
		gbc_lblt_2.gridy = 9;
		panel_1.add(lblt_2, gbc_lblt_2);

		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 0, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 8;
		gbc_textField_12.gridy = 9;
		panel_1.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "换算法求列车制动力", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 5;
		gbc_panel_2.gridwidth = 19;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 6;
		brakingPanel_1.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 28, 28, 28, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblNewLabel = new JLabel("闸瓦/片类型");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);

		JComboBox<String> comboBox_4 = new JComboBox<String>(BrakeShoeType_2.getNameList());
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 0;
		panel_2.add(comboBox_4, gbc_comboBox_4);

		JLabel lblNewLabel_8 = new JLabel("列车制动类型");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 0;
		panel_2.add(lblNewLabel_8, gbc_lblNewLabel_8);

		JComboBox<String> comboBox_7 = new JComboBox<String>(BrakingType.getNameList());
		GridBagConstraints gbc_comboBox_7 = new GridBagConstraints();
		gbc_comboBox_7.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_7.gridx = 3;
		gbc_comboBox_7.gridy = 0;
		panel_2.add(comboBox_7, gbc_comboBox_7);

		JLabel lblNewLabel_5 = new JLabel("单机牵引/多机牵引");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 4;
		gbc_lblNewLabel_5.gridy = 0;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);

		JComboBox<String> comboBox_9 = new JComboBox<String>(TractionType.getNameList());
		GridBagConstraints gbc_comboBox_9 = new GridBagConstraints();
		gbc_comboBox_9.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_9.gridx = 5;
		gbc_comboBox_9.gridy = 0;
		panel_2.add(comboBox_9, gbc_comboBox_9);

		JLabel lblNewLabel_2 = new JLabel("列车运行速度(km/h)");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField_26 = new JTextField();
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.gridx = 1;
		gbc_textField_26.gridy = 1;
		panel_2.add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("旅客列车/货物列车");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 1;
		panel_2.add(lblNewLabel_9, gbc_lblNewLabel_9);

		JComboBox<String> comboBox_8 = new JComboBox<String>(TrunkOrBus.getNameList());
		GridBagConstraints gbc_comboBox_8 = new GridBagConstraints();
		gbc_comboBox_8.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_8.gridx = 3;
		gbc_comboBox_8.gridy = 1;
		panel_2.add(comboBox_8, gbc_comboBox_8);

		JLabel label_6 = new JLabel("动力制动力使用系数");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.gridx = 4;
		gbc_label_6.gridy = 1;
		panel_2.add(label_6, gbc_label_6);

		textField_19 = new JTextField();
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 5;
		gbc_textField_19.gridy = 1;
		panel_2.add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("制动初速度(km/h)");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);

		textField_27 = new JTextField();
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.insets = new Insets(0, 0, 5, 5);
		gbc_textField_27.gridx = 1;
		gbc_textField_27.gridy = 2;
		panel_2.add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("机车轮周牵引力(KN)");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 2;
		panel_2.add(lblNewLabel_10, gbc_lblNewLabel_10);

		textField_30 = new JTextField();
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 3;
		gbc_textField_30.gridy = 2;
		panel_2.add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);

		JLabel lblkn_5 = new JLabel("机车动力制动力(KN)");
		GridBagConstraints gbc_lblkn_5 = new GridBagConstraints();
		gbc_lblkn_5.anchor = GridBagConstraints.EAST;
		gbc_lblkn_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_5.gridx = 4;
		gbc_lblkn_5.gridy = 2;
		panel_2.add(lblkn_5, gbc_lblkn_5);

		textField_20 = new JTextField();
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 5;
		gbc_textField_20.gridy = 2;
		panel_2.add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);

		JLabel label_1 = new JLabel("机车、车辆类型");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 3;
		panel_2.add(label_1, gbc_label_1);

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
		GridBagConstraints gbc_locoVehicleModel = new GridBagConstraints();
		gbc_locoVehicleModel.insets = new Insets(0, 0, 5, 5);
		gbc_locoVehicleModel.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoVehicleModel.gridx = 1;
		gbc_locoVehicleModel.gridy = 3;
		panel_2.add(locoVehicleModel, gbc_locoVehicleModel);
		locoVehicleModel.setSelectedIndex(0);

		GridBagConstraints gbc_locoVehicleTypeByModel = new GridBagConstraints();
		gbc_locoVehicleTypeByModel.gridwidth = 2;
		gbc_locoVehicleTypeByModel.insets = new Insets(0, 0, 5, 5);
		gbc_locoVehicleTypeByModel.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoVehicleTypeByModel.gridx = 2;
		gbc_locoVehicleTypeByModel.gridy = 3;
		panel_2.add(locoVehicleTypeByModel, gbc_locoVehicleTypeByModel);

		JLabel lblt_4 = new JLabel("机车计算质量(t)");
		GridBagConstraints gbc_lblt_4 = new GridBagConstraints();
		gbc_lblt_4.anchor = GridBagConstraints.EAST;
		gbc_lblt_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_4.gridx = 4;
		gbc_lblt_4.gridy = 3;
		panel_2.add(lblt_4, gbc_lblt_4);

		textField_21 = new JTextField();
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 5;
		gbc_textField_21.gridy = 3;
		panel_2.add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);

		JLabel label_2 = new JLabel("折算类型");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 4;
		panel_2.add(label_2, gbc_label_2);

		JComboBox<String> comboBox_5 = new JComboBox<String>(ConvertType.getNameList());
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 1;
		gbc_comboBox_5.gridy = 4;
		panel_2.add(comboBox_5, gbc_comboBox_5);

		JLabel lblkpa_3 = new JLabel("列车管减压量(kPa)");
		GridBagConstraints gbc_lblkpa_3 = new GridBagConstraints();
		gbc_lblkpa_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblkpa_3.anchor = GridBagConstraints.EAST;
		gbc_lblkpa_3.gridx = 2;
		gbc_lblkpa_3.gridy = 4;
		panel_2.add(lblkpa_3, gbc_lblkpa_3);

		textField_28 = new JTextField();
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.insets = new Insets(0, 0, 5, 5);
		gbc_textField_28.gridx = 3;
		gbc_textField_28.gridy = 4;
		panel_2.add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);

		JLabel lblt_5 = new JLabel("牵引质量(t)");
		GridBagConstraints gbc_lblt_5 = new GridBagConstraints();
		gbc_lblt_5.anchor = GridBagConstraints.EAST;
		gbc_lblt_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_5.gridx = 4;
		gbc_lblt_5.gridy = 4;
		panel_2.add(lblt_5, gbc_lblt_5);

		textField_22 = new JTextField();
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 5;
		gbc_textField_22.gridy = 4;
		panel_2.add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);

		JLabel lblkpa_1 = new JLabel("自动制动机列车主管压力");
		GridBagConstraints gbc_lblkpa_1 = new GridBagConstraints();
		gbc_lblkpa_1.anchor = GridBagConstraints.EAST;
		gbc_lblkpa_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkpa_1.gridx = 0;
		gbc_lblkpa_1.gridy = 5;
		panel_2.add(lblkpa_1, gbc_lblkpa_1);

		JComboBox<String> comboBox_6 = new JComboBox<String>(PressureType.getNameList());
		GridBagConstraints gbc_comboBox_6 = new GridBagConstraints();
		gbc_comboBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_6.gridx = 1;
		gbc_comboBox_6.gridy = 5;
		panel_2.add(comboBox_6, gbc_comboBox_6);

		JLabel lblkpa_2 = new JLabel("列车管空气压力(kPa)");
		GridBagConstraints gbc_lblkpa_2 = new GridBagConstraints();
		gbc_lblkpa_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkpa_2.anchor = GridBagConstraints.EAST;
		gbc_lblkpa_2.gridx = 2;
		gbc_lblkpa_2.gridy = 5;
		panel_2.add(lblkpa_2, gbc_lblkpa_2);

		textField_29 = new JTextField();
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.gridx = 3;
		gbc_textField_29.gridy = 5;
		panel_2.add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);

		JLabel lblnkn = new JLabel("机车运行单位基本阻力(N/KN)");
		GridBagConstraints gbc_lblnkn = new GridBagConstraints();
		gbc_lblnkn.anchor = GridBagConstraints.EAST;
		gbc_lblnkn.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn.gridx = 4;
		gbc_lblnkn.gridy = 5;
		panel_2.add(lblnkn, gbc_lblnkn);

		textField_23 = new JTextField();
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 5;
		gbc_textField_23.gridy = 5;
		panel_2.add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);

		JLabel label_3 = new JLabel("机车台数(台)");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 6;
		panel_2.add(label_3, gbc_label_3);

		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 6;
		panel_2.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);

		JLabel lblkn_3 = new JLabel("每轴作用在钢轨上的垂直载荷(KN)");
		GridBagConstraints gbc_lblkn_3 = new GridBagConstraints();
		gbc_lblkn_3.anchor = GridBagConstraints.EAST;
		gbc_lblkn_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_3.gridx = 2;
		gbc_lblkn_3.gridy = 6;
		panel_2.add(lblkn_3, gbc_lblkn_3);

		textField_16 = new JTextField();
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 3;
		gbc_textField_16.gridy = 6;
		panel_2.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);

		JLabel lblnkn_1 = new JLabel("车辆运行单位基本阻(N/KN)");
		GridBagConstraints gbc_lblnkn_1 = new GridBagConstraints();
		gbc_lblnkn_1.anchor = GridBagConstraints.EAST;
		gbc_lblnkn_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn_1.gridx = 4;
		gbc_lblnkn_1.gridy = 6;
		panel_2.add(lblnkn_1, gbc_lblnkn_1);

		textField_24 = new JTextField();
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.insets = new Insets(0, 0, 5, 5);
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.gridx = 5;
		gbc_textField_24.gridy = 6;
		panel_2.add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);

		JLabel label_4 = new JLabel("车辆辆数(辆)");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 7;
		panel_2.add(label_4, gbc_label_4);

		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 1;
		gbc_textField_14.gridy = 7;
		panel_2.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);

		JLabel label_5 = new JLabel("轮轨件的黏着系数");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 2;
		gbc_label_5.gridy = 7;
		panel_2.add(label_5, gbc_label_5);

		textField_17 = new JTextField();
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 3;
		gbc_textField_17.gridy = 7;
		panel_2.add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);

		JLabel label_12 = new JLabel("计算坡度千分数");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.EAST;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 4;
		gbc_label_12.gridy = 7;
		panel_2.add(label_12, gbc_label_12);

		textField_25 = new JTextField();
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 5;
		gbc_textField_25.gridy = 7;
		panel_2.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);

		JLabel lblt_3 = new JLabel("列车质量(t)");
		GridBagConstraints gbc_lblt_3 = new GridBagConstraints();
		gbc_lblt_3.anchor = GridBagConstraints.EAST;
		gbc_lblt_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblt_3.gridx = 0;
		gbc_lblt_3.gridy = 8;
		panel_2.add(lblt_3, gbc_lblt_3);

		textField_15 = new JTextField();
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 0, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 1;
		gbc_textField_15.gridy = 8;
		panel_2.add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);

		JLabel lblkn_4 = new JLabel("每轴上的闸瓦压力(KN)");
		GridBagConstraints gbc_lblkn_4 = new GridBagConstraints();
		gbc_lblkn_4.anchor = GridBagConstraints.EAST;
		gbc_lblkn_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblkn_4.gridx = 2;
		gbc_lblkn_4.gridy = 8;
		panel_2.add(lblkn_4, gbc_lblkn_4);

		textField_18 = new JTextField();
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 0, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 3;
		gbc_textField_18.gridy = 8;
		panel_2.add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);

		JButton btnNewButton = new JButton("开始计算");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(internalContainer);
			}
			
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 8;
		panel_2.add(btnNewButton, gbc_btnNewButton);

		return internalFrame;
	}

}
