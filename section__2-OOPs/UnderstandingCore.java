class Test {
   public int x = 10;
   private int y = 20;

    public int findSum(){
        int result = x + y;

        return result;
    }
}

class Student {
    String name;
    int age;
    double psp;

    Student(String s, int a, double p){
        this.name = s;
        this.age = a;
        this.psp = p;
    }
}


public class UnderstandingCore {

    public static void main(String[] args) {
        
        // Create Class object 
        Test test = new Test();

        System.out.println("The sum of tow nums: "+ test.findSum());
        System.out.println("The value of X: "+ test.x);
        System.out.println("Mem Location of test object: "+ test);

        // Creating Student class objects
        Student stu = new Student("Yogesh", 29, 100);
        System.out.println(stu.name);
    }
    
}
