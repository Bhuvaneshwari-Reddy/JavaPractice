Here are concise notes on **Java Basic Concepts** to help you understand the key features and fundamentals of Java:

---

### 1. **Java Overview**
   - **Object-Oriented Language**: Java is based on OOP principles (Encapsulation, Inheritance, Polymorphism, and Abstraction).
   - **Platform Independent**: Java code is compiled into bytecode, which can run on any system with a Java Virtual Machine (JVM).
   - **Syntax**: Java uses a C-style syntax, which is easy to learn for developers familiar with C, C++, or similar languages.

---

### 2. **Java Structure**
   - **Class**: A template for creating objects (instances). Every Java application has at least one class with a `main` method.
   - **Method**: A block of code that performs a specific task. The `main` method is the entry point of any Java application.
   - **Object**: An instance of a class.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

### 3. **Variables and Data Types**
   - **Primitive Data Types**: These are the most basic types of data (e.g., `int`, `char`, `boolean`, `double`, etc.)
     - `int`: Integer numbers (e.g., 10, -5)
     - `char`: Single character (e.g., 'A', '1')
     - `boolean`: True or false values
     - `double`: Decimal numbers (e.g., 3.14, -0.01)
     - `float`: Single precision floating-point numbers
   - **Non-Primitive (Reference) Data Types**: These store references to objects (e.g., arrays, classes, etc.)
     - Example: `String`, `ArrayList`, `Custom Class`

```java
int age = 25;
double price = 19.99;
char letter = 'A';
boolean isJavaFun = true;
```

---

### 4. **Control Flow Statements**
   - **If-Else**: Executes a block of code based on a condition.
   ```java
   if (age >= 18) {
       System.out.println("Adult");
   } else {
       System.out.println("Minor");
   }
   ```
   - **Switch**: Evaluates a variable against multiple values and executes a block of code depending on the value.
   ```java
   switch (day) {
       case 1: System.out.println("Monday"); break;
       case 2: System.out.println("Tuesday"); break;
       default: System.out.println("Invalid day");
   }
   ```
   - **For Loop**: Repeats a block of code a specified number of times.
   ```java
   for (int i = 0; i < 5; i++) {
       System.out.println(i);
   }
   ```
   - **While Loop**: Repeats a block of code while a condition is true.
   ```java
   int i = 0;
   while (i < 5) {
       System.out.println(i);
       i++;
   }
   ```

---

### 5. **Arrays**
   - Arrays are used to store multiple values in a single variable.
   ```java
   int[] numbers = {1, 2, 3, 4, 5};
   System.out.println(numbers[2]); // Outputs: 3
   ```

---

### 6. **Methods**
   - Methods define blocks of code that perform specific tasks.
   - Methods can have parameters and return values.
   ```java
   public static void greet(String name) {
       System.out.println("Hello, " + name);
   }
   greet("Alice");
   ```

---

### 7. **Object-Oriented Programming Concepts**
   - **Encapsulation**: Wrapping data (variables) and code (methods) into a single unit (class).
   - **Inheritance**: Allows one class to inherit fields and methods from another.
   - **Polymorphism**: Enables objects to be treated as instances of their parent class.
   - **Abstraction**: Hides the complex implementation details and exposes only the necessary parts of the code.

   Example of Inheritance:
   ```java
   class Animal {
       void sound() {
           System.out.println("Some sound");
       }
   }

   class Dog extends Animal {
       void sound() {
           System.out.println("Bark");
       }
   }
   ```

---

### 8. **Access Modifiers**
   - **Public**: Accessible from anywhere.
   - **Private**: Accessible only within the same class.
   - **Protected**: Accessible within the same package or subclasses.
   - **Default** (Package-Private): Accessible only within the same package.

---

### 9. **Exception Handling**
   - Java provides a mechanism to handle runtime errors through `try`, `catch`, and `finally` blocks.
   ```java
   try {
       int result = 10 / 0; // This will cause an ArithmeticException
   } catch (ArithmeticException e) {
       System.out.println("Cannot divide by zero.");
   } finally {
       System.out.println("This block always executes.");
   }
   ```

---

### 10. **String Handling**
   - Strings are immutable objects.
   - Common methods include `.length()`, `.charAt()`, `.substring()`, `.toUpperCase()`, `.toLowerCase()`, etc.
   ```java
   String greeting = "Hello";
   String name = "Alice";
   String message = greeting + " " + name;
   System.out.println(message);  // Outputs: Hello Alice
   ```

---

### 11. **Java Collections Framework**
   - Provides classes to store and manipulate groups of data.
   - Common interfaces: `List`, `Set`, `Map`.
   - **ArrayList**: A resizable array implementation of the `List` interface.
   - **HashMap**: A hash table-based implementation of the `Map` interface.

   Example of `ArrayList`:
   ```java
   import java.util.ArrayList;

   public class Main {
       public static void main(String[] args) {
           ArrayList<String> list = new ArrayList<>();
           list.add("Apple");
           list.add("Banana");
           System.out.println(list); // Outputs: [Apple, Banana]
       }
   }
   ```

---

### 12. **Input/Output (I/O)**
   - Java provides classes like `Scanner` (for input) and `FileReader`/`FileWriter` (for file I/O).
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter your name: ");
           String name = scanner.nextLine();
           System.out.println("Hello, " + name);
       }
   }
   ```

---

### 13. **Java Keywords**
   Java has reserved keywords that have special meaning and cannot be used as identifiers (e.g., `int`, `class`, `if`, `while`).

---

### 14. **Basic Java Development Process**
   1. Write your code in a `.java` file.
   2. Compile it using `javac` to generate a `.class` file (bytecode).
   3. Run the bytecode on the JVM using `java`.

---

These notes cover the most essential Java concepts. As you dive deeper into Java, you'll explore more advanced topics like multithreading, networking, and Java frameworks.
