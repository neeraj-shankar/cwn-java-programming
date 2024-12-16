public class UnderstandingString {
    public static void main(String[] args) {
        String text = "  Hello, Java World!  ";

        // Length
        System.out.println("Length: " + text.length());

        // Trim
        String trimmed = text.trim();
        System.out.println("Trimmed: " + trimmed); // Trimmed: Hello, Java World!

        // Substring
        System.out.println("Substring: " + trimmed.substring(7, 11)); // Output: Java

        // Upper and Lower Case
        System.out.println("Uppercase: " + trimmed.toUpperCase()); // Uppercase: HELLO, JAVA WORLD!
        System.out.println("Lowercase: " + trimmed.toLowerCase()); // Lowercase: hello, java world!

        // Replace
        System.out.println("Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python")); 
        // Replace 'Java' with 'Python': Hello, Python World!

        // Contains
        System.out.println("Contains 'World': " + trimmed.contains("World")); // Contains 'World': true

        // Split
        String[] words = trimmed.split(" ");
        System.out.println("Words in String:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}