package submission;

import java.util.Arrays;

public class Quicksort {

	static void sort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int splitIndex = split(arr, begin, end);

	        sort(arr, begin, splitIndex-1);
	        sort(arr, splitIndex+1, end);
	    }
	}
	
	static int split(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            swap(arr, i, j);
	        }
	    }

	    swap(arr, i+1, end);

	    return i+1;
	}
	
	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 3, 6, 4, 2};
		sort(arr, 0, 5);
		System.out.println(Arrays.toString(arr));
	
		
	}

}

