package example3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class EventsFrame extends JFrame {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventsFrame frame = new EventsFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EventsFrame() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn1 = new JButton("Button 1");
		btn1.setBounds(68, 17, 117, 29);
		
		
		btn1.setActionCommand("GO");
		
		btn1.addMouseListener(new MyMouseListener());
		
		btn1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				System.out.println("Secon event fired....");
				
			}
		});
		
		
		
		
		btn1.addActionListener(e-> {
			System.out.println("Button click action: command:" + e.getActionCommand());
			
		});
		
		contentPane.add(btn1);
		
		btn2 = new JButton("Button 2");
		btn2.setBounds(228, 17, 117, 29);
		contentPane.add(btn2);
	}

}
