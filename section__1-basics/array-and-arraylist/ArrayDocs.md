# Java Basics: Array and ArrayList

## Arrays

**Arrays** are one of the fundamental data structures in Java programming, so mastering them is crucial.

---

### **1. What is an Array?**
An array is a collection of elements of the same data type, stored in contiguous memory locations. In Java:
- Arrays are **fixed in size**.
- Arrays can hold **primitive data types** (like `int`, `char`, etc.) or **objects** (like `String`).

---

### **2. Declaring and Initializing Arrays**

#### **a. Declaration**
```java
int[] arr; // Preferred
// or
int arr[]; // Allowed but less common
```

#### **b. Initialization**
```java
arr = new int[5]; // Creates an array of size 5 with default values (0 for int)
```

#### **c. Declaration and Initialization in One Line**
```java
int[] arr = {1, 2, 3, 4, 5};
```

#### **d. Multidimensional Arrays**
```java
int[][] matrix = new int[2][3]; // A 2x3 matrix
int[][] predefined = {{1, 2, 3}, {4, 5, 6}};
```

---

### **3. Array Operations**

#### **a. Insert**
Add a value to a specific index in the array.

**Code Example**:
```java
int[] arr = new int[5];
arr[0] = 10;
arr[1] = 20;
System.out.println(arr[0]); // Output: 10
```

- **Time Complexity**:  
  - Best/Avg/Worst: **O(1)** (constant time, as arrays allow direct access by index).

#### **b. Traverse**
Access each element of the array one by one.

**Code Example**:
```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

- **Time Complexity**: **O(n)** (n is the size of the array).

#### **c. Search**
Find an element in the array.

- **Linear Search**:
  ```java
  int search(int[] arr, int target) {
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              return i; // Found
          }
      }
      return -1; // Not found
  }
  ```

  - **Time Complexity**: **O(n)** (worst case: traverse entire array).

- **Binary Search** (only for sorted arrays):
  ```java
  int binarySearch(int[] arr, int target) {
      int left = 0, right = arr.length - 1;
      while (left <= right) {
          int mid = left + (right - left) / 2;
          if (arr[mid] == target) {
              return mid;
          } else if (arr[mid] < target) {
              left = mid + 1;
          } else {
              right = mid - 1;
          }
      }
      return -1;
  }
  ```

  - **Time Complexity**: **O(log n)** (divide-and-conquer).

#### **d. Update**
Modify a value at a specific index.

**Code Example**:
```java
arr[2] = 99; // Updates the 3rd element to 99
```

- **Time Complexity**: **O(1)** (direct access by index).

#### **e. Delete**
You cannot change the size of an array in Java, but you can "simulate" deletion by setting the value to a special marker (e.g., `0` or `null`).

**Code Example**:
```java
arr[2] = 0; // Simulate deletion by setting value to 0
```

- **Time Complexity**: **O(1)**

#### **f. Resize**
Java arrays are fixed in size. To resize an array:
- Create a new array with a larger or smaller size.
- Copy elements from the old array to the new one.

**Code Example**:
```java
int[] oldArr = {1, 2, 3};
int[] newArr = new int[5];

