 class Student {
    int age;
    String name;

    void display(){
            System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
    }

    void sayHello(String name){
            System.out.println(this.name + " says hello to " + name);
    }
}


public class Client {
  public static void main(String[] args) {

      Student s1 = new Student();

      // Checking the initialized from in class Student.
      System.out.println("The Mem address of s1: "+ s1);
      System.out.println("The initial value of "+ s1.age);
      System.out.println("The initial value of name: "+ s1.name);

      s1.age = 10;
      s1.name = "A";
      s1.display();

      Student s2 = s1;
      System.out.println("The Mem Loc of s2: "+ s2);
      s2.age = 20;
      s2.name = "B";

      s2.display();

      s1.display();
  }
}