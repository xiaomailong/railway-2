package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Insets;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalBorders;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

public class Main {

	private JFrame frame;

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
		frame.setBounds(100, 100, 800, 600);
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
		
		JButton button = new JButton("");
		toolBar.add(button);
		button.setIcon(new ImageIcon(Main.class.getResource("/icon/rail.png")));
		
		JButton button_1 = new JButton("");
		toolBar.add(button_1);
		button_1.setIcon(new ImageIcon(Main.class.getResource("/icon/save.png")));
		toolBar.addSeparator();
		
		JButton button_2 = new JButton("");
		toolBar.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setIcon(new ImageIcon(Main.class.getResource("/icon/pause.png")));
		
		JButton button_3 = new JButton("");
		toolBar.add(button_3);
		button_3.setIcon(new ImageIcon(Main.class.getResource("/icon/play.png")));
		
		JButton button_4 = new JButton("");
		toolBar.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setIcon(new ImageIcon(Main.class.getResource("/icon/stop.png")));
		
		JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JInternalFrame internalFrame = new JInternalFrame("机车类型维护", true, true, true, true);
		internalFrame.setBounds(20, 20, 760, 500);
		desktopPane.add(internalFrame);
		internalFrame.setVisible(true);
	}
}
