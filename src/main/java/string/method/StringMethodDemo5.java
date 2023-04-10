package string.method;

public class StringMethodDemo5 {

    /*
        String 类的切割方法

            public String[] split(String regex) : 根据传入的字符串作为规则，切割当前字符串
     */
    public static void main(String[] args) {
        String s = "192,168,1,1";
        String[] res =  s.split(",");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
