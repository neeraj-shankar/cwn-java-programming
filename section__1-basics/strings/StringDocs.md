# Strings, StringBuilder and StringBuffer in Java Programming

## Strings

### **1. Overview of String in Java**

- Strings in Java are **immutable**. Once created, they cannot be changed. Modifications create new objects.
- Strings are stored in the **String pool** for memory optimization.

---

### **2. Key Characteristics of String**

- **Immutable**: Once created, their value cannot be changed.
- **Stored in String Pool**: JVM optimizes memory by storing literals in a common pool.
- **Thread-Safe**: Since they are immutable, they are inherently thread-safe.

---

### **3. Common String Methods with Time and Space Complexity**

| **Method**                                                 | **Description**                                                           | **Time Complexity** | **Space Complexity** |
| ---------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------- | -------------------------- |
| **charAt(int index)**                                      | Returns the character at the specified index.                                   | \(O(1)\)                  | \(O(1)\)                   |
| **length()**                                               | Returns the length of the string.                                               | \(O(1)\)                  | \(O(1)\)                   |
| **substring(int beginIndex)**                              | Returns a substring starting from the specified index.                          | \(O(n)\)                  | \(O(n)\)                   |
| **substring(int beginIndex, int endIndex)**                | Returns a substring between the specified indices.                              | \(O(n)\)                  | \(O(n)\)                   |
| **equals(Object obj)**                                     | Compares the string with another object.                                        | \(O(n)\)                  | \(O(1)\)                   |
| **equalsIgnoreCase(String anotherString)**                 | Compares two strings, ignoring case considerations.                             | \(O(n)\)                  | \(O(1)\)                   |
| **compareTo(String anotherString)**                        | Compares two strings lexicographically.                                         | \(O(n)\)                  | \(O(1)\)                   |
| **compareToIgnoreCase(String str)**                        | Compares two strings lexicographically, ignoring case differences.              | \(O(n)\)                  | \(O(1)\)                   |
| **contains(CharSequence s)**                               | Checks if the string contains the specified sequence.                           | \(O(n)\)                  | \(O(1)\)                   |
| **indexOf(char c)**                                        | Returns the index of the first occurrence of the specified character.           | \(O(n)\)                  | \(O(1)\)                   |
| **indexOf(String str)**                                    | Returns the index of the first occurrence of the specified substring.           | \(O(n)\)                  | \(O(1)\)                   |
| **lastIndexOf(String str)**                                | Returns the index of the last occurrence of the specified substring.            | \(O(n)\)                  | \(O(1)\)                   |
| **startsWith(String prefix)**                              | Checks if the string starts with the specified prefix.                          | \(O(n)\)                  | \(O(1)\)                   |
| **endsWith(String suffix)**                                | Checks if the string ends with the specified suffix.                            | \(O(n)\)                  | \(O(1)\)                   |
| **toLowerCase()**                                          | Converts all characters to lowercase.                                           | \(O(n)\)                  | \(O(n)\)                   |
| **toUpperCase()**                                          | Converts all characters to uppercase.                                           | \(O(n)\)                  | \(O(n)\)                   |
| **trim()**                                                 | Removes leading and trailing white spaces.                                      | \(O(n)\)                  | \(O(n)\)                   |
| **replace(char oldChar, char newChar)**                    | Replaces all occurrences of the specified old character with the new character. | \(O(n)\)                  | \(O(n)\)                   |
| **replace(CharSequence target, CharSequence replacement)** | Replaces all occurrences of the specified sequence with the replacement.        | \(O(n)\)                  | \(O(n)\)                   |
| **split(String regex)**                                    | Splits the string around matches of the given regular expression.               | \(O(n)\)                  | \(O(n)\)                   |
| **toCharArray()**                                          | Converts the string to a character array.                                       | \(O(n)\)                  | \(O(n)\)                   |
| **concat(String str)**                                     | Concatenates the specified string to the end of this string.                    | \(O(n)\)                  | \(O(n)\)                   |
| **matches(String regex)**                                  | Tests if the string matches the given regular expression.                       | \(O(n)\)                  | \(O(n)\)                   |
| **valueOf(Object obj)**                                    | Returns the string representation of the given object.                          | \(O(1)\)                  | \(O(n)\)                   |

---

### **4. Commonly Used String Methods**

#### **charAt(int index)**

- **Usage**: Fetch a character at a specific index.
- **Example**:

```java
String str = "Java";
char ch = str.charAt(2);  // Returns 'v'
```

