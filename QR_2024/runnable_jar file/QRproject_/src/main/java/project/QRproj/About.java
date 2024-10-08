package project.QRproj;


import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class About extends JDialog   {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public About() throws URISyntaxException {

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("About QR Generator");
		this.setSize(400,250);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		this.addWindowListener(new WindowListener() {
			
			public void windowOpened(WindowEvent e) {
				GenerateQR.aboutItem.setEnabled(false);
				
			}
			
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowClosed(WindowEvent e) {
				GenerateQR.aboutItem.setEnabled(true);
				
			}
			
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel titleLabel  = new JLabel();

		titleLabel.setText("QR Generator");
		titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		titleLabel.setForeground(Color.blue);
		titleLabel.setIcon(new ImageIcon("images/qrIcon.jpg"));
		titleLabel.setIconTextGap(20);
		titleLabel.setHorizontalTextPosition(JLabel.RIGHT);
		titleLabel.setVerticalTextPosition(JLabel.CENTER);
		titleLabel.setBounds(58,20,300,50);
		
		JPanel textPanel = new JPanel();
		textPanel.setBounds(50, 90, 281, 110);
		textPanel.setLayout(new GridLayout(4,1,0,3));
		
		JLabel line1 = new JLabel();
		line1.setFont(new Font("Arial", Font.PLAIN,17));
		line1.setText("<html>product of <strong><i>svintotech</i></strong><hr></html>");
		line1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel line2 = new JLabel("<html>General purpose QR Generator use to create QR of links & text, to download and distribute.<html>");
		JLabel line3 = new JLabel("<html>Copyright <i>@</i> 2023 | All rights reserved.</html>");
		
		final URI uri = new URI("https://www.svinfotech.co.in");
	
		JButton btn = new JButton("<html><u>visit our website www.svinfotech.co.in</u><html>");
		btn.setForeground(new Color(0x6d00ff));
		btn.setToolTipText(uri.toString());
		btn.setBorder(null);
		btn.setFocusable(false);
		btn.setOpaque(false);
		btn.setBackground(Color.white);
		btn.setSize(50,50);
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(Desktop.isDesktopSupported()) {
					try {
						Desktop.getDesktop().browse(uri);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Unable to open browser", "Error!", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		
		textPanel.add(line1);		
		textPanel.add(line3);
		textPanel.add(line2);
		textPanel.add(btn);

		this.add(textPanel);
		this.add(titleLabel);
		this.setVisible(true);
	}
	
	



	
}


