package OOP;

/**
1.创建对象的格式
     类名 对象名 = new 类名();

2. 使用对象成员变量的格式
     对象名.成员变量;

3. 使用对象成员方法的格式
     对象名.成员方法();

-----------------------------------------------------------------

 tips:

 1. 打印对象名， 可以看到对象的内存地址

 2. 成员变量就算没有赋值，也可以直接使用，使用的是对象的默认值

*/

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1.name);
        System.out.println(stu1.age);

        stu1.eat();
        stu1.study();


    }
}
