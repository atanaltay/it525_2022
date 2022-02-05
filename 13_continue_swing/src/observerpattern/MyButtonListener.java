package observerpattern;

import java.util.Date;

public class MyButtonListener implements ButtonClickListener{

	@Override
	public void buttonClicked(Date when) {
		System.out.println("Class implementation");
		
	}

}
