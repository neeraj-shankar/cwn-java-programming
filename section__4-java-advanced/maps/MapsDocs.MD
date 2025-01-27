### **Exploring Maps in Java**

In Java, a **Map** is a data structure that stores data in key-value pairs. Keys are unique, and each key maps to exactly one value. The `Map` interface is part of the `java.util` package.

---

### **Types of Maps in Java**

There are several implementations of the `Map` interface, each suited for different use cases. Let’s explore them:

---

### **1. HashMap**

- **Description**:

  - Implements the `Map` interface using a **hash table**.
  - Allows one `null` key and multiple `null` values.
  - **Unordered**: The order of keys is not guaranteed.
- **Time Complexity**:

  - Average case: \( O(1) \) for `put()` and `get()`.
  - Worst case: \( O(n) \) (if hash collisions occur).
- **Use Case**:

  - Storing and retrieving data quickly without caring about the order.
  - Example: A dictionary of employee IDs and names.
- **Example Code**:

  ```java
  import java.util.HashMap;

  public class HashMapExample {
      public static void main(String[] args) {
          HashMap<Integer, String> map = new HashMap<>();
          map.put(1, "Alice");
          map.put(2, "Bob");
          map.put(3, "Charlie");

          System.out.println(map.get(2)); // Output: Bob
      }
  }
  ```

---

### **2. LinkedHashMap**

- **Description**:

  - Extends `HashMap` but maintains a **linked list** of entries.
  - **Ordered**: Keys are iterated in the insertion order.
- **Time Complexity**:

  - Same as `HashMap` (average \( O(1) \) for `put()` and `get()`).
- **Use Case**:

  - When you need predictable iteration order.
  - Example: Maintaining a cache where the insertion order matters.
- **Example Code**:

  ```java
  import java.util.LinkedHashMap;

  public class LinkedHashMapExample {
      public static void main(String[] args) {
          LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
          map.put(1, "Apple");
          map.put(2, "Banana");
          map.put(3, "Cherry");

          for (Integer key : map.keySet()) {
              System.out.println(key + ": " + map.get(key));
          }
      }
  }
  ```

---

### **3. TreeMap**

- **Description**:

  - Implements the `Map` interface using a **red-black tree**.
  - **Sorted**: Keys are sorted in their natural order (or a custom comparator if provided).
- **Time Complexity**:

  - \( O(\log n) \) for `put()`, `get()`, and `remove()`.
- **Use Case**:

  - When you need sorted keys.
  - Example: Storing student scores where the keys (student IDs) should be in ascending order.
- **Example Code**:

  ```java
  import java.util.TreeMap;

  public class TreeMapExample {
      public static void main(String[] args) {
          TreeMap<Integer, String> map = new TreeMap<>();
          map.put(3, "Dog");
          map.put(1, "Cat");
          map.put(2, "Bird");

          for (Integer key : map.keySet()) {
              System.out.println(key + ": " + map.get(key));
          }
      }
  }
  ```

---

### **4. Hashtable**

- **Description**:

  - Synchronized version of `HashMap`.
  - Does not allow `null` keys or values.
- **Time Complexity**:

  - Average \( O(1) \), but slightly slower due to synchronization overhead.
- **Use Case**:

  - Legacy systems or when thread safety is required for key-value pairs.
  - Example: Shared configuration settings in a multithreaded environment.
- **Example Code**:

  ```java
  import java.util.Hashtable;

  public class HashtableExample {
      public static void main(String[] args) {
          Hashtable<Integer, String> table = new Hashtable<>();
          table.put(1, "One");
          table.put(2, "Two");

          System.out.println(table.get(1)); // Output: One
      }
  }
  ```

---

### **5. EnumMap**

- **Description**:

  - Specialized implementation for keys that are enums.
  - Faster than `HashMap` for enum keys due to internal optimization.
- **Time Complexity**:

  - Average \( O(1) \).
- **Use Case**:

  - When the keys are enums, such as storing values based on days of the week.
