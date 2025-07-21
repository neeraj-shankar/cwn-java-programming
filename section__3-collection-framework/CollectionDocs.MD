# **Understand the Basics**

## **What is the Collection Framework?**
The Java Collection Framework is a unified architecture for storing and manipulating groups of data (i.e., collections). It provides interfaces, classes, and algorithms to work with lists, sets, queues, maps, etc.


## **Key Interfaces**

- **List**: Ordered collection (ArrayList, LinkedList, Vector).
- **Set**: Unique elements (HashSet, LinkedHashSet, TreeSet).
- **Map**: Key-value pairs (HashMap, LinkedHashMap, TreeMap).

---

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