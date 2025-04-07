# Collection Framework

## Queue

The queue is a fundamental data structure in Java and computer science, primarily used to store elements in a first-in, first-out (FIFO) manner. This means the first element added to the queue will be the first one to be removed.

### Key Features of Queue

- **FIFO Order**: Elements are processed in the order they are added.
- **Dynamic Size**: Automatically resizes with the addition and removal of elements.

### Common Operations

- **Enqueue**: Add elements to the rear of the queue.
  - `add(E e)` - Inserts the specified element into the queue. Throws an exception if the queue is full.
  - `offer(E e)` - Inserts the specified element into the queue. Returns `false` if the queue is full, rather than throwing an exception.
  
- **Dequeue**: Remove elements from the front of the queue.
  - `remove()` - Retrieves and removes the head of the queue. Throws an exception if the queue is empty.
  - `poll()` - Retrieves and removes the head of the queue, or returns `null` if the queue is empty.

- **Peek**: Access the element at the front without removing it.
  - `element()` - Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.
  - `peek()` - Retrieves, but does not remove, the head of the queue, or returns `null` if the queue is empty.

### Implementations in Java:

- **LinkedList**: Implements both `Queue` and `Deque`, allowing for FIFO operations.
- **PriorityQueue**: A queue that orders its elements based on their natural ordering or by a specified comparator.

### Example Usage

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.add("Element 1");
        queue.offer("Element 2");

        // Peek at the front element
        System.out.println("Front Element: " + queue.peek());

        // Dequeue elements
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.poll());

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
```

### Notes

- **Exceptions**: Methods like `add()` and `remove()` throw exceptions if operations fail, unlike `offer()` and `poll()`, which handle these cases more gracefully.
- **Usage**: Queues are often used in scenarios like breadth-first search in graphs, task scheduling, and buffering of data streams.

### Edge Cases

- Attempting to remove or retrieve elements from an empty queue using `remove()` or `element()` will result in exceptions (`NoSuchElementException`).

## Collection Framework - Double Ended Queue

The Deque (Double-Ended Queue) is a linear collection in Java that allows elements to be added or removed from both ends. It is part of the Java Collections Framework and is implemented by various classes, such as ArrayDeque and LinkedList.

## Key Features of Deque:

1. **Double-Ended:** Elements can be inserted and removed from both ends (front and rear).
2. **Resizing:** Automatically resizes when elements are added or removed.
3. **Iterative Access:** Provides iterator methods to traverse elements.

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.addFirst("Element 1");
        deque.addLast("Element 2");
        deque.addFirst("Element 0");

        // Accessing elements
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());

        // Removing elements
        deque.removeFirst();
        deque.removeLast();

        // Iterating through the deque
        for (String element : deque) {
            System.out.println("Remaining Element: " + element);
        }
    }
}
```

## Notes

### *Capacity and Performance:* ArrayDeque is typically faster than LinkedList for most implementations due to better cache locality, but it has a fixed capacity that expands automatically

### *Null Elements:* Deque does not allow null elements

## Deque Methods and uses

| Method               | Use Case                               | Example Code Snippet                                   | Time Complexity | Space Complexity |
|----------------------|----------------------------------------|-------------------------------------------------------|-----------------|------------------|
| `addFirst(E e)`      | Add an element to the front            | `deque.addFirst("Element 1");`                        | O(1)            | O(1)             |
| `addLast(E e)`       | Add an element to the rear             | `deque.addLast("Element 2");`                         | O(1)            | O(1)             |
| `removeFirst()`      | Remove the element at the front        | `deque.removeFirst();`                                | O(1)            | O(1)             |
| `removeLast()`       | Remove the element at the rear         | `deque.removeLast();`                                 | O(1)            | O(1)             |
| `getFirst()`         | Access the element at the front        | `String first = deque.getFirst();`                    | O(1)            | O(1)             |
| `getLast()`          | Access the element at the rear         | `String last = deque.getLast();`                      | O(1)            | O(1)             |
| `offerFirst(E e)`    | Add an element to the front (returns boolean) | `deque.offerFirst("Element 3");`                   | O(1)            | O(1)             |
| `offerLast(E e)`     | Add an element to the rear (returns boolean) | `deque.offerLast("Element 4");`                    | O(1)            | O(1)             |
| `pollFirst()`        | Remove and return the element at the front | `String first = deque.pollFirst();`                | O(1)            | O(1)             |
| `pollLast()`         | Remove and return the element at the rear | `String last = deque.pollLast();`                  | O(1)            | O(1)             |
| `peekFirst()`        | Retrieve but do not remove the front element | `String first = deque.peekFirst();`               | O(1)            | O(1)             |
| `peekLast()`         | Retrieve but do not remove the rear element | `String last = deque.peekLast();`                 | O(1)            | O(1)             |
| `isEmpty()`          | Check if deque is empty                | `boolean empty = deque.isEmpty();`                    | O(1)            | O(1)             |
| `size()`             | Get the number of elements in deque    | `int size = deque.size();`                            | O(1)            | O(1)             |
| `clear()`            | Remove all elements                    | `deque.clear();`                                      | O(n)            | O(1)             |
