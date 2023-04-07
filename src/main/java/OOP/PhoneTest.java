package OOP;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Apple";
        phone1.color = "black";
        phone1.price = 999;

        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);

        phone1.call();
        phone1.sendMessage();
    }
}
