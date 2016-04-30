package app.pojo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import app.provider.ChartProvider;

public class ToolBarBtn extends JButton {
	private static final long serialVersionUID = -1241835142113689725L;
	private JInternalFrame internalFrame;

	public ToolBarBtn(URL iconUrl, final JDesktopPane desktopPane, final ChartProvider provider) {
		super("");
		this.setIcon(new ImageIcon(iconUrl));
		if (provider != null) {
			this.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (internalFrame == null) {
	                	internalFrame = provider.createInternalFrame();
	                    desktopPane.add(internalFrame);
	                } else {
	                    internalFrame.show();
	                    internalFrame.toFront();
	                }
	            }
	        });
		}
	}
}
