package example1;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
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

public class WorldSearchFrame extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField txtSearch;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable tblData;
	
	
	private List<Country> countries = new ArrayList<Country>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorldSearchFrame frame = new WorldSearchFrame();
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
	public WorldSearchFrame() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtSearch = new JTextField();
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnSearch_actionPerformed(e);
			}
		});
		panel.add(btnSearch);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		tblData = new JTable();
		scrollPane.setViewportView(tblData);
	}

	protected void do_btnSearch_actionPerformed(ActionEvent e) {
		countries = new ArrayList<Country>();
		try (Connection conn = DriverManager
				.getConnection("jdbc:mysql://localhost/world","root","e118528!")){
			
			String query = "select * from country where name like ?";
			
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, txtSearch.getText() + "%");
			
			ResultSet rs =  psmt.executeQuery();
			
			
			while(rs.next()) {
				
				Country country = new Country(rs.getString("code"),
						rs.getString("name"), rs.getString("region"), 
						rs.getString("continent"), rs.getInt("population"));
				
				countries.add(country);
				
				
			}
			
			String[] cols = {"code","name","region","continent","population"};
			
			Object[][] data = new Object[countries.size()][];
			
			
			for (int i = 0; i < countries.size(); i++) {
				Country current = countries.get(i);
				data[i] = new Object[] {current.getCode(),current.getName(),
						current.getRegion(),current.getContinent(),
						current.getPopulation()};
			}
			
			
			DefaultTableModel model = new DefaultTableModel(data, cols);
			tblData.setModel(model);
			

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for (Country country : countries) {
			System.out.println(country);
		}
		
		
		
		
		
		
		
	}
}
