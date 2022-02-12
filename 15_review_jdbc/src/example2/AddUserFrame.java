package example2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddUserFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtUsername;
	private JLabel lblNewLabel_1;
	private JTextField txtPassword;
	private JLabel lblNewLabel_2;
	private JTextField txtCity;
	private JButton btnSave;
	private JButton btnCancel;
	private AddUserListener listener;

	public AddUserFrame(AddUserListener listener) {
		this.listener = listener;
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Password:");
		lblNewLabel.setBounds(37, 71, 128, 16);
		contentPane.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(184, 31, 130, 26);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setBounds(37, 36, 128, 16);
		contentPane.add(lblNewLabel_1);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(184, 66, 130, 26);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		lblNewLabel_2 = new JLabel("City:");
		lblNewLabel_2.setBounds(37, 115, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		txtCity = new JTextField();
		txtCity.setBounds(184, 110, 130, 26);
		contentPane.add(txtCity);
		txtCity.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnSave_actionPerformed(e);
			}
		});
		btnSave.setBounds(196, 164, 117, 29);
		contentPane.add(btnSave);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCancel_actionPerformed(e);
			}
		});
		btnCancel.setBounds(62, 164, 117, 29);
		contentPane.add(btnCancel);
	}
	protected void do_btnSave_actionPerformed(ActionEvent e) {
		
		
		listener.userSaved(txtUsername.getText(), txtPassword.getText(), txtCity.getText());

		this.dispose();
		
		
	}
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		
		this.dispose();
		
	}
}
