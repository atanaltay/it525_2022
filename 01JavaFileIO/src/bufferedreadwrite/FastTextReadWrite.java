package bufferedreadwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FastTextReadWrite {

	
	public static void main(String[] args) {
		
		
		// relative file path versus absolute file path?
		
		//absolute path: full path: /Users/atanaltay/Desktop/test.txt for windows C://Program Files/..
		
		//relative path: the path according to working directory : text.txt  -> text.txt in current directory
		//															../text.txt -> text.txt in one directory above
		//															../../test.txt -> 2 directories above
		
		//Writing
		/*
		 * BufferedWriter writer = null; try { writer = new BufferedWriter(new
		 * FileWriter("testfile.fancy")); writer.
		 * write("a line with buffered writer...\na line with buffered writer...\na line with buffered writer...\na line with buffered writer...\nlast line.."
		 * ); writer.flush();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }finally { try { writer.close(); } catch (IOException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); } }
		 * 
		 */
		
		//Reading
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("testfile.fancy"));
			
			String line ="";
			
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
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
