# Java Collection Framework

## **What is the Collection Framework?**
The Java Collection Framework is a unified architecture for storing and manipulating groups of data (i.e., collections). It provides interfaces, classes, and algorithms to work with lists, sets, queues, maps, etc.


1. **Collection**: The root interface of the collection hierarchy. It is a group of objects, known as its elements.

2. **List**: An ordered collection (also known as a sequence). Lists can contain duplicate elements. Common implementations include:
   - `ArrayList`: A resizable array implementation.
   - `LinkedList`: An implementation using a doubly linked list.
   - `Vector`: A synchronized version of `ArrayList`.

3. **Set**: A collection that cannot contain duplicate elements. Common implementations include:
   - `HashSet`: A set based on a hash table.
   - `LinkedHashSet`: A hash table and linked list implementation that maintains the order of elements.
   - `TreeSet`: A set that uses a tree for storage, maintaining sorted order.

## Major Implementations

| Interface | Implementations                                                         |
| --------- | ----------------------------------------------------------------------- |
| `List`    | `ArrayList`, `LinkedList`, `Vector`, `Stack`                            |
| `Set`     | `HashSet`, `LinkedHashSet`, `TreeSet`                                   |
| `Queue`   | `PriorityQueue`, `ArrayDeque`, `LinkedList`                             |
| `Deque`   | `ArrayDeque`, `LinkedList`                                              |
| `Map`     | `HashMap`, `TreeMap`, `LinkedHashMap`, `Hashtable`, `ConcurrentHashMap` |


## List Interface
It is part of the java.util package and extends the Collection interface. List is an ordered collection (also known as a sequence). It Maintains insertion order, Allows duplicates, Supports index-based access.

### Commonly Used Implementations of List

| Class        | Key Characteristics                                                    |
| ------------ | ---------------------------------------------------------------------- |
| `ArrayList`  | Fast random access, dynamic array, slow inserts/removals in the middle |
| `LinkedList` | Doubly-linked list, fast inserts/removals anywhere, slower access      |
| `Vector`     | Legacy class, synchronized (thread-safe), slower performance           |
| `Stack`      | Subclass of `Vector`, follows LIFO order                               |

### Comparison Between Implementations

| Feature       | `ArrayList`     | `LinkedList`        | `Vector`           |
| ------------- | --------------- | ------------------- | ------------------ |
| Backing Data  | Array           | Doubly Linked List  | Array              |
| Access Speed  | Fast (O(1))     | Slow (O(n))         | Fast (O(1))        |
| Insert/Delete | Slow (O(n))     | Fast (O(1)/O(n))    | Slow (O(n))        |
| Thread Safe   | No              | No                  | Yes                |
| Use Case      | Frequent access | Frequent add/remove | Legacy/thread-safe |

### 📌 Key Methods of List Interface

- add(E element)
- add(int index, E element)
- get(int index)
- set(int index, E element)
- remove(int index) / remove(Object o)
- indexOf(Object o)
- lastIndexOf(Object o)
- subList(int fromIndex, int toIndex)
