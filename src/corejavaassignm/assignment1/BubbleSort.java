package corejavaassignm.assignment1;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Before sorting :");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("After sorting :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
