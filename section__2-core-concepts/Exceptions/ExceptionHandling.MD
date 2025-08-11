# Exception Handling 

## Overview
An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.

## Types of Exceptions

### Checked Exceptions (Compile-time)
- Handled explicitly using try-catch or throws.

#### Examples: 
- IOException
- SQLException
- FileNotFoundException

### Unchecked Exceptions (Runtime)
- Occur during runtime and can be avoided with better code logic.

#### Examples
- NullPointerException
- ArrayIndexOutOfBoundsException
- ArithmeticException

### Errors (Not Exceptions)
- Serious issues that shouldn’t be caught (e.g., JVM crashes).

#### Examples
- OutOfMemoryError
- StackOverflowError

## Exception idea
| Block     | Purpose                                    |
| --------- | ------------------------------------------ |
| `try`     | Code that may throw exception              |
| `catch`   | Handles specific exception types           |
| `finally` | Always executed (e.g., to close resources) |

## Java Exception Types - Summary Table
| **Category**           | **Exception Type**               | **Description**                                          | **Example**                         |
| ---------------------- | -------------------------------- | -------------------------------------------------------- | ----------------------------------- |
| ✅ Checked Exception    | `IOException`                    | Occurs during I/O operations (e.g., file not found)      | FileReader, InputStream             |
| ✅ Checked Exception    | `SQLException`                   | Related to database operations                           | JDBC connection                     |
| ✅ Checked Exception    | `ClassNotFoundException`         | Class not found at runtime (reflection/dynamic loading)  | `Class.forName("com.MyClass")`      |
| ✅ Checked Exception    | `FileNotFoundException`          | File doesn't exist                                       | new FileReader("abc.txt")           |
| ✅ Checked Exception    | `ParseException`                 | Parsing errors in dates or formats                       | `SimpleDateFormat.parse(...)`       |
| ✅ Checked Exception    | `InterruptedException`           | Thread is interrupted during sleep/wait                  | `Thread.sleep()`                    |
| 🔶 Unchecked Exception | `NullPointerException`           | Accessing a method/field on a null reference             | `obj.toString()` if `obj == null`   |
| 🔶 Unchecked Exception | `ArithmeticException`            | Arithmetic error (e.g., divide by zero)                  | `10 / 0`                            |
| 🔶 Unchecked Exception | `ArrayIndexOutOfBoundsException` | Accessing invalid array index                            | `arr[10]` when size is 5            |
| 🔶 Unchecked Exception | `NumberFormatException`          | String cannot be parsed into a number                    | `Integer.parseInt("abc")`           |
| 🔶 Unchecked Exception | `IllegalArgumentException`       | Invalid argument passed to method                        | `Thread.setPriority(100)`           |
| 🔶 Unchecked Exception | `IllegalStateException`          | Object is in an inappropriate state                      | `Iterator.remove()` before `next()` |
| 🔶 Unchecked Exception | `ClassCastException`             | Invalid type casting                                     | `Object o = "abc"; (Integer)o`      |
| ❌ Error                | `OutOfMemoryError`               | JVM runs out of memory                                   | Large array or infinite loop        |
| ❌ Error                | `StackOverflowError`             | Infinite recursive call stack                            | Infinite recursion                  |
| ❌ Error                | `NoClassDefFoundError`           | Class was present at compile time but missing at runtime | Missing class on classpath          |
| ❌ Error                | `AssertionError`                 | Fails a program assertion (from `assert` keyword)        | `assert x > 0;` when x is -1        |

## Exception Handling Insights

### A Multi Catch Block
- A multi-catch block allows you to catch multiple exception types in a single catch block,  using the | (pipe) separator.
- Reduces code duplication when different exceptions need the same handling.
- caught exception must not have a common parent-child relationship (other than Exception or Throwable).
```java
catch (IOException | SQLException e) // Valid
catch (Exception | IOException e) // ❌ Compile-time error — IOException is a subclass of Exception
```

- In multi-catch, the exception variable e is implicitly final, so you cannot reassign it inside the block.
```java
catch (IOException | SQLException e) {
    // e = new IOException(); ❌ Not allowed
}
```
### try-with-resources
- try-with-resources is a feature introduced in Java 7 that automatically closes resources (like files or streams) after they are used — even if an exception occurs.
- The resource must implement the AutoCloseable interface (or its subtype, Closeable).

- You can declare multiple resources in a single try statement by separating them with semicolons:
```java
try (
    BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
) {
    String line = reader.readLine();
    writer.write(line);
}
```
- Note: Java closes resources in the reverse order of their creation (just like a stack). The last resource declared is closed first.

#### Summary Table
| Feature                     | Behavior                               |
| --------------------------- | -------------------------------------- |
| Multiple resources allowed? | ✅ Yes, separated by semicolons         |
| Order of closing            | 🔁 LIFO (reverse of declaration)       |
| Exception in one `close()`? | Still tries to close others            |
| Suppressed exceptions?      | Yes, retrievable via `getSuppressed()` |




