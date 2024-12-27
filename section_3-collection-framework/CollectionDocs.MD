# **Understand the Basics**

## **What is the Collection Framework?**

- A unified architecture for storing and manipulating groups of objects.
- Interfaces (e.g., List, Set, Map) and their implementations (e.g., ArrayList, HashSet, HashMap).

## **Key Interfaces**

- **List**: Ordered collection (ArrayList, LinkedList, Vector).
- **Set**: Unique elements (HashSet, LinkedHashSet, TreeSet).
- **Map**: Key-value pairs (HashMap, LinkedHashMap, TreeMap).

---


## **What is a List?**

- A `List` in Java is an ordered collection that allows duplicate elements.
- The `java.util.List` interface extends the `Collection` interface.
- Key features:
  - Allows positional access.
  - Maintains insertion order.
  - Can contain duplicate elements.

---

### **Major List Implementations**

### **1. ArrayList**

- **Description**:

  - Backed by a dynamic array.
  - Provides fast random access (indexed retrieval).
  - Slower when adding/removing elements in the middle because elements are shifted.
- **Key Methods**:

  - `add(element)`, `add(index, element)`
  - `remove(index)`, `remove(object)`
  - `get(index)`, `set(index, element)`
  - `size()`
- **When to Use**:

  - When you need **fast read operations** or frequently append elements at the end.
- **Example**:

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
      
        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1)); // Banana

        // Updating elements
        list.set(1, "Blueberry");

        // Removing elements
        list.remove("Apple");

        // Iterating through the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

---

### **2. LinkedList**

- **Description**:

  - Implemented as a doubly linked list.
  - Fast for insertions/removals in the middle of the list.
  - Slower random access compared to `ArrayList`.
- **Key Methods**:Inherits all `List` methods but also has additional methods for **queue-like operations**:

  - `addFirst()`, `addLast()`
  - `removeFirst()`, `removeLast()`
  - `getFirst()`, `getLast()`
- **When to Use**:

  - When you need **frequent insertions and deletions**, especially in the middle of the list.
- **Example**:

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Dog");
        list.add("Cat");
        list.addFirst("Bird");
        list.addLast("Elephant");

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Removing elements
        list.remove("Cat");
        list.removeFirst();

        // Iterating through the list
        for (String animal : list) {
            System.out.println(animal);
        }
    }
}
```

---

### **3. Vector**

- **Description**:

  - Similar to `ArrayList`, but thread-safe (synchronized).
  - Slower than `ArrayList` due to synchronization overhead.
  - Rarely used in modern applications unless synchronization is explicitly needed.
- **Key Methods**:Same as `ArrayList`.
- **When to Use**:

  - Only if you need a thread-safe version of `ArrayList`.
- **Example**:

```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Iterating through the vector
        for (Integer num : vector) {
            System.out.println(num);
        }
    }
}
```

---

### **Comparing ArrayList, LinkedList, and Vector**

| Feature                  | ArrayList          | LinkedList                    | Vector                                |
| ------------------------ | ------------------ | ----------------------------- | ------------------------------------- |
| **Data Structure** | Dynamic Array      | Doubly Linked List            | Dynamic Array                         |
| **Performance**    | Fast random access | Fast insertions/removals      | Thread-safe                           |
| **Thread-Safe**    | No                 | No                            | Yes                                   |
| **Usage**          | General-purpose    | Frequent insertions/deletions | Legacy code requiring synchronization |

---

### **Hands-On Task**

1. Create a program that:
   - Stores student names in an `ArrayList`.
   - Allows users to add, remove, and search for a student.
   - Displays all students in alphabetical order using `Collections.sort()`.

Let me know if you'd like me to help write or debug it!
