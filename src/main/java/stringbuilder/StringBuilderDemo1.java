package stringbuilder;

public class StringBuilderDemo1 {

    /*
        StringBuilder介绍：
            1.一个可变的字符序列

            2.StringBuilder是字符缓冲区，将其理解成容器，这个容器可以存储任意数据类型，但是只要进入到这个容器，全部变成字符串
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(100);
        sb.append(45.5);
        sb.append(false);
        sb.append('中');

        System.out.println(sb);
    }
}
