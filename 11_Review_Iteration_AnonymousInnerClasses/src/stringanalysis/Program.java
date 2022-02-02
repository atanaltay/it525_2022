package stringanalysis;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = {"Java rules!","python rules","c# rules!","javascript","html"};
		
		/*
		ContainsAnalyzer containsAnayzer = new ContainsAnalyzer();
		
		System.out.println("Contains");
		Z03Analyzer.searchLargeText(lines, "rules", containsAnayzer);
		
		System.out.println("Starts with");
		
		
		Z03Analyzer.searchLargeText(lines, "j", new StartsWithAnalayzer());
		*/
		
		//Using anonymous inner classes
		
		System.out.println("Contains...");
		Z03Analyzer.searchLargeText(lines, "java", new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String searchStr) {
				if(target.toLowerCase().contains(searchStr.toLowerCase())) {
					return true;
				}
				return false;
			}
			
		});
		
		System.out.println("strts with...");
		
		Z03Analyzer.searchLargeText(lines, "ja", new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String searchStr) {
				if(target.toLowerCase().startsWith(searchStr.toLowerCase())) {
					return true;
				}
				return false;
			}
		});
		
		
		
		
	}
	
	
	
	
	
}
