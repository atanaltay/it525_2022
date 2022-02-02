package stringanalysis;

public class Z03Analyzer {

	
	
	public static void searchLargeText(String[] lines, String searchStr,StringAnalyzer analyzer) {
		
		for (int i = 0; i < lines.length; i++) {
			
			if(analyzer.analyze(lines[i], searchStr)) {
				System.out.println("Found at " + i );
			}
			
			
			
		}
		
		
		
	}
	
	
}
