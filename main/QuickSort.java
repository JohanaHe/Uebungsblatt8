import java.util.Arrays;

public class QuickSort {

	static void quicksort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int pivot = partition(arr, begin, end);

	        quicksort(arr, begin, pivot-1);
	        quicksort(arr, pivot+1, end);
	    }
	}
	
	static int partition(int arr[], int begin, int end) {
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
		
		int[] arr = {2};
		quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	
		
	}

}
