package corejavaassignm.assignment3.stringbufferassmnt;

public class StringConcat {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("It is used to _ at the specified index position");
		StringBuffer addStr = new StringBuffer("insert text");
		
		int indexOfUnderscore = sb.indexOf("_");
		
		if(indexOfUnderscore!=1) {
			sb.replace(indexOfUnderscore, indexOfUnderscore+1, addStr.toString());
		}
		
		System.out.println("Modified String is: "+sb);

	}

}
