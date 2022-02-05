package observerpattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Button {

	private String text;
	
	private List<ButtonClickListener> listeners
	 = new ArrayList<ButtonClickListener>();
	
	
	public Button(String text) {
		System.out.println("Button initialized");
		this.text = text;
	}
	
	public void addClickListener(ButtonClickListener lis) {
		this.listeners.add(lis);
	}
	
	
	public void clickButton() {
		Date now = new Date();
		for (ButtonClickListener buttonClickListener : listeners) {
			buttonClickListener.buttonClicked(now);
		}
	}
	
	
}
