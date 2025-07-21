/*
 * Find the First and Last Position of an Element in a Sorted Array
 * 
 * Given a sorted array of integers, find the starting and ending position of a given target value. If the target is not found, return [-1, -1]
 */
public class FirstAndLastOccurrence {

    /*
     * Approach:
     * Use binary search method to find target element. Once element is found keep
     * searching on left side to get first index
     */
    public static int firstOccurrence(int[] A, int target) {

        int low = 0, high = A.length - 1;

        int pos = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (A[mid] == target) {

                pos = mid;
                high = mid - 1; // to keep searching on left
            } else if (A[mid] > target) {
                high = mid - 1; // search in left
            } else {
                low = mid + 1; // search in right
            }

        }

        return pos;

    }

    /*
     * Approach:
     * Use binary search method to find target element. Once element is found keep
     * searching on right side to get last index
     */
    public static int secondOccurrence(int[] A, int target) {

        int low = 0, high = A.length - 1;

        int pos = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (A[mid] == target) {

                pos = mid;
                low = mid + 1; // to keep searching on right
            } else if (A[mid] > target) {
                high = mid - 1; // search in left
            } else {
                low = mid + 1; // search in right
            }

        }

        return pos;

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 3, 3, 4, 4};
        int target = 3;

        System.out.println("First Index: " + firstOccurrence(A, target));
        System.out.println("Last Index: " + secondOccurrence(A, target));

    }

}
