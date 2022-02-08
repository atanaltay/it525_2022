package example2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginFrameV1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JButton btnLogin;
	private JLabel lblLoginResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrameV1 frame = new LoginFrameV1();
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
	public LoginFrameV1() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(20, 20, 164, 16);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(20, 73, 148, 16);
		contentPane.add(lblNewLabel_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(127, 15, 130, 26);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(127, 68, 130, 26);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnLogin_actionPerformed(e);
			}
		});
		btnLogin.setBounds(140, 121, 117, 29);
		contentPane.add(btnLogin);
		
		lblLoginResult = new JLabel("");
		lblLoginResult.setForeground(Color.RED);
		lblLoginResult.setBounds(73, 176, 184, 16);
		contentPane.add(lblLoginResult);
	}
	protected void do_btnLogin_actionPerformed(ActionEvent e) {
		
		//SELECT count(*) as cnt from users where username='altug' and password='1234';
		
		
		if(txtUsername.getText().equals("") || txtPassword.getText().equals("")) {
			
			lblLoginResult.setText("Please enter username and pass!");
			
			
		}else {
			
			String username = txtUsername.getText();
			String password = txtPassword.getText();
			
			
			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it525login","root","e118528!")){
				
				Statement stmt =  conn.createStatement();
				ResultSet rs = stmt.executeQuery("select count(*) as cnt from users where username='" + username + "' and password='" + password + "'");
				
				rs.next();
				
				 if(rs.getInt("cnt")>0) {
					 
					 lblLoginResult.setText("SUCCESS");
					 
					 
				 }else {
					 lblLoginResult.setText("FAIL");
				 }
				 
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
		}
		
		
		
		
		
	}
}
