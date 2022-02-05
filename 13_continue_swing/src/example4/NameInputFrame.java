package example4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NameInputFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtName;
	private JButton btnOK;
	private JLabel lblOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameInputFrame frame = new NameInputFrame();
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
	public NameInputFrame() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(23, 21, 61, 16);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(96, 16, 130, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		btnOK = new JButton("OK");
		btnOK.setBounds(109, 54, 117, 29);
		
		btnOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblOutput.setText("Merhaba " +  txtName.getText() + "!");
				
				
				
				
			}
			
		});
		
		
		contentPane.add(btnOK);
		
		lblOutput = new JLabel("");
		lblOutput.setBounds(23, 109, 203, 16);
		contentPane.add(lblOutput);
	}
}
