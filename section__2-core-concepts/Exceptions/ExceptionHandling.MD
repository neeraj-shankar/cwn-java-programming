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
