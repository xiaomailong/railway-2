package app.pojo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;

import app.provider.CalcProvider;

public class MenuItem extends JMenuItem {
	private static final long serialVersionUID = -4146878333051914842L;
	private JInternalFrame internalFrame;
	
	public MenuItem(String name, final JDesktopPane desktopPane, final CalcProvider provider) {
		super(name);
		if (provider != null) {
			this.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (internalFrame == null) {
	                    internalFrame = provider.createInternalFrame();
	                    desktopPane.add(internalFrame);
	                }
                	internalFrame.show();
                	internalFrame.toFront();
	            }
	            
	        });	
		}
	}
}
