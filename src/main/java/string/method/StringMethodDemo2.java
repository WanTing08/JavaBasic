package string.method;

/*
    Methods used by String class to traverse:

        public char[] toCharArray()   convert the string to a new  character array

        public char charAt(int index)   return the value of char at the specified index

 */
public class StringMethodDemo2 {
    public static void main(String[] args) {


    }

    private static void print2() {
        String s = "wwtnb";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }


    private static void print1() {
        String s = "wwtnb";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}

