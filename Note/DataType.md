## Forced conversion

Assign a value or variable with a large range of values to another variable
with a small range of values. 

Direct asignment is not allowed and a forced conversion needs to be added.

```java
public class test{
    public static void main(String[] args) {
        double a = 12.3;
        int b = (int) a;
        System.out.println(b);
    }
}
```


