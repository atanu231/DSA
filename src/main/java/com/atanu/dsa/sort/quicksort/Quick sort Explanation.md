# Quick sort Explanation

It is the fastest sorting algorithm among all of the other sorting algorithms. it's technique based on pivot element (the element which is fixed and will be compared with the other elements. ) and partitioning concept. Partitioning means partition of the Array into different sub arrays.Sub Array can be further divided into other sub arrays and sorting technique will be applied on the sub arrays. That is why Quick sort is known as ***Divide And Conquer*** technique. 

Quick sort algorithm description as follows:
|Index|0  | 1 | 2 |3  | 4 |  5|6 | 7|8  | 9 |
|--|--|--|--|--|--|--|--|--|--|--|
Elements|12  | 13 | 2 | 5 | 1 | 8 |  15| 16 |4  |3
We are going to sort the above array by using Quick sort technique. For that we need to take two variable just like cursor **start, end and pivot**. We are considering pivot element as the first element.

In this case pivot element is 12 (the 1st element). *Lower* means lowest index and *upper* means highest index of the array or sub array. Initially **start**  is pointing to the lower. **end** is pointing to the upper.

    int pivot = array[lower];
    int start = lower ;
	int end = upper;
the idea to divide the array into sub array by keeping all elements(Less than pivot element) on the left side of the pivot and elements(greater than pivot) will be on the right side of the pivot.
so, until the last element found which is less than the pivot we will increment the **start** value. Also to check start is less than upper. 

    while (array[start] <= pivot && start<upper) {
				start++;
		}
And, until the last element found which is greater than the pivot we will decrement the **end** value. Also to check end is greater than lower.

    while (array[end] > pivot && end>lower) {
				end--;
			}
Once start is incremented & end is decremented if start is still less than end then swap

    if (start < end) {
				swap(array, start, end);
			}

if start is greater than end, then swap with the pivot element. Here *Lower* represents the pivot element index.

    swap(array, end, lower);

			
**visualization:
First check**
||start| end |    
|--|--|--|
1st| 0 | 9 |
2nd| 1 | 9 |
[12 3 2 5 1 8 15 16 4 13]
**second check**
||start| end |
|--|--|--|
 1st|6 | 8 |
[12 3 2 5 1 8 4 16 15 13 ]

**Third check**
||start| end |
|--|--|--|
 1st|6 | 8 |
[12 3 2 5 1 8 4 16 15 13 ]

and so on..

Finally once Array is divided into sub array and recursively call the same partition of quicksort().

    private static void quickSort(int[] arrayToSort, int lower, int upper) {
		if (lower < upper) {
			int pivotindex = partition(arrayToSort, lower, upper);
			quickSort(arrayToSort, lower, pivotindex - 1);
			quickSort(arrayToSort, pivotindex + 1, upper);
		}
	}
Refer the code base to get the source code.
