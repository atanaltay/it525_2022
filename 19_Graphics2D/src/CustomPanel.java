import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class CustomPanel extends JPanel{

	int posX =150;
	int posY = 30;
	
	public CustomPanel() {
		
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
					posX = e.getX()-25;
					posY = e.getY()-25;
					
					repaint();
				
				
				
			}
			
		});
		
		this.addMouseMotionListener(new MouseMotionAdapter() {
			
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
				posX = e.getX()-25;
				posY = e.getY()-25;
				
				repaint();
				
			}
			
			
		});
		
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		Graphics2D pen = (Graphics2D)g;
		
		pen.setColor(Color.red);
		
		
		pen.fillRect(30, 30, 100, 100);
		
		
		pen.setColor(Color.blue);
		
		pen.fillArc(posX, posY, 50, 50, 0, 360);
		
	}
	
	
	
	
}
