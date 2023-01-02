package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
	
static void sorting (int arr []) {
	int n = arr.length;
	int temp=0;
	for (int i=0;i<n-1;i++); 
		int i=0;
		for (int j=0;j<n-i-1;j++) 
			if (arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
}
	public static void main (String[] args) {
		System.out.println("BUBBLE SORTING ALGORITHM");
		int arr[]= {25,40,26,11,33,12,95,100};
		System.out.println("String :" + Arrays.toString(arr));
		sorting(arr);
		
		System.out.println("\nSorted Array : ");
		System.out.println("String :" + Arrays.toString(arr));
	}

}
