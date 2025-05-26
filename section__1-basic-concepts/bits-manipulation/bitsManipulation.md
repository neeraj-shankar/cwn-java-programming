# Bits Manipulation - A comprehensive walkthrough

---

## Basics Of Bits

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

## Bits - Topic Wise

### Bitwise XOR

**XOR (Exclusive OR)** compares each bit of two integers:

  1. Returns 1 if only one of the bits is 1

  2. Returns 0 if both bits are the same

| A | B | A ^ B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 1     |
| 1 | 0 | 1     |
| 1 | 1 | 0     |

### Bitwise Left Shift

The **left shift operator << shifts** the bits of a number to the left by a specified number of positions.

```java
result = number << n;
```

- This shifts the bits of number to the left by n positions
- Each shift left is equivalent to *multiplying the number by 2^n*.

#### ⚠️ Java Behavior

- Java fills in zeros from the right when shifting left.

- Bits shifted out of the left end are discarded.

- Java uses 32-bit integers for int and 64-bit for long.
