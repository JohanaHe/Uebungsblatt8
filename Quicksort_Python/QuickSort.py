from typing import List

def partition(array: List[int], low: int, high: int) -> int:
  """
  finds the partition position
  :param array: an input array of integers, can be empty
  :param low: smallest index in array to be sorted
  :param high: highest index in array to be sorted
  :return: position from where partition is done
  """
  pivot = array[high] # the rightmost element as pivot

  i = low - 1

  for j in range(low, high): # compare each element with pivot
    if array[j] <= pivot:
      i = i + 1

      temp1 = array[j]
      array[j] = array[i]
      array[i] = temp1

  temp2 = array[high]
  array[high] = array[i+1]
  array[i+1] = temp2

  return i + 1

# function to perform quicksort
def quicksort(array, low, high):
  """
  Sorting an array inplace in ascending order with quicksort
  :param array: an input array of integers, can be empty
  :param low: smallest index in array to be sorted
  :param high: highest index in array to be sorted
  :return: None
  """
  if low < high:
    pivot = partition(array, low, high) # pivot such that smaller elements are left and greater elements are right
    quicksort(array, low, pivot - 1) # recursive call on the left of pivot
    quicksort(array, pivot + 1, high) # recursive call on the right of pivot

