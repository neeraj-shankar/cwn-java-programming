public class LongestCommonPrefix {

    static String solutionHorizontalScanning(String[] strs) {
        /*
         * Approach:
         * Start with first string as prefix.
         * Compare this with the subsequent string and shorten it as necessary.
         * 
         * Steps:
         * Initialize the prefix as the first string.
         * Iterate over the remaining strings, updating the prefix by comparing it
         * character by character.
         * If at any point the prefix becomes an empty string, return immediately as
         * there is no common prefix.
         * 
         * Time Complexity: (O(S)), where (S) is the sum of all characters in all
         * strings.
         * Space Complexity: (O(1)) because it uses a constant amount of extra space.
         */

        // Store the first substring as longest prefix
        String longestPrefix = strs[0];

        // Start with second string and compare subsequent strings for common prefix
        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(longestPrefix) != 0) {

                // keep shortening the longest prefix
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);

                // if prefix becomes empty return it

                if (longestPrefix.isEmpty())
                    return "";
            }
        }

        return longestPrefix;
    }

    static String solutionHorizontalScanningOptimized(String[] s) {

        if (s == null || s.length == 0)
            return "";

        // Initialize the prefix length to the length the first string
        int prefixLength = s[0].length();

        // Compare the prefix with each subsequent string
        for (int i = 1; i < s.length; i++) {

            // find the minimum length between prefix and current string
            prefixLength = Math.min(prefixLength, s[i].length());

            for (int j = 0; j < prefixLength; j++) {
                if (s[i].charAt(j) != s[0].charAt(j)) {
                    prefixLength = j;
                    break;
                }
            }
        }

        return s[0].substring(0, prefixLength);
    }


    static String solutionVerticalScanning(String[] strs){
        /*
         * Approach:
         * Compare characters of each string vertically (i.e., by index) until a mismatch is found.
         * 
         * Steps:
         * Iterate over the characters of the first string.
         * For each character, compare it with the corresponding characters in the other strings.
         * Stop when a mismatch is found or any string is exhausted.
         * 
         * Time Complexity: (O(S)), where (S) is the sum of all characters in all strings.
         * Space Complexity: (O(1)).
         */

        if (strs == null || strs.length == 0){
            return "";
        } 

        // Take the first string in strs as longest prefix
        String longestPrefix = strs[0];

        // iterate over length of first string and compare each char of other strings at this position
        for (int i=0; i<strs[0].length(); i++){

            // at any point string goes outside range of first string or character mismatch match found return it
            for (int j=1; j<strs.length; j++){

                if (i>=strs[j].length() || longestPrefix.charAt(i) != strs[j].charAt(i)){

                    // return the substring as prefix
                    return strs[0].substring(0, i);
                }
            }
        }

         return "";
    }

    static String solutionBinarySearch(String[] strs){
        /*
         * Approach:
         * Use binary search to find the common prefix length by checking prefixes of increasing lengths.
         * 
         * Steps:
         * Find the minimum string length in the array.
         * Use binary search over the length of this shortest string.
         * Check if all strings contain the prefix of the current midpoint length.
         * 
         * Time Complexity: (O(S \log m)), where (S) is the sum of all characters in all strings and (m) is the length of the shortest string.
         * Space Complexity: (O(1)).
         */

         return "";
    }

    public static void main(String[] args) {
        String[] s = { "flower", "flow", "flight" };

        System.out.println("The longest Prefix: " + solutionHorizontalScanning(s));
        System.out.println("The longest Prefix: " + solutionHorizontalScanningOptimized(s));
        System.out.println("The longest Prefix: " + solutionVerticalScanning(s));

    }
}