// Copy elements
for (int i = 0; i < oldArr.length; i++) {
    newArr[i] = oldArr[i];
}
```

- **Time Complexity**: **O(n)** (copy all elements).

---

### **4. Space Complexity**
- **Arrays in Java** use **O(n)** space for storing elements, where `n` is the number of elements.
- Additional space might be required during operations (e.g., resizing requires temporary extra space for the new array).

---
---

### **6. Time and Space Complexity of Operations**

| **Operation** | **Time Complexity**   | **Space Complexity** |
|---------------|------------------------|-----------------------|
| Insert        | **O(1)**               | **O(1)**             |
| Traverse      | **O(n)**               | **O(1)**             |
| Search        | **O(n)** (Linear)      | **O(1)**             |
|               | **O(log n)** (Binary)  | **O(1)**             |
| Update        | **O(1)**               | **O(1)**             |
| Delete        | **O(n)** (shifting)    | **O(1)**             |
| Resize        | **O(n)**               | **O(n)** (temporary) |

---

### **7. Key Points**
- Use **arrays** for fixed-size, indexed collections.
- If dynamic resizing is needed, consider **ArrayList**, which abstracts resizing internally.
- For most array operations (insert, delete, search), understanding the **time complexity** helps optimize your code.

Great! Let’s dive into **dynamic arrays** in Java using **ArrayList**. It’s a very powerful and commonly used data structure because it solves the biggest limitation of arrays: **fixed size**. 

---

### **1. What is an ArrayList?**
- **ArrayList** is part of the **Java Collections Framework** (`java.util` package).
- Unlike arrays, **ArrayList** can dynamically resize itself when elements are added or removed.
- It maintains **insertion order** and allows random access using indices (just like arrays).

---

### **2. Declaring and Initializing an ArrayList**

#### **a. Declaration**
```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
// Syntax: ArrayList<DataType> variableName = new ArrayList<>();
```

#### **b. Add Elements**
```java
list.add(10); // Adds 10
list.add(20);
System.out.println(list); // Output: [10, 20]
```

#### **c. Access Elements**
```java
System.out.println(list.get(0)); // Accesses the element at index 0 (Output: 10)
```

#### **d. Remove Elements**
```java
list.remove(0); // Removes the element at index 0
System.out.println(list); // Output: [20]
```

#### **e. Other Initialization Options**
```java
ArrayList<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
System.out.println(names); // Output: [Alice, Bob, Charlie]
```

---

### **3. Common Operations on ArrayList**

Let’s explore common operations step-by-step with their time complexity.

#### **a. Add**
```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10); // Adds 10 to the list
list.add(20);
System.out.println(list); // Output: [10, 20]
```
- **Time Complexity**:  
  - **O(1)** for adding at the end (amortized, due to resizing).
  - **O(n)** when adding at a specific index, because elements may need to be shifted.

#### **b. Insert at a Specific Index**
```java
list.add(1, 15); // Adds 15 at index 1
System.out.println(list); // Output: [10, 15, 20]
```
- **Time Complexity**: **O(n)** (shifts elements to the right).

#### **c. Get (Access)**
```java
System.out.println(list.get(0)); // Output: 10
```
- **Time Complexity**: **O(1)** (random access).

#### **d. Update**
```java
list.set(1, 25); // Updates the element at index 1 to 25
System.out.println(list); // Output: [10, 25, 20]
```
- **Time Complexity**: **O(1)**

#### **e. Remove**
```java
list.remove(1); // Removes the element at index 1
System.out.println(list); // Output: [10, 20]
```
- **Time Complexity**:  
  - **O(n)** (shifts elements to the left).

#### **f. Check Size**
```java
System.out.println(list.size()); // Output: 2
```
- **Time Complexity**: **O(1)**

#### **g. Iterate (Traverse)**
```java
for (int num : list) {
    System.out.println(num);
}
```
- **Time Complexity**: **O(n)**

#### **h. Clear the List**
```java
list.clear(); // Removes all elements from the list
System.out.println(list); // Output: []
```
- **Time Complexity**: **O(n)**

---

### **4. Complete Program with ArrayList Operations**

Here’s a complete program that demonstrates **add, insert, update, delete, and traverse** operations with `ArrayList`:

```java
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After Adding: " + list);

        // Insert at a specific index
        list.add(1, 15); // Inserts 15 at index 1
        System.out.println("After Inserting: " + list);

        // Get an element
        int value = list.get(2);
        System.out.println("Element at Index 2: " + value);

        // Update an element
        list.set(2, 25); // Updates index 2 to 25
        System.out.println("After Updating: " + list);

        // Remove an element
        list.remove(1); // Removes the element at index 1
        System.out.println("After Removing: " + list);

        // Traverse the list
        System.out.print("Traversing: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clear the list
        list.clear();
        System.out.println("After Clearing: " + list);
    }
}
```

---

### **5. Differences Between Arrays and ArrayLists**

| **Feature**        | **Array**                          | **ArrayList**                      |
|---------------------|------------------------------------|-------------------------------------|
| **Size**           | Fixed size                        | Dynamic size                        |
| **Type**           | Can store primitives and objects  | Can store objects only              |
| **Resize**         | Needs manual implementation       | Automatically resizes               |
| **Performance**    | Faster (no resizing overhead)     | Slightly slower (resizing overhead) |
| **Methods**        | Limited operations                | Rich API (e.g., `add`, `remove`)    |

---

### **6. Time Complexity of ArrayList Operations**

| **Operation**       | **Time Complexity**   |
|---------------------|------------------------|
| Add (end)          | **O(1)** (amortized)   |
| Add (specific index)| **O(n)**               |
| Remove (end)       | **O(1)**               |
| Remove (specific index)| **O(n)**            |
| Access (get/set)   | **O(1)**               |
| Search (contains)  | **O(n)**               |
| Traverse           | **O(n)**               |

---

### **7. Use Cases for ArrayList**
- **Dynamic Collections**: When you don't know the size of the collection in advance.
- **Frequent Insertions/Removals at the End**: Adding/removing elements at the end is efficient.
- **Traversals and Random Access**: Accessing elements by index is fast.

---
