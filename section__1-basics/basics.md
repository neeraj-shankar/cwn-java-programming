# Basics of Java Programming

## Modules, Packages and classes

Before we go deep into package-level access and inheritance visibility, understanding **Java’s structure** — **packages, modules, and class hierarchy** — will make everything much clearer. Let’s break it down piece by piece.

---

### 📦 **1. Packages in Java**

A **package** in Java is like a folder in a file system. It helps:

- Group **related classes and interfaces**
- Avoid **name conflicts**
- Provide **access control**

#### ✅ Types of Packages:

- **Built-in** (e.g., `java.util`, `java.io`, `java.lang`)
- **User-defined** (you create your own)

```java
package myapp.utils;

public class Logger {
    public void log(String msg) {
        System.out.println(msg);
    }
}
```

You import it like:

```java
import myapp.utils.Logger;
```

---

### 📦🧱 **2. Modules (Java 9+)**

A **module** is a higher-level grouping than a package. It:

- Encapsulates packages
- Specifies which packages are **exported**
- Declares dependencies on other modules

Modules are defined in `module-info.java`:

```java
module my.application {
    requires java.logging;        // dependency
    exports myapp.api;            // make this package accessible to others
}
```

#### ✅ Benefits

- Strong encapsulation
- Better organization in large projects
- Control over what gets exposed (even across packages)

---

### 🧬 **3. Class Hierarchy in Java**

All classes in Java **inherit (directly or indirectly)** from the `Object` class.

#### 🔹 Base of all classes

```java
public class Object {
    // has methods like:
    toString(), equals(), hashCode(), clone(), wait(), notify(), etc.
}
```

Even if you don’t explicitly extend anything:

```java
class MyClass {
}
```

It’s internally like:

```java
class MyClass extends Object {
}
```

---

#### 📚 Example: Class Hierarchy Tree

```java
java.lang.Object
   └── java.util.AbstractCollection
         └── java.util.ArrayList
```

You can think of it like a family tree where:

- `Object` is the ancestor
- Everything else inherits behaviors from it

---

## 🧠 Summary: How Everything Connects

| Concept     | Acts Like               | Purpose                            |
|-------------|-------------------------|-------------------------------------|
| Class       | A blueprint              | Holds data and behavior             |
| Package     | A folder                 | Organizes related classes/interfaces|
| Module      | A boundary manager       | Controls dependencies & visibility |
| Object      | Root class               | Base of every class in Java        |

---

Now that we’ve got the full architecture in mind — want to **see visibility in action** with classes from different **packages** and **access modifiers**?

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

Sweet! Let’s get into **Access Modifiers** — they’re key to **encapsulation** and **controlling visibility** in Java. Think of them as visibility guards that decide who gets to access what. 🛡️

---

## Access Modifiers

Access modifiers determine **who can see or use** a class, variable, method, or constructor.

There are **four** main access levels in Java:

| Modifier   | Class | Package | Subclass | World |
|------------|-------|---------|----------|-------|
| `private`  | ✅    | ❌      | ❌       | ❌    |
| _default_  | ✅    | ✅      | ❌       | ❌    |
| `protected`| ✅    | ✅      | ✅       | ❌    |
| `public`   | ✅    | ✅      | ✅       | ✅    |

---

### 🔹 1. `private`

- Most restrictive.
- Accessible **only within the same class**.
- Used to **hide internal details** (data hiding / encapsulation).

```java
class Demo {
    private int secret = 42;

    private void whisper() {
        System.out.println("Shhh...");
    }
}
```

🛑 `secret` and `whisper()` are not accessible from outside the class.

---

### 🔹 2. _Default_ (No modifier)

- Accessible **within the same package**.
- Also called **package-private**.
- Not accessible from outside the package.

```java
class PackageDemo {
    int value = 100;  // default access

    void sayHi() {
        System.out.println("Hi from same package");
    }
}
```

---

### 🔹 3. `protected`

- Accessible:
  - **Within the same package**
  - **In subclasses** (even if they’re in different packages)
- Useful when you want to give **subclasses access**, but not the whole world.

```java
class Animal {
    protected void breathe() {
        System.out.println("Breathing...");
    }
}
```

---

### 🔹 4. `public`

- Least restrictive — accessible **from anywhere** (any class, any package).
- Typically used for:
  - `main()` method
  - Utility classes/methods
  - Public APIs

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Accessible from everywhere!");
    }
}
```

---

### 🔍 Access Modifiers — Where Can They Be Used?

| Element       | Allowed Modifiers                    |
|---------------|--------------------------------------|
| Class         | `public`, _default_                  |
| Variables     | `private`, `protected`, `public`, _default_ |
| Methods       | Same as variables                    |
| Constructors  | Same as methods                      |
| Inner classes | All four                             |

---

#### ✅ Example Summary

```java
public class Parent {
    private int a = 10;
    int b = 20;             // default
    protected int c = 30;
    public int d = 40;

    private void privateMethod() {}
    void defaultMethod() {}
    protected void protectedMethod() {}
    public void publicMethod() {}
}
```

---

🧩 **Interface in Java**

An **interface** is like a **contract**: it defines **what** should be done, but **not how**.

> 🧠 Think of it as a blueprint of a class — **only method declarations**, no implementation (until Java 8+).

---

### ✅ **Key Features of Interfaces**

- Use the `interface` keyword
- Can contain:
  - **Abstract methods** (no body)
  - **Constants** (`public static final` fields)
  - **Default methods** (from Java 8+)
  - **Static methods** (Java 8+)
  - **Private methods** (Java 9+)

---

### 💡 Example: Basic Interface

```java
interface Animal {
    void eat();           // implicitly public and abstract
    void sleep();
}
```

### ✅ Implementing an Interface

```java
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats kibble");
    }

    public void sleep() {
        System.out.println("Dog sleeps at night");
    }
}
```

---

### 🔄 **Multiple Inheritance with Interfaces**

Java doesn’t support multiple inheritance with classes, but **interfaces make it possible**.

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies");
    }

    public void swim() {
        System.out.println("Duck swims");
    }
}
```

---

### 🧱 Interface vs Abstract Class

| Feature                  | Interface                     | Abstract Class              |
|--------------------------|-------------------------------|-----------------------------|
| Keyword                  | `interface`                   | `abstract class`            |
| Inheritance              | Multiple (via interfaces)     | Single inheritance          |
| Method implementation    | Not allowed (till Java 7)     | Allowed                     |
| Default/Static Methods   | Java 8+                       | Allowed                     |
| Access Modifiers         | Methods are `public abstract` | Can have any                |
| Constructors             | ❌ No                         | ✅ Yes                       |

---

## 🚀 Java 8+ Interface Enhancements

### 🔹 Default Methods

Allow methods with implementation inside interfaces.

```java
interface Vehicle {
    default void honk() {
        System.out.println("Honking...");
    }
}
```

### 🔹 Static Methods

Can be called on the interface itself.

```java
interface Helper {
    static void printHelp() {
        System.out.println("Help Info");
    }
}
```

---

### 🔹 Private Methods (Java 9+)

Used to reduce code duplication inside default/static methods.

```java
interface MyInterface {
    private void log(String msg) {
        System.out.println("LOG: " + msg);
    }

    default void doSomething() {
        log("Doing something");
    }
}
```

---

### 🎯 Real-World Analogy

> An interface is like a **remote control** — it defines **buttons (methods)** but doesn't care **how the device works inside**. You can have different TVs (classes) implementing the same remote interface in different ways.

---
