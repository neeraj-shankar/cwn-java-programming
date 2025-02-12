
public class SquareRootNumber {

    public static double solutionBinary(int A){

        int low = 0;
        int high = A;

        while(low<=high){

            int mid = (high - low)/2;
            System.out.println("Current Middle: "+ mid);

            if (mid*mid == A){
                System.out.println("Condition Matched");
                return mid;
            }

            else low ++;
        }

        return 1.00;
    }

    public static void main(String[] args) {
        int A = 2;

        System.out.println("The square root: "+ solutionBinary(A));
    }
    
}
