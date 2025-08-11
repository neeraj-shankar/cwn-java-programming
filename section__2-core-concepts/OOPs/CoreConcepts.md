# **Object-Oriented Programming** 🚀

## Classes and Objects
A class in Java is a blueprint or template for creating objects.
It defines fields (variables) and methods (functions) that describe the behavior and state of the object.

```java
public class Person {
    // Fields / attributes
    String name;
    int age;

    // Method
    void sayHello() {
        System.out.println("Hello! My name is " + name);
    }
}
```

---

## ✨ Key Concepts to Learn in Classes:

| Concept             | Description                                               |
| ------------------- | --------------------------------------------------------- |
| Fields (Attributes) | Variables inside a class                                  |
| Methods             | Functions that define behavior                            |
| Constructor         | Special method to initialize objects                      |
| `this` keyword      | Refers to the current object                              |
| Access Modifiers    | `public`, `private`, `protected`                          |
| Static Members      | Belong to the class, not the object                       |
| Inheritance         | One class inherits from another                           |
| Encapsulation       | Hiding internal data with `private` and `getters/setters` |

---

## Polymorphism
**Polymorphism** means *“many forms”*. In Java, it allows an object to take **many forms** — i.e., the **same method name** can behave **differently** depending on the object/class.

### 🔥 Real-life analogy:
---

## ✅ Two Types of Polymorphism in Java:

| Type             | When It Happens    | How It's Achieved               |
| ---------------- | ------------------ | ------------------------------- |
| **Compile-time** | During compilation | Method Overloading              |
| **Runtime**      | During program run | Method Overriding + Inheritance |

---

## 1. ✅ Compile-time Polymorphism (Method Overloading)

**Same method name, different parameters**

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

👉 Java decides **at compile time** which `add()` to call, based on parameters.

---

## 2. ✅ Runtime Polymorphism (Method Overriding + Inheritance)

**Same method signature, different class behavior**

```java
class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}
```
👉 Even though `a` is of type `Animal`, **Java uses the actual object type** (`Dog` or `Cat`) **at runtime** to decide which `speak()` to call.

---

## 🎯 Why Use Polymorphism?

* **Flexibility**: Write code that works on parent classes/interfaces, not just specific classes.
* **Scalability**: Easily extend behavior by adding new subclasses.
* **Clean code**: Avoid repetitive if-else or switch-case logic.

---

### FAQs
Great! Here are some **polymorphism-focused Java interview questions** suitable for a developer with **4–5 years of experience** — along with how you might approach or answer them in an interview setting.

---

### 🔶 1. **What is polymorphism in Java and how is it implemented?**

**Expected Answer:**
Polymorphism means the ability of a variable, function, or object to take multiple forms. In Java, it is implemented in two ways:

* **Compile-time polymorphism** via *method overloading*
* **Runtime polymorphism** via *method overriding*

---

### 🔶 2. **What is method overloading? Can it happen across classes?**

**Expected Answer:**
Method overloading is having multiple methods with the same name but different parameters within the **same class**. It can't happen *across classes* — that's overriding, not overloading.

```java
void print(String s) {}
void print(String s, int count) {}
```

---

### 🔶 3. **What is method overriding? What rules must be followed?**

**Expected Answer:**
Overriding means redefining a method from the parent class in a subclass.

Rules:

* Method signature must be **identical**
* The method in the subclass must have **same or more accessible** visibility
* Return type should be the **same or covariant**
* The method should not be `static`, `final`, or `private`

---

### 🔶 4. **Can you override a static method in Java? Why or why not?**

**Expected Answer:**
No. Static methods belong to the class, not the object. So they are **hidden**, not overridden. This is called **method hiding**.

```java
class A {
    static void show() { System.out.println("A"); }
}
class B extends A {
    static void show() { System.out.println("B"); }
}
```

---

### 🔶 5. **What is dynamic method dispatch in Java?**

**Expected Answer:**
Dynamic method dispatch is the mechanism by which the **Java Virtual Machine (JVM)** determines which version of an overridden method to call at **runtime**, based on the actual object type, not the reference type.

---

### 🔶 6. **Can constructors be polymorphic (overloaded/overridden)?**

* **Overloading:** Yes, you can have multiple constructors in the same class.
* **Overriding:** No, constructors can't be inherited or overridden.

---

### 🔶 7. **Can you provide a real-life use case where polymorphism is useful in code?**

**Example:**

You have a list of `Shape` objects:

```java
List<Shape> shapes = List.of(new Circle(), new Rectangle(), new Triangle());
for (Shape shape : shapes) {
    shape.draw(); // Polymorphic behavior
}
```

Each `Shape` subclass overrides `draw()`, but the code treats them all uniformly.

---

### 🔶 8. **What happens if you use an interface reference to a class object?**

```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
```

```java
Animal a = new Dog();
a.makeSound();  // Bark (runtime polymorphism)
```

---


### **1. Inheritance**
Inheritance allows one class (child class) to inherit the properties and methods of another class (parent class). This promotes **code reuse** and helps create a hierarchy of classes.

**Key Points**:

- Parent class: The class whose properties are inherited.
- Child class: The class that inherits the parent class's properties and methods.
- The `extends` keyword is used for inheritance.

**Example**:

```java
// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Defined in Dog
    }
}
```


---

## Abstraction
Abstraction means hiding implementation details and showing only the essential features of an object. This is achieved through:

- **Abstract Classes**
- **Interfaces**

#### **Abstract Classes**:

- Use the `abstract` keyword.
- Can have both abstract methods (no body) and concrete methods (with body).

## Intefaces:

- Use the `interface` keyword.
- Only contains abstract methods (until Java 8; from Java 8+, it can have default and static methods).

**Example**:

```java
interface Vehicle {
    void drive(); // Abstract method
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive(); // Output: Driving a car.
    }
}
```

---

### **4. Encapsulation**

**Definition**:
Encapsulation is the concept of wrapping data (fields) and methods into a single unit (class) and restricting direct access to them using **access modifiers**. This helps in maintaining control over the data and ensures security.

**How to achieve encapsulation?**

1. Make fields `private`.
2. Provide `public` getter and setter methods to access and update the fields.

**Example**:

```java
class Employee {
    private String name; // Private field
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setAge(30);

        System.out.println("Name: " + emp.getName()); // Output: Name: John
        System.out.println("Age: " + emp.getAge());   // Output: Age: 30
    }
}
```

---
