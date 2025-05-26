Great! Let's explore the **built-in methods of the `Queue` interface** in Java. 🚀

### **Queue Interface in Java (`java.util.Queue<E>`)**

- **Implemented by:** `LinkedList`, `PriorityQueue`, `ArrayDeque`
- **Follows:** **FIFO (First In, First Out)** principle

---

## **1️⃣ Important Queue Methods in Java**

| Method         | Description                                                                |
| -------------- | -------------------------------------------------------------------------- |
| `offer(E e)` | Inserts the element into the queue (returns `false` if full).            |
| `add(E e)`   | Inserts the element (throws an exception if full).                         |
| `poll()`     | Removes and returns the front element (returns `null` if empty).         |
| `remove()`   | Removes and returns the front element (throws exception if empty).         |
| `peek()`     | Returns the front element without removing it (`null` if empty).         |
| `element()`  | Returns the front element without removing it (throws exception if empty). |
| `isEmpty()`  | Checks if the queue is empty.                                              |
| `size()`     | Returns the number of elements in the queue.                               |

---

## **2️⃣ Example Code Using Queue Methods**

```java
import java.util.*;

public class QueueMethodsExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements
        queue.offer(10);  // Recommended method
        queue.offer(20);
        queue.add(30);  // Throws exception if full

        System.out.println("Queue: " + queue); // Output: [10, 20, 30]

        // Accessing front element
        System.out.println("Front (peek): " + queue.peek()); // Output: 10
        System.out.println("Front (element): " + queue.element()); // Output: 10

        // Removing elements
        System.out.println("Removed (poll): " + queue.poll()); // Output: 10
        System.out.println("Queue after poll: " + queue); // Output: [20, 30]

        // Remove another element
        System.out.println("Removed (remove): " + queue.remove()); // Output: 20
        System.out.println("Queue after remove: " + queue); // Output: [30]

        // Checking if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
        System.out.println("Queue size: " + queue.size()); // Output: 1

        // Clearing the queue
        queue.poll();
        System.out.println("Is queue empty after poll? " + queue.isEmpty()); // Output: true
    }
}
```

---

## **3️⃣ Difference Between `offer()` vs `add()`**

| Method         | Behavior                                                   |
| -------------- | ---------------------------------------------------------- |
| `offer(E e)` | Returns `false` if the queue is full (preferred method). |
| `add(E e)`   | Throws an exception (`IllegalStateException`) if full.   |

**Example:**

```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(10);  // ✅ No exception
queue.add(20);    // ✅ No exception
```

---

## **4️⃣ Difference Between `poll()` vs `remove()`**

| Method       | Behavior                                               |
| ------------ | ------------------------------------------------------ |
| `poll()`   | Returns `null` if queue is empty (preferred method). |
| `remove()` | Throws `NoSuchElementException` if empty.            |

**Example:**

```java
Queue<Integer> queue = new LinkedList<>();
System.out.println(queue.poll());   // ✅ Output: null
System.out.println(queue.remove()); // ❌ Throws NoSuchElementException
```

---

## **5️⃣ Difference Between `peek()` vs `element()`**

| Method        | Behavior                                               |
| ------------- | ------------------------------------------------------ |
| `peek()`    | Returns `null` if queue is empty (preferred method). |
| `element()` | Throws `NoSuchElementException` if empty.            |

**Example:**

```java
Queue<Integer> queue = new LinkedList<>();
System.out.println(queue.peek());   // ✅ Output: null
System.out.println(queue.element()); // ❌ Throws NoSuchElementException
```

---

## **6️⃣ Other Implementations of Queue**

### **🔹 `ArrayDeque` (Faster than `LinkedList`)**

```java
Queue<Integer> queue = new ArrayDeque<>();
queue.offer(1);
queue.offer(2);
queue.poll(); // Removes 1
```

### **🔹 `PriorityQueue` (Min-Heap)**

```java
Queue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(2);
pq.offer(8);
System.out.println(pq.poll()); // Output: 2 (Smallest element first)
```

---

Would you like to dive deeper into **Deque (Double-ended Queue)** or **Circular Queue** next? 🚀
