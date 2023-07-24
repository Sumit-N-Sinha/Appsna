package corejavaassignm.assignment3.stringbuilderassmnt;

public class StringBuilderAssign {

	public static void main(String[] args) {
		String str[] = new String[4];
		str[0] = "StringBuffer";
		str[1] = "is a peer class of String";
		str[2] = "that provides much of";
		str[3] = "the functionality of strings";
		
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			sb.append(s);
			sb.append(" ");
		}
		
		System.out.println("After appending in stringbuffer "+sb);
		
	}

}
