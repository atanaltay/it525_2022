package example1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	JButton btn1;
	JButton btn2;
	
	public MainFrame() {
		
		this.setBounds(200, 200, 400, 400);
		
		btn1 = new JButton("Click 1");
		btn2 = new JButton("Click 2");
		
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		
		
		
	}
	
	public static void main(String[] args) {
		MainFrame frm1 = new MainFrame();
		frm1.setVisible(true);
		
	}
	
	

}
