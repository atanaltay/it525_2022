package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Category;
import model.Person;
import service.AppService;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPersonFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtname;
	private JLabel lblNewLabel_1;
	private JTextField txtlastname;
	private JLabel lblNewLabel_2;
	private JTextField txtwork;
	private JTextField txtaddress;
	private JLabel lblNewLabel_4;
	private JTextField txthome;
	private JLabel lblNewLabel_5;
	private JTextField txtemail;
	private JLabel lblNewLabel_6;
	private JTextField txtCity;
	private JLabel lblNewLabel_7;
	private JTextField txtbirthdate;
	private JLabel lblNewLabel_8;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	private JComboBox cmbCategory;


	
	AddPersonListener listener;
	AppService srv = new AppService();
	List<Category> categories = new ArrayList<Category>();
	
	public AddPersonFrame(AddPersonListener listener) {
		initGUI();
		this.listener = listener;
		categories = srv.getAllCategories();
		
		DefaultComboBoxModel<Category> model = new DefaultComboBoxModel<Category>(categories.toArray(new Category[categories.size()]));
		cmbCategory.setModel(model);
		
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 454, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("name:");
		lblNewLabel.setBounds(6, 30, 61, 16);
		contentPane.add(lblNewLabel);
		
		txtname = new JTextField();
		txtname.setBounds(117, 25, 193, 26);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setBounds(6, 70, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		txtlastname = new JTextField();
		txtlastname.setBounds(117, 63, 193, 26);
		contentPane.add(txtlastname);
		txtlastname.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Work Phone:");
		lblNewLabel_2.setBounds(6, 105, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		txtwork = new JTextField();
		txtwork.setColumns(10);
		txtwork.setBounds(117, 98, 193, 26);
		contentPane.add(txtwork);
		
		txtaddress = new JTextField();
		txtaddress.setColumns(10);
		txtaddress.setBounds(117, 133, 193, 26);
		contentPane.add(txtaddress);
		
		lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setBounds(6, 140, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		txthome = new JTextField();
		txthome.setColumns(10);
		txthome.setBounds(117, 171, 193, 26);
		contentPane.add(txthome);
		
		lblNewLabel_5 = new JLabel("Home phone:");
		lblNewLabel_5.setBounds(6, 178, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(117, 209, 193, 26);
		contentPane.add(txtemail);
		
		lblNewLabel_6 = new JLabel("Email:");
		lblNewLabel_6.setBounds(6, 216, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(117, 255, 193, 26);
		contentPane.add(txtCity);
		
		lblNewLabel_7 = new JLabel("City");
		lblNewLabel_7.setBounds(6, 262, 61, 16);
		contentPane.add(lblNewLabel_7);
		
		txtbirthdate = new JTextField();
		txtbirthdate.setColumns(10);
		txtbirthdate.setBounds(117, 293, 193, 26);
		contentPane.add(txtbirthdate);
		
		lblNewLabel_8 = new JLabel("Birthdate");
		lblNewLabel_8.setBounds(6, 300, 61, 16);
		contentPane.add(lblNewLabel_8);
		
		btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setBounds(193, 369, 117, 29);
		contentPane.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("Category:");
		lblNewLabel_3.setBounds(6, 339, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		cmbCategory = new JComboBox();
		cmbCategory.setBounds(117, 331, 193, 27);
		contentPane.add(cmbCategory);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		int cat_id = ((Category)cmbCategory.getSelectedItem()).getId();
		
		Person p = new Person(-1, txtname.getText(),txtlastname.getText(), txtwork.getText(), txtaddress.getText(),
				txthome.getText(), txtemail.getText(),txtCity.getText(), txtbirthdate.getText(), cat_id);
		
		srv.savePerson(p);
		
		listener.personAdded();
		
		this.dispose();		
		
	}
}
