package stringanalysis;

public class StartsWithAnalayzer implements StringAnalyzer{

	@Override
	public boolean analyze(String target, String searchStr) {
		if(target.toLowerCase().startsWith(searchStr.toLowerCase())) {
			return true;
		}
		return false;
	}

}
