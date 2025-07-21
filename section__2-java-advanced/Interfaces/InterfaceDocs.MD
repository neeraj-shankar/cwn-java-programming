# Interface in Java

## Comparator

In Java, a `Comparator` is an interface used to define custom ordering for objects. It provides a way to control the order of objects when sorting collections that don't have a natural ordering or when you want to override the natural ordering.

### Key Features of Comparator

- **Custom Ordering**: Allows you to define a custom order for objects, separate from their natural order.
- **Multiple Sort Criteria**: You can define different comparators to sort the same type of objects using different criteria.
- **Functional Interface**: Since Java 8, `Comparator` is a functional interface, allowing the use of lambda expressions to implement its methods.

### Methods in Comparator

- **compare(T o1, T o2)**: This method compares two objects and returns:
  - A negative integer if the first object is less than the second.
  - Zero if the objects are equal.
  - A positive integer if the first object is greater than the second.

- **equals(Object obj)**: This method checks whether some other object is equal to the comparator.

### Example Usage

Here's how you might use a `Comparator` to sort a list of objects:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 25));

        // Define a Comparator to sort students by age
        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        };

        // Alternatively, using a lambda expression (Java 8+)
        // Comparator<Student> ageComparator = (s1, s2) -> Integer.compare(s1.age, s2.age);

        // Sort the list using the Comparator
        Collections.sort(students, ageComparator);

        // Print the sorted list
        System.out.println("Students sorted by age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
```

### Explanation

- **Custom Comparator**: The `ageComparator` is defined to sort `Student` objects by their age.
- **Sorting with Comparator**: `Collections.sort(students, ageComparator);` sorts the list using the specified comparator.
- **Lambda Expressions**: For simplicity and conciseness, you can use lambda expressions to define the comparator if using Java 8 or later.

### Additional Features

- **Chaining Comparators**: You can chain comparators using `Comparator.thenComparing` to sort by multiple criteria.
- **Natural Order Comparator**: Use `Comparator.naturalOrder()` and `Comparator.reverseOrder()` for natural ordering or reverse ordering.

The `Comparator` interface is powerful for customizing the sorting logic of collections beyond their natural ordering. If you have more questions or need further examples, feel free to ask!
