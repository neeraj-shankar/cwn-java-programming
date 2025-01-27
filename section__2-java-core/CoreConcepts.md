## **Object-Oriented Programming (OOP)** concepts—**Inheritance**, **Polymorphism**, **Abstraction**, and **Encapsulation**—and see how they work in Java. 🚀

---

### **1. Inheritance**

**Definition**:
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

**Output**:

```
This animal eats food.
The dog barks.
```

---

### **2. Polymorphism**

**Definition**:Polymorphism means "many forms." In Java, it allows the same method or object to behave differently in different contexts. This can happen in two ways:

- **Compile-time Polymorphism**: Method Overloading.
- **Run-time Polymorphism**: Method Overriding.

#### **a. Method Overloading** (Compile-time Polymorphism):

- Same method name but different parameter lists.

**Example**:

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));       // Output: 5
        System.out.println(calc.add(2.5, 3.5));  // Output: 6.0
    }
}
```

#### **b. Method Overriding** (Run-time Polymorphism):

- A child class provides a specific implementation of a method that is already defined in its parent class.

**Example**:

```java
class Animal {
    void sound() {
        System.out.println("Some generic animal sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Upcasting
        myAnimal.sound();            // Output: The dog barks.
    }
}
```

---

### **3. Abstraction**

**Definition**:Abstraction means hiding implementation details and showing only the essential features of an object. This is achieved through:

- **Abstract Classes**
- **Interfaces**

#### **Abstract Classes**:

- Use the `abstract` keyword.
- Can have both abstract methods (no body) and concrete methods (with body).

**Example**:

```java
abstract class Shape {
    abstract void draw();  // Abstract method (no implementation)

    void description() {   // Concrete method (with implementation)
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();        // Output: Drawing a circle.
        shape.description(); // Output: This is a shape.
    }
}
```

#### **Interfaces**:

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

### **Comparison Summary**

| Concept                 | Purpose                                                                                          | How It's Achieved                                   |
| ----------------------- | ------------------------------------------------------------------------------------------------ | --------------------------------------------------- |
| **Inheritance**   | Reuse code from a parent class.                                                                  | `extends` keyword.                                |
| **Polymorphism**  | Use the same method or object in different ways (overloading/overriding).                        | Method overloading/overriding.                      |
| **Abstraction**   | Hide unnecessary details and expose essential features.                                          | Abstract classes and interfaces.                    |
| **Encapsulation** | Protect data by restricting direct access and using getter/setter methods for controlled access. | `private` fields with `public` getters/setters. |

---

Would you like to dive deeper into any of these concepts or see more advanced examples? 😊
