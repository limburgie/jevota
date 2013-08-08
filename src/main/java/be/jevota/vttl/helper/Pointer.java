package be.jevota.vttl.helper;


public class Pointer {

	private int index = 0;
	private String fileContents;
	
	public Pointer(String fileContents) {
		this.fileContents = fileContents;
	}
	
	public String getNextBetween(String from, String to) {
		String subString = fileContents.substring(index);
		int fromIndex = subString.indexOf(from);
		if(fromIndex == -1) {
			return null;
		}
		int resultIndex = fromIndex + from.length();
		String resultSubString = subString.substring(resultIndex);
		int toIndex = resultIndex + resultSubString.indexOf(to);
		if(toIndex == -1) {
			return null;
		}
		index += toIndex + to.length();
		return subString.substring(resultIndex, toIndex);
	}
	
}
