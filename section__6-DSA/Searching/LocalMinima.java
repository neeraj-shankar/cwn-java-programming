public class LocalMinima {
    public static int findLocalMinima(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean isLeftSmaller = (mid == 0) || (array[mid] < array[mid - 1]);
            boolean isRightSmaller = (mid == array.length - 1) || (array[mid] < array[mid + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return mid; // Local minima found
            } else if (mid > 0 && array[mid - 1] < array[mid]) {
                high = mid - 1; // Search left
            } else {
                low = mid + 1; // Search right
            }
        }

        return -1; // If no local minima is found (should not happen in distinct array)
    }

    public static void main(String[] args) {
        int[] array = {9, 7, 6, 3, 14, 5, 7, 4};
        int localMinimaIndex = findLocalMinima(array);
        System.out.println("Local Minima found at index: " + localMinimaIndex);
    }
}