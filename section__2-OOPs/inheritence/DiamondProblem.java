interface A {
    default void display() {
        System.out.println("Display method from Interface A");
    }
}

interface B {
    default void display() {
        System.out.println("Display method from Interface B");
    }
}

interface Speaker{
    default void talk() {
        System.out.println("Talking from Speaker interface");
    }
}

interface Greater{
    default void talk() {
        System.out.println("Talking from Greater interface");
    }
} 

interface Entertainer{
    default void entertain() {
        System.out.println("Entertaining from Entertainer interface");
    }
}

class Host implements Speaker, Greater, Entertainer{

    public void talk() {
        Speaker.super.talk(); // Resolving ambiguity by calling Speaker's method
        Greater.super.talk(); // Resolving ambiguity by calling Greater's method
    }

}
public class DiamondProblem{

    public static void main(String[] args) {
        Host anchor = new Host();
        anchor.talk(); // Ambiguous method call, need to resolve it
        anchor.entertain(); // No ambiguity, calls Entertainer's method
    }
}