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

import app.enums.BusType;
import app.enums.DieselLocoType_2;
import app.enums.ElectricLocoType;
import app.enums.EmuType;
import app.enums.LocoVehicleModel;
import app.enums.LocoVehicleType;
import app.enums.RampDirection;
import app.enums.RampType;
import app.enums.TrunkOrBus;
import app.enums.TrunkType;
import app.provider.CalcProvider;

/**
 * @author I310818
 *
 */
public class ResistanceProviderImpl implements CalcProvider {
	private JTextField locoMass;
	private JTextField rampSlop;
	private JTextField speed;
	private JTextField trainLength;
	private JTextField tractionMass;
	private JTextField result_1;
	private JTextField result_2;
	private JTextField result_3;
	private JTextField result_4;
	private JTextField result_5;
	private JTextField trainMassPerMeter;
	private JTextField curveRadius;
	private JTextField spiral;
	private JTextField curveLength;
	private JTextField curveCenterAngle;
	private JTextField tunnelLength;
	private JTextField speedInTunnel;
	private JTextField trainLengh_2;
	private JTextField trainRampSloap;
	private JTextField initRampSlope;
	private JTextField trainOverLength;
	private JTextField trainOverCurveRadius;
	private JTextField trainOverCurveLength;
	private JTextField trainOverResistUnit;
	private JTextField trainOverTunnelLength;
	private JTextField result_11;
	private JTextField result_12;
	private JTextField result_13;
	private JTextField result_14;
	private JTextField result_15;
	private JTextField result_6;
	private JTextField result_7;
	private JTextField result_8;
	private JTextField result_9;
	private JTextField result_10;

