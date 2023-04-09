package constructor;
/**
 * 构造方法： 创建对象的时候，要执行的方法
 *
 * 格式：
 *      1. 方法名与类名相同， 大小写也要一致
 *      2. 没有返回值类型，连void都没有
 *      3. 没有具体的返回值
 *
 * 构造方法的作用：
 *              1. 本质的作用：创建对象
 *              2. 结合执行时机：可以创建对象的时候，给对象中的数据初始化
 *
 * Tips:
 *       1.一个类中， 没有编写构造方法， 系统将会提供一个默认的、无参数的构造方法
 *       2.一个类中，如果手动编写了构造方法，系统将不会再提供那个默认的无参构造了
 *       3.构造方法不允许手动调用
 *
 * */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("Lucy", 23);
        System.out.println(stu1.name + stu1.age);
    }
}
