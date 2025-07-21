import java.util.ArrayList;

public class practice {

    public static void p1(){

        ArrayList<Integer> myList = new ArrayList<>();

        int[] numbers = {2, 3, 4, 5};

        System.out.println(numbers.getClass());
    }

    public static void p2(){
        String[] strArray = {"2", "1", "+", "3", "*"};

        for (int i=0; i<strArray.length; i++){

            if (strArray[i]!= "+" && strArray[i] != "*")
            {
                System.out.println(Integer.valueOf(strArray[i]) + Integer.valueOf(strArray[i]));
            }

        }
    }

    public static void main(String[] args) {
        
        p1();
        p2();
    }
    
}
