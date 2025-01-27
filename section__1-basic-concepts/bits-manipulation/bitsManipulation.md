Let's dive into **bitwise operations** and **bit masking**, as these are foundational to bit manipulation in Java.

---

### **1. Bitwise Operations in Java**

Java provides six primary bitwise operators that operate directly on bits of integers (`int` and `long` types):

| Operator | Description                                                              | Example                                         |
| -------- | ------------------------------------------------------------------------ | ----------------------------------------------- |
| `&`    | AND: Sets each bit to 1 if both bits are 1.                              | `5 & 3 = 1`                                   |
| `        | `                                                                        | OR: Sets each bit to 1 if one of the bits is 1. |
| `^`    | XOR: Sets each bit to 1 if only one bit is 1.                            | `5 ^ 3 = 6`                                   |
| `~`    | NOT: Inverts all the bits.                                               | `~5 = -6`                                     |
| `<<`   | Left Shift: Shifts bits to the left, filling 0 from the right.           | `5 << 1 = 10`                                 |
| `>>`   | Right Shift: Shifts bits to the right, keeping the sign bit.             | `5 >> 1 = 2`                                  |
| `>>>`  | Unsigned Right Shift: Shifts bits to the right, filling 0 from the left. | `-5 >>> 1 = ...`                              |

#### **Examples**

```java
public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("a & b = " + (a & b)); // AND: 0001 -> 1
        System.out.println("a | b = " + (a | b)); // OR: 0111 -> 7
        System.out.println("a ^ b = " + (a ^ b)); // XOR: 0110 -> 6
        System.out.println("~a = " + (~a));       // NOT: 1010 -> -6
        System.out.println("a << 1 = " + (a << 1)); // Left Shift: 1010 -> 10
        System.out.println("a >> 1 = " + (a >> 1)); // Right Shift: 0010 -> 2
    }
}
```

---

### **2. Bit Masks**

A **bit mask** is a binary number that is used to manipulate specific bits of another number. Common operations include setting, clearing, toggling, and checking bits.

#### **Common Bit Mask Operations**

1. **Set a bit**

   - To set the `i-th` bit to 1:
     ```java
     int num = 5; // Binary: 0101
     int i = 1;
     int mask = 1 << i;  // Create mask: 0010
     num = num | mask;   // Set bit: 0111
     System.out.println(num); // Output: 7
     ```
2. **Clear a bit**

   - To clear the `i-th` bit (set it to 0):
     ```java
     int num = 5; // Binary: 0101
     int i = 0;
     int mask = ~(1 << i); // Create mask: 1110
     num = num & mask;     // Clear bit: 0100
     System.out.println(num); // Output: 4
     ```
3. **Toggle a bit**

   - To flip the `i-th` bit:
     ```java
     int num = 5; // Binary: 0101
     int i = 1;
     int mask = 1 << i; // Create mask: 0010
     num = num ^ mask;  // Toggle bit: 0111
     System.out.println(num); // Output: 7
     ```
4. **Check if a bit is set**

   - To check if the `i-th` bit is 1:
     ```java
     int num = 5; // Binary: 0101
     int i = 2;
     int mask = 1 << i; // Create mask: 0100
     boolean isSet = (num & mask) != 0;
     System.out.println(isSet); // Output: true
     ```

#### **Practical Example: Extract Odd/Even**

- **Check if a number is odd or even:**
  ```java
  public class BitMaskDemo {
      public static void main(String[] args) {
          int num = 5; // Binary: 0101
          if ((num & 1) == 1) {
              System.out.println(num + " is Odd");
          } else {
              System.out.println(num + " is Even");
          }
      }
  }
  ```

---

### **Key Applications of Bit Manipulation**

- **Count set bits** (Hamming Weight).
- **Detect power of two**.
- **Reverse bits** in an integer.
- **Find the unique number** in an array where all others appear twice.
- **Efficient subset generation** using binary representation.

---

Where do you want to go next? Should we dive into specific problems, or explore advanced applications like subset generation or efficient XOR tricks?n
