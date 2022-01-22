package bytebased;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyByteBased {

	
	public static void main(String[] args) {
		
		//String input = "javacup.png";
		//String output = "/Users/atanaltay/Desktop/javacup_copy.png";
		
		String input = "longtext_copy.txt";
		String output = "/Users/atanaltay/Desktop/longtext_copy2.txt";
		
		
		//Reader
		
		try (
				BufferedInputStream reader = new BufferedInputStream(new FileInputStream(input));
				BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(output))
			) 
		{
			
			int b = 0;
			while((b=reader.read())!=-1) {
				
				writer.write(b);

			}
			writer.flush();
			System.out.println("File copied!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not copied!!");
		}
		
		
		
		
		
		
	}
	
	
	
	
}
