package fileexample;

import java.io.File;
import java.io.IOException;

public class MainClass {
	
	
		public static void main(String[] args) {
			
			//create a file object with absolute / full path
			File f = new File("/Users/atanaltay/Desktop/samp.txt");
			
			if (f.exists()) {
				System.out.println("file exists");
			}else {
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
	
}
