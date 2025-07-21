# Map Interface

---



## **What is the Map Interface?**

The `Map<K, V>` interface in Java is part of the `java.util` package and represents a **collection of key-value pairs**.
Unlike a `List` or `Set`, a `Map` does **not allow duplicate keys**—each key maps to **at most one value**.

### **Key Characteristics of Map Interface:**

- Stores **key-value pairs (`K, V`)**.
- **No duplicate keys** allowed (values can be duplicated).
- **Fast lookups** (`O(1)` average time for `get()` in `HashMap`).
- Multiple implementations with different properties (`HashMap`, `LinkedHashMap`, `TreeMap`, etc.).

---

## **Map Implementations in Java**

| Implementation          | Ordering              | Null Keys? | Null Values? | Best Use Case                           |
| ----------------------- | --------------------- | ---------- | ------------ | --------------------------------------- |
| **HashMap**       | No order              | ✅ Yes     | ✅ Yes       | Fastest lookups (`O(1)`)              |
| **LinkedHashMap** | Insertion order       | ✅ Yes     | ✅ Yes       | Maintaining order of insertion          |
| **TreeMap**       | Sorted order (by key) | ❌ No      | ✅ Yes       | Sorted key-value storage (`O(log N)`) |
| **Hashtable**     | No order              | ❌ No      | ❌ No        | Thread-safe, slower                     |

---

## **Basic Operations on Map**

```java
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding elements (put)
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);

        // Fetching elements (get)
        System.out.println("Alice's age: " + map.get("Alice")); // Output: 25

        // Checking if a key exists
        System.out.println("Contains 'Bob'? " + map.containsKey("Bob")); // true

        // Checking if a value exists
        System.out.println("Contains value 22? " + map.containsValue(22)); // true

        // Removing a key
        map.remove("Charlie");

        // Iterating over keys
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Iterating over key-value pairs (entrySet)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Size of the map
        System.out.println("Size: " + map.size());

        // Clearing the map
        map.clear();
        System.out.println("Is map empty? " + map.isEmpty()); // true
    }
}
```

---

## **Exploring Different Implementations**

### **1️⃣ HashMap (Unordered, Fast Lookups)**

```java
Map<Integer, String> hashMap = new HashMap<>();
hashMap.put(3, "Three");
hashMap.put(1, "One");
hashMap.put(2, "Two");

System.out.println(hashMap); // Output: {1=One, 2=Two, 3=Three} (Order may vary)
```

- **Average time complexity:** `O(1)` for `put/get`.
- **Best use case:** When **ordering does not matter** and we need **fast lookups**.

---

### **2️⃣ LinkedHashMap (Insertion Order Preserved)**

```java
Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put(3, "Three");
linkedHashMap.put(1, "One");
linkedHashMap.put(2, "Two");

System.out.println(linkedHashMap); // Output: {3=Three, 1=One, 2=Two} (Maintains insertion order)
```

- **Best use case:** When we need **ordering of keys** preserved.

---

### **3️⃣ TreeMap (Sorted Order)**

```java
Map<Integer, String> treeMap = new TreeMap<>();
treeMap.put(3, "Three");
treeMap.put(1, "One");
treeMap.put(2, "Two");

System.out.println(treeMap); // Output: {1=One, 2=Two, 3=Three} (Sorted by key)
```

- **Time complexity:** `O(log N)` for `put/get`.
- **Best use case:** When we need **keys to be sorted**.

---

### **4️⃣ Hashtable (Thread-Safe but Slower)**

```java
Map<Integer, String> hashtable = new Hashtable<>();
hashtable.put(3, "Three");
hashtable.put(1, "One");
hashtable.put(2, "Two");

System.out.println(hashtable); // Output: {1=One, 2=Two, 3=Three} (Unordered)
```

- **Best use case:** When we need a **thread-safe** `HashMap` (but `ConcurrentHashMap` is better).

---

## **Common Map Methods**

| Method                     | Description                           |
| -------------------------- | ------------------------------------- |
| `put(K key, V value)`    | Inserts or updates a key-value pair   |
| `get(K key)`             | Retrieves the value for a key         |
| `remove(K key)`          | Deletes a key from the map            |
| `containsKey(K key)`     | Checks if a key exists                |
| `containsValue(V value)` | Checks if a value exists              |
| `keySet()`               | Returns a `Set` of keys             |
| `values()`               | Returns a `Collection` of values    |
| `entrySet()`             | Returns a `Set` of key-value pairs  |
| `size()`                 | Returns the number of key-value pairs |
| `isEmpty()`              | Checks if the map is empty            |
| `clear()`                | Removes all entries                   |

---

## **Use Case Scenarios**

| Use Case                 | Best Map Implementation                 |
| ------------------------ | --------------------------------------- |
| Fast lookups             | **HashMap**                       |
| Maintain insertion order | **LinkedHashMap**                 |
| Sorted order of keys     | **TreeMap**                       |
| Thread safety needed     | **ConcurrentHashMap / Hashtable** |

---

## **Interview Question: Word Frequency Counter**

**Problem:** Given a list of words, count the occurrences of each word.

```java
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
```

**Output:**

```
{apple=3, banana=2, orange=1}
```

---

## **Key Takeaways**

✅ **Map stores key-value pairs** with unique keys.
✅ **HashMap is fastest** but does not guarantee order.
✅ **LinkedHashMap preserves insertion order**.
✅ **TreeMap sorts keys automatically**.
✅ **Hashtable is synchronized**, but `ConcurrentHashMap` is better for multi-threading.

Would you like to explore **ConcurrentHashMap** or solve more problems using Maps? 😃🚀
