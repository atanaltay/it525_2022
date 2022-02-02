package iteration;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("altug");
		names.add("ahmet");
		names.add("mehmet");
		names.add("hasan");
		names.add("osman");
	
		//Exception in thread "main" java.util.ConcurrentModificationException
		/*
		 * for (String name : names) { if(name.equals("mehmet")) {
		 * names.remove("mehmet"); } } System.out.println(names);
		 */
		
		//List iteration
		Iterator<String> namesIter = names.iterator();
		
		while (namesIter.hasNext()) {
			String currentName = namesIter.next();
			if(currentName.equals("mehmet")) {
				namesIter.remove();
			}
			
		}
		
		System.out.println(names);
		
		String[] texts = {"java","football","java","football"};
		
		//Map iteration
		
		Map<String, Integer> counts = new TreeMap<String, Integer>();
		
		for (String text : texts) {
			
			if(counts.containsKey(text)) {
				//counts.put(text, null)
			}else {
				
			}
			
			
			
		}
		
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("counts.csv"),StandardOpenOption.CREATE)) {
		
			for (Map.Entry<String, Integer> entry : counts.entrySet()) {
				
				writer.write(entry.getKey() + ":" + entry.getValue());
				
				
			}
			writer.flush();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
