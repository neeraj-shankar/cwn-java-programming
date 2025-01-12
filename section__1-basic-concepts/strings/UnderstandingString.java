class DataTypeCharacter {

    public void operationChar() {

        char firstletter = 'A';
        char smallLetter = 'a';

        System.out.println("Showing char: " + firstletter);
        System.out.println("HashIdentity of char: firstLetter: " + System.identityHashCode(firstletter));

        if (firstletter < smallLetter) {
            System.out.printf(
                    "Character %c with ascii value %d is greater than %c of ascii value based on ascii value %d comparison",
                    smallLetter, (int) smallLetter, firstletter, (int) firstletter);
        }
    }

    public void addCharacters() {
        char ch1 = 'A'; // ASCII value: 65
        char ch2 = 'B'; // ASCII value: 66
        char ch3 = 'a'; // ASCII value 97

        // addition happens using the ascii value of ch3 and 1. ex: 97 + 1 = 98 which is
        // nothing but b
        char plusOne = (char) (ch3 + 1); // output: b
        System.out.println("result of ch3 plus one: " + plusOne);

        int sum = ch1 + ch2; // 'A' (65) + 'B' (66)
        System.out.println("Sum of '" + ch1 + "' and '" + ch2 + "' (as ASCII): " + sum);

        // Toggle Small to Capital and vice versa
        char sl1 = 'a', sl2 = 'z';
        char cl1 = 'A', cl2 = 'Z';

        // difference between Equivalent Capital and Small Letters
        int diff1 = cl1 - sl1;
        int diff2 = sl2 - cl2;

        System.out.println("The ASCII value difference between 'A' and 'a': " + diff1);
        System.out.println("The ASCII value difference between 'Z' and 'z': " + diff2);

        // Togle small to caps
        char eqCapital = (char) (sl1 - 'a' + 'A');
        System.out.println("Capital form of 'a' is: " + eqCapital);

    }

}

class StringLiterals {
    public void operationStrings() {
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

public class UnderstandingString {
    public static void main(String[] args) {

        // object of the DataType char class
        DataTypeCharacter dtc = new DataTypeCharacter();

        // calling method using dtc object
        // dtc.operationChar();
        dtc.addCharacters();

    }
}