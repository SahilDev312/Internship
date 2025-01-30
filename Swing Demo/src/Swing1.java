

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 extends JFrame {
	private JButton submitButton;
	private JButton clickButton;
	
	public Swing1() {
		// initialize window
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Bye!");
				Swing1.this.dispose();
			}
		});
		this.setTitle("First Window");
		this.setLayout(null);
		
		// add components
		class ButtonActionListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button is clicked!");
				JButton btn = (JButton) e.getSource();
				System.out.println("Button Title: " + btn.getText());
				String command = e.getActionCommand();
				System.out.println("Action Command: " + command);
				if(command.equals("BTN1")) {
					System.out.println("Submit button is clicked...");
				}
				else if(command.equals("BTN2")) {
					System.out.println("Click button is clicked...");
				}
			}
		}
		ButtonActionListener actionListener = new ButtonActionListener();
		
		submitButton = new JButton();
		submitButton.setText("Submit");
		submitButton.setBounds(100, 150, 80, 30);
		submitButton.setActionCommand("BTN1");
		this.add(submitButton);
		submitButton.addActionListener(actionListener);
		
		/*
		submitButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Submit Button is Clicked!");
			}
		});
		*/

		clickButton = new JButton();
		clickButton.setText("Click");
		clickButton.setBounds(250, 150, 80, 30);
		clickButton.setActionCommand("BTN2");
		this.add(clickButton);
		clickButton.addActionListener(actionListener);
		
		/*
		clickButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button object: " + e.getSource());
				System.out.println("Button Action Command: " + e.getActionCommand());
				System.out.println("Click Button is Clicked!!");
			}
		});
		*/
	}

	public static void main(String[] args) {
		Swing1 w = new Swing1();
		w.setSize(600, 400);
		w.setVisible(true);
	}
}
