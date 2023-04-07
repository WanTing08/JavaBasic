public class ArrayDemo {
    public static void main(String[] args) {
        printArray();
        getSum();
        maxNum();
    }

    public static void printArray(){}

    public static void getSum(){
        int[] arr = {11, 22, 33, 44, 55};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("偶数和为：" + sum);
    }

    public static void maxNum(){
        int[] arr = {5, 44, 56, 34, 23};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max );
    }



}
