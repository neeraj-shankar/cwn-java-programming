# Basics of Java Programming

## Variables in Java

A **variable** is a named memory location that holds a value which can change during program execution.

In Java, variables are **strongly typed**, meaning you must declare the data type.

---

### ✅ **Types of Variables**

#### 1. **Local Variables**

- Declared **inside a method, constructor, or block**
- Must be **initialized** before use
- **Not accessible** outside the method/block

#### 2. **Instance Variables (a.k.a non-static fields)**

- Declared **inside a class** but **outside any method**
- Belong to the **object** (each object gets its own copy)
- Default values: `0`, `false`, or `null` (if uninitialized)

#### 3. **Static Variables (Class variables)**

- Declared with the `static` keyword
- Shared among **all instances** of a class
- Often used for **counters**, **constants**, or **shared config**

#### 4. **Final Variables**

- Declared with the `final` keyword → **constant** (cannot be changed after assignment)
- Must be initialized once — either **immediately**, in a **constructor**, or in a **static block** (for static finals)

---

### 🔁 Variable Shadowing

If a local variable has the same name as an instance variable, the local one "shadows" the instance variable.

---

### 🔍 Variable Scope & Lifetime

| Variable Type | Scope                  | Lifetime                         |
|---------------|------------------------|----------------------------------|
| Local         | Within method/block    | Created when method is called    |
| Instance      | Within class           | Exists as long as the object     |
| Static        | Within class (shared)  | Exists until class is unloaded   |

---

#### ✅ Example: All Variables in One

```java
class Demo {
    static int staticVar = 10;       // static variable
    int instanceVar = 5;             // instance variable

    void display() {
        int localVar = 3;            // local variable
        final int finalVar = 100;    // final local variable
        System.out.println(staticVar + ", " + instanceVar + ", " + localVar + ", " + finalVar);
    }
}
```

---

Want to try a small quiz or exercise on this? Or shall we move to **Access Modifiers** next?
