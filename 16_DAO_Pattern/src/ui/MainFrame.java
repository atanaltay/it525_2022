package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.AppService;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;

import java.util.ArrayList;
import java.util.List;
import  model.Category;


public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JList list;
	private JTable table;
	
	private AppService appService = new AppService();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		initGUI();
		refreshCategories();
	}
	
	private List<Category> categories  =new ArrayList<Category>();
	public void refreshCategories() {
		
		categories = appService.getAllCategories();
		
		DefaultComboBoxModel<Category> model 
		= new DefaultComboBoxModel<Category>(categories.toArray(new Category[categories.size()]));

		
		list.setModel(model);
		
		
	}
	
	
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnNewButton = new JButton("New Category");
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New Person");
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Update Category");
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Update Person");
		panel.add(btnNewButton_3);
		
		splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		scrollPane_1 = new JScrollPane();
		splitPane.setRightComponent(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
	}

}
