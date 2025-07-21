
public class Patterns {

    public void printRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*".repeat(i) + "\n");
        }
    }

    public void printTriangle(int n) {
        int firstTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i) + "*".repeat(firstTerm + (i - firstTerm) * 2) + "\n");
        }
    }

    public void printDiamond(int n) {
        int firstTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i) + "*".repeat(firstTerm + (i - firstTerm) * 2) + "\n");
        }
        for (int j = n - 1; j >= 1; j--) {
            System.out.print(" ".repeat(n - j) + "*".repeat((firstTerm + (j - firstTerm) * 2)) + "\n");
        }
    }

    public void butterflyPattern(int n){

        // print the first half
        for (int i=1; i<=n; i++){
            System.out.print("*".repeat(i) + " ".repeat(2*n - (2*i)) + "*".repeat(i));
            System.out.println();
        }

        // print the lower half
        for (int i=n; i>=1; i--){
            System.out.print("*".repeat(i) + " ".repeat(2*n - (2*i)) + "*".repeat(i));
            System.out.println();
        }

    }

    public void binaryPattern(int n){

        // print the first half
        for (int i=1; i<=n; i++){
            System.out.print("*".repeat(i) + " ".repeat(2*n - (2*i)) + "*".repeat(i));
            System.out.println();
        }

        // print the lower half
        for (int i=n; i>=1; i--){
            System.out.print("*".repeat(i) + " ".repeat(2*n - (2*i)) + "*".repeat(i));
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Patterns patterns = new Patterns();

        // Print the right triangle
        patterns.printRightTriangle(5);

        // Print normal triangle
        patterns.printTriangle(5);

        // Print diamond pattern
        patterns.printDiamond(5);

        // Butter fly pattern
        patterns.butterflyPattern(4);
    }

}
