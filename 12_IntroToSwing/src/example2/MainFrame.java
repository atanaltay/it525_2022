package example2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

	private JButton btn1;
	private JButton btn2;
	
	public MainFrame() {
		System.out.println("Mainfrme initializing...");
		this.setBounds(200, 200, 300, 300);
		this.setTitle("Main Frame");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		System.out.println("Mainfrme displayed...");
		
	}
	
	public static void main(String[] args) {
		new MainFrame().setVisible(true);
	}
	
	
}
