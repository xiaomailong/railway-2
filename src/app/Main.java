package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import app.pojo.MenuItem;
import app.provider.impl.BrakeProblemCalcProviderImpl;
import app.provider.impl.BrakingProviderImpl;
import app.provider.impl.LocoEnergeCalcProviderImpl;
import app.provider.impl.LocoTractionProviderImpl;
import app.provider.impl.MotionEquationProviderImpl;
import app.provider.impl.RailAbilityCalcProviderImpl;
import app.provider.impl.ResistanceProviderImpl;
import app.provider.impl.SpeedAndTimeCalcProviderImpl;
import app.provider.impl.TractionMassCalcProviderImpl;

public class Main {
	private JFrame frame;
	private JDesktopPane desktopPane;
	
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
		
		ImageIcon background = new ImageIcon(Main.class.getResource("/icon/background.jpg"));
		JLabel label_bg = new JLabel(background);
		label_bg.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
		
		desktopPane = new JDesktopPane();
		desktopPane.add(label_bg, new Integer(Integer.MIN_VALUE));

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
		menu_function.add(new MenuItem("机车能耗量的计算", desktopPane, new LocoEnergeCalcProviderImpl()));
		menu_function.add(new MenuItem("牵引质量计算", desktopPane, new TractionMassCalcProviderImpl()));
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
		
		/**JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		toolBar.setBorder(new LineBorder(Color.DARK_GRAY));
		
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/rail.png"), desktopPane, new SampleChartProviderImpl(false)));
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/save.png"), desktopPane, null));
		toolBar.addSeparator();
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/pause.png"), desktopPane, null));
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/play.png"), desktopPane, new SampleChartProviderImpl(true)));
		toolBar.add(new ToolBarBtn(Main.class.getResource("/icon/stop.png"), desktopPane, null));*/
		
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);		
	}
}
