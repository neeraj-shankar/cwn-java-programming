# Java Collection Framework

The Java Collections Framework is a set of classes and interfaces that implement commonly reusable collection data structures. Here’s an overview of the main components:

## Key Interfaces

1. **Collection**: The root interface of the collection hierarchy. It is a group of objects, known as its elements.

2. **List**: An ordered collection (also known as a sequence). Lists can contain duplicate elements. Common implementations include:
   - `ArrayList`: A resizable array implementation.
   - `LinkedList`: An implementation using a doubly linked list.
   - `Vector`: A synchronized version of `ArrayList`.

3. **Set**: A collection that cannot contain duplicate elements. Common implementations include:
   - `HashSet`: A set based on a hash table.
   - `LinkedHashSet`: A hash table and linked list implementation that maintains the order of elements.
   - `TreeSet`: A set that uses a tree for storage, maintaining sorted order.

4. **Queue**: A collection used to hold multiple elements prior to processing. It typically orders elements in a FIFO (first-in-first-out) manner. Common implementations include:
   - `PriorityQueue`: An unbounded priority queue based on a priority heap.
   - `ArrayDeque`: A resizable array implementation of the `Deque` interface.

5. **Map**: An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value. Common implementations include:
   - `HashMap`: A hash table-based implementation.
   - `LinkedHashMap`: A hash table and linked list implementation that maintains the order of elements.
   - `TreeMap`: A Red-Black tree-based implementation that maintains sorted order.

### Key Concepts

- **Iterators**: Used to traverse collections.
- **Generics**: Used to ensure type safety.
- **Algorithms**: Utility methods for collections, like sorting and searching, provided by the `Collections` class.

## ArrayList

An ArrayList is a resizable array implementation of the List interface. It provides the flexibility of dynamic arrays that can grow as needed. It is part of the java.util package.

### Key Characteristics

- **Dynamic Size:** Unlike arrays, the size of an ArrayList can grow or shrink dynamically.
- **Index-Based:** Provides fast, random access to elements using an index.
- **Allows Duplicates:** ArrayList can contain duplicate elements.
- **Null Elements:** Allows storing null values.

### Arraylist Methods

| Method                  | Usage Description                                               | Time Complexity | Space Complexity |
|-------------------------|-----------------------------------------------------------------|-----------------|------------------|
| `add(E element)`        | Appends the specified element to the end of the list.           | O(1) amortized  | O(n) (dynamic resizing) |
| `add(int index, E element)` | Inserts the specified element at the specified position.       | O(n)            | O(n) (dynamic resizing) |
| `get(int index)`        | Returns the element at the specified position in the list.      | O(1)            | O(1)             |
| `set(int index, E element)` | Replaces the element at the specified position with the specified element. | O(1)            | O(1)             |
| `remove(int index)`     | Removes the element at the specified position.                  | O(n)            | O(n) (dynamic resizing) |
| `remove(Object o)`      | Removes the first occurrence of the specified element.          | O(n)            | O(n) (dynamic resizing) |
| `size()`                | Returns the number of elements in the list.                     | O(1)            | O(1)             |
| `clear()`               | Removes all elements from the list.                             | O(n)            | O(n) (dynamic resizing) |
| `contains(Object o)`    | Returns `true` if the list contains the specified element.      | O(n)            | O(1)             |
| `indexOf(Object o)`     | Returns the index of the first occurrence of the specified element. | O(n)         | O(1)             |
| `lastIndexOf(Object o)` | Returns the index of the last occurrence of the specified element. | O(n)         | O(1)             |
| `isEmpty()`             | Returns `true` if the list contains no elements.                | O(1)            | O(1)             |
| `toArray()`             | Returns an array containing all elements in the list.           | O(n)            | O(n)             |
| `iterator()`            | Returns an iterator over the elements in the list.              | O(1)            | O(1)             |
| `listIterator()`        | Returns a list iterator over the elements in the list.          | O(1)            | O(1)             |

### Notes

- **Amortized Complexity**: The amortized time complexity for adding elements is O(1) because the array resizes occasionally as it grows. Resizing involves copying elements to a new array, which is why it can occasionally be O(n).
- **Space Complexity**: The space complexity involves the dynamic resizing of the underlying array. When the array grows, a new array is created with increased capacity, typically 1.5 times the current size.
