### 1. What's the difference between JDK, JRE, JVM

JDK is used for developing java applications.

JRE is used for running java applications.

JVM is the running environment that executes java bytecode.

### 2. The relation between hashCode() and equals()

If the two objects are equal, they should have the same hashCode.

The 'equals()' method is used to determine whether the two objects are 
equal or not based on their content.

Therefore, when implementing the 'equals()' method for a class, it is 
important to also implement 'hashCode()' method, as they work together 
can ensure the proper object comparison.

### 3. String, StringBuffer, StringBuilder
String is an immutable class, but StringBuffer and StringBuilder are mutable classes that allow you to modify the contents of string without create a new object.


StringBuffer is thread-safe, StringBuilder is thread-insecure. So the StringBuilder is more efficient in a single-threaded environment.

### 4. The difference between _**"=="**_ and **_"equals()"_**

"==" is used to compare the memory address of two objects.

"equals()" is used to compare the content or value of two objects.

### 5. The difference between Overloading and Overriding


### 6. The difference between List and Set

List is ordered and allow duplicates, while Set is unordered and do not allow duplicates.

List is based-on index and support operations like get, set and sort, while set support
operations like add, remove and contains.

### 7. The difference between ArrayList and LinkedList

First, the underlying data structure is different: ArrayList is based on 
array implementation, while LinkedList based on linked list.


ArrayLists allow for fast access of elements by index，while LinkedLists allow for fast insertion or removal of elements at the beginning or end of the List.


Both of them implement List interface, but LinkedList additional implements
Deque interface, so it also can be used as a queue.

### 8. 








