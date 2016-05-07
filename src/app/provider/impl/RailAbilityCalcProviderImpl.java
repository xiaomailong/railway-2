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

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import app.enums.BlockType;
import app.provider.CalcProvider;

/**
 * @author I310818
 *
 */
public class RailAbilityCalcProviderImpl implements CalcProvider {
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_4;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see app.provider.CalcProvider#createInternalFrame()
	 */
	@Override
	public JInternalFrame createInternalFrame() {
		JInternalFrame internalFrame = new JInternalFrame("铁路能力计算", true, true, true, true);
		internalFrame.setBounds(20, 20, 860, 710);
		internalFrame.setVisible(true);
		internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

		final Container internalContainer = internalFrame.getContentPane();
		final CardLayout cardLayout = new CardLayout();
		internalContainer.setLayout(cardLayout);

		JPanel main_panel_1 = new JPanel();
		internalContainer.add(main_panel_1);
		JPanel main_panel_2 = new JPanel();
		internalContainer.add(main_panel_2);
		GridBagLayout gridbag_1 = new GridBagLayout();
		gridbag_1.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0 };
		gridbag_1.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		main_panel_1.setLayout(gridbag_1);
		GridBagLayout gridbag_2 = new GridBagLayout();
		gridbag_2.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridbag_2.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		main_panel_2.setLayout(gridbag_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "单行平行成对运行图的通过能力", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.gridwidth = 20;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		main_panel_1.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 28, 28, 28, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblmin_2 = new JLabel("日均综合维修天窗时间(min)");
		GridBagConstraints gbc_lblmin_2 = new GridBagConstraints();
		gbc_lblmin_2.anchor = GridBagConstraints.EAST;
		gbc_lblmin_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin_2.gridx = 0;
		gbc_lblmin_2.gridy = 0;
		panel_1.add(lblmin_2, gbc_lblmin_2);

		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 1;
		gbc_textField_11.gridy = 0;
		panel_1.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);