- **Example Code**:

  ```java
  import java.util.EnumMap;

  enum Day {
      MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
  }

  public class EnumMapExample {
      public static void main(String[] args) {
          EnumMap<Day, String> map = new EnumMap<>(Day.class);
          map.put(Day.MONDAY, "Work");
          map.put(Day.FRIDAY, "Relax");

          for (Day day : map.keySet()) {
              System.out.println(day + ": " + map.get(day));
          }
      }
  }
  ```

---

### **Key Differences Between Map Implementations**

| Feature                    | `HashMap`                          | `LinkedHashMap`                | `TreeMap`              | `Hashtable`           | `EnumMap`             |
| -------------------------- | ------------------------------------ | -------------------------------- | ------------------------ | ----------------------- | ----------------------- |
| **Order**            | Unordered                            | Insertion order                  | Sorted by key            | Unordered               | Enum order              |
| **Null Keys/Values** | 1 `null` key, many `null` values | Same as `HashMap`              | No `null` keys         | No `null` keys/values | No `null` keys/values |
| **Synchronization**  | Not synchronized                     | Not synchronized                 | Not synchronized         | Synchronized            | Not synchronized        |
| **Performance**      | Fast (avg\( O(1) \))                 | Slightly slower than `HashMap` | Slower (\( O(\log n) \)) | Slower due to sync      | Optimized for enums     |

---

### **Use Cases for Different Maps**

1. **HashMap**: Fast lookup for caching or storing unique IDs.
2. **LinkedHashMap**: Implementing an LRU cache or maintaining order.
3. **TreeMap**: Sorted data like leaderboard or rankings.
4. **Hashtable**: Thread-safe configurations.
5. **EnumMap**: Mapping enums to specific values, like days to activities.

---

### **HashMap in Detail**

The `HashMap` class in Java is one of the most widely used implementations of the `Map` interface. It is a powerful, efficient, and flexible data structure for storing and accessing key-value pairs.

---

### **Key Features of HashMap**

1. **Stores Key-Value Pairs**: Each key is mapped to exactly one value.
2. **Allows Nulls**:
   - One `null` key is allowed.
   - Multiple `null` values are allowed.
3. **Unordered**: The order of keys is not guaranteed and may change over time.
4. **Fast Operations**:
   - **Average-case** complexity for `get()` and `put()` is \( O(1) \).
   - **Worst-case** complexity is \( O(n) \) in case of hash collisions.

---

### **How HashMap Works**

1. **Internal Storage**:

   - The `HashMap` uses an array of **buckets** to store entries.
   - Each bucket is a linked list (or tree if collision threshold is exceeded).
2. **Hashing**:

   - The key's hash code is calculated using the `hashCode()` method.
   - The hash code is used to determine the bucket where the entry will be stored.
3. **Collision Handling**:

   - If two keys generate the same hash code, they are stored in the same bucket using a linked list or a balanced tree (for performance improvement in Java 8+).
4. **Load Factor**:

   - The default load factor is `0.75`.
   - When the number of elements exceeds `capacity × load factor`, the `HashMap` resizes its internal array, doubling the capacity.

---

### **HashMap Common Operations**

Here’s a breakdown of how to use `HashMap` effectively.

