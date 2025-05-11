# Hashmaps

## Here’s a categorized list of **HashMap interview questions**—from **conceptual** to **coding-based**—tailored for your level 👇

---

### ✅ **Core Conceptual Questions**
1. **How does a HashMap work internally in Java?**
2. **What happens when two keys have the same hashcode?**
3. **What is the significance of `equals()` and `hashCode()` in HashMap?**
4. **How does Java resolve collisions in HashMap?**
5. **What is the load factor and threshold in HashMap?**
6. **What are the time complexities for get(), put(), remove()?**
7. **How does HashMap handle resizing?**
8. **What is the difference between `HashMap`, `Hashtable`, and `ConcurrentHashMap`?**
9. **Is HashMap thread-safe? How can you make it thread-safe?**
10. **What happens if we insert a key with `null` in a HashMap?**

---

### 🧠 **Advanced/Internal Mechanism**
1. **What is the significance of TreeNode in HashMap in Java 8?**
2. **Explain how HashMap changed from Java 7 to Java 8.**
3. **How are keys distributed across buckets in a HashMap?**
4. **Can we store mutable objects as keys in a HashMap? What are the consequences?**
5. **Why is it a bad idea to use objects that override `hashCode()` in a non-consistent way as keys?**
6. **Explain fail-fast behavior in HashMap.**
7. **How would you implement your own custom hash function?**

---

### 💻 **Coding / Problem-Solving with HashMap**
1. **Find the first non-repeating character in a string.**
2. **Group anagrams together from a list of strings.**
3. **Find the length of the longest subarray with sum 0.**
4. **Two Sum problem — find pairs in array that sum to target.**
5. **Find duplicate elements in an array.**
6. **Top K frequent elements.**
7. **Check if two strings are isomorphic.**
8. **Subarray sum equals K.**
9. **Longest substring without repeating characters.**
10. **Find the majority element in an array (appears > n/2 times).**

---

### 📦 **Real-world Use Case Discussions**
1. **Have you used HashMap in a multithreaded environment? How did you manage synchronization?**
2. **How did you use HashMap in a recent project?**
3. **How would you cache frequently used data using HashMap?**
4. **Design an LRU Cache using HashMap and LinkedList.**
5. **How would you handle memory leaks in long-lived HashMaps?**

---

## **How does a HashMap work internally in Java?**
A HashMap<K, V> stores key-value pairs. Internally, it uses an array of buckets, where each bucket is a linked list (or tree in Java 8+) that handles hash collisions.
