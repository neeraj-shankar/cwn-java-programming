
// Create a main class Animal
class Animal{

    public void sound(){
        System.out.println("The animals have ability to make sound.");
    }
}

class Cat extends Animal{

    @Override
    public void sound() {
        super.sound();
        System.out.println("Specifically Cats do Meow..");
    }
}


public class AnimalWorld{

    public static void main(String[] args) {
        
        // Cat class object
        Cat cat = new Cat();

        // Calling methods in cat
        cat.sound();
    }
}