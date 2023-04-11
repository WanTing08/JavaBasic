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

# Interception

```java
 public String substring(int beginIndex)  
        
 public String substring(int beginIndex, int endIndex)
```

```java
public static void main(String[] args) {
    String s = "wwtnb";
    
    String result1 = s.substring(2); // The intercepted string as a new string, and a new variable is created to receive it.
    System.out.println(result1);
    
    String result2 = s.substring(0, 2); //include the index "1", not include the index "2"
    System.out.println(result2);
}
```

### Example

Enter a cell phone number as a string, masking the middle four digits.
For example: 188****5607

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter phone number: ");
    String s = sc.nextLine();
    
    String res1 = s.substring(0,3);
    String res2 = s.substring(7,11);
    System.out.println("The output number is: " + res1 + "****" + res2);
}
```

# Replacement
```java
public String replace(CharSequence target, CharSequence replacement)
```

# Cutting
```java
public String[] split(String regex) //Cut the current string according to the string passed in as a rule
```

```java
public static void main(String[] args) {
    String s = "192,168,1,1";
    String[] res =  s.split(","); // '.'represent any character, unless enter '//.' 
    for (int i = 0; i < res.length; i++) {
        System.out.println(res[i]);
    }
}
```

# StringBuilder

Improve the efficiency of the string manipulation.

StringBuilder is a character buffer, understand it as a container, this container
can store any data type,  but as soon as it enters the container, all become
strings.

### method

```public StringBuilder append(any type)``` Add data and return the object itself

```public StringBuilder reverse()``` Inverting the contents of the buffer

```public int length()``` return length

```public String toString()``` return the contents of the buffer as String type

The data in StringBuilder, but the method that will be called is not in 
the StringBuilder, but in the String. How to solve this problem?

It can be converted to String and then call it.

```java
String result = sb.toString();
```

### Example
Requirement: Keyboard in a string, the program determines whether the string is a symmetric string and prints yes or no on the console.
Example: 123321, 111

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a string:");
    String s = sc.nextLine();
    
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    
    if(s.equals(sb.toString())){
        System.out.println("yes");
    }else{
        System.out.println("no");
    }
}
```

### Example

Requirement: Define a method that splices the data in the int array into a string in the specified format,
calls the method, and outputs the result in the console.

input: int[] arr = {1,2,3} 
output: [1,2,3]

```java
public static String array2String(int[] arr){
    StringBuilder sb = new StringBuilder("[");
    
    for (int i = 0; i < arr.length - 1; i++) {
        sb.append(arr[i]).append(",");
    }

    sb.append(arr[arr.length - 1]).append("]");

    return sb.toString();
}
```






















