#### **1. Creating a HashMap**

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();
    }
}
```

---

#### **2. Adding Elements (`put()`)**

```java
map.put(1, "Apple");
map.put(2, "Banana");
map.put(3, "Cherry");
```

---

#### **3. Accessing Elements (`get()`)**

```java
System.out.println(map.get(1)); // Output: Apple
System.out.println(map.get(5)); // Output: null (if key doesn't exist)
```

---

#### **4. Checking for Key or Value (`containsKey()` / `containsValue()`)**

```java
System.out.println(map.containsKey(2)); // Output: true
System.out.println(map.containsValue("Banana")); // Output: true
```

---

#### **5. Removing Elements (`remove()`)**

```java
map.remove(2); // Removes the entry with key 2
System.out.println(map); // Output: {1=Apple, 3=Cherry}
```

---

#### **6. Iterating Through a HashMap**

There are multiple ways to iterate over a `HashMap`:

- **Using `entrySet()`**:

  ```java
  for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
  }
  ```
- **Using `keySet()`**:

  ```java
  for (Integer key : map.keySet()) {
      System.out.println(key + " -> " + map.get(key));
  }
  ```

---

#### **7. Size of the Map (`size()`)**

```java
System.out.println(map.size()); // Output: 2
```

---

### **Example: Word Frequency Counter**

Let’s use a `HashMap` to count the frequency of words in a string:

```java
import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "hello world hello java world";

        // Split the text into words
        String[] words = text.split(" ");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            // Increment the count if the word is already in the map
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        for (HashMap.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

**Output**:

```
hello: 2
world: 2
java: 1
```

---

### **Advantages of HashMap**

1. **Fast Lookup**: Average \( O(1) \) for most operations.
2. **Flexibility**: Allows `null` keys and values.
3. **Ease of Use**: Well-integrated with Java's collections framework.

---

### **Limitations of HashMap**

1. **Unordered**: Keys are not stored in any particular order.
2. **Not Thread-Safe**: Multiple threads accessing a `HashMap` can cause data inconsistency.
   - Use **`ConcurrentHashMap`** for thread-safe operations.
3. **Memory Overhead**: Due to hashing and resizing mechanisms.

---

### **Use Cases of HashMap**

1. **Caching**: Store frequently used data for quick lookup.
   - Example: User sessions in a web application.
2. **Data Indexing**: Quickly access data using unique identifiers.
   - Example: Mapping product IDs to product details in e-commerce.
3. **Frequency Count**: Count occurrences of words, characters, or numbers.
4. **Associative Arrays**: Store key-value pairs like a dictionary.

---

### **Advanced Concepts**

1. **Custom Objects as Keys**:

   - You can use custom objects as keys in a `HashMap`, but you must override the `equals()` and `hashCode()` methods to ensure proper functioning.

   ```java
   class Employee {
       int id;
       String name;

       Employee(int id, String name) {
           this.id = id;
           this.name = name;
       }

       @Override
       public int hashCode() {
           return id;
       }

       @Override
       public boolean equals(Object obj) {
           if (this == obj) return true;
           if (obj == null || getClass() != obj.getClass()) return false;
           Employee e = (Employee) obj;
           return id == e.id;
       }
   }
   ```
2. **Hash Collisions**:

   - Occur when two keys have the same hash code.
   - In Java 8+, buckets switch to balanced trees if collisions become excessive.
3. **Capacity and Load Factor**:

   - Default capacity: 16.
   - Load factor: 0.75 (resize when 75% full).

---


Sure! Here's a detailed explanation of the **HashSet** methods available in Java, along with their usage, time complexity, and space complexity.

---

### **Overview of HashSet**

- **HashSet** is part of the **Java Collection Framework**.
- It implements the **Set** interface and is backed by a **HashMap**.
- It **does not allow duplicate elements** and **does not maintain insertion order**.

---

### **Key Methods of HashSet**

Below are the commonly used methods in **HashSet**, with explanations:

#### 1. **add(E e)**

- **Usage:** Adds the specified element to the set if it is not already present.
- **Time Complexity:**
  - **Average Case:** \(O(1)\)
  - **Worst Case:** \(O(n)\), when many elements have the same hash code (hash collisions).
- **Space Complexity:** \(O(1)\) for the element itself, but overall \(O(n)\) for maintaining the internal hash table.

**Example:**

```java
HashSet<Integer> set = new HashSet<>();
set.add(10);  // Adds 10 to the set
set.add(20);  // Adds 20 to the set
```

---

#### 2. **contains(Object o)**

- **Usage:** Checks if the set contains the specified element.
- **Time Complexity:**
  - **Average Case:** \(O(1)\)
  - **Worst Case:** \(O(n)\) (in case of hash collisions).
- **Space Complexity:** \(O(1)\)

**Example:**

```java
set.contains(10);  // Returns true if 10 is in the set
```

---

#### 3. **remove(Object o)**

- **Usage:** Removes the specified element from the set if it is present.
- **Time Complexity:**
  - **Average Case:** \(O(1)\)
  - **Worst Case:** \(O(n)\) (in case of hash collisions).
- **Space Complexity:** \(O(1)\)

**Example:**

```java
set.remove(10);  // Removes 10 from the set
```

---

#### 4. **isEmpty()**

- **Usage:** Checks if the set is empty.
- **Time Complexity:** \(O(1)\)
- **Space Complexity:** \(O(1)\)

**Example:**

```java
set.isEmpty();  // Returns true if the set is empty
```

---

#### 5. **size()**

- **Usage:** Returns the number of elements in the set.
- **Time Complexity:** \(O(1)\)
- **Space Complexity:** \(O(1)\)

**Example:**

```java
set.size();  // Returns the size of the set
```

---

#### 6. **clear()**

- **Usage:** Removes all elements from the set.
- **Time Complexity:** \(O(n)\) (needs to clear all elements).
- **Space Complexity:** \(O(1)\)

**Example:**

```java
set.clear();  // Clears the set
```

---

#### 7. **iterator()**

- **Usage:** Returns an iterator over the elements in the set.
- **Time Complexity:** \(O(1)\) for getting the iterator; \(O(1)\) for moving to the next element in most cases.
- **Space Complexity:** \(O(1)\)

**Example:**

```java
Iterator<Integer> it = set.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

#### 8. **addAll(Collection<? extends E> c)**

- **Usage:** Adds all elements from the specified collection to the set.
- **Time Complexity:** \(O(k)\), where \(k\) is the number of elements in the input collection.
- **Space Complexity:** \(O(k)\), for storing the added elements.

**Example:**

```java
HashSet<Integer> set2 = new HashSet<>();
set2.addAll(Arrays.asList(30, 40, 50));
```

---

#### 9. **removeAll(Collection<?> c)**

- **Usage:** Removes all elements in the specified collection from the set.
- **Time Complexity:** \(O(k)\), where \(k\) is the size of the collection.
- **Space Complexity:** \(O(1)\)

**Example:**

```java
set.removeAll(set2);  // Removes elements present in set2
```

---

#### 10. **retainAll(Collection<?> c)**

- **Usage:** Retains only the elements in the set that are contained in the specified collection (intersection).
- **Time Complexity:** \(O(n)\), where \(n\) is the size of the set.
- **Space Complexity:** \(O(1)\)

**Example:**

```java
set.retainAll(Arrays.asList(10, 20));  // Keeps only common elements
```

---

#### 11. **toArray()**

- **Usage:** Converts the set into an array.
- **Time Complexity:** \(O(n)\)
- **Space Complexity:** \(O(n)\)

**Example:**

```java
Object[] array = set.toArray();
```

---

### **Time and Space Complexity Summary**

| Method           | Time Complexity (Average) | Time Complexity (Worst) | Space Complexity |
| ---------------- | ------------------------- | ----------------------- | ---------------- |
| add(E e)         | \(O(1)\)                  | \(O(n)\)                | \(O(1)\)         |
| contains(Object) | \(O(1)\)                  | \(O(n)\)                | \(O(1)\)         |
| remove(Object)   | \(O(1)\)                  | \(O(n)\)                | \(O(1)\)         |
| isEmpty()        | \(O(1)\)                  | \(O(1)\)                | \(O(1)\)         |
| size()           | \(O(1)\)                  | \(O(1)\)                | \(O(1)\)         |
| clear()          | \(O(n)\)                  | \(O(n)\)                | \(O(1)\)         |
| iterator()       | \(O(1)\)                  | \(O(1)\)                | \(O(1)\)         |
| addAll()         | \(O(k)\)                  | \(O(k)\)                | \(O(k)\)         |
| removeAll()      | \(O(k)\)                  | \(O(k)\)                | \(O(1)\)         |
| retainAll()      | \(O(n)\)                  | \(O(n)\)                | \(O(1)\)         |
| toArray()        | \(O(n)\)                  | \(O(n)\)                | \(O(n)\)         |

---

Let me know if you'd like more examples or deeper insights into any of these methods! 😊
