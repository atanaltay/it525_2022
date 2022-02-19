package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.awt.event.ActionEvent;

public class ProgressFrame extends JFrame implements CountListener{

	private JPanel contentPane;
	private JProgressBar progressBar;
	private JButton btnTest;
	private JButton btnStart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressFrame frame = new ProgressFrame();
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
	public ProgressFrame() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(86, 67, 401, 20);
		contentPane.add(progressBar);
		
		btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnTest_actionPerformed(e);
			}
		});
		btnTest.setBounds(70, 6, 117, 29);
		contentPane.add(btnTest);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnStart_actionPerformed(e);
			}
		});
		btnStart.setBounds(85, 100, 117, 29);
		contentPane.add(btnStart);
		
		btnNewButton = new JButton("Stop");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setBounds(202, 99, 117, 29);
		contentPane.add(btnNewButton);
		
		btnPause = new JButton("Pause");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPause_actionPerformed(e);
			}
		});
		btnPause.setBounds(323, 99, 117, 29);
		contentPane.add(btnPause);
		
		btnResume = new JButton("Resume");
		btnResume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnResume_actionPerformed(e);
			}
		});
		btnResume.setBounds(452, 99, 117, 29);
		contentPane.add(btnResume);
	}
	protected void do_btnTest_actionPerformed(ActionEvent e) {
		
		progressBar.setValue(50);
		
		
		
	}
	
	
	
	CounterThread counterThread;
	boolean started = false;
	private JButton btnNewButton;
	private JButton btnPause;
	private JButton btnResume;
	protected void do_btnStart_actionPerformed(ActionEvent e) {
		
		progressBar.setValue(0);
		
		ExecutorService srv = Executors.newCachedThreadPool();
		if(counterThread==null && started==false) {
			counterThread = new CounterThread(this);
			
			
			srv.submit(counterThread);
			started = true;
		}
	
		
		srv.shutdown();
		

	}

	@Override
	public void countIncremented(int value) {
		
			progressBar.setValue(value);
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		if(counterThread!=null) {
			counterThread.stopThread();
			counterThread = null;
			started = false;
		}
		
	}
	protected void do_btnPause_actionPerformed(ActionEvent e) {
		
		counterThread.pauseThread();
	}
	protected void do_btnResume_actionPerformed(ActionEvent e) {
		
		counterThread.resumeThread();
	}
}
