package string.method;

public class StringMethodDemo3 {

    /*
        public String substring(int beginIndex)

        public String substring(int beginIndex, int endIndex)

        The intercepted string as a new string, and a new variable is created to receive it.
     */

    public static void main(String[] args) {
        String s = "wwtnb";
        String result1 = s.substring(2);
        System.out.println(result1);

        String result2 = s.substring(0, 2);
        System.out.println(result2);
    }
}
