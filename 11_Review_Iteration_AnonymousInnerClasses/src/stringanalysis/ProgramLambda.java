package stringanalysis;

public class ProgramLambda {

	public static void main(String[] args) {
		
		String[] lines = {"Java rules!","python rules","c# rules!","javascript","html"};
		
		System.out.println("Contains");
		Z03Analyzer.searchLargeText(lines, "java", (target,search)-> 
									target.toLowerCase().contains(search.toLowerCase()));
		
		
		System.out.println("Starts with...");
		
		
		Z03Analyzer.searchLargeText(lines, "ja", (target, search) -> target.toLowerCase().startsWith(search.toLowerCase()));
		
		
		
	}
	
	
	
	
	
}
