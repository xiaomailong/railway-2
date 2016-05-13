/**
 * 
 */
package app.provider.impl;

import java.awt.CardLayout;
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
import app.enums.LocoType_3;
import app.enums.LocoVehicleModel;
import app.enums.TrunkType_2;
import app.enums.VehicleType;
import app.enums.YesOrNoType;
import app.provider.CalcProvider;

/**
 * @author I310818
 *
 */
public class TractionMassCalcProviderImpl implements CalcProvider {
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_9;
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
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField;
	private JTextField textField_7;
	private JTextField textField_16;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_30;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;

	/*
	 * (non-Javadoc)
	 * 
	 * @see app.provider.CalcProvider#createInternalFrame()
	 */
	@Override
	public JInternalFrame createInternalFrame() {
		final JInternalFrame internalFrame = new JInternalFrame("牵引质量计算", true, true, true, true);
		internalFrame.setBounds(20, 20, 1160, 600);
		internalFrame.setVisible(true);
		internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		final Container internalContainer = internalFrame.getContentPane();
		final CardLayout cardLayout = new CardLayout();
		internalContainer.setLayout(cardLayout);

		JPanel calcPanel_1 = new JPanel();
		internalContainer.add(calcPanel_1);
		JPanel calcPanel_2 = new JPanel();
		internalContainer.add(calcPanel_2);
		GridBagLayout gridbag = new GridBagLayout();
		gridbag.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0 };
		gridbag.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		calcPanel_1.setLayout(gridbag);
		calcPanel_2.setLayout(gridbag);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "牵引质量计算", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 5;
		gbc_panel_1.gridwidth = 19;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		calcPanel_1.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 28, 28, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, 10.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblNewLabel = new JLabel("机车类型");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);

		JComboBox<String> comboBox_4 = new JComboBox<String>(LocoType_3.getNameList());
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 0;
		panel_1.add(comboBox_4, gbc_comboBox_4);

		JLabel lblNewLabel_8 = new JLabel("车辆类型");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 0;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>(VehicleType.getNameList());
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 0;
		panel_1.add(comboBox_2, gbc_comboBox_2);

		JLabel lblNewLabel_5 = new JLabel("机车计算牵引力(KN)");
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

		JLabel lblNewLabel_2 = new JLabel("机车计算速度(km/h)");
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

		JLabel lblNewLabel_9 = new JLabel("机车牵引力使用系数");
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

		JLabel lbla = new JLabel("限制坡道加算坡度千分数");
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
				
						JLabel lblNewLabel_3 = new JLabel("机车计算质量(t)");
						GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
						gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
						gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel_3.gridx = 0;
						gbc_lblNewLabel_3.gridy = 2;
						panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
				
				textField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 2;
				panel_1.add(textField, gbc_textField);
				textField.setColumns(10);
		
				JLabel lblkpa_3 = new JLabel("机车计算速度下的机车");
				GridBagConstraints gbc_lblkpa_3 = new GridBagConstraints();
				gbc_lblkpa_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblkpa_3.anchor = GridBagConstraints.EAST;
				gbc_lblkpa_3.gridx = 2;
				gbc_lblkpa_3.gridy = 2;
				panel_1.add(lblkpa_3, gbc_lblkpa_3);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 2;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblkn_5 = new JLabel("机车计算速度下的车辆单位基本阻力(N/KN)");
		GridBagConstraints gbc_lblkn_5 = new GridBagConstraints();
		gbc_lblkn_5.anchor = GridBagConstraints.EAST;
		gbc_lblkn_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_5.gridx = 4;
		gbc_lblkn_5.gridy = 2;
		panel_1.add(lblkn_5, gbc_lblkn_5);

		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 5;
		gbc_textField_6.gridy = 2;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
				
				JLabel lblnkn = new JLabel("单位基本阻力(N/KN)");
				GridBagConstraints gbc_lblnkn = new GridBagConstraints();
				gbc_lblnkn.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblnkn.insets = new Insets(0, 0, 5, 5);
				gbc_lblnkn.gridx = 2;
				gbc_lblnkn.gridy = 3;
				panel_1.add(lblnkn, gbc_lblnkn);
				
						JLabel lblkpa_2 = new JLabel("结果: 计算坡道上的牵引质量(t)");
						GridBagConstraints gbc_lblkpa_2 = new GridBagConstraints();
						gbc_lblkpa_2.insets = new Insets(0, 0, 5, 5);
						gbc_lblkpa_2.anchor = GridBagConstraints.EAST;
						gbc_lblkpa_2.gridx = 4;
						gbc_lblkpa_2.gridy = 4;
						panel_1.add(lblkpa_2, gbc_lblkpa_2);
				
				textField_8 = new JTextField();
				textField_8.setEnabled(false);
				textField_8.setEditable(false);
				GridBagConstraints gbc_textField_8 = new GridBagConstraints();
				gbc_textField_8.insets = new Insets(0, 0, 5, 5);
				gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_8.gridx = 5;
				gbc_textField_8.gridy = 4;
				panel_1.add(textField_8, gbc_textField_8);
				textField_8.setColumns(10);
				
				JLabel lblh = new JLabel("限制坡度(‰)");
				GridBagConstraints gbc_lblh = new GridBagConstraints();
				gbc_lblh.anchor = GridBagConstraints.EAST;
				gbc_lblh.insets = new Insets(0, 0, 5, 5);
				gbc_lblh.gridx = 0;
				gbc_lblh.gridy = 5;
				panel_1.add(lblh, gbc_lblh);
				
				textField_10 = new JTextField();
				GridBagConstraints gbc_textField_10 = new GridBagConstraints();
				gbc_textField_10.insets = new Insets(0, 0, 5, 5);
				gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_10.gridx = 1;
				gbc_textField_10.gridy = 5;
				panel_1.add(textField_10, gbc_textField_10);
				textField_10.setColumns(10);
				
				JLabel label = new JLabel("有/无计算坡度");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.anchor = GridBagConstraints.EAST;
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 2;
				gbc_label.gridy = 5;
				panel_1.add(label, gbc_label);
				
				JComboBox<String> comboBox = new JComboBox<String>(YesOrNoType.getNameList());
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 3;
				gbc_comboBox.gridy = 5;
				panel_1.add(comboBox, gbc_comboBox);
		
				JLabel lblt_4 = new JLabel("结果: 试算牵引质量(t)");
				GridBagConstraints gbc_lblt_4 = new GridBagConstraints();
				gbc_lblt_4.anchor = GridBagConstraints.EAST;
				gbc_lblt_4.insets = new Insets(0, 0, 5, 5);
				gbc_lblt_4.gridx = 0;
				gbc_lblt_4.gridy = 6;
				panel_1.add(lblt_4, gbc_lblt_4);
		
				textField_9 = new JTextField();
				textField_9.setEnabled(false);
				textField_9.setEditable(false);
				GridBagConstraints gbc_textField_9 = new GridBagConstraints();
				gbc_textField_9.insets = new Insets(0, 0, 5, 5);
				gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_9.gridx = 1;
				gbc_textField_9.gridy = 6;
				panel_1.add(textField_9, gbc_textField_9);
				textField_9.setColumns(10);
		
		JLabel lblt_2 = new JLabel("动能坡道上所求的牵引质量(t)");
		GridBagConstraints gbc_lblt_2 = new GridBagConstraints();
		gbc_lblt_2.anchor = GridBagConstraints.EAST;
		gbc_lblt_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_2.gridx = 2;
		gbc_lblt_2.gridy = 6;
		panel_1.add(lblt_2, gbc_lblt_2);
		
		textField_11 = new JTextField();
		textField_11.setEnabled(false);
		textField_11.setEditable(false);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 3;
		gbc_textField_11.gridy = 6;
		panel_1.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JLabel lblkwh = new JLabel("与此动能坡道相当的计算坡度(‰)");
		GridBagConstraints gbc_lblkwh = new GridBagConstraints();
		gbc_lblkwh.anchor = GridBagConstraints.EAST;
		gbc_lblkwh.insets = new Insets(0, 0, 5, 5);
		gbc_lblkwh.gridx = 4;
		gbc_lblkwh.gridy = 6;
		panel_1.add(lblkwh, gbc_lblkwh);
		
		textField_12 = new JTextField();
		textField_12.setEnabled(false);
		textField_12.setEditable(false);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 5;
		gbc_textField_12.gridy = 6;
		panel_1.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JLabel lblkm = new JLabel("列车回转质量系数");
		GridBagConstraints gbc_lblkm = new GridBagConstraints();
		gbc_lblkm.anchor = GridBagConstraints.EAST;
		gbc_lblkm.insets = new Insets(0, 0, 5, 5);
		gbc_lblkm.gridx = 0;
		gbc_lblkm.gridy = 7;
		panel_1.add(lblkm, gbc_lblkm);
		
		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 7;
		panel_1.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);
		
		JLabel lblt = new JLabel("列车最高运行速度(km/h)");
		GridBagConstraints gbc_lblt = new GridBagConstraints();
		gbc_lblt.anchor = GridBagConstraints.EAST;
		gbc_lblt.insets = new Insets(0, 0, 5, 5);
		gbc_lblt.gridx = 2;
		gbc_lblt.gridy = 7;
		panel_1.add(lblt, gbc_lblt);
		
		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 3;
		gbc_textField_14.gridy = 7;
		panel_1.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);
		
		JLabel lblkn = new JLabel("列车最高运行速度时的机车牵引力(KN)");
		GridBagConstraints gbc_lblkn = new GridBagConstraints();
		gbc_lblkn.anchor = GridBagConstraints.EAST;
		gbc_lblkn.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn.gridx = 4;
		gbc_lblkn.gridy = 7;
		panel_1.add(lblkn, gbc_lblkn);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 5;
		gbc_textField_7.gridy = 7;
		panel_1.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel label_1 = new JLabel("列车最高运行速度时的");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 8;
		panel_1.add(label_1, gbc_label_1);
		
		textField_16 = new JTextField();
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 1;
		gbc_textField_16.gridy = 8;
		panel_1.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);
		
		JLabel label_7 = new JLabel("列车最高运行速度时的");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 2;
		gbc_label_7.gridy = 8;
		panel_1.add(label_7, gbc_label_7);
		
		textField_39 = new JTextField();
		GridBagConstraints gbc_textField_39 = new GridBagConstraints();
		gbc_textField_39.insets = new Insets(0, 0, 5, 5);
		gbc_textField_39.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_39.gridx = 3;
		gbc_textField_39.gridy = 8;
		panel_1.add(textField_39, gbc_textField_39);
		textField_39.setColumns(10);
		
		JLabel label_8 = new JLabel("列车在平直道上以最高速度运行时");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 4;
		gbc_label_8.gridy = 8;
		panel_1.add(label_8, gbc_label_8);
		
		textField_40 = new JTextField();
		GridBagConstraints gbc_textField_40 = new GridBagConstraints();
		gbc_textField_40.insets = new Insets(0, 0, 5, 5);
		gbc_textField_40.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_40.gridx = 5;
		gbc_textField_40.gridy = 8;
		panel_1.add(textField_40, gbc_textField_40);
		textField_40.setColumns(10);
		
		JLabel lblnkn_1 = new JLabel("机车单位基本阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_1 = new GridBagConstraints();
		gbc_lblnkn_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblnkn_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn_1.gridx = 0;
		gbc_lblnkn_1.gridy = 9;
		panel_1.add(lblnkn_1, gbc_lblnkn_1);
		
		JLabel lblnkn_2 = new JLabel("车辆单位基本阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_2 = new GridBagConstraints();
		gbc_lblnkn_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblnkn_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn_2.gridx = 2;
		gbc_lblnkn_2.gridy = 9;
		panel_1.add(lblnkn_2, gbc_lblnkn_2);
		
		JLabel lblm = new JLabel("保有加速度(m/s²)");
		GridBagConstraints gbc_lblm = new GridBagConstraints();
		gbc_lblm.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblm.insets = new Insets(0, 0, 5, 5);
		gbc_lblm.gridx = 4;
		gbc_lblm.gridy = 9;
		panel_1.add(lblm, gbc_lblm);
		
		JLabel lblkwh_2 = new JLabel("结果: 列车在平直道上以最高速度运行时");
		GridBagConstraints gbc_lblkwh_2 = new GridBagConstraints();
		gbc_lblkwh_2.anchor = GridBagConstraints.EAST;
		gbc_lblkwh_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkwh_2.gridx = 4;
		gbc_lblkwh_2.gridy = 10;
		panel_1.add(lblkwh_2, gbc_lblkwh_2);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setEditable(false);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 5;
		gbc_textField_15.gridy = 10;
		panel_1.add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);
		
		JButton button = new JButton("开始计算");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 11;
		panel_1.add(button, gbc_button);
		
		JLabel lblt_3 = new JLabel("仍有加速度时牵引质量(t)");
		GridBagConstraints gbc_lblt_3 = new GridBagConstraints();
		gbc_lblt_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_3.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblt_3.gridx = 4;
		gbc_lblt_3.gridy = 11;
		panel_1.add(lblt_3, gbc_lblt_3);				

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "生成图形", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 3;
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 5;
		calcPanel_1.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 130, 0, 169, 117, 169, 0 };
		gbl_panel_3.rowHeights = new int[] { 28, 28, 28, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);
		
		JButton button_2 = new JButton("合力曲线图");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 1;
		panel_3.add(button_2, gbc_button_2);
		
		JButton button_4 = new JButton("动能闯坡速度线");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 2;
		panel_3.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("坡顶速度与牵引质量的关系曲线");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.anchor = GridBagConstraints.WEST;
		gbc_button_5.insets = new Insets(0, 0, 0, 5);
		gbc_button_5.gridx = 0;
		gbc_button_5.gridy = 3;
		panel_3.add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("第二页");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(internalContainer);
			}
		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 17;
		gbc_button_6.gridy = 6;
		calcPanel_1.add(button_6, gbc_button_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "牵引质量检验", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 9;
		gbc_panel_2.gridwidth = 19;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		calcPanel_2.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 28, 28, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, 8.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblkn_1 = new JLabel("机车计算起动牵引力(KN)");
		GridBagConstraints gbc_lblkn_1 = new GridBagConstraints();
		gbc_lblkn_1.anchor = GridBagConstraints.EAST;
		gbc_lblkn_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_1.gridx = 0;
		gbc_lblkn_1.gridy = 0;
		panel_2.add(lblkn_1, gbc_lblkn_1);
		
		textField_19 = new JTextField();
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 1;
		gbc_textField_19.gridy = 0;
		panel_2.add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);
		
		JLabel label_4 = new JLabel("起动地点加算坡度千分数");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 0;
		panel_2.add(label_4, gbc_label_4);
		
		textField_20 = new JTextField();
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 3;
		gbc_textField_20.gridy = 0;
		panel_2.add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);
		
		JLabel lblt_5 = new JLabel("机车计算质量(t)");
		GridBagConstraints gbc_lblt_5 = new GridBagConstraints();
		gbc_lblt_5.anchor = GridBagConstraints.EAST;
		gbc_lblt_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_5.gridx = 4;
		gbc_lblt_5.gridy = 0;
		panel_2.add(lblt_5, gbc_lblt_5);
		
		textField_21 = new JTextField();
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 5;
		gbc_textField_21.gridy = 0;
		panel_2.add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);
		
		JLabel lblkgmin_1 = new JLabel("机车起动单位基本阻力(N/KN)");
		GridBagConstraints gbc_lblkgmin_1 = new GridBagConstraints();
		gbc_lblkgmin_1.anchor = GridBagConstraints.EAST;
		gbc_lblkgmin_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_1.gridx = 0;
		gbc_lblkgmin_1.gridy = 1;
		panel_2.add(lblkgmin_1, gbc_lblkgmin_1);
		
		textField_22 = new JTextField();
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 1;
		gbc_textField_22.gridy = 1;
		panel_2.add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);
		
		JLabel lblkg = new JLabel("车辆起动单位基本阻力(N/KN)");
		GridBagConstraints gbc_lblkg = new GridBagConstraints();
		gbc_lblkg.anchor = GridBagConstraints.EAST;
		gbc_lblkg.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg.gridx = 2;
		gbc_lblkg.gridy = 1;
		panel_2.add(lblkg, gbc_lblkg);
		
		textField_23 = new JTextField();
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 3;
		gbc_textField_23.gridy = 1;
		panel_2.add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("结果: 起动地段牵引质量(t)");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_41 = new JTextField();
		textField_41.setEnabled(false);
		textField_41.setEditable(false);
		GridBagConstraints gbc_textField_41 = new GridBagConstraints();
		gbc_textField_41.insets = new Insets(0, 0, 5, 5);
		gbc_textField_41.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_41.gridx = 1;
		gbc_textField_41.gridy = 2;
		panel_2.add(textField_41, gbc_textField_41);
		textField_41.setColumns(10);
		
		JLabel lblkg_1 = new JLabel("能够起动的坡度千分数");
		GridBagConstraints gbc_lblkg_1 = new GridBagConstraints();
		gbc_lblkg_1.anchor = GridBagConstraints.EAST;
		gbc_lblkg_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_1.gridx = 2;
		gbc_lblkg_1.gridy = 2;
		panel_2.add(lblkg_1, gbc_lblkg_1);
		
		textField_42 = new JTextField();
		textField_42.setEnabled(false);
		textField_42.setEditable(false);
		GridBagConstraints gbc_textField_42 = new GridBagConstraints();
		gbc_textField_42.insets = new Insets(0, 0, 5, 5);
		gbc_textField_42.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_42.gridx = 3;
		gbc_textField_42.gridy = 2;
		panel_2.add(textField_42, gbc_textField_42);
		textField_42.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("按限制坡道计算出来的牵引质量");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.gridx = 4;
		gbc_lblNewLabel_6.gridy = 2;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
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
		
		JLabel lblkg_2 = new JLabel("在车站能/不能够可靠起动");
		GridBagConstraints gbc_lblkg_2 = new GridBagConstraints();
		gbc_lblkg_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblkg_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_2.gridx = 4;
		gbc_lblkg_2.gridy = 3;
		panel_2.add(lblkg_2, gbc_lblkg_2);
		
		JLabel lblm_1 = new JLabel("曲线半径(m)");
		GridBagConstraints gbc_lblm_1 = new GridBagConstraints();
		gbc_lblm_1.anchor = GridBagConstraints.EAST;
		gbc_lblm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_1.gridx = 0;
		gbc_lblm_1.gridy = 4;
		panel_2.add(lblm_1, gbc_lblm_1);
		
		textField_25 = new JTextField();
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 1;
		gbc_textField_25.gridy = 4;
		panel_2.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		JLabel label_3 = new JLabel("结果:");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 3;
		gbc_label_3.gridy = 4;
		panel_2.add(label_3, gbc_label_3);
		
		JLabel lblkgmin_3 = new JLabel("三轴转向架电力机车的牵引质量(t)");
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
		
		JLabel lblkgmin_4 = new JLabel("三轴转向架机车小半径曲线上");
		GridBagConstraints gbc_lblkgmin_4 = new GridBagConstraints();
		gbc_lblkgmin_4.anchor = GridBagConstraints.EAST;
		gbc_lblkgmin_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_4.gridx = 0;
		gbc_lblkgmin_4.gridy = 5;
		panel_2.add(lblkgmin_4, gbc_lblkgmin_4);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setEnabled(false);
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(0, 0, 5, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 1;
		gbc_textField_28.gridy = 5;
		panel_2.add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);
		
		JLabel lblmin_1 = new JLabel("起动牵引质量受/不受小半径");
		GridBagConstraints gbc_lblmin_1 = new GridBagConstraints();
		gbc_lblmin_1.anchor = GridBagConstraints.EAST;
		gbc_lblmin_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin_1.gridx = 2;
		gbc_lblmin_1.gridy = 5;
		panel_2.add(lblmin_1, gbc_lblmin_1);
		
		textField_29 = new JTextField();
		textField_29.setEnabled(false);
		textField_29.setEditable(false);
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 3;
		gbc_textField_29.gridy = 5;
		panel_2.add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);
		
		JLabel lblmin = new JLabel("按限制坡道/平直道计算出来的");
		GridBagConstraints gbc_lblmin = new GridBagConstraints();
		gbc_lblmin.anchor = GridBagConstraints.EAST;
		gbc_lblmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin.gridx = 4;
		gbc_lblmin.gridy = 5;
		panel_2.add(lblmin, gbc_lblmin);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 5;
		gbc_textField_26.gridy = 5;
		panel_2.add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);
		
		JLabel lblkgmin_5 = new JLabel("黏降后的起动牵引力(KN)");
		GridBagConstraints gbc_lblkgmin_5 = new GridBagConstraints();
		gbc_lblkgmin_5.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblkgmin_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_5.gridx = 0;
		gbc_lblkgmin_5.gridy = 6;
		panel_2.add(lblkgmin_5, gbc_lblkgmin_5);
		
		JLabel lblNewLabel_7 = new JLabel("曲线黏降得限制");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 2;
		gbc_lblNewLabel_7.gridy = 6;
		panel_2.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblkg_3 = new JLabel("牵引质量不受/受小半径曲线机车");
		GridBagConstraints gbc_lblkg_3 = new GridBagConstraints();
		gbc_lblkg_3.anchor = GridBagConstraints.EAST;
		gbc_lblkg_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_3.gridx = 4;
		gbc_lblkg_3.gridy = 6;
		panel_2.add(lblkg_3, gbc_lblkg_3);
		
		JLabel lblNewLabel_11 = new JLabel("黏着力降低的限制");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 5;
		gbc_lblNewLabel_11.gridy = 6;
		panel_2.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		JLabel lblkgmin_6 = new JLabel("列车空走时间(s)");
		GridBagConstraints gbc_lblkgmin_6 = new GridBagConstraints();
		gbc_lblkgmin_6.anchor = GridBagConstraints.EAST;
		gbc_lblkgmin_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblkgmin_6.gridx = 0;
		gbc_lblkgmin_6.gridy = 7;
		panel_2.add(lblkgmin_6, gbc_lblkgmin_6);
		
		textField_31 = new JTextField();
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 5, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 1;
		gbc_textField_31.gridy = 7;
		panel_2.add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);
		
		JLabel lblmin_2 = new JLabel("结果: 列车充风时间(s)");
		GridBagConstraints gbc_lblmin_2 = new GridBagConstraints();
		gbc_lblmin_2.anchor = GridBagConstraints.EAST;
		gbc_lblmin_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin_2.gridx = 2;
		gbc_lblmin_2.gridy = 7;
		panel_2.add(lblmin_2, gbc_lblmin_2);
		
		textField_32 = new JTextField();
		textField_32.setEnabled(false);
		textField_32.setEditable(false);
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 3;
		gbc_textField_32.gridy = 7;
		panel_2.add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("再制动时的速度(km/h)");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 8;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_35 = new JTextField();
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 5, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 1;
		gbc_textField_35.gridy = 8;
		panel_2.add(textField_35, gbc_textField_35);
		textField_35.setColumns(10);
		
		JLabel lblkm_1 = new JLabel("缓解时的速度(km/h)");
		GridBagConstraints gbc_lblkm_1 = new GridBagConstraints();
		gbc_lblkm_1.anchor = GridBagConstraints.EAST;
		gbc_lblkm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkm_1.gridx = 2;
		gbc_lblkm_1.gridy = 8;
		panel_2.add(lblkm_1, gbc_lblkm_1);
		
		textField_36 = new JTextField();
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.insets = new Insets(0, 0, 5, 5);
		gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_36.gridx = 3;
		gbc_textField_36.gridy = 8;
		panel_2.add(textField_36, gbc_textField_36);
		textField_36.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("增速地段的平均加算坡度千分数");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 4;
		gbc_lblNewLabel_10.gridy = 8;
		panel_2.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		textField_30 = new JTextField();
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 5;
		gbc_textField_30.gridy = 8;
		panel_2.add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);
		
		JLabel lblkg_4 = new JLabel("结果: 增速时间(s)");
		GridBagConstraints gbc_lblkg_4 = new GridBagConstraints();
		gbc_lblkg_4.anchor = GridBagConstraints.EAST;
		gbc_lblkg_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_4.gridx = 0;
		gbc_lblkg_4.gridy = 9;
		panel_2.add(lblkg_4, gbc_lblkg_4);
		
		textField_38 = new JTextField();
		textField_38.setEnabled(false);
		textField_38.setEditable(false);
		GridBagConstraints gbc_textField_38 = new GridBagConstraints();
		gbc_textField_38.insets = new Insets(0, 0, 5, 5);
		gbc_textField_38.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_38.gridx = 1;
		gbc_textField_38.gridy = 9;
		panel_2.add(textField_38, gbc_textField_38);
		textField_38.setColumns(10);
		
		JLabel lblkg_6 = new JLabel("相应辆数(辆)");
		GridBagConstraints gbc_lblkg_6 = new GridBagConstraints();
		gbc_lblkg_6.anchor = GridBagConstraints.EAST;
		gbc_lblkg_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblkg_6.gridx = 2;
		gbc_lblkg_6.gridy = 9;
		panel_2.add(lblkg_6, gbc_lblkg_6);
		
		textField_33 = new JTextField();
		textField_33.setEnabled(false);
		textField_33.setEditable(false);
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 3;
		gbc_textField_33.gridy = 9;
		panel_2.add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);
		
		JLabel lblkg_5 = new JLabel("增速时间不小于/小于");
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
		
		JLabel label_2 = new JLabel("充风时间与空走时间之和");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 10;
		panel_2.add(label_2, gbc_label_2);
		
		JLabel lblt_1 = new JLabel("每辆车平均总质量(t)");
		GridBagConstraints gbc_lblt_1 = new GridBagConstraints();
		gbc_lblt_1.anchor = GridBagConstraints.EAST;
		gbc_lblt_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblt_1.gridx = 0;
		gbc_lblt_1.gridy = 11;
		panel_2.add(lblt_1, gbc_lblt_1);
		
		textField_43 = new JTextField();
		GridBagConstraints gbc_textField_43 = new GridBagConstraints();
		gbc_textField_43.insets = new Insets(0, 0, 5, 5);
		gbc_textField_43.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_43.gridx = 1;
		gbc_textField_43.gridy = 11;
		panel_2.add(textField_43, gbc_textField_43);
		textField_43.setColumns(10);
		
		JLabel label_5 = new JLabel("结果: 长大下坡道上牵引辆数");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 2;
		gbc_label_5.gridy = 11;
		panel_2.add(label_5, gbc_label_5);
		
		textField_44 = new JTextField();
		textField_44.setEnabled(false);
		textField_44.setEditable(false);
		GridBagConstraints gbc_textField_44 = new GridBagConstraints();
		gbc_textField_44.insets = new Insets(0, 0, 5, 5);
		gbc_textField_44.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_44.gridx = 3;
		gbc_textField_44.gridy = 11;
		panel_2.add(textField_44, gbc_textField_44);
		textField_44.setColumns(10);
		
		JLabel label_6 = new JLabel("按限制坡道/平直道计算出来的");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.gridx = 4;
		gbc_label_6.gridy = 11;
		panel_2.add(label_6, gbc_label_6);
		
		textField_37 = new JTextField();
		textField_37.setEnabled(false);
		textField_37.setEditable(false);
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.insets = new Insets(0, 0, 5, 5);
		gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_37.gridx = 5;
		gbc_textField_37.gridy = 11;
		panel_2.add(textField_37, gbc_textField_37);
		textField_37.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("受制动机充风时间限制的牵引质量(t)");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 2;
		gbc_lblNewLabel_12.gridy = 12;
		panel_2.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		JLabel label_9 = new JLabel("牵引质量不受/受长大下坡道");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.NORTHEAST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 4;
		gbc_label_9.gridy = 12;
		panel_2.add(label_9, gbc_label_9);
		
		JLabel label_10 = new JLabel("牵引辆数的限制");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 5;
		gbc_label_10.gridy = 12;
		panel_2.add(label_10, gbc_label_10);
		
		JLabel lblm_2 = new JLabel("区段内最短到发线有效长(m)");
		GridBagConstraints gbc_lblm_2 = new GridBagConstraints();
		gbc_lblm_2.anchor = GridBagConstraints.EAST;
		gbc_lblm_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_2.gridx = 0;
		gbc_lblm_2.gridy = 13;
		panel_2.add(lblm_2, gbc_lblm_2);
		
		textField_45 = new JTextField();
		GridBagConstraints gbc_textField_45 = new GridBagConstraints();
		gbc_textField_45.insets = new Insets(0, 0, 5, 5);
		gbc_textField_45.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_45.gridx = 1;
		gbc_textField_45.gridy = 13;
		panel_2.add(textField_45, gbc_textField_45);
		textField_45.setColumns(10);
		
		JLabel lblm_3 = new JLabel("机车全长(m)");
		GridBagConstraints gbc_lblm_3 = new GridBagConstraints();
		gbc_lblm_3.anchor = GridBagConstraints.EAST;
		gbc_lblm_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_3.gridx = 2;
		gbc_lblm_3.gridy = 13;
		panel_2.add(lblm_3, gbc_lblm_3);
		
		textField_46 = new JTextField();
		GridBagConstraints gbc_textField_46 = new GridBagConstraints();
		gbc_textField_46.insets = new Insets(0, 0, 5, 5);
		gbc_textField_46.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_46.gridx = 3;
		gbc_textField_46.gridy = 13;
		panel_2.add(textField_46, gbc_textField_46);
		textField_46.setColumns(10);
		
		JLabel lblm_4 = new JLabel("附加制动距离(m)");
		GridBagConstraints gbc_lblm_4 = new GridBagConstraints();
		gbc_lblm_4.anchor = GridBagConstraints.EAST;
		gbc_lblm_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_4.gridx = 4;
		gbc_lblm_4.gridy = 13;
		panel_2.add(lblm_4, gbc_lblm_4);
		
		textField_47 = new JTextField();
		GridBagConstraints gbc_textField_47 = new GridBagConstraints();
		gbc_textField_47.insets = new Insets(0, 0, 5, 5);
		gbc_textField_47.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_47.gridx = 5;
		gbc_textField_47.gridy = 13;
		panel_2.add(textField_47, gbc_textField_47);
		textField_47.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("结果: 列车最大计长");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_13.gridx = 0;
		gbc_lblNewLabel_13.gridy = 14;
		panel_2.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		textField_48 = new JTextField();
		textField_48.setEnabled(false);
		textField_48.setEditable(false);
		GridBagConstraints gbc_textField_48 = new GridBagConstraints();
		gbc_textField_48.insets = new Insets(0, 0, 0, 5);
		gbc_textField_48.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_48.gridx = 1;
		gbc_textField_48.gridy = 14;
		panel_2.add(textField_48, gbc_textField_48);
		textField_48.setColumns(10);
		
		JButton button_3 = new JButton("开始计算");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 14;
		panel_2.add(button_3, gbc_button_3);
		
		JButton button_1 = new JButton("货车列车副风缸充风时间曲线图");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 14;
		panel_2.add(button_1, gbc_button_1);
		
		JButton button_7 = new JButton("第一页");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(internalContainer);
			}
		});
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 0, 5);
		gbc_button_7.gridx = 4;
		gbc_button_7.gridy = 14;
		panel_2.add(button_7, gbc_button_7);

		return internalFrame;
	}

}
