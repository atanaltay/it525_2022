package example1;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main1 {

	
	public static void main(String[] args) {
		
		JFrame frm1 = new JFrame("First App");
		
		frm1.setBounds(200, 200, 300, 400);
		
		
		JButton btn1 = new JButton("Click me!");
		JButton btn2 = new JButton("Button 2");
		
		frm1.getContentPane().add(btn1,BorderLayout.NORTH);
		frm1.getContentPane().add(btn2,BorderLayout.WEST);
		
		frm1.setVisible(true);
		
		
		
		
		
	}
	
	
	
}
