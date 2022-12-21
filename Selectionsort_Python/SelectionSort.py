from typing import List

def selectionsort(array: List[int]):
    """
    Sorting an array inplace in ascending order
    :param array: an input array of integers, can be empty
    :return: None
    """
    for step in range(len(array)):
        minIndex= step

        for i in range(step + 1, len(array)):

            if array[i] < array[minIndex]: # select minimum element for each loop
                minIndex = i

        # put min at the correct position
        temp = array[step]
        array[step] = array[minIndex]
        array[minIndex] = temp