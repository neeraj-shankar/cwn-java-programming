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
 
 public class Client1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        System.out.println("The adrress of S1: "+ s1);

        Student s2 = new Student();
        System.out.println("The adrress of S2: "+ s2);
 
        Student temp = s1;
        System.out.println("The adrress of tem: "+ temp);
        s1 = s2;
        System.out.println("The adrress of S1: "+ s1);
        s1.display();
        temp.display();
        s2 = temp;
 
        s2.display();
 
    }
 }