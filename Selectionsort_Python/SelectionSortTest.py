import unittest
import SelectionSort

class TestSelectionSort(unittest.TestCase):

    def test_a_normal_array(self):
        array = [3, 2, -5, 1, 0]
        SelectionSort.selectionsort(array)
        self.assertEqual([-5, 0, 1, 2, 3], array)
    def test_an_empty_array(self):
        array = []
        SelectionSort.selectionsort(array)
        self.assertEqual([], array)
    def test_array_with_1_element(self):
        array = [1]
        SelectionSort.selectionsort(array)
        self.assertEqual([1], array)

if __name__ == '__main__':
    unittest.main()
