package test;

/*
    Requirement: Define a method that splices the data in the int array into a string in the specified format,
                 calls the method, and outputs the result in the console.

                 input: int[] arr = {1,2,3}
                 output: [1,2,3]
 */
public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        String res = array2String(arr);
        System.out.println(res);
    }

    public static String array2String(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(",");
        }

        sb.append(arr[arr.length - 1]).append("]");

        return sb.toString();
    }
}
