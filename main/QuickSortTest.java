import static org.junit.Assert.*;

class QuickSortTest {

	public void test_a_normal_array() {
		int[] array = {3, 2, -5, 1, 0};
		int[] sortedArr = {-5, 0, 1, 2, 3};
		QuickSort.quicksort(array, 0, array.length-1);
		assertArrayEquals(sortedArr, array);
	}
	
	public void test_an_empty_array() {
		int[] array = {};
		int[] sortedArr = {};
		QuickSort.quicksort(array, 0, array.length-1);
		assertArrayEquals(sortedArr, array);
	}
	
	public void test_array_with_1_element() {
		int[] array = {2};
		int[] sortedArr = {2};
		QuickSort.quicksort(array, 0, array.length-1);
		assertArrayEquals(sortedArr, array);
	}
}
