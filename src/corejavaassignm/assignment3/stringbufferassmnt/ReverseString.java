package corejavaassignm.assignment3.stringbufferassmnt;

public class ReverseString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This method returns the reversed object on which it was called");
		
		System.out.println("Initial string is "+sb);
		System.out.println("Reverse of string is "+sb.reverse());

	}

}
