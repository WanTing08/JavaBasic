public class MethodsDemo {
    /**
    public static void maxNum(){
       int num1 = 10;
       int num2 = 20;

       int max = num1 > num2 ? num1 : num2;
       System.out.println(max);

    }

    public static void main(String[] args) {
        maxNum();
    }
     */


    public static void main(String[] args) {
        maxNum(10, 20);
    }

    public static void maxNum(int num1, int num2){
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
