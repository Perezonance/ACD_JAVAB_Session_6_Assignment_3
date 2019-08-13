package assignment_3;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1 , 2 , 3, 4, 5, 6};
		BinaryAlg(arr, 4);
	}
	
	public static void BinaryAlg(int[] arr, int n){
		int index = 0;
		boolean found = false;
		for (int i : arr) {
			if(i == n){
				index = i - 1;
				found = true;
			}
		}
		if(found)
			System.out.println("Element " + n + " found at index " + index + "!");
		else
			System.out.println("Element not found!");
	}
}