#### **substring(int beginIndex, int endIndex)**

- **Usage**: Extract a portion of the string.
- **Example**:

```java
String str = "Hello World";
String sub = str.substring(0, 5);  // Returns "Hello"
```

#### **equals(Object obj)**

- **Usage**: Compares two strings for equality.
- **Example**:

```java
String str1 = "Java";
String str2 = "Java";
boolean result = str1.equals(str2);  // Returns true
```

#### **toLowerCase() and toUpperCase()**

- **Usage**: Convert string to lowercase/uppercase.
- **Example**:

```java
String str = "JAVA";
String lower = str.toLowerCase();  // Returns "java"
String upper = lower.toUpperCase();  // Returns "JAVA"
```

#### **replace(CharSequence target, CharSequence replacement)**

- **Usage**: Replace characters or sequences.
- **Example**:

```java
String str = "Java";
String replaced = str.replace("a", "o");  // Returns "Jovo"
```

#### **split(String regex)**

- **Usage**: Splits a string into an array based on a delimiter.
- **Example**:

```java
String str = "Java,Python,C++";
String[] languages = str.split(",");  // Returns ["Java", "Python", "C++"]
```

#### **trim()**

- **Usage**: Remove leading and trailing spaces.
- **Example**:

```java
String str = "  Hello  ";
String trimmed = str.trim();  // Returns "Hello"
```

---

### **5. Performance and Memory Considerations**

1. **Immutability**:

   - Modifying strings creates new objects, which can lead to memory overhead in performance-critical applications.
   - Use `StringBuilder` or `StringBuffer` for frequent modifications.
2. **String Pool**:

   - If two strings have the same content, they share the same object in the pool, reducing memory usage.
3. **Avoiding Concatenation in Loops**:

   - Using `+` in a loop creates a new object each time. Instead, use `StringBuilder`.

---

### **6. Real-World Use Cases**

- **toLowerCase()/toUpperCase()**: Case-insensitive search or comparisons.
- **substring()**: Parsing or extracting data from strings.
- **split()**: Breaking up CSV files, logs, or user input.
- **trim()**: Cleaning up user input for processing.

---

Would you like me to focus on any specific method or topic in more detail? 😊


### **1. Overview of String in Java**

- Strings in Java are **immutable**. Once created, they cannot be changed. Modifications create new objects.
- Strings are stored in the **String pool** for memory optimization.

---

### **2. Key Characteristics of String**

- **Immutable**: Once created, their value cannot be changed.
- **Stored in String Pool**: JVM optimizes memory by storing literals in a common pool.
- **Thread-Safe**: Since they are immutable, they are inherently thread-safe.

---

### **3. Common String Methods with Time and Space Complexity**

| **Method**                                                 | **Description**                                                           | **Time Complexity** | **Space Complexity** |
| ---------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------- | -------------------------- |
| **charAt(int index)**                                      | Returns the character at the specified index.                                   | \(O(1)\)                  | \(O(1)\)                   |
| **length()**                                               | Returns the length of the string.                                               | \(O(1)\)                  | \(O(1)\)                   |
| **substring(int beginIndex)**                              | Returns a substring starting from the specified index.                          | \(O(n)\)                  | \(O(n)\)                   |
| **substring(int beginIndex, int endIndex)**                | Returns a substring between the specified indices.                              | \(O(n)\)                  | \(O(n)\)                   |
| **equals(Object obj)**                                     | Compares the string with another object.                                        | \(O(n)\)                  | \(O(1)\)                   |
| **equalsIgnoreCase(String anotherString)**                 | Compares two strings, ignoring case considerations.                             | \(O(n)\)                  | \(O(1)\)                   |
| **compareTo(String anotherString)**                        | Compares two strings lexicographically.                                         | \(O(n)\)                  | \(O(1)\)                   |
| **compareToIgnoreCase(String str)**                        | Compares two strings lexicographically, ignoring case differences.              | \(O(n)\)                  | \(O(1)\)                   |
| **contains(CharSequence s)**                               | Checks if the string contains the specified sequence.                           | \(O(n)\)                  | \(O(1)\)                   |
| **indexOf(char c)**                                        | Returns the index of the first occurrence of the specified character.           | \(O(n)\)                  | \(O(1)\)                   |
| **indexOf(String str)**                                    | Returns the index of the first occurrence of the specified substring.           | \(O(n)\)                  | \(O(1)\)                   |
| **lastIndexOf(String str)**                                | Returns the index of the last occurrence of the specified substring.            | \(O(n)\)                  | \(O(1)\)                   |
| **startsWith(String prefix)**                              | Checks if the string starts with the specified prefix.                          | \(O(n)\)                  | \(O(1)\)                   |
| **endsWith(String suffix)**                                | Checks if the string ends with the specified suffix.                            | \(O(n)\)                  | \(O(1)\)                   |
| **toLowerCase()**                                          | Converts all characters to lowercase.                                           | \(O(n)\)                  | \(O(n)\)                   |
| **toUpperCase()**                                          | Converts all characters to uppercase.                                           | \(O(n)\)                  | \(O(n)\)                   |
| **trim()**                                                 | Removes leading and trailing white spaces.                                      | \(O(n)\)                  | \(O(n)\)                   |
| **replace(char oldChar, char newChar)**                    | Replaces all occurrences of the specified old character with the new character. | \(O(n)\)                  | \(O(n)\)                   |
| **replace(CharSequence target, CharSequence replacement)** | Replaces all occurrences of the specified sequence with the replacement.        | \(O(n)\)                  | \(O(n)\)                   |
| **split(String regex)**                                    | Splits the string around matches of the given regular expression.               | \(O(n)\)                  | \(O(n)\)                   |
| **toCharArray()**                                          | Converts the string to a character array.                                       | \(O(n)\)                  | \(O(n)\)                   |
| **concat(String str)**                                     | Concatenates the specified string to the end of this string.                    | \(O(n)\)                  | \(O(n)\)                   |
| **matches(String regex)**                                  | Tests if the string matches the given regular expression.                       | \(O(n)\)                  | \(O(n)\)                   |
| **valueOf(Object obj)**                                    | Returns the string representation of the given object.                          | \(O(1)\)                  | \(O(n)\)                   |

