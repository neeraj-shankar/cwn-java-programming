public class MaxChunksToSorted {
    public static int maxChunksToSorted(int[] arr) {
        int maxSoFar = 0;
        int chunks = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // Update the maximum value encountered so far
            maxSoFar = Math.max(maxSoFar, arr[i]);
            
            // If the maximum value so far is equal to the current index
            // it means a valid chunk can be formed
            if (maxSoFar == i) {
                chunks++;
            }
        }
        
        return chunks;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 4};
        System.out.println("Maximum number of chunks: " + maxChunksToSorted(arr)); // Output: 4
    }
}