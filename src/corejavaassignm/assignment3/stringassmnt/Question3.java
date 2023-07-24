package corejavaassignm.assignment3.stringassmnt;

public class Question3 {

	public static void main(String[] args) {
		String s = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println("In lowercase "+s.toLowerCase());
		
		System.out.println("In uppercase "+s.toUpperCase());
		
		System.out.println("Replace a with $ sign");
		System.out.println(s.replace('a', '$'));
		
		System.out.println("Whether it contains the word");
		System.out.println(s.compareToIgnoreCase("collection")>0?true:false);

		System.out.println("String matches another string");
		String matchString = "java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(s.equals(matchString));
		
		System.out.println("Other method to match string with another string");
		System.out.println(s.equalsIgnoreCase(matchString));
	}

}