---

### **4. Commonly Used String Methods**

#### **charAt(int index)**

- **Usage**: Fetch a character at a specific index.
- **Example**:

```java
String str = "Java";
char ch = str.charAt(2);  // Returns 'v'
```

#### **substring(int beginIndex, int endIndex)**

- **Usage**: Extract a portion of the string.
- **Example**:

```java
String str = "Hello World";
String sub = str.substring(0, 5);  // Returns "Hello"
```

#### **equals(Object obj)**

- **Usage**: Compares two strings for equality.
- **Example**:

```java
String str1 = "Java";
String str2 = "Java";
boolean result = str1.equals(str2);  // Returns true
```

#### **toLowerCase() and toUpperCase()**

- **Usage**: Convert string to lowercase/uppercase.
- **Example**:

```java
String str = "JAVA";
String lower = str.toLowerCase();  // Returns "java"
String upper = lower.toUpperCase();  // Returns "JAVA"
```

#### **replace(CharSequence target, CharSequence replacement)**

- **Usage**: Replace characters or sequences.
- **Example**:

```java
String str = "Java";
String replaced = str.replace("a", "o");  // Returns "Jovo"
```

#### **split(String regex)**

- **Usage**: Splits a string into an array based on a delimiter.
- **Example**:

```java
String str = "Java,Python,C++";
String[] languages = str.split(",");  // Returns ["Java", "Python", "C++"]
```

#### **trim()**

- **Usage**: Remove leading and trailing spaces.
- **Example**:

```java
String str = "  Hello  ";
String trimmed = str.trim();  // Returns "Hello"
```

---

### **5. Performance and Memory Considerations**

1. **Immutability**:

   - Modifying strings creates new objects, which can lead to memory overhead in performance-critical applications.
   - Use `StringBuilder` or `StringBuffer` for frequent modifications.
2. **String Pool**:

   - If two strings have the same content, they share the same object in the pool, reducing memory usage.
3. **Avoiding Concatenation in Loops**:

   - Using `+` in a loop creates a new object each time. Instead, use `StringBuilder`.

---

### **6. Real-World Use Cases**

- **toLowerCase()/toUpperCase()**: Case-insensitive search or comparisons.
- **substring()**: Parsing or extracting data from strings.
- **split()**: Breaking up CSV files, logs, or user input.
- **trim()**: Cleaning up user input for processing.

---

Would you like me to focus on any specific method or topic in more detail? 😊

---

## Stringbuilder and String Buffer

Great choice! Exploring **StringBuffer** and **StringBuilder** will help you understand how Java handles mutable strings and their performance implications. Let's dive deep into their concepts, methods, differences, and when to use each.

---

### **1. StringBuffer vs StringBuilder**

