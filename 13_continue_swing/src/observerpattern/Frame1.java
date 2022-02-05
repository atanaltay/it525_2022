package observerpattern;

import java.util.Date;

public class Frame1 implements ButtonClickListener{

	
	Button frm1Button;
	
	public Frame1() {
		frm1Button = new Button("Btn-1");
		//Method 1
		frm1Button.addClickListener(new MyButtonListener());
		
		//Method 2
		frm1Button.addClickListener(this);
		
		//Method 3
		frm1Button.addClickListener(new ButtonClickListener() {
			
			@Override
			public void buttonClicked(Date when) {
				System.out.println("Anonymous inner class");
				System.out.println("... at " + when);
			}
		});
		
		
		frm1Button.addClickListener(d->System.out.println("Button clicked at " + d));
		
		
	}
	
	
	public void test() {
		frm1Button.clickButton();
	}


	@Override
	public void buttonClicked(Date when) {
		System.out.println("Frame implementation");
		
	}
	
	
}
