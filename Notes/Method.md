# Methods

## Introduction

**method**: A block of code with independent functionality that is not executed
unless it is called.

- You can take bloated code that is crammed together and manage it in categories by function.

- Can improve code reusability.


## Definition

```java
public static void MethodName(){
    //...
}
```

### tips

- Methods are related to each other at a level, and nested definitions are not allowed.

- Method is not executed unless it is called.

```java
public static void maxNum(){
       int num1 = 10;
       int num2 = 20;

       int max = num1 > num2 ? num1 : num2;
       
       System.out.println(max);
    }

    public static void main(String[] args) {
        maxNum(); // call the method
    }
```

## Methods with Parameters

```java
public static void methodName(data type, variable name){
    //
}
```

```java
public static void main(String[] args) {
        maxNum(10, 20);
    }

    public static void maxNum(int num1, int num2){
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
```