| Feature                 | **StringBuffer**                  | **StringBuilder**                       |
| ----------------------- | --------------------------------------- | --------------------------------------------- |
| **Mutability**    | Mutable (can change the content).       | Mutable (like StringBuffer).                  |
| **Thread-Safety** | **Thread-safe** (synchronized).   | **Not thread-safe** (not synchronized). |
| **Performance**   | Slower due to synchronization overhead. | Faster due to lack of synchronization.        |
| **Use Case**      | Use in multithreaded environments.      | Use in single-threaded environments.          |

---

### **2. Why Use StringBuffer/StringBuilder Instead of String?**

- **Strings are immutable** in Java. When you modify a string, a new object is created, which is inefficient for repeated operations (e.g., concatenation in loops).
- **StringBuffer/StringBuilder** allows you to modify strings without creating new objects, saving memory and improving performance.

---

### **3. Common Methods of StringBuffer/StringBuilder**

| **Method**                                | **Description**                                             | **Time Complexity**          |
| ----------------------------------------------- | ----------------------------------------------------------------- | ---------------------------------- |
| **append(String s)**                      | Adds the given string to the end of the current sequence.         | \(O(n)\) in worst case (resizing). |
| **insert(int offset, String s)**          | Inserts the string at the specified position.                     | \(O(n)\)                           |
| **replace(int start, int end, String s)** | Replaces characters in the specified range with the given string. | \(O(n)\)                           |
| **delete(int start, int end)**            | Removes characters in the specified range.                        | \(O(n)\)                           |
| **reverse()**                             | Reverses the characters in the sequence.                          | \(O(n)\)                           |
| **capacity()**                            | Returns the current capacity of the buffer.                       | \(O(1)\)                           |
| **ensureCapacity(int minimumCapacity)**   | Ensures the buffer has at least the specified capacity.           | \(O(n)\) (if resizing is needed).  |
| **length()**                              | Returns the number of characters in the sequence.                 | \(O(1)\)                           |
| **charAt(int index)**                     | Returns the character at the specified position.                  | \(O(1)\)                           |
| **setCharAt(int index, char ch)**         | Sets the character at the specified position.                     | \(O(1)\)                           |
| **substring(int start, int end)**         | Extracts a portion of the sequence as a string.                   | \(O(n)\)                           |

---

### **4. StringBuffer Example**

```java
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);  // Hello World

        // Insert
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);  // Hello Java World

        // Replace
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb);  // Hello Awesome World

        // Delete
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);  // Hello World

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);  // dlroW olleH
    }
}
```

---

### **5. StringBuilder Example**

```java
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Performance");

        // Append
        sb.append(" Test");
        System.out.println("After append: " + sb);  // Performance Test

        // Insert
        sb.insert(11, "Java ");
        System.out.println("After insert: " + sb);  // Performance Java Test

        // Replace
        sb.replace(11, 15, "Speed");
        System.out.println("After replace: " + sb);  // Performance Speed Test

        // Delete
        sb.delete(11, 16);
        System.out.println("After delete: " + sb);  // Performance Test

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);  // tseT ecnamrofreP
    }
}
```

---

### **6. Performance and Memory Management**

- **Resizable Buffer**: Both StringBuffer and StringBuilder have an initial capacity (default: 16 characters), which grows dynamically as needed. Resizing is costly (\(O(n)\)), so it's better to use `ensureCapacity()` if you know the required size in advance.
- **Garbage Collection**: Since they create fewer intermediate objects compared to `String`, they reduce garbage collection overhead.

---

### **7. Key Differences in Multithreading**

- In **multi-threaded environments**, always use **StringBuffer** for safety.
- In **single-threaded applications**, use **StringBuilder** for better performance.

---

### **8. Comparison with String Concatenation**

#### Example:

```java
// Using String
String str = "";
for (int i = 0; i < 1000; i++) {
    str += i;  // Creates a new object in each iteration
}

// Using StringBuilder
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);  // Modifies the same object
}
```

- **String Concatenation**: Time complexity = \(O(n^2)\) (due to repeated object creation).
- **StringBuilder**: Time complexity = \(O(n)\).

---

### **9. Real-World Use Cases**

- **StringBuffer**:

  - Logging in multi-threaded systems.
  - Building thread-safe string representations.
- **StringBuilder**:

  - Parsing large files.
  - Constructing JSON, XML, or HTML documents dynamically.
  - Optimizing algorithms involving string concatenations.

---

Let me know if you'd like to practice some examples or explore advanced usage patterns! 😊
