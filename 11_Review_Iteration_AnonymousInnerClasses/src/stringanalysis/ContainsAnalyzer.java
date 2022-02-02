package stringanalysis;

public class ContainsAnalyzer implements StringAnalyzer{

	@Override
	public boolean analyze(String target, String searchStr) {
		if(target.toLowerCase().contains(searchStr.toLowerCase())) {
			return true;
		}
		return false;
	}

}