	/*
	 * (non-Javadoc)
	 * 
	 * @see app.provider.CalcProvider#createInternalFrame()
	 */
	@Override
	public JInternalFrame createInternalFrame() {
		final JInternalFrame internalFrame = new JInternalFrame("列车阻力", true, true, true, true);
		internalFrame.setBounds(20, 20, 1160, 600);
		internalFrame.setVisible(true);
		internalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

		Container internalContainer = internalFrame.getContentPane();
		GridBagLayout gridbag = new GridBagLayout();
		gridbag.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0 };
		gridbag.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		internalContainer.setLayout(gridbag);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 8;
		gbc_panel_1.gridwidth = 20;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		internalFrame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE, 0.0, 0.0, 0.0 };
		gbl_panel_1.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);
		;

		JLabel lblt = new JLabel("机车计算质量(t)");
		lblt.setBounds(63, 18, 52, 16);
		GridBagConstraints gbc_lblt = new GridBagConstraints();
		gbc_lblt.anchor = GridBagConstraints.EAST;
		gbc_lblt.insets = new Insets(0, 0, 5, 5);
		gbc_lblt.gridx = 3;
		gbc_lblt.gridy = 0;
		panel_1.add(lblt, gbc_lblt);
		locoMass = new JTextField();
		locoMass.setBounds(121, 13, 165, 28);
		GridBagConstraints gbc_locoMass = new GridBagConstraints();
		gbc_locoMass.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoMass.insets = new Insets(0, 0, 5, 5);
		gbc_locoMass.gridx = 4;
		gbc_locoMass.gridy = 0;
		panel_1.add(locoMass, gbc_locoMass);
		locoMass.setFocusable(false);
		locoMass.setOpaque(false);
		locoMass.setBackground(Color.white);

		JLabel lblm = new JLabel("坡道方向");
		lblm.setBounds(63, 75, 52, 16);
		GridBagConstraints gbc_lblm = new GridBagConstraints();
		gbc_lblm.anchor = GridBagConstraints.EAST;
		gbc_lblm.insets = new Insets(0, 0, 5, 5);
		gbc_lblm.gridx = 6;
		gbc_lblm.gridy = 0;
		panel_1.add(lblm, gbc_lblm);

		JComboBox<String> rampDirection = new JComboBox<String>(RampDirection.getNameList());
		GridBagConstraints gbc_rampDirection = new GridBagConstraints();
		gbc_rampDirection.insets = new Insets(0, 0, 5, 5);
		gbc_rampDirection.fill = GridBagConstraints.HORIZONTAL;
		gbc_rampDirection.gridx = 7;
		gbc_rampDirection.gridy = 0;
		panel_1.add(rampDirection, gbc_rampDirection);

		JLabel lblNewLabel_19 = new JLabel("货运/客运");
		lblNewLabel_19.setBounds(312, 75, 61, 16);
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 8;
		gbc_lblNewLabel_19.gridy = 0;
		panel_1.add(lblNewLabel_19, gbc_lblNewLabel_19);

		JComboBox<String> trunkOrBus = new JComboBox<String>(TrunkOrBus.getNameList());
		trunkOrBus.setBounds(385, 99, 128, 27);
		GridBagConstraints gbc_trunkOrBus = new GridBagConstraints();
		gbc_trunkOrBus.anchor = GridBagConstraints.WEST;
		gbc_trunkOrBus.insets = new Insets(0, 0, 5, 5);
		gbc_trunkOrBus.gridx = 9;
		gbc_trunkOrBus.gridy = 0;
		panel_1.add(trunkOrBus, gbc_trunkOrBus);

		JLabel lblNewLabel_18 = new JLabel("牵引质量(t)");
		lblNewLabel_18.setBounds(312, 46, 61, 16);
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 3;
		gbc_lblNewLabel_18.gridy = 1;
		panel_1.add(lblNewLabel_18, gbc_lblNewLabel_18);

		tractionMass = new JTextField();
		GridBagConstraints gbc_tractionMass = new GridBagConstraints();
		gbc_tractionMass.insets = new Insets(0, 0, 5, 5);
		gbc_tractionMass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tractionMass.gridx = 4;
		gbc_tractionMass.gridy = 1;
		panel_1.add(tractionMass, gbc_tractionMass);
		tractionMass.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("坡道坡度千分数");
		lblNewLabel_17.setBounds(11, 103, 104, 16);
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 6;
		gbc_lblNewLabel_17.gridy = 1;
		panel_1.add(lblNewLabel_17, gbc_lblNewLabel_17);

		rampSlop = new JTextField();
		GridBagConstraints gbc_rampSlop = new GridBagConstraints();
		gbc_rampSlop.insets = new Insets(0, 0, 5, 5);
		gbc_rampSlop.fill = GridBagConstraints.HORIZONTAL;
		gbc_rampSlop.gridx = 7;
		gbc_rampSlop.gridy = 1;
		panel_1.add(rampSlop, gbc_rampSlop);
		rampSlop.setColumns(10);

		JLabel lblm_1 = new JLabel("列车长度(m)");
		lblm_1.setBounds(312, 103, 61, 16);
		GridBagConstraints gbc_lblm_1 = new GridBagConstraints();
		gbc_lblm_1.anchor = GridBagConstraints.EAST;
		gbc_lblm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_1.gridx = 8;
		gbc_lblm_1.gridy = 1;
		panel_1.add(lblm_1, gbc_lblm_1);

		trainLength = new JTextField();
		GridBagConstraints gbc_trainLength = new GridBagConstraints();
		gbc_trainLength.insets = new Insets(0, 0, 5, 5);
		gbc_trainLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainLength.gridx = 9;
		gbc_trainLength.gridy = 1;
		panel_1.add(trainLength, gbc_trainLength);
		trainLength.setColumns(10);

		JLabel lblkmh = new JLabel("列车运行速度(km/h)");
		lblkmh.setBounds(37, 46, 78, 16);
		GridBagConstraints gbc_lblkmh = new GridBagConstraints();
		gbc_lblkmh.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh.gridx = 3;
		gbc_lblkmh.gridy = 2;
		panel_1.add(lblkmh, gbc_lblkmh);

		speed = new JTextField();
		GridBagConstraints gbc_speed = new GridBagConstraints();
		gbc_speed.insets = new Insets(0, 0, 5, 5);
		gbc_speed.fill = GridBagConstraints.HORIZONTAL;
		gbc_speed.gridx = 4;
		gbc_speed.gridy = 2;
		panel_1.add(speed, gbc_speed);
		speed.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("列车延米质量(t/m)");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 8;
		gbc_lblNewLabel_1.gridy = 2;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

		trainMassPerMeter = new JTextField();
		GridBagConstraints gbc_trainMassPerMeter = new GridBagConstraints();
		gbc_trainMassPerMeter.insets = new Insets(0, 0, 5, 5);
		gbc_trainMassPerMeter.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainMassPerMeter.gridx = 9;
		gbc_trainMassPerMeter.gridy = 2;
		panel_1.add(trainMassPerMeter, gbc_trainMassPerMeter);
		trainMassPerMeter.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("机车、车辆类型");
		lblNewLabel_16.setBounds(312, 18, 61, 16);
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 3;
		gbc_lblNewLabel_16.gridy = 3;
		panel_1.add(lblNewLabel_16, gbc_lblNewLabel_16);

		JComboBox<String> locoVehicleModel = new JComboBox<String>(LocoVehicleModel.getNameList());
		final JComboBox<String> locoVehicleTypeByModel = new JComboBox<String>();
		locoVehicleModel.setBounds(385, 14, 128, 27);
		locoVehicleModel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unchecked")
				JComboBox<String> source = (JComboBox<String>) e.getSource();
				if (LocoVehicleModel.ELECTRIC.getName().equals(source.getSelectedItem())) {
					locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(ElectricLocoType.getNameList()));
				}
				if (LocoVehicleModel.DIESEL.getName().equals(source.getSelectedItem())) {
					locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(DieselLocoType_2.getNameList()));
				}
				if (LocoVehicleModel.BUS.getName().equals(source.getSelectedItem())) {
					locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(BusType.getNameList()));
				}
				if (LocoVehicleModel.TRUNK.getName().equals(source.getSelectedItem())) {
					locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(TrunkType.getNameList()));
				}
				if (LocoVehicleModel.EMU.getName().equals(source.getSelectedItem())) {
					locoVehicleTypeByModel.setModel(new DefaultComboBoxModel<String>(EmuType.getNameList()));
				}
			}

		});
		GridBagConstraints gbc_locoVehicleModel = new GridBagConstraints();
		gbc_locoVehicleModel.anchor = GridBagConstraints.WEST;
		gbc_locoVehicleModel.insets = new Insets(0, 0, 5, 5);
		gbc_locoVehicleModel.gridx = 4;
		gbc_locoVehicleModel.gridy = 3;
		panel_1.add(locoVehicleModel, gbc_locoVehicleModel);
		locoVehicleModel.setSelectedIndex(0);
		locoVehicleTypeByModel.setMaximumRowCount(16);

		locoVehicleTypeByModel.setBounds(525, 14, 228, 27);
		GridBagConstraints gbc_locoVehicleTypeByModel = new GridBagConstraints();
		gbc_locoVehicleTypeByModel.gridwidth = 3;
		gbc_locoVehicleTypeByModel.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoVehicleTypeByModel.insets = new Insets(0, 0, 5, 5);
		gbc_locoVehicleTypeByModel.gridx = 5;
		gbc_locoVehicleTypeByModel.gridy = 3;
		panel_1.add(locoVehicleTypeByModel, gbc_locoVehicleTypeByModel);

		JLabel lblm_2 = new JLabel("曲线半径(m)");
		GridBagConstraints gbc_lblm_2 = new GridBagConstraints();
		gbc_lblm_2.anchor = GridBagConstraints.EAST;
		gbc_lblm_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_2.gridx = 8;
		gbc_lblm_2.gridy = 3;
		panel_1.add(lblm_2, gbc_lblm_2);

		curveRadius = new JTextField();
		GridBagConstraints gbc_curveRadius = new GridBagConstraints();
		gbc_curveRadius.insets = new Insets(0, 0, 5, 5);
		gbc_curveRadius.fill = GridBagConstraints.HORIZONTAL;
		gbc_curveRadius.gridx = 9;
		gbc_curveRadius.gridy = 3;
		panel_1.add(curveRadius, gbc_curveRadius);
		curveRadius.setColumns(10);

		JLabel lblm_6 = new JLabel("列车长度2(m)");
		GridBagConstraints gbc_lblm_6 = new GridBagConstraints();
		gbc_lblm_6.anchor = GridBagConstraints.EAST;
		gbc_lblm_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_6.gridx = 6;
		gbc_lblm_6.gridy = 4;
		panel_1.add(lblm_6, gbc_lblm_6);

		trainLengh_2 = new JTextField();
		GridBagConstraints gbc_trainLengh_2 = new GridBagConstraints();
		gbc_trainLengh_2.insets = new Insets(0, 0, 5, 5);
		gbc_trainLengh_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainLengh_2.gridx = 7;
		gbc_trainLengh_2.gridy = 4;
		panel_1.add(trainLengh_2, gbc_trainLengh_2);
		trainLengh_2.setColumns(10);

		JLabel lblm_3 = new JLabel("缓和曲线(m)");
		GridBagConstraints gbc_lblm_3 = new GridBagConstraints();
		gbc_lblm_3.anchor = GridBagConstraints.EAST;
		gbc_lblm_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_3.gridx = 8;
		gbc_lblm_3.gridy = 4;
		panel_1.add(lblm_3, gbc_lblm_3);

		spiral = new JTextField();
		GridBagConstraints gbc_spiral = new GridBagConstraints();
		gbc_spiral.insets = new Insets(0, 0, 5, 5);
		gbc_spiral.fill = GridBagConstraints.HORIZONTAL;
		gbc_spiral.gridx = 9;
		gbc_spiral.gridy = 4;
		panel_1.add(spiral, gbc_spiral);
		spiral.setColumns(10);

		JLabel lblm_5 = new JLabel("隧道长度(m)");
		GridBagConstraints gbc_lblm_5 = new GridBagConstraints();
		gbc_lblm_5.anchor = GridBagConstraints.EAST;
		gbc_lblm_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_5.gridx = 3;
		gbc_lblm_5.gridy = 5;
		panel_1.add(lblm_5, gbc_lblm_5);

		tunnelLength = new JTextField();
		GridBagConstraints gbc_tunnelLength = new GridBagConstraints();
		gbc_tunnelLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_tunnelLength.insets = new Insets(0, 0, 5, 5);
		gbc_tunnelLength.gridx = 4;
		gbc_tunnelLength.gridy = 5;
		panel_1.add(tunnelLength, gbc_tunnelLength);
		tunnelLength.setColumns(10);

		JLabel label_7 = new JLabel("列车所覆盖的坡道的坡度千分数");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 6;
		gbc_label_7.gridy = 5;
		panel_1.add(label_7, gbc_label_7);

		trainRampSloap = new JTextField();
		GridBagConstraints gbc_trainRampSloap = new GridBagConstraints();
		gbc_trainRampSloap.insets = new Insets(0, 0, 5, 5);
		gbc_trainRampSloap.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainRampSloap.gridx = 7;
		gbc_trainRampSloap.gridy = 5;
		panel_1.add(trainRampSloap, gbc_trainRampSloap);
		trainRampSloap.setColumns(10);

		JLabel lblm_4 = new JLabel("曲线总长(m)");
		GridBagConstraints gbc_lblm_4 = new GridBagConstraints();
		gbc_lblm_4.anchor = GridBagConstraints.EAST;
		gbc_lblm_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_4.gridx = 8;
		gbc_lblm_4.gridy = 5;
		panel_1.add(lblm_4, gbc_lblm_4);

		curveLength = new JTextField();
		GridBagConstraints gbc_curveLength = new GridBagConstraints();
		gbc_curveLength.insets = new Insets(0, 0, 5, 5);
		gbc_curveLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_curveLength.gridx = 9;
		gbc_curveLength.gridy = 5;
		panel_1.add(curveLength, gbc_curveLength);
		curveLength.setColumns(10);

		JLabel lblkmh_1 = new JLabel("列车通过隧道");
		GridBagConstraints gbc_lblkmh_1 = new GridBagConstraints();
		gbc_lblkmh_1.anchor = GridBagConstraints.EAST;
		gbc_lblkmh_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkmh_1.gridx = 3;
		gbc_lblkmh_1.gridy = 6;
		panel_1.add(lblkmh_1, gbc_lblkmh_1);

		speedInTunnel = new JTextField();
		GridBagConstraints gbc_speedInTunnel = new GridBagConstraints();
		gbc_speedInTunnel.insets = new Insets(0, 0, 5, 5);
		gbc_speedInTunnel.fill = GridBagConstraints.HORIZONTAL;
		gbc_speedInTunnel.gridx = 4;
		gbc_speedInTunnel.gridy = 6;
		panel_1.add(speedInTunnel, gbc_speedInTunnel);
		speedInTunnel.setColumns(10);

		JLabel lblm_9 = new JLabel("列车所覆盖的坡道长度(m)");
		GridBagConstraints gbc_lblm_9 = new GridBagConstraints();
		gbc_lblm_9.anchor = GridBagConstraints.EAST;
		gbc_lblm_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_9.gridx = 6;
		gbc_lblm_9.gridy = 6;
		panel_1.add(lblm_9, gbc_lblm_9);

		trainOverLength = new JTextField();
		GridBagConstraints gbc_trainOverLength = new GridBagConstraints();
		gbc_trainOverLength.insets = new Insets(0, 0, 5, 5);
		gbc_trainOverLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainOverLength.gridx = 7;
		gbc_trainOverLength.gridy = 6;
		panel_1.add(trainOverLength, gbc_trainOverLength);
		trainOverLength.setColumns(10);

		JLabel label_8 = new JLabel("曲线中心角(°)");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 8;
		gbc_label_8.gridy = 6;
		panel_1.add(label_8, gbc_label_8);

		curveCenterAngle = new JTextField();
		GridBagConstraints gbc_curveCenterAngle = new GridBagConstraints();
		gbc_curveCenterAngle.insets = new Insets(0, 0, 5, 5);
		gbc_curveCenterAngle.fill = GridBagConstraints.HORIZONTAL;
		gbc_curveCenterAngle.gridx = 9;
		gbc_curveCenterAngle.gridy = 6;
		panel_1.add(curveCenterAngle, gbc_curveCenterAngle);
		curveCenterAngle.setColumns(10);

		JLabel lblNewLabel = new JLabel("的运行速度(km/h)");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 7;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblm_8 = new JLabel("列车所覆盖的曲线半径(m)");
		GridBagConstraints gbc_lblm_8 = new GridBagConstraints();
		gbc_lblm_8.anchor = GridBagConstraints.EAST;
		gbc_lblm_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_8.gridx = 6;
		gbc_lblm_8.gridy = 7;
		panel_1.add(lblm_8, gbc_lblm_8);

		trainOverCurveRadius = new JTextField();
		GridBagConstraints gbc_trainOverCurveRadius = new GridBagConstraints();
		gbc_trainOverCurveRadius.insets = new Insets(0, 0, 5, 5);
		gbc_trainOverCurveRadius.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainOverCurveRadius.gridx = 7;
		gbc_trainOverCurveRadius.gridy = 7;
		panel_1.add(trainOverCurveRadius, gbc_trainOverCurveRadius);
		trainOverCurveRadius.setColumns(10);

		JLabel rampType_lbl = new JLabel("有/无限制坡道");
		GridBagConstraints gbc_rampType_lbl = new GridBagConstraints();
		gbc_rampType_lbl.anchor = GridBagConstraints.EAST;
		gbc_rampType_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_rampType_lbl.gridx = 3;
		gbc_rampType_lbl.gridy = 8;
		panel_1.add(rampType_lbl, gbc_rampType_lbl);

		JComboBox<String> rampType = new JComboBox<String>(RampType.getNameList());
		rampType.setBounds(385, 14, 128, 27);
		GridBagConstraints gbc_rampType = new GridBagConstraints();
		gbc_rampType.anchor = GridBagConstraints.WEST;
		gbc_rampType.insets = new Insets(0, 0, 5, 5);
		gbc_rampType.gridx = 4;
		gbc_rampType.gridy = 8;
		panel_1.add(rampType, gbc_rampType);
		
		JLabel lblm_7 = new JLabel("列车所覆盖的曲线的计算长度(m)");
		GridBagConstraints gbc_lblm_7 = new GridBagConstraints();
		gbc_lblm_7.anchor = GridBagConstraints.EAST;
		gbc_lblm_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_7.gridx = 6;
		gbc_lblm_7.gridy = 8;
		panel_1.add(lblm_7, gbc_lblm_7);

		trainOverCurveLength = new JTextField();
		GridBagConstraints gbc_trainOverCurveLength = new GridBagConstraints();
		gbc_trainOverCurveLength.insets = new Insets(0, 0, 5, 5);
		gbc_trainOverCurveLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainOverCurveLength.gridx = 7;
		gbc_trainOverCurveLength.gridy = 8;
		panel_1.add(trainOverCurveLength, gbc_trainOverCurveLength);
		trainOverCurveLength.setColumns(10);

		JLabel label = new JLabel("起动坡道坡度");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 8;
		gbc_label.gridy = 8;
		panel_1.add(label, gbc_label);

		initRampSlope = new JTextField();
		GridBagConstraints gbc_initRampSlope = new GridBagConstraints();
		gbc_initRampSlope.insets = new Insets(0, 0, 5, 5);
		gbc_initRampSlope.fill = GridBagConstraints.HORIZONTAL;
		gbc_initRampSlope.gridx = 9;
		gbc_initRampSlope.gridy = 8;
		panel_1.add(initRampSlope, gbc_initRampSlope);
		initRampSlope.setColumns(10);

		JLabel lblnkn = new JLabel("列车所覆盖的单位隧道阻力(N/KN)");
		GridBagConstraints gbc_lblnkn = new GridBagConstraints();
		gbc_lblnkn.anchor = GridBagConstraints.EAST;
		gbc_lblnkn.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn.gridx = 6;
		gbc_lblnkn.gridy = 9;
		panel_1.add(lblnkn, gbc_lblnkn);

		trainOverResistUnit = new JTextField();
		GridBagConstraints gbc_trainOverResistUnit = new GridBagConstraints();
		gbc_trainOverResistUnit.insets = new Insets(0, 0, 5, 5);
		gbc_trainOverResistUnit.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainOverResistUnit.gridx = 7;
		gbc_trainOverResistUnit.gridy = 9;
		panel_1.add(trainOverResistUnit, gbc_trainOverResistUnit);
		trainOverResistUnit.setColumns(10);

		JLabel label_2 = new JLabel("机车、车辆类型");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 8;
		gbc_label_2.gridy = 9;
		panel_1.add(label_2, gbc_label_2);

		JComboBox<String> locoVehicleType = new JComboBox<String>(LocoVehicleType.getNameList());
		GridBagConstraints gbc_locoVehicleType = new GridBagConstraints();
		gbc_locoVehicleType.insets = new Insets(0, 0, 5, 5);
		gbc_locoVehicleType.fill = GridBagConstraints.HORIZONTAL;
		gbc_locoVehicleType.gridx = 9;
		gbc_locoVehicleType.gridy = 9;
		panel_1.add(locoVehicleType, gbc_locoVehicleType);

		JLabel lblm_10 = new JLabel("列车所覆盖的隧道长度(m)");
		GridBagConstraints gbc_lblm_10 = new GridBagConstraints();
		gbc_lblm_10.anchor = GridBagConstraints.EAST;
		gbc_lblm_10.insets = new Insets(0, 0, 0, 5);
		gbc_lblm_10.gridx = 6;
		gbc_lblm_10.gridy = 10;
		panel_1.add(lblm_10, gbc_lblm_10);

		trainOverTunnelLength = new JTextField();
		GridBagConstraints gbc_trainOverTunnelLength = new GridBagConstraints();
		gbc_trainOverTunnelLength.insets = new Insets(0, 0, 0, 5);
		gbc_trainOverTunnelLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_trainOverTunnelLength.gridx = 7;
		gbc_trainOverTunnelLength.gridy = 10;
		panel_1.add(trainOverTunnelLength, gbc_trainOverTunnelLength);
		trainOverTunnelLength.setColumns(10);

		JButton calc = new JButton("开始计算");
		GridBagConstraints gbc_calc = new GridBagConstraints();
		gbc_calc.insets = new Insets(0, 0, 0, 5);
		gbc_calc.gridx = 12;
		gbc_calc.gridy = 10;
		panel_1.add(calc, gbc_calc);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "结果", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 3;
		gbc_panel_3.gridwidth = 20;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 8;
		internalFrame.getContentPane().add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 130, 169, 0, 0, 0, 117, 169, 0 };
		gbl_panel_3.rowHeights = new int[] { 28, 28, 28, 0, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JLabel lblnkn_1 = new JLabel("\"类型\"运行单位基本阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_1 = new GridBagConstraints();
		gbc_lblnkn_1.anchor = GridBagConstraints.EAST;
		gbc_lblnkn_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn_1.gridx = 0;
		gbc_lblnkn_1.gridy = 0;
		panel_3.add(lblnkn_1, gbc_lblnkn_1);

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

		JLabel lblNewLabel_2 = new JLabel("总的曲线附加阻力(KN)");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 0;
		panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);

		result_6 = new JTextField();
		result_6.setEnabled(false);
		result_6.setEditable(false);
		GridBagConstraints gbc_result_6 = new GridBagConstraints();
		gbc_result_6.insets = new Insets(0, 0, 5, 5);
		gbc_result_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_6.gridx = 3;
		gbc_result_6.gridy = 0;
		panel_3.add(result_6, gbc_result_6);
		result_6.setColumns(10);

		JLabel lblnkn_6 = new JLabel("\"类型\"列车平均单位阻力(N/KN))");
		GridBagConstraints gbc_lblnkn_6 = new GridBagConstraints();
		gbc_lblnkn_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblnkn_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn_6.gridx = 5;
		gbc_lblnkn_6.gridy = 0;
		panel_3.add(lblnkn_6, gbc_lblnkn_6);

		result_11 = new JTextField();
		result_11.setEnabled(false);
		result_11.setEditable(false);
		GridBagConstraints gbc_result_11 = new GridBagConstraints();
		gbc_result_11.insets = new Insets(0, 0, 5, 0);
		gbc_result_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_11.gridx = 6;
		gbc_result_11.gridy = 0;
		panel_3.add(result_11, gbc_result_11);
		result_11.setColumns(10);

		JLabel lblkn = new JLabel("列车总基本阻力(KN)");
		GridBagConstraints gbc_lblkn = new GridBagConstraints();
		gbc_lblkn.anchor = GridBagConstraints.EAST;
		gbc_lblkn.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn.gridx = 0;
		gbc_lblkn.gridy = 1;
		panel_3.add(lblkn, gbc_lblkn);

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

		JLabel label_1 = new JLabel("曲线阻力折算坡度千分数");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 1;
		panel_3.add(label_1, gbc_label_1);

		result_7 = new JTextField();
		result_7.setEnabled(false);
		result_7.setEditable(false);
		GridBagConstraints gbc_result_7 = new GridBagConstraints();
		gbc_result_7.insets = new Insets(0, 0, 5, 5);
		gbc_result_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_7.gridx = 3;
		gbc_result_7.gridy = 1;
		panel_3.add(result_7, gbc_result_7);
		result_7.setColumns(10);

		JLabel label_4 = new JLabel("加算坡度千分数");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 5;
		gbc_label_4.gridy = 1;
		panel_3.add(label_4, gbc_label_4);

		result_12 = new JTextField();
		result_12.setEnabled(false);
		result_12.setEditable(false);
		GridBagConstraints gbc_result_12 = new GridBagConstraints();
		gbc_result_12.insets = new Insets(0, 0, 5, 0);
		gbc_result_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_12.gridx = 6;
		gbc_result_12.gridy = 1;
		panel_3.add(result_12, gbc_result_12);
		result_12.setColumns(10);

		JLabel lblnkn_2 = new JLabel("单位坡道阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_2 = new GridBagConstraints();
		gbc_lblnkn_2.anchor = GridBagConstraints.EAST;
		gbc_lblnkn_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn_2.gridx = 0;
		gbc_lblnkn_2.gridy = 2;
		panel_3.add(lblnkn_2, gbc_lblnkn_2);

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

		JLabel lblnkn_4 = new JLabel("隧道内单位空气附加阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_4 = new GridBagConstraints();
		gbc_lblnkn_4.anchor = GridBagConstraints.EAST;
		gbc_lblnkn_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblnkn_4.gridx = 2;
		gbc_lblnkn_4.gridy = 2;
		panel_3.add(lblnkn_4, gbc_lblnkn_4);

		result_8 = new JTextField();
		result_8.setEnabled(false);
		result_8.setEditable(false);
		GridBagConstraints gbc_result_8 = new GridBagConstraints();
		gbc_result_8.insets = new Insets(0, 0, 5, 5);
		gbc_result_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_8.gridx = 3;
		gbc_result_8.gridy = 2;
		panel_3.add(result_8, gbc_result_8);
		result_8.setColumns(10);

		JLabel lblkn_1 = new JLabel("列车起动总全阻力(KN)");
		GridBagConstraints gbc_lblkn_1 = new GridBagConstraints();
		gbc_lblkn_1.anchor = GridBagConstraints.EAST;
		gbc_lblkn_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_1.gridx = 5;
		gbc_lblkn_1.gridy = 2;
		panel_3.add(lblkn_1, gbc_lblkn_1);

		result_13 = new JTextField();
		result_13.setEnabled(false);
		result_13.setEditable(false);
		GridBagConstraints gbc_result_13 = new GridBagConstraints();
		gbc_result_13.insets = new Insets(0, 0, 5, 0);
		gbc_result_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_13.gridx = 6;
		gbc_result_13.gridy = 2;
		panel_3.add(result_13, gbc_result_13);
		result_13.setColumns(10);

		JLabel lblm_11 = new JLabel("曲线计算长度(m)");
		GridBagConstraints gbc_lblm_11 = new GridBagConstraints();
		gbc_lblm_11.anchor = GridBagConstraints.EAST;
		gbc_lblm_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblm_11.gridx = 0;
		gbc_lblm_11.gridy = 3;
		panel_3.add(lblm_11, gbc_lblm_11);

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

		JLabel label_3 = new JLabel("隧道折算坡度千分数");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 2;
		gbc_label_3.gridy = 3;
		panel_3.add(label_3, gbc_label_3);

		result_9 = new JTextField();
		result_9.setEnabled(false);
		result_9.setEditable(false);
		GridBagConstraints gbc_result_9 = new GridBagConstraints();
		gbc_result_9.insets = new Insets(0, 0, 5, 5);
		gbc_result_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_9.gridx = 3;
		gbc_result_9.gridy = 3;
		panel_3.add(result_9, gbc_result_9);
		result_9.setColumns(10);

		JLabel lblkn_2 = new JLabel("列车运行总全阻力(KN)");
		GridBagConstraints gbc_lblkn_2 = new GridBagConstraints();
		gbc_lblkn_2.anchor = GridBagConstraints.EAST;
		gbc_lblkn_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblkn_2.gridx = 5;
		gbc_lblkn_2.gridy = 3;
		panel_3.add(lblkn_2, gbc_lblkn_2);

		result_14 = new JTextField();
		result_14.setEnabled(false);
		result_14.setEditable(false);
		GridBagConstraints gbc_result_14 = new GridBagConstraints();
		gbc_result_14.insets = new Insets(0, 0, 5, 0);
		gbc_result_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_14.gridx = 6;
		gbc_result_14.gridy = 3;
		panel_3.add(result_14, gbc_result_14);
		result_14.setColumns(10);

		JLabel lblnkn_3 = new JLabel("平均单位曲线附加阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_3 = new GridBagConstraints();
		gbc_lblnkn_3.anchor = GridBagConstraints.EAST;
		gbc_lblnkn_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblnkn_3.gridx = 0;
		gbc_lblnkn_3.gridy = 4;
		panel_3.add(lblnkn_3, gbc_lblnkn_3);

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

		JLabel lblnkn_5 = new JLabel("单位计算坡道阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_5 = new GridBagConstraints();
		gbc_lblnkn_5.anchor = GridBagConstraints.EAST;
		gbc_lblnkn_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblnkn_5.gridx = 2;
		gbc_lblnkn_5.gridy = 4;
		panel_3.add(lblnkn_5, gbc_lblnkn_5);

		result_10 = new JTextField();
		result_10.setEnabled(false);
		result_10.setEditable(false);
		GridBagConstraints gbc_result_10 = new GridBagConstraints();
		gbc_result_10.insets = new Insets(0, 0, 0, 5);
		gbc_result_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_10.gridx = 3;
		gbc_result_10.gridy = 4;
		panel_3.add(result_10, gbc_result_10);
		result_10.setColumns(10);

		JLabel lblnkn_7 = new JLabel("列车运行单位全阻力(N/KN)");
		GridBagConstraints gbc_lblnkn_7 = new GridBagConstraints();
		gbc_lblnkn_7.anchor = GridBagConstraints.EAST;
		gbc_lblnkn_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblnkn_7.gridx = 5;
		gbc_lblnkn_7.gridy = 4;
		panel_3.add(lblnkn_7, gbc_lblnkn_7);

		result_15 = new JTextField();
		result_15.setEnabled(false);
		result_15.setEditable(false);
		GridBagConstraints gbc_result_15 = new GridBagConstraints();
		gbc_result_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_result_15.gridx = 6;
		gbc_result_15.gridy = 4;
		panel_3.add(result_15, gbc_result_15);
		result_15.setColumns(10);

		return internalFrame;
	}

}
