# 📘 Complete Java Notes

This document covers **Java basics to advanced** in a structured format for revision, with concise explanations and examples.


## 🧭 Table of Contents
### Java Basics
- 🔧 Installation
- 🧬 Syntax
- 📦 Variables
- 🔢 Data Types
- ♻️ Java Casting
- ➕ Operators
- 🧵 Strings
- ➗ Java Math
- 🔁 Loops
- 🔘 Switch Block
- 📚 Arrays
- 🛠️ Methods
- 🔙 Return Keyword
- 🔄 Recursion

### 🧱 Object-Oriented Programming (OOP)
- 🧍 Classes & Objects
- 🧰 Constructor
- 🧬 Inheritance
- 🧬 Types of Inheritance
- 🕶️ Abstraction
- 🔌 Interface
- 🔒 Encapsulation
- 🔁 Polymorphism

### ⚠️ Exception Handling
- 🧯 Try-Catch
- 🧹 Finally Block
- 🚨 Throw & Throws

### 📚 Collections Framework
- 📋 List
- 🧺 Set
- 🗺️ Map
- 🔄 Iterating Collections

---


## ✅ 1. Java Basics

### ✅ 1.1 Installation
📘 Setting up Java is the first step to start programming.

**Steps:**
1. Download and install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Set `JAVA_HOME` and add JDK `bin` folder to system `PATH`
3. Use IDEs like **IntelliJ IDEA**, **Eclipse**, or **VS Code**

---

### ✅ 1.2 Syntax
📘 Java code is structured into classes and methods.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
🔹 Java is case-sensitive and requires semicolons at the end of statements.

---

### ✅ 1.3 Variables
📘 Variables are containers to store data values.

```java
int age = 25;
String name = "Alice";
```
🔹 Declared with type, initialized before use.

---

### ✅ 1.4 Data Types
📘 Java has **primitive** and **non-primitive** data types.

| Type      | Description         | Example              |
|-----------|---------------------|----------------------|
| `int`     | Integer              | `int a = 5;`         |
| `double`  | Decimal number       | `double d = 5.6;`    |
| `char`    | Single character     | `char c = 'A';`      |
| `boolean` | True/false           | `boolean b = true;`  |
| `String`  | Text (non-primitive) | `String s = "Hi";`   |

---

### ✅ 1.5 Java Casting
📘 Converting one type to another.

```java
int x = 10;
double y = x; // Implicit casting
int z = (int) y; // Explicit casting
```

---

### ✅ 1.6 Operators
📘 Operators perform operations on variables.

```java
int a = 10 + 5; // Arithmetic
boolean b = (a > 5); // Comparison
```

| Operator Type | Symbols               |
|---------------|------------------------|
| Arithmetic    | `+`, `-`, `*`, `/`     |
| Comparison    | `==`, `!=`, `>`, `<`   |
| Logical       | `&&`, `||`, `!`        |

---

### ✅ 1.7 Strings
📘 Strings are objects that represent sequences of characters.

```java
String name = "Alice";
System.out.println(name.length());
System.out.println(name.toUpperCase());
```

---

### ✅ 1.8 Java Math
📘 Java Math provides utility methods.

```java
System.out.println(Math.max(5, 10));
System.out.println(Math.sqrt(16));
```

---

### ✅ 1.9 Loops
📘 Loops execute a block of code repeatedly.

```java
for (int i = 0; i < 3; i++) {
    System.out.println(i);
}
```

Types:
- `for` loop
- `while` loop
- `do-while` loop

---

### ✅ 1.10 Switch Block
📘 Used to replace multiple `if-else` conditions.

```java
int day = 2;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other");
}
```

---

### ✅ 1.11 Arrays
📘 Arrays store multiple values of the same type.

```java
int[] nums = {1, 2, 3};
System.out.println(nums[0]);
```

---

### ✅ 1.12 Methods (Functions)
📘 Blocks of code for specific tasks.

```java
public int add(int a, int b) {
    return a + b;
}
```

---

### ✅ 1.13 Return Keyword
📘 Used to return a value from a method.

```java
return a + b;
```

---

### ✅ 1.14 Recursion
📘 A method calling itself.

```java
int factorial(int n) {
    if (n == 1) return 1;
    return n * factorial(n - 1);
}
```

---

## ✅ 2. Object-Oriented Programming (OOP)

### ✅ 2.1 Classes & Objects
📘 A class is a blueprint for creating objects.

```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

Person p = new Person("Alice", 25);
p.greet();
```

---

### ✅ 2.2 Constructor
📘 Special method used to initialize objects.

```java
class Car {
    String model;
    Car(String model) {
        this.model = model;
    }
}
```

---

### ✅ 2.3 Inheritance
📘 One class inherits properties and methods from another.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

---

### ✅ 2.4 Types of Inheritance
- Single
- Multilevel
- Hierarchical

Java does not support **multiple inheritance** with classes (only through interfaces).

---

### ✅ 2.5 Abstraction
📘 Hiding complex implementation using abstract classes or interfaces.

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```

---

### ✅ 2.6 Interface
📘 Specifies what a class must do, but not how.

```java
interface Vehicle {
    void move();
}

class Car implements Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}
```

---

### ✅ 2.7 Encapsulation
📘 Binding data with methods using private fields and public getters/setters.

```java
class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

---

### ✅ 2.8 Polymorphism
📘 Ability of object to take many forms (method overloading/overriding).

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

```java
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
```

---

## ✅ 3. Exception Handling

### ✅ 3.1 Try-Catch Block
```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

### ✅ 3.2 Finally Block
```java
finally {
    System.out.println("This block always runs");
}

### ✅ 3.3 Throw & Throws
```java
void checkAge(int age) {
    if (age < 18) {
        throw new ArithmeticException("Underage");
    }
}

void myMethod() throws IOException {
    // may throw an IOException
}
```

---

## ✅ 4. Collections Framework

📘 Java Collections Framework provides classes and interfaces to store and manipulate groups of data.

### ✅ 4.1 List
Ordered, allows duplicates.
```java
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
System.out.println(names.get(0));
```

### ✅ 4.2 Set
Unordered, no duplicates.
```java
Set<String> uniqueNames = new HashSet<>();
uniqueNames.add("Alice");
uniqueNames.add("Alice"); // Ignored
System.out.println(uniqueNames);
```

### ✅ 4.3 Map
Key-value pairs.
```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "Apple");
map.put(2, "Banana");
System.out.println(map.get(1));
```

### ✅ 4.4 Iterating Collections
```java
for (String name : names) {
    System.out.println(name);
}

for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

---

✅ Next: Multithreading, Java 8+ Features, File I/O, Lambda Expressions, Streams API, Functional Interfaces, Generics, Annotations, JDBC

Let me know if you'd like to continue! ✅

