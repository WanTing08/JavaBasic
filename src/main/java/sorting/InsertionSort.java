package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertion(int[] arr){
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }

        for(int i = startIndex; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,44,38,1,78,45,98,46,7,14};
        int[] res = insertion(arr);
        System.out.println(Arrays.toString(res));
    }
}
