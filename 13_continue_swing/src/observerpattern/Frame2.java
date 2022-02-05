package observerpattern;

import java.util.Date;

public class Frame2 {

	Button frm2Button;
	
	public Frame2() {
		frm2Button = new Button("Button frame 2");
		
		frm2Button.addClickListener(d->System.out.println("Frame 2 button click " + d));
		
	}
	
	
	public void test() {
		frm2Button.clickButton();
	}


	
	
	
}
