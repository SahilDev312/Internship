


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Swing7 extends JFrame {
	private JButton loginButton;
	
	public Swing7() {
		// initialize window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Seventh Window");
		this.setLayout(null);	
		// initialize components
		loginButton = new JButton("Login");
		loginButton.setBounds(250, 150, 100, 30);
		this.add(loginButton);
		loginButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Login dialog = new Login();
				dialog.setModal(true);
				dialog.setVisible(true);
				String name = dialog.getName();
				String passwd = dialog.getPassword();
				String msg = "Entered Name: " + name + " and Password: " + passwd ;
				JOptionPane.showMessageDialog(Swing7.this, msg);
			}
		});
	}
	
	public static void main(String[] args) {
		Swing7 w = new Swing7();
		w.setSize(600, 400);
		w.setVisible(true);
	}
}