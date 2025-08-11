public class SubstringCount {

    public static int countBobOccurrences(String str) {
        if (str == null || str.length() < 3) return 0;

        int count = 0;
        // Iterate through the string, checking for "bob"
        for (int i = 0; i <= str.length() - 3; i++) {
            // Check if the substring starting at index i is "bob"
            if (str.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "bobob";
        int result = countBobOccurrences(input);
        System.out.println("Number of 'bob' occurrences: " + result); // Output: 3
    }
}