import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student{

    String name;
    int age;

    // Constructor method
    Student(String name, int age){

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + "(" + age + ")";
    }
}
public class ComparatorInterface {

    public static void main(String[] args) {
        
        // Create a arraylist of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rajbhaan", 18));
        students.add(new Student("Neeraj", 39));
        students.add(new Student("Ankit", 19));

        // lets sort these object using age in ascending order
        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return Integer.compare(s1.age, s2.age);
            }
        };

        // sort arraylist using 
        System.out.println(students);
        Collections.sort(students, ageComparator);

        System.out.println(students);

        

    }
    
}
