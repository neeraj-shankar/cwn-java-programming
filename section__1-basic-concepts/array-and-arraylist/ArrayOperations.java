import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Array of size 5
        int size = 0; // Tracks the number of elements

        // Insert
        arr[size++] = 10;
        arr[size++] = 20;
        arr[size++] = 30;
        System.out.println("After Insert: " + Arrays.toString(arr));

        // Traverse
        System.out.print("Traverse: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Search
        int target = 20;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Search: " + target + " found at index " + index);

        // Update
        arr[1] = 25; // Update index 1 to 25
        System.out.println("After Update: " + Arrays.toString(arr));

        // Delete (simulate by shifting elements)
        int deleteIndex = 1;
        for (int i = deleteIndex; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = 0; // Reduce size and clear the last element
        System.out.println("After Delete: " + Arrays.toString(arr));

        // Resize
        int[] newArr = new int[10];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        System.out.println("After Resize: " + Arrays.toString(arr));
    }
}