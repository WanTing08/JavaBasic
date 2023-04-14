# Collection

Collection just like a container, storing data, like array, but the length of 
an array is fixed. 

## ArrayList

```public ArrayList()``` create an empty collection container

### Traverse

```java
public static void main(String[] args) {
    
    ArrayList<String> list = new ArrayList<>();
    list.add("minji");
    list.add("daniel");
    list.add("haeren");
    
    for (int i = 0; i < list.size(); i++) {
        String s = list.get(i);
        System.out.println(s);
    }
}
```

### Example - Student Management

### add 

```java
public static void addStudent(ArrayList<Student> list){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("please enter the student name: ");
    String name = sc.next();
    
    System.out.println("Please enter the student age: ");
    int age = sc.nextInt();
    Student stu = new Student(name, age);
    
    list.add(stu);
}
    
pubic static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    
    for (int i = 1; i < list.size(); i++) {
        System.out.println("Please enter the " + i +"-th student information");
        addStudent(list);
    }
    
    for (int i = 0; i < list.size(); i++) {
        Student stu = list.get(i);
        System.out.println(stu.getName() + stu.getAge());
    }
}
```

### remove

```java
public static void main(String[] args) {
    
    ArrayList<String> list = new ArrayList<>();
    list.add("wwt");
    list.add("test");
    list.add("test");
    list.add("eric");
    list.add("test");
    
    for (int i = list.size() -1; i >= 0; i--) {
        String s = list.get(i);
        if("test".equals(s)){
            list.remove(i);
        }
    }
    System.out.println(list);
}
```

### screening







