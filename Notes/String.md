# String

```java
public static void main(String[] args){
    String s1 = "abc";
    String s2 = new String("abc");
    
    System.out.println(s1 == s2); //return false
        }
```

```java
public static void main(String[] args){
    String s1 = "abd";
    String s2 = "ab";
    String s3 = s2 + "c";  
    
    System.out.println(s1 == s3); //return false
}
```

```java
public static void main(String[] args){
    String s1 = "abc";
    String s2 = "a" + "b" + "c"; //constant optimization mechanism
    
    System.out.println(s1 == s2); //return true
}
```

## Comparison

```java
public boolean equals(Object anObject)   //compare the string with the specified object

public boolean equalsIgnoreCase(String anotherString) //Compare the String with another String, regardless of case
```

```java
public static void main(String[] args) {
    String s1 = "abc";
    String s2 = new String("abc");

    System.out.println(s1 == s2); //false
        
    System.out.println(s1.equals(s2)); //true

    System.out.println("----------------------------");

    String ss1 = "abc";
    String ss2 = "ABC";

    System.out.println(ss1.equals(s2)); //false
    System.out.println(ss1.equalsIgnoreCase(s2)); //true
    }
```

## Traverse
```java
public char[] toCharArray()  //convert the string to a new  character array
```

```java
public static void main(String[]args){
    String s = "wwtnb";
    char[] chars = s.toCharArray();
    System.out.println(chars[i]);
}
```

---

```java
public char charAt(int index)   //return the value of char at the specified index
```

```java
private static void print2() {
    String s = "wwtnb";
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        System.out.println(c);
    }
}
```

### Example

Enter a string and count the number of occurrences of uppercase alphabetic
characters, lowercase alphabetic characters and numeric characters in that 
string.

```java
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter: ");
    String s = sc.nextLine();
    
    int lowerCount = 0, upperCount = 0, numericCount = 0;
    char[] c = s.toCharArray();
    for(int i = 0; i < c.length; i++){
        if(c[i] >= 'a' && c[i] <= 'z') lowerCount++;
        if(c[i] >= 'A' && c[i] <= 'Z') upperCount++;
        if(c[i] >= '0' && c[i] <= '9') numericCount++;
    }
    System.out.println("the count of lowercase character: " + lowerCount);
    System.out.println("the count of uppercase character: " + upperCount);
    System.out.println("the count of numeric character: " + numericCount);
}
```

























