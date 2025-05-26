
class Animal {
    Animal(String s){
        System.out.println("Animal Constructor");
        System.out.println("Arugement pass: "+s);
    }
}

class Cat extends Animal{

    Cat(){
        super("Neeraj");
        System.out.println("Cat Constructor");
    }

}
public class Inheritance {
    
    public static void main(String[] args) {
        // Create Cat class instance
        Cat cat = new Cat();

    }
}
