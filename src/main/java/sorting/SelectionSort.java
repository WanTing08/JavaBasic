package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selection(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,7,11,32,3,4};
        int[] res = selection(arr);
        System.out.println(Arrays.toString(res));
    }
}
