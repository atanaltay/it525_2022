package example1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main2 {

	
	public static void main(String[] args) {
		
		JFrame frm1 = new JFrame("First App");
		
		frm1.setBounds(200, 200, 300, 400);
		
		
		JButton btn1 = new JButton("Click me!");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Click me!");
		JButton btn4 = new JButton("Button 4");
		
		frm1.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		
		frm1.getContentPane().add(btn1);
		frm1.getContentPane().add(btn2);
		frm1.getContentPane().add(btn3);
		frm1.getContentPane().add(btn4);
		
		frm1.setVisible(true);
		
		
		
		
		
	}
	
	
	
}
