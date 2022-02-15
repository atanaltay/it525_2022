package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
import model.Person;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainFrame extends JFrame implements AddPersonListener{

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
	private JTable tblPeople;
	
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
		people = appService.getAllContacts();
		refreshCategories();
		refreshPeople();
	}
	
	private List<Category> categories  =new ArrayList<Category>();
	public void refreshCategories() {
		
		categories = appService.getAllCategories();
		
		DefaultComboBoxModel<Category> model 
		= new DefaultComboBoxModel<Category>(categories.toArray(new Category[categories.size()]));

		
		list.setModel(model);
		
		
	}
	
	
	List<Person> people = new ArrayList<Person>();
	public void refreshPeople() {
	
		
		
		String[] columns = {"id","name","lastname","work","address","home","email","city","birthdate"};
		
		Object[][] data = new Object[people.size()][];
		for (int i = 0; i < people.size(); i++) {
			Person current = people.get(i);
			data[i] = new Object[] {current.getId(),current.getName(),current.getLastname(),current.getWorkphone(),
					current.getAddress(),current.getHomephone(),current.getEmail(),current.getCity(),current.getBirthdate()};
			
			
			
		}
		
		DefaultTableModel tblModel = new DefaultTableModel(data, columns);
		tblPeople.setModel(tblModel);
		
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_1_actionPerformed(e);
			}
		});
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
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				do_list_valueChanged(e);
			}
		});
		scrollPane.setViewportView(list);
		
		scrollPane_1 = new JScrollPane();
		splitPane.setRightComponent(scrollPane_1);
		
		tblPeople = new JTable();
		scrollPane_1.setViewportView(tblPeople);
	}

	protected void do_list_valueChanged(ListSelectionEvent e) {
		
		if(!e.getValueIsAdjusting()) {
			
			
			
			people=  appService.getContactsByCategoryId(((Category)list.getSelectedValue()).getId());
			refreshPeople();
			
			
		}
		
		
		
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		
		AddPersonFrame frm = new AddPersonFrame(this);
		frm.setVisible(true);
		
		
	}

	@Override
	public void personAdded() {
		

			if(list.getSelectedIndex()==-1) {
				//nothing is selected
				people = appService.getAllContacts();
				refreshPeople();
				
			}else {
				people=  appService.getContactsByCategoryId(((Category)list.getSelectedValue()).getId());
				refreshPeople();
				
				
			}
		
		
		
	}
}
