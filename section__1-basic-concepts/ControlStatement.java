import java.util.Scanner;

class PlayWithNumbers {
    void evenSum(){
        System.out.println("I am from even Sum function");
    }
}

public class ControlStatement {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // create the instance of the PlayWithNumbers
        PlayWithNumbers playWithNumbers = new PlayWithNumbers();

        // call the evenSum() 
        playWithNumbers.evenSum();
    }
}