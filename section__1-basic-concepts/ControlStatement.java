import java.util.Scanner;

class PlayWithNumbers {
    void evenSum(int[] arr){
        // calculate the sum all odd numbers in the arr

        // initialize sum with zero
        int sum = 0;

        for (int num: arr){
            if (num % 2 != 0){
                sum = sum + num;
            }
        }
        System.out.println("The sum of odd numbers: " + sum);

    }
}

class TestWhileLoop {
    static boolean isPalindrome(String inputString){
        int left_pointer = 0;
        int right_pointer = 0;

        while (left_pointer < right_pointer){
            if (inputString.charAt(left_pointer) != inputString.charAt(right_pointer)){
                return false;
            }
            left_pointer++;
            right_pointer--;
        }
        return true;
    }
}
public class ControlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take size of array as input from user
        System.out.print("Please enter number of integers to store in arr: ");
        int size = sc.nextInt();
        
        // create an array of length equal to size
        int[] numbers = new int[size];
        // ask user to input the integers
        System.out.println("Please enter " + size + " to store in array");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        // close the scanner
        sc.close();

        // create the instance of the PlayWithNumbers
        PlayWithNumbers playWithNumbers = new PlayWithNumbers();

        // call the evenSum() 
        playWithNumbers.evenSum(numbers);


        // Testing while loop method 
        String rawData = "abba";
        // create instance of TestWhileLoop Class
        boolean result = TestWhileLoop.isPalindrome(rawData);
        System.out.println("Is the given string palindrome: " + result);
    }
}
