package corejavaassignm.assignment3.stringbuilderassmnt;

public class StringConcat {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("It is used to _ at the specified index position");
		StringBuilder addStr = new StringBuilder("insert text");
		
		int indexOfUnderscore = sb.indexOf("_");
		
		if(indexOfUnderscore!=1) {
			sb.replace(indexOfUnderscore, indexOfUnderscore+1, addStr.toString());
		}
		
		System.out.println("Modified String is: "+sb);

	}

}
