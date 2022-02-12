package example2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import example1.Country;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class UsersFrame extends JFrame implements AddUserListener {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewUser;
	private JScrollPane scrollPane;
	private JTable tblData;

	private List<User> users;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsersFrame frame = new UsersFrame();
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
	public UsersFrame() {
		initGUI();
		refreshData();
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		btnNewUser = new JButton("New User");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewUser_actionPerformed(e);
			}
		});
		panel.add(btnNewUser);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		tblData = new JTable();
		scrollPane.setViewportView(tblData);
	}

	public void refreshData() {
		users = new ArrayList<User>();

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it525login", "root", "e118528!")) {

			String query = "select * from users";

			PreparedStatement psmt = conn.prepareStatement(query);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {

				User usr = new User(rs.getString("username"), rs.getString("password"), rs.getString("city"));
				users.add(usr);

			}

			String[] cols = { "username", "password", "city" };

			Object[][] data = new Object[users.size()][];

			for (int i = 0; i < users.size(); i++) {
				User current = users.get(i);
				data[i] = new Object[] { current.getUsername(), current.getPassword(), current.getCity() };
			}

			DefaultTableModel model = new DefaultTableModel(data, cols);
			tblData.setModel(model);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void do_btnNewUser_actionPerformed(ActionEvent e) {

		AddUserFrame frm = new AddUserFrame(this);
		frm.setVisible(true);

	}

	@Override
	public void userSaved(String username, String password, String country) {
		
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it525login", "root", "e118528!")){
			
			
			String query = "insert into users (username,password,city) values(?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			
			psmt.setString(1, username);
			psmt.setString(2, password);	
			psmt.setString(3, country);
			
			psmt.executeUpdate();
			
			refreshData();
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