		JLabel lblmin = new JLabel("对向列车不同时到达的间隔时分(min)");
		GridBagConstraints gbc_lblmin = new GridBagConstraints();
		gbc_lblmin.anchor = GridBagConstraints.EAST;
		gbc_lblmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin.gridx = 2;
		gbc_lblmin.gridy = 0;
		panel_1.add(lblmin, gbc_lblmin);

		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);

		JLabel lblmin_1 = new JLabel("车站会车间隔时分(min)");
		GridBagConstraints gbc_lblmin_1 = new GridBagConstraints();
		gbc_lblmin_1.anchor = GridBagConstraints.EAST;
		gbc_lblmin_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin_1.gridx = 0;
		gbc_lblmin_1.gridy = 1;
		panel_1.add(lblmin_1, gbc_lblmin_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel_1.add(textField_1, gbc_textField_1);

		JLabel lblmin_3 = new JLabel("站(区)间往、返走行时分(min)");
		GridBagConstraints gbc_lblmin_3 = new GridBagConstraints();
		gbc_lblmin_3.anchor = GridBagConstraints.EAST;
		gbc_lblmin_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin_3.gridx = 2;
		gbc_lblmin_3.gridy = 1;
		panel_1.add(lblmin_3, gbc_lblmin_3);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 1;
		panel_1.add(textField_2, gbc_textField_2);

		JLabel lbld = new JLabel("单线平行成对运行图的通过能力(对/d)");
		GridBagConstraints gbc_lbld = new GridBagConstraints();
		gbc_lbld.anchor = GridBagConstraints.EAST;
		gbc_lbld.insets = new Insets(0, 0, 0, 5);
		gbc_lbld.gridx = 0;
		gbc_lbld.gridy = 2;
		panel_1.add(lbld, gbc_lbld);

		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 2;
		panel_1.add(textField_3, gbc_textField_3);

		JButton button = new JButton("开始计算");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 2;
		panel_1.add(button, gbc_button);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "双线平行运行图的通过能力", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 4;
		gbc_panel_2.gridwidth = 20;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 2;
		main_panel_1.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 28, 28, 28, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel label = new JLabel("闭塞方式");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_2.add(label, gbc_label);

		JComboBox<String> comboBox = new JComboBox<String>(BlockType.getNameList());
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panel_2.add(comboBox, gbc_comboBox);

		JLabel lblmin_4 = new JLabel("日均综合维修天窗时间(min)");
		GridBagConstraints gbc_lblmin_4 = new GridBagConstraints();
		gbc_lblmin_4.anchor = GridBagConstraints.EAST;
		gbc_lblmin_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblmin_4.gridx = 2;
		gbc_lblmin_4.gridy = 0;
		panel_2.add(lblmin_4, gbc_lblmin_4);

		textField_23 = new JTextField();
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.gridx = 3;
		gbc_textField_23.gridy = 0;
		panel_2.add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("普通货物列车站间单方向走行时分(min)");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField_21 = new JTextField();
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.gridx = 1;
		gbc_textField_21.gridy = 1;
		panel_2.add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("同向列车连发间隔时分(min)");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 1;
		panel_2.add(lblNewLabel_9, gbc_lblNewLabel_9);

		textField_24 = new JTextField();
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.insets = new Insets(0, 0, 5, 5);
		gbc_textField_24.gridx = 3;
		gbc_textField_24.gridy = 1;
		panel_2.add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("同向列车追踪间隔时分(min)");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);

		textField_22 = new JTextField();
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.gridx = 1;
		gbc_textField_22.gridy = 2;
		panel_2.add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("双线平行运行图的通过能力(对/d)");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 2;
		panel_2.add(lblNewLabel_10, gbc_lblNewLabel_10);

		textField_25 = new JTextField();
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 3;
		gbc_textField_25.gridy = 2;
		panel_2.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);

		JButton button_1 = new JButton("开始计算");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 3;
		panel_2.add(button_1, gbc_button_1);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "列车对数", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 5;
		gbc_panel.gridwidth = 20;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 6;
		main_panel_1.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 28, 28, 28, 28, 28, 28, 28 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel.setLayout(gbl_panel);

		JLabel lbld_1 = new JLabel("旅客列车对数(对/d)");
		GridBagConstraints gbc_lbld_1 = new GridBagConstraints();
		gbc_lbld_1.anchor = GridBagConstraints.EAST;
		gbc_lbld_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_1.gridx = 0;
		gbc_lbld_1.gridy = 0;
		panel.add(lbld_1, gbc_lbld_1);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 0;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		JLabel label_14 = new JLabel("扣除系数");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.anchor = GridBagConstraints.EAST;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 2;
		gbc_label_14.gridy = 0;
		panel.add(label_14, gbc_label_14);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 0;
		panel.add(textField_5, gbc_textField_5);

		JLabel lbld_2 = new JLabel("直达旅客列车对数(对/d)");
		GridBagConstraints gbc_lbld_2 = new GridBagConstraints();
		gbc_lbld_2.anchor = GridBagConstraints.EAST;
		gbc_lbld_2.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_2.gridx = 0;
		gbc_lbld_2.gridy = 1;
		panel.add(lbld_2, gbc_lbld_2);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 1;
		panel.add(textField_6, gbc_textField_6);

		JLabel label_16 = new JLabel("扣除系数");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.anchor = GridBagConstraints.EAST;
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 2;
		gbc_label_16.gridy = 1;
		panel.add(label_16, gbc_label_16);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.gridx = 3;
		gbc_textField_7.gridy = 1;
		panel.add(textField_7, gbc_textField_7);

		JLabel lbld_3 = new JLabel("快运货物列车对数(对/d)");
		GridBagConstraints gbc_lbld_3 = new GridBagConstraints();
		gbc_lbld_3.anchor = GridBagConstraints.EAST;
		gbc_lbld_3.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_3.gridx = 0;
		gbc_lbld_3.gridy = 2;
		panel.add(lbld_3, gbc_lbld_3);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 2;
		panel.add(textField_8, gbc_textField_8);

		JLabel label_18 = new JLabel("扣除系数");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.anchor = GridBagConstraints.EAST;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 2;
		gbc_label_18.gridy = 2;
		panel.add(label_18, gbc_label_18);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 2;
		panel.add(textField_9, gbc_textField_9);

		JLabel label_7 = new JLabel("满轴系数");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 5;
		gbc_label_7.gridy = 2;
		panel.add(label_7, gbc_label_7);

		textField_18 = new JTextField();
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 6;
		gbc_textField_18.gridy = 2;
		panel.add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);

		JLabel lbld_4 = new JLabel("零担列车对数(对/d)");
		GridBagConstraints gbc_lbld_4 = new GridBagConstraints();
		gbc_lbld_4.anchor = GridBagConstraints.EAST;
		gbc_lbld_4.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_4.gridx = 0;
		gbc_lbld_4.gridy = 3;
		panel.add(lbld_4, gbc_lbld_4);

		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 1;
		gbc_textField_12.gridy = 3;
		panel.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);

		JLabel label_3 = new JLabel("扣除系数");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 2;
		gbc_label_3.gridy = 3;
		panel.add(label_3, gbc_label_3);

		textField_15 = new JTextField();
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 3;
		gbc_textField_15.gridy = 3;
		panel.add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);

		JLabel label_8 = new JLabel("满轴系数");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 5;
		gbc_label_8.gridy = 3;
		panel.add(label_8, gbc_label_8);

		textField_19 = new JTextField();
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 6;
		gbc_textField_19.gridy = 3;
		panel.add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);

		JLabel lbld_5 = new JLabel("摘挂列车对数(对/d)");
		GridBagConstraints gbc_lbld_5 = new GridBagConstraints();
		gbc_lbld_5.anchor = GridBagConstraints.EAST;
		gbc_lbld_5.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_5.gridx = 0;
		gbc_lbld_5.gridy = 4;
		panel.add(lbld_5, gbc_lbld_5);

		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 4;
		panel.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);

		JLabel label_5 = new JLabel("扣除系数");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 2;
		gbc_label_5.gridy = 4;
		panel.add(label_5, gbc_label_5);

		textField_16 = new JTextField();
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 3;
		gbc_textField_16.gridy = 4;
		panel.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);

		JLabel label_9 = new JLabel("满轴系数");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.EAST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 5;
		gbc_label_9.gridy = 4;
		panel.add(label_9, gbc_label_9);

		textField_20 = new JTextField();
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 6;
		gbc_textField_20.gridy = 4;
		panel.add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);

		JLabel lbld_6 = new JLabel("铁路通过能力(对/d)");
		GridBagConstraints gbc_lbld_6 = new GridBagConstraints();
		gbc_lbld_6.anchor = GridBagConstraints.EAST;
		gbc_lbld_6.insets = new Insets(0, 0, 5, 5);
		gbc_lbld_6.gridx = 0;
		gbc_lbld_6.gridy = 5;
		panel.add(lbld_6, gbc_lbld_6);

		JButton button_2 = new JButton("开始计算");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 1;
		gbc_textField_14.gridy = 5;
		panel.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);

		JLabel label_2 = new JLabel("通过能力储备系数");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 5;
		panel.add(label_2, gbc_label_2);

		textField_17 = new JTextField();
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 3;
		gbc_textField_17.gridy = 5;
		panel.add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 6;
		gbc_button_2.gridy = 6;
		panel.add(button_2, gbc_button_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "铁路输送能力", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.anchor = GridBagConstraints.SOUTH;
		gbc_panel_3.gridwidth = 17;
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 11;
		main_panel_1.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 130, 169, 117, 169, 0 };
		gbl_panel_3.rowHeights = new int[] { 28, 28 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0 };
		panel_3.setLayout(gbl_panel_3);

		JLabel lblmt = new JLabel("普通货物列车净载(Mt)");
		GridBagConstraints gbc_lblmt = new GridBagConstraints();
		gbc_lblmt.anchor = GridBagConstraints.EAST;
		gbc_lblmt.insets = new Insets(0, 0, 5, 5);
		gbc_lblmt.gridx = 0;
		gbc_lblmt.gridy = 0;
		panel_3.add(lblmt, gbc_lblmt);

		textField_26 = new JTextField();
		textField_26.setEnabled(false);
		textField_26.setEditable(false);
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 1;
		gbc_textField_26.gridy = 0;
		panel_3.add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);

		JLabel label_1 = new JLabel("货运波动系数");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 0;
		panel_3.add(label_1, gbc_label_1);

		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 0);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 3;
		gbc_textField_10.gridy = 0;
		panel_3.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);

		JLabel lblmta = new JLabel("铁路输送能力(Mt/a)");
		GridBagConstraints gbc_lblmta = new GridBagConstraints();
		gbc_lblmta.anchor = GridBagConstraints.EAST;
		gbc_lblmta.insets = new Insets(0, 0, 0, 5);
		gbc_lblmta.gridx = 0;
		gbc_lblmta.gridy = 1;
		panel_3.add(lblmta, gbc_lblmta);

		textField_27 = new JTextField();
		textField_27.setEnabled(false);
		textField_27.setEditable(false);
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 0, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 1;
		gbc_textField_27.gridy = 1;
		panel_3.add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);

		JButton calc = new JButton("开始计算");
		GridBagConstraints gbc_calc = new GridBagConstraints();
		gbc_calc.gridx = 3;
		gbc_calc.gridy = 1;
		panel_3.add(calc, gbc_calc);

		JButton button_3 = new JButton("第二页");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(internalContainer);
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 18;
		gbc_button_3.gridy = 11;
		main_panel_1.add(button_3, gbc_button_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "高速铁路通过能力-1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridheight = 5;
		gbc_panel_4.gridwidth = 20;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 0;
		main_panel_2.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0 };
		gbl_panel_4.rowHeights = new int[] { 28, 28, 28, 28, 28, 0 };
		gbl_panel_4.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_4.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_4.setLayout(gbl_panel_4);

		JLabel main_2_lblmin_2 = new JLabel("综合维修天窗时间(min)");
		GridBagConstraints gbc_main_2_lblmin_2 = new GridBagConstraints();
		gbc_main_2_lblmin_2.anchor = GridBagConstraints.EAST;
		gbc_main_2_lblmin_2.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lblmin_2.gridx = 0;
		gbc_main_2_lblmin_2.gridy = 0;
		panel_4.add(main_2_lblmin_2, gbc_main_2_lblmin_2);

		main_2_textField_11 = new JTextField();
		GridBagConstraints gbc_main_2_textField_11 = new GridBagConstraints();
		gbc_main_2_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_11.gridx = 1;
		gbc_main_2_textField_11.gridy = 0;
		panel_4.add(main_2_textField_11, gbc_main_2_textField_11);
		main_2_textField_11.setColumns(10);

		JLabel main_2_lblmin = new JLabel("追踪列车间隔时间(min)");
		GridBagConstraints gbc_main_2_lblmin = new GridBagConstraints();
		gbc_main_2_lblmin.anchor = GridBagConstraints.EAST;
		gbc_main_2_lblmin.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lblmin.gridx = 2;
		gbc_main_2_lblmin.gridy = 0;
		panel_4.add(main_2_lblmin, gbc_main_2_lblmin);

		main_2_textField = new JTextField();
		main_2_textField.setColumns(10);
		GridBagConstraints gbc_main_2_textField = new GridBagConstraints();
		gbc_main_2_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField.gridx = 3;
		gbc_main_2_textField.gridy = 0;
		panel_4.add(main_2_textField, gbc_main_2_textField);

		JLabel main_2_lblmin_1 = new JLabel("客运区段/天窗开设长度(km)");
		GridBagConstraints gbc_main_2_lblmin_1 = new GridBagConstraints();
		gbc_main_2_lblmin_1.anchor = GridBagConstraints.EAST;
		gbc_main_2_lblmin_1.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lblmin_1.gridx = 0;
		gbc_main_2_lblmin_1.gridy = 1;
		panel_4.add(main_2_lblmin_1, gbc_main_2_lblmin_1);

		main_2_textField_1 = new JTextField();
		main_2_textField_1.setColumns(10);
		GridBagConstraints gbc_main_2_textField_1 = new GridBagConstraints();
		gbc_main_2_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_1.gridx = 1;
		gbc_main_2_textField_1.gridy = 1;
		panel_4.add(main_2_textField_1, gbc_main_2_textField_1);

		JLabel main_2_lblmin_3 = new JLabel("列车运行图无效时间(min)");
		GridBagConstraints gbc_main_2_lblmin_3 = new GridBagConstraints();
		gbc_main_2_lblmin_3.anchor = GridBagConstraints.EAST;
		gbc_main_2_lblmin_3.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lblmin_3.gridx = 2;
		gbc_main_2_lblmin_3.gridy = 1;
		panel_4.add(main_2_lblmin_3, gbc_main_2_lblmin_3);

		main_2_textField_2 = new JTextField();
		main_2_textField_2.setColumns(10);
		GridBagConstraints gbc_main_2_textField_2 = new GridBagConstraints();
		gbc_main_2_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_2.gridx = 3;
		gbc_main_2_textField_2.gridy = 1;
		panel_4.add(main_2_textField_2, gbc_main_2_textField_2);

		JLabel main_2_lbld = new JLabel("客运专线铁路列车运行速度(km/h)");
		GridBagConstraints gbc_main_2_lbld = new GridBagConstraints();
		gbc_main_2_lbld.anchor = GridBagConstraints.EAST;
		gbc_main_2_lbld.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lbld.gridx = 0;
		gbc_main_2_lbld.gridy = 2;
		panel_4.add(main_2_lbld, gbc_main_2_lbld);

		main_2_textField_3 = new JTextField();
		main_2_textField_3.setColumns(10);
		GridBagConstraints gbc_main_2_textField_3 = new GridBagConstraints();
		gbc_main_2_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_3.gridx = 1;
		gbc_main_2_textField_3.gridy = 2;
		panel_4.add(main_2_textField_3, gbc_main_2_textField_3);

		JLabel lbld_7 = new JLabel("高速客运专线铁路平行运行图区间通过能力(对/d)");
		GridBagConstraints gbc_lbld_7 = new GridBagConstraints();
		gbc_lbld_7.anchor = GridBagConstraints.EAST;
		gbc_lbld_7.insets = new Insets(0, 0, 0, 5);
		gbc_lbld_7.gridx = 0;
		gbc_lbld_7.gridy = 3;
		panel_4.add(lbld_7, gbc_lbld_7);

		main_2_textField_21 = new JTextField();
		main_2_textField_21.setEnabled(false);
		main_2_textField_21.setEditable(false);
		GridBagConstraints gbc_main_2_textField_21 = new GridBagConstraints();
		gbc_main_2_textField_21.insets = new Insets(0, 0, 0, 5);
		gbc_main_2_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_21.gridx = 1;
		gbc_main_2_textField_21.gridy = 3;
		panel_4.add(main_2_textField_21, gbc_main_2_textField_21);
		main_2_textField_21.setColumns(10);

		JButton main_2_button = new JButton("开始计算");
		GridBagConstraints gbc_main_2_button = new GridBagConstraints();
		gbc_main_2_button.insets = new Insets(0, 0, 0, 5);
		gbc_main_2_button.gridx = 3;
		gbc_main_2_button.gridy = 3;
		panel_4.add(main_2_button, gbc_main_2_button);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "高速铁路通过能力-2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridheight = 7;
		gbc_panel_5.gridwidth = 20;
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 5;
		main_panel_2.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0, 0, 0 };
		gbl_panel_5.rowHeights = new int[] { 0, 28, 28, 28, 0, 0, 0, 0 };
		gbl_panel_5.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_5.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel_5.setLayout(gbl_panel_5);

		JLabel main_2_label = new JLabel("高速列车扣除系数");
		GridBagConstraints gbc_main_2_label = new GridBagConstraints();
		gbc_main_2_label.anchor = GridBagConstraints.EAST;
		gbc_main_2_label.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_label.gridx = 0;
		gbc_main_2_label.gridy = 1;
		panel_5.add(main_2_label, gbc_main_2_label);

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
		GridBagConstraints gbc_main_2_textField_25 = new GridBagConstraints();
		gbc_main_2_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_25.gridx = 3;
		gbc_main_2_textField_25.gridy = 1;
		panel_5.add(main_2_textField_25, gbc_main_2_textField_25);
		main_2_textField_25.setColumns(10);

		JLabel main_2_lblNewLabel_2 = new JLabel("计算时间内高速列车扣除系数");
		GridBagConstraints gbc_main_2_lblNewLabel_2 = new GridBagConstraints();
		gbc_main_2_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_main_2_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lblNewLabel_2.gridx = 0;
		gbc_main_2_lblNewLabel_2.gridy = 2;
		panel_5.add(main_2_lblNewLabel_2, gbc_main_2_lblNewLabel_2);

		main_2_textField_23 = new JTextField();
		GridBagConstraints gbc_main_2_textField_23 = new GridBagConstraints();
		gbc_main_2_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_23.gridx = 1;
		gbc_main_2_textField_23.gridy = 2;
		panel_5.add(main_2_textField_23, gbc_main_2_textField_23);
		main_2_textField_23.setColumns(10);

		JLabel main_2_lblNewLabel_9 = new JLabel("全高速列车的小时区间最大通过能力(对/d)");
		GridBagConstraints gbc_main_2_lblNewLabel_9 = new GridBagConstraints();
		gbc_main_2_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_main_2_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lblNewLabel_9.gridx = 2;
		gbc_main_2_lblNewLabel_9.gridy = 2;
		panel_5.add(main_2_lblNewLabel_9, gbc_main_2_lblNewLabel_9);

		main_2_textField_26 = new JTextField();
		main_2_textField_26.setEnabled(false);
		main_2_textField_26.setEditable(false);
		GridBagConstraints gbc_main_2_textField_26 = new GridBagConstraints();
		gbc_main_2_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_26.gridx = 3;
		gbc_main_2_textField_26.gridy = 2;
		panel_5.add(main_2_textField_26, gbc_main_2_textField_26);
		main_2_textField_26.setColumns(10);

		JLabel main_2_lblNewLabel_3 = new JLabel("区间通过能力使用系数");
		GridBagConstraints gbc_main_2_lblNewLabel_3 = new GridBagConstraints();
		gbc_main_2_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_main_2_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lblNewLabel_3.gridx = 0;
		gbc_main_2_lblNewLabel_3.gridy = 3;
		panel_5.add(main_2_lblNewLabel_3, gbc_main_2_lblNewLabel_3);

		main_2_textField_24 = new JTextField();
		GridBagConstraints gbc_main_2_textField_24 = new GridBagConstraints();
		gbc_main_2_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_24.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_24.gridx = 1;
		gbc_main_2_textField_24.gridy = 3;
		panel_5.add(main_2_textField_24, gbc_main_2_textField_24);
		main_2_textField_24.setColumns(10);

		JLabel main_2_lblNewLabel_10 = new JLabel("全高速列车的区间使用能力(对/d)");
		GridBagConstraints gbc_main_2_lblNewLabel_10 = new GridBagConstraints();
		gbc_main_2_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_main_2_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lblNewLabel_10.gridx = 2;
		gbc_main_2_lblNewLabel_10.gridy = 3;
		panel_5.add(main_2_lblNewLabel_10, gbc_main_2_lblNewLabel_10);

		main_2_textField_27 = new JTextField();
		main_2_textField_27.setEnabled(false);
		main_2_textField_27.setEditable(false);
		GridBagConstraints gbc_main_2_textField_27 = new GridBagConstraints();
		gbc_main_2_textField_27.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_27.gridx = 3;
		gbc_main_2_textField_27.gridy = 3;
		panel_5.add(main_2_textField_27, gbc_main_2_textField_27);
		main_2_textField_27.setColumns(10);

		JLabel main_2_label_1 = new JLabel("中速列车扣除系数");
		GridBagConstraints gbc_main_2_label_1 = new GridBagConstraints();
		gbc_main_2_label_1.anchor = GridBagConstraints.EAST;
		gbc_main_2_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_label_1.gridx = 0;
		gbc_main_2_label_1.gridy = 4;
		panel_5.add(main_2_label_1, gbc_main_2_label_1);

		main_2_textField_4 = new JTextField();
		GridBagConstraints gbc_main_2_textField_4 = new GridBagConstraints();
		gbc_main_2_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_4.gridx = 1;
		gbc_main_2_textField_4.gridy = 4;
		panel_5.add(main_2_textField_4, gbc_main_2_textField_4);
		main_2_textField_4.setColumns(10);

		JLabel main_2_label_2 = new JLabel("列车运行图中的中速列车比重");
		GridBagConstraints gbc_main_2_label_2 = new GridBagConstraints();
		gbc_main_2_label_2.anchor = GridBagConstraints.EAST;
		gbc_main_2_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_label_2.gridx = 2;
		gbc_main_2_label_2.gridy = 4;
		panel_5.add(main_2_label_2, gbc_main_2_label_2);

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
		main_panel_2.add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[] { 130, 169, 117, 169, 0, 0, 0, 0, 0, 0 };
		gbl_panel_6.rowHeights = new int[] { 28, 28, 28, 28 };
		gbl_panel_6.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_6.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0 };
		panel_6.setLayout(gbl_panel_6);

		JLabel main_2_lbld_3 = new JLabel("列车平均定员(人/列)");
		GridBagConstraints gbc_main_2_lbld_3 = new GridBagConstraints();
		gbc_main_2_lbld_3.anchor = GridBagConstraints.EAST;
		gbc_main_2_lbld_3.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lbld_3.gridx = 0;
		gbc_main_2_lbld_3.gridy = 0;
		panel_6.add(main_2_lbld_3, gbc_main_2_lbld_3);

		main_2_textField_8 = new JTextField();
		main_2_textField_8.setColumns(10);
		GridBagConstraints gbc_main_2_textField_8 = new GridBagConstraints();
		gbc_main_2_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_8.gridx = 1;
		gbc_main_2_textField_8.gridy = 0;
		panel_6.add(main_2_textField_8, gbc_main_2_textField_8);

		JLabel main_2_label_18 = new JLabel("列车平均载客率(%)");
		GridBagConstraints gbc_main_2_label_18 = new GridBagConstraints();
		gbc_main_2_label_18.anchor = GridBagConstraints.EAST;
		gbc_main_2_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_label_18.gridx = 2;
		gbc_main_2_label_18.gridy = 0;
		panel_6.add(main_2_label_18, gbc_label_18);

		main_2_textField_9 = new JTextField();
		main_2_textField_9.setColumns(10);
		GridBagConstraints gbc_main_2_textField_9 = new GridBagConstraints();
		gbc_main_2_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_9.gridx = 3;
		gbc_main_2_textField_9.gridy = 0;
		panel_6.add(main_2_textField_9, gbc_main_2_textField_9);

		JLabel main_2_lbld_4 = new JLabel("月间客流波动系数");
		GridBagConstraints gbc_main_2_lbld_4 = new GridBagConstraints();
		gbc_main_2_lbld_4.anchor = GridBagConstraints.EAST;
		gbc_main_2_lbld_4.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lbld_4.gridx = 0;
		gbc_main_2_lbld_4.gridy = 1;
		panel_6.add(main_2_lbld_4, gbc_main_2_lbld_4);

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

		JLabel main_2_lbld_5 = new JLabel("全高速列车的区间通过能力(对/d)");
		GridBagConstraints gbc_main_2_lbld_5 = new GridBagConstraints();
		gbc_main_2_lbld_5.anchor = GridBagConstraints.EAST;
		gbc_main_2_lbld_5.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lbld_5.gridx = 0;
		gbc_main_2_lbld_5.gridy = 2;
		panel_6.add(main_2_lbld_5, gbc_main_2_lbld_5);

		main_2_textField_13 = new JTextField();
		GridBagConstraints gbc_main_2_textField_13 = new GridBagConstraints();
		gbc_main_2_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_13.gridx = 1;
		gbc_main_2_textField_13.gridy = 2;
		panel_6.add(main_2_textField_13, gbc_main_2_textField_13);
		main_2_textField_13.setColumns(10);

		JLabel main_2_lbld_1 = new JLabel("一列高速列车的年输送能力(对/d)");
		GridBagConstraints gbc_main_2_lbld_1 = new GridBagConstraints();
		gbc_main_2_lbld_1.anchor = GridBagConstraints.EAST;
		gbc_main_2_lbld_1.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lbld_1.gridx = 2;
		gbc_main_2_lbld_1.gridy = 2;
		panel_6.add(main_2_lbld_1, gbc_main_2_lbld_1);

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

		JLabel main_2_lbld_2 = new JLabel("一列中速和普通列车的年输送能力(对/d)");
		GridBagConstraints gbc_main_2_lbld_2 = new GridBagConstraints();
		gbc_main_2_lbld_2.anchor = GridBagConstraints.EAST;
		gbc_main_2_lbld_2.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lbld_2.gridx = 0;
		gbc_main_2_lbld_2.gridy = 4;
		panel_6.add(main_2_lbld_2, gbc_main_2_lbld_2);

		main_2_textField_19 = new JTextField();
		GridBagConstraints gbc_main_2_textField_19 = new GridBagConstraints();
		gbc_main_2_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_2_textField_19.gridx = 1;
		gbc_main_2_textField_19.gridy = 4;
		panel_6.add(main_2_textField_19, gbc_main_2_textField_19);
		main_2_textField_19.setColumns(10);

		JLabel main_2_lbld_6 = new JLabel("不同速度等级列车混运条件下高速");
		GridBagConstraints gbc_main_2_lbld_6 = new GridBagConstraints();
		gbc_main_2_lbld_6.anchor = GridBagConstraints.EAST;
		gbc_main_2_lbld_6.insets = new Insets(0, 0, 5, 5);
		gbc_main_2_lbld_6.gridx = 2;
		gbc_main_2_lbld_6.gridy = 4;
		panel_6.add(main_2_lbld_6, gbc_main_2_lbld_6);

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
				cardLayout.next(internalContainer);
			}
		});
		GridBagConstraints gbc_main_2_button_3 = new GridBagConstraints();
		gbc_main_2_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_main_2_button_3.gridx = 4;
		gbc_main_2_button_3.gridy = 6;
		panel_6.add(main_2_button_3, gbc_main_2_button_3);

		return internalFrame;
	}

}
