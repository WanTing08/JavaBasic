# Bubble Sort

Bubble sort repeatedly steps through a list of items to be sorted, compares adjacent elements and swaps them if they are in the wrong order. 

```java
public int[] bubble(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - 1 - i; j++){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}
```

# Selection Sort

Selection sort is an algorithm that works by repeatedly finding the minimum element from the unsorted part of an array and putting it at the beginning of the array.

```java
public int[] selection(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n - 1; i++){
        for(int j = i + 1; j < n; j++){
            if(arr[i] > arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
}
```

# Insertion Sort
Insertion sort is a sorting algorithm that builds the final sorted array (or list) one item at a time.  It performs well on small lists or partially sorted lists.

The algorithm works as follows:

1. Iterate through the array from the second element to the last element.
2. For each element, compare it with the previous elements in the array from right to left.
3. If the previous element is greater than the current element, swap them.
4. Repeat step 3 until the previous element is not greater than the current element, or until the beginning of the array is reached.
5. Continue the iteration until the end of the array is reached.

```java
public int[] insertion(int[] arr){
    int startIndex = -1;
    
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > arr[i + 1]){
            startIndex = i + 1;
            break;
        }
    }
    
    for(int i = 0; i < arr.length; i++){
        int j = i;
        while(j > 0 && arr[j] < arr[j - 1]){
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j++;
        }
    }
    return arr;
}
```

# Quick Sort

Quick sort is a popular and efficient sorting algorithm that works by
dividing an array into two smaller sub-arrays, one with elements less 
than a chosen pivot element, and the other with elements greater than 
the pivot element. This process is repeated **recursively** on each 
sub-array until the sub-arrays are small enough to be sorted using a 
simple algorithm, such as insertion sort.

```java

```





