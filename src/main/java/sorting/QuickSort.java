package sorting;

public class QuickSort {
    public static void quickSort(int[] nums, int i, int j){
        int start = i;
        int end = j;

        if(start > end) return;
        int basement = nums[i];

        while(start != end){
            while(true){
                if(end <= start || nums[end] < basement) break;
                end--;
            }

            while(true){
                if(end <= start || nums[start] > basement) break;
                start++;
            }

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        int temp = nums[i];
        nums[i] = nums[start];
        nums[start] = temp;

        quickSort(nums, 0, start - 1);
        quickSort(nums, start+1, j);
    }


    public static void main(String[] args) {
        int[] nums = {23,1,13,56,3,6,9,90,68,24};
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
