# Object Oriented Programming - Inhenitance

## Concepts

### 🧠 What is Inheritance?

Inheritance allows a class (child/subclass) to **inherit properties and methods** from another class (parent/superclass). It helps in **code reusability** and **method overriding**.

---

### ✅ Basic Syntax

```java
class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}
```

### 🧪 Usage

```java
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();  // inherited method
        obj.show();     // child class method
    }
}
```

---

### 🏷️ Types of Inheritance in Java

1. **Single Inheritance** – One subclass inherits one superclass.
2. **Multilevel Inheritance** – A class inherits a class which inherits another class.
3. **Hierarchical Inheritance** – Multiple subclasses inherit one superclass.
4. (**Java does not support** multiple inheritance with classes — to avoid ambiguity — but it **does with interfaces**.)

---

### Constructor Chaining

Constructor chaining means one constructor calls another constructor within the same class or a parent class.

#### ✅ Ways of Constructor Chaining

- **Within the same class** using `this()`
- **From subclass to superclass** using `super()`

---

### 🧠 Key Rules for Constructor Chaining

1. Only one call to `this()` or `super()` is allowed — and it **must be the first line**.
2. If you don't explicitly call `super()`, Java tries to insert `super()` by default.
3. You can’t mix `this()` and `super()` in the same constructor.

---

#### 🔁 Full Example: Both `this()` and `super()`

```java
class Vehicle {
    Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    Car() {
        this("Sedan");
        System.out.println("Car default constructor");
    }

    Car(String model) {
        super("Car");
        System.out.println("Car model: " + model);
    }
}

// Vehicle type: Car
// Car model: Sedan
// Car default constructor
```

---

### 🔁 **Method Overriding**

**Method overriding** means **redefining a method** in a **subclass** that already exists in its **superclass** — with the **same method name, return type, and parameters**.

---

#### 📌 Why is it used?

To provide a **specific implementation** of a method in the **child class** — essentially, to change or enhance the behavior **inherited** from the parent.

---

#### ✅ Rules for Method Overriding in Java

1. **Same method signature** (name + parameters).
2. Return type should be the same (or covariant in Java 5+).
3. The overriding method **cannot have a more restrictive access modifier**.
4. Only **inherited methods** can be overridden.
5. Constructors **cannot** be overridden.
6. Use `@Override` annotation for clarity and compiler checks (optional but recommended).

---

#### 🔗 Relation to Inheritance

- **Inheritance enables overriding.** Without inheritance, there’s nothing to override.
- Overriding allows **runtime polymorphism** — behavior determined at runtime based on the object’s actual type.

---

### 📘 Example:

```java
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

### ⚠️ Special Notes

- You **can’t override**:
  - `final` methods (they can't be changed)
  - `static` methods (they're bound at compile time — they can be hidden, not overridden)
  - `private` methods (they're not inherited)
- You **can override**:
  - Abstract methods
  - Interface methods

---

### 🔁 **Method Overloading** (Compile-Time Polymorphism)

**Overloading** means creating **multiple methods with the same name** but **different parameter lists** within the same class.

> It’s like one name, many behaviors — depending on **arguments**.

#### 🎯 Key Points

- Happens **within the same class**
- Parameters must be **different in number or type**
- Return type can be same or different (but can't overload based on return type alone)
- Resolved at **compile-time**

#### ✅ Example

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

### 🔄 **Method Overriding** (Run-Time Polymorphism)

### ✅ What is it?

**Overriding** means **redefining a method** in a subclass that is already defined in the superclass.

> It’s like a subclass saying: *“I’ll do this differently than my parent.”*

#### 🎯 Key Points:

- Must have **same method signature**
- Happens in **inheritance hierarchy**
- Return type must be the same (or covariant — i.e., subtype)
- Access level must be **same or more permissive**
- Resolved at **run-time**
- Can’t override `final`, `static`, or `private` methods

#### ✅ Example of Overriding

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

```java
Animal obj = new Dog();
obj.sound();  // Output: Dog barks (runtime polymorphism)
```

---

### 🔍 Comparison Table

| Feature              | Overloading                          | Overriding                              |
|----------------------|---------------------------------------|------------------------------------------|
| Where                | Same class                           | Subclass (inherits from parent)          |
| Signature            | Must differ                          | Must be same                             |
| Return Type          | Can differ                           | Must be same (or covariant)              |
| Access Modifier      | Irrelevant                           | Cannot be more restrictive               |
| Static/Final Methods | Can be overloaded                    | Cannot be overridden                     |
| Resolution Time      | Compile-time                         | Runtime                                  |

---

### 💡 Bonus: Static Method Behavior

```java
class Parent {
    static void sayHi() {
        System.out.println("Hi from Parent");
    }
}

class Child extends Parent {
    static void sayHi() {
        System.out.println("Hi from Child");
    }
}
```

```java
Parent obj = new Child();
obj.sayHi();  // Output: Hi from Parent (not overridden, but hidden)
```

➡️ This is called **method hiding**, not overriding!

---

## FAQs

---

### 🔹 **Advanced Conceptual Questions**

8. **What is the role of the `super` keyword in inheritance?**
9. **How does Java handle constructor chaining in inheritance?**
10. **What is dynamic method dispatch (runtime polymorphism)?**
11. **Why doesn't Java support multiple inheritance using classes?**
12. **How can multiple inheritance be achieved in Java?**
13. **What are the pitfalls of deep inheritance hierarchies?**
14. **Can you inherit a class from another package? What about access modifiers?**

---

### 🔹 **Design-Oriented & Practical Questions**

15. **How do you decide when to use inheritance vs composition?**
16. **Can you explain the "Liskov Substitution Principle" with an example?**
17. **Have you ever refactored an inheritance-based design to use interfaces or composition? Why?**
18. **What are the downsides of using inheritance in large-scale applications?**
19. **Can you give a real-world use case where inheritance helped simplify your codebase?**
20. **How would you handle method conflicts in case of multiple interfaces having default methods?**

---

### 🔹 **Code-Based / Scenario Questions**

21. **Write a code snippet to show multilevel inheritance.**
22. **Create a scenario where overriding a method improves reusability.**
23. **Write code to demonstrate constructor chaining using `super`.**
24. **Given a class hierarchy, can you identify violations of OOP principles (e.g., tight coupling, breaking encapsulation)?**
25. **How would you test and mock inherited methods in unit testing?**

---

### What is the difference between `extends` and `implements`?

Perfect! Let's break it down in a clean and simple way:

---

### 🔹 `extends` vs `implements` in Java

Java supports inheritance through the use of the extends and implements keywords, allowing classes and interfaces to share behavior and structure.

| Feature                     | `extends`                             | `implements`                              |
|----------------------------|----------------------------------------|-------------------------------------------|
| **Used for**               | Inheriting a **class** or **abstract class** | Implementing an **interface**             |
| **Inheritance Type**       | Class inheritance (single inheritance) | Interface inheritance (can be multiple)   |
| **Syntax**                 | `class B extends A`                    | `class C implements I`                    |
| **Multiple allowed?**      | ❌ No (only one class)                 | ✅ Yes (multiple interfaces)              |
| **Can override methods?**  | ✅ Yes                                  | ✅ Yes (must override interface methods)  |
| **Is polymorphism supported?** | ✅ Yes                              | ✅ Yes                                     |
| **Can be used with abstract class?** | ✅ Yes                         | ❌ No                                     |

---

### Can constructors be inherited in Java?

No, constructors are not inherited in Java. Constructors are not members of a class like methods or fields — they are special blocks used only to initialize objects. When a subclass is created, its constructor must call the parent’s constructor, but it does not inherit it.
