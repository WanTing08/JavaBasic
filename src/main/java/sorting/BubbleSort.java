package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,7,3};
        int[] res = bubble(arr);
        System.out.println(Arrays.toString(res));
    }
}
