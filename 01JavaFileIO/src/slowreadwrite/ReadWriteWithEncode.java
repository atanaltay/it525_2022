package slowreadwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReadWriteWithEncode {

	public static void main(String[] args) {
		InputStreamReader reader =  null;
		try {
		
			reader = new InputStreamReader(new FileInputStream("/Users/atanaltay/Desktop/sample3.txt"), "utf-8");
			
			  
			  int c =0;
			  
			  while((c=reader.read())!=-1) {
			  
			  System.out.print(((char)c)); }
			  
			  System.out.println("En of file!");
			
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	
	
}
