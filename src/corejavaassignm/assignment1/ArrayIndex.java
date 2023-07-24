package corejavaassignm.assignment1;

public class ArrayIndex {

	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int findNum = 191;
		
		boolean bool = false;
		for(int i : arr) {
			if(findNum == i) {
				bool = true;
			}
		}

		System.out.println("Number present is "+bool);
	}

}
