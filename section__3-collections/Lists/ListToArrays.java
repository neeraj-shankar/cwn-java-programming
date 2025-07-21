package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrays {

    public void toIntegerArray(){

        // Create a list of integers
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        nums.add(6);
        System.out.println(nums);

        // Convert th nums list to an integer array
        // Always pass the correct type in new T[0] to avoid ClassCastException.
        Integer[] arr = nums.toArray(new Integer[0]); 
    }

    public void toPrimitiveArray(){

        // Create a list of integers
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        nums.add(6);
        // Using Stream Api to convert to primitive type array.
        int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("The primitive array data: ");
        for (int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();        
    }

    public static void main(String[] args) {
        ListToArrays lta = new ListToArrays();
        lta.toIntegerArray();
        lta.toPrimitiveArray();
    }
    
}
