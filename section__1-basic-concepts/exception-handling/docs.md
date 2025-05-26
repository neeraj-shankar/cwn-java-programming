# Exception handling in Java
---

## Exception Handling Key Concepts

### 🔹 What is Exception Handling?

In Java, **exceptions** are events that disrupt the normal flow of a program. Exception handling helps you **gracefully handle errors** without crashing your application.

---

### 🔹 Types of Exceptions

1. **Checked Exceptions**
   - Handled at **compile time**.
   - Examples: `IOException`, `SQLException`
   - Must be either caught or declared to be thrown.

2. **Unchecked Exceptions**
   - Handled at **runtime**.
   - Examples: `NullPointerException`, `ArithmeticException`
   - Extend from `RuntimeException`.

3. **Errors**
   - Serious issues like `OutOfMemoryError`, not meant to be caught.
   - Extend from `Error`, not `Exception`.

---

### 🔹 Syntax

```java
try {
    // Code that might throw an exception
} catch (ExceptionType name) {
    // Handling the exception
} finally {
    // Optional: Code that always executes (cleanup)
}
```

---

### 🔹 Example

```java
public class Example {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
```

---

### 🔹 Key Concepts to Learn

- `try-catch-finally`
- Multiple catch blocks
- Nested try-catch
- `throw` keyword (used to throw an exception)
- `throws` keyword (used to declare an exception)
- Custom Exceptions (creating your own exception class)

---

### Flow of try-catch-finally
```java
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e);
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
```

#### Output
Caught an exception: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
This block will always execute.

#### Key Points

1. The code inside try is monitored for exceptions.
2. If an exception occurs, control goes to the matching catch block.
3. The finally block executes no matter what, whether an exception occurred or not (even if there's a return inside the try/catch).

### Exception Hierarchy (Simplified)

```java
Object
 └── Throwable
      ├── Error               // Not usually handled
      └── Exception
           ├── IOException   // Checked
           ├── SQLException  // Checked
           └── RuntimeException
                ├── ArithmeticException
                ├── NullPointerException
                ├── ArrayIndexOutOfBoundsException
```

#### Example: Multiple Catch in Action

```java
public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] nums = new int[3];
            int result = 10 / 0;         // This throws ArithmeticException
            System.out.println(nums[5]); // Won't be reached
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } catch (Exception e) {
            System.out.println("Some other exception: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

// Output
// Cannot divide by zero: java.lang.ArithmeticException: / by zero
// Finally block executed.

```

#### If You Do This, It Won’t Compile:
```java
try {
    // risky code
} catch (Exception e) {
    // general catch
} catch (ArithmeticException e) {
    // ❌ compile-time error: unreachable catch block
}

/*
 * Because Exception is a parent of ArithmeticException, it catches everything including it—so the child will never be reached.
*/
```

### throw vs throws — Key Differences

#### 🔹 `throw` Keyword

Used to **manually throw an exception** in your code.

#### 🔸 Syntax:
```java
throw new ExceptionType("Error message");
```

#### 🔸 Example:
```java
public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }
}
```

#### 🧠 Output:
```
Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote
```

---

### 🔹 `throws` Keyword

Used in method **declaration** to indicate that the method might throw one or more **checked exceptions**, and it’s the caller’s responsibility to handle them.

#### 🔸 Syntax:
```java
returnType methodName() throws ExceptionType {
    // method body
}
```

#### 🔸 Example:
```java
import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("non_existing_file.txt");
        file.read();
        file.close();
    }
}
```

#### 🧠 Output:
```
Exception in thread "main" java.io.FileNotFoundException: non_existing_file.txt (No such file or directory)
```

---

### 🔍 `throw` vs `throws` — Key Differences

| Feature        | `throw`                            | `throws`                               |
|----------------|------------------------------------|----------------------------------------|
| Purpose        | To **actually throw** an exception | To **declare** a potential exception   |
| Position       | Inside method body                 | In method signature                    |
| Type           | Used with instance of Throwable    | Used with exception class names        |
| Example usage  | `throw new NullPointerException()` | `void method() throws IOException`     |

---

