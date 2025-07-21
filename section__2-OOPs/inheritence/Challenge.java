class Vehicle {
    String type = "Generic Vehicle";

    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    void showType() {
        System.out.println("Type: " + type);
    }
}

class Car extends Vehicle {
    String type = "Car";

    Car() {
        super();  // calling Vehicle constructor
        System.out.println("Car constructor");
    }

    @Override
    void showType() {
        System.out.println("Type: " + type);        // prints Car's type
        System.out.println("Parent Type: " + super.type); // prints Vehicle's type
    }
}

class SportsCar extends Car {
    SportsCar() {
        super();  // calls Car constructor
        System.out.println("SportsCar constructor");
    }

    @Override
    void showType() {
        super.showType();  // call Car's showType()
        System.out.println("SportsCar is a fast " + type);
    }
}

public class Challenge {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.showType();
    }
}
