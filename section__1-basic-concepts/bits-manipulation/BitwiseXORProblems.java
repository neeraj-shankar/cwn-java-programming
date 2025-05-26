

public class BitwiseXORProblems {

    /*
     * Swap Two Numbers Without Temp Variable
     * Given Two integers A and B, swap their values without using a Temporary 
     */
    public void swap(int A, int B){
        System.out.println("Original Value of A: "+A);
        System.out.println("Original Value of B: "+B);
        
        A = A ^ B;
        B = A ^ B;
        A = A ^ B;

        System.out.println("New Value of A: "+A);
        System.out.println("New Value of B: "+B);

    }

    /*
     * Check if Two Numbers Are Different:
     * Given Two numbers check whether they are different
     */
    public void areDifferent(int A, int B){
        
        if ((A ^ B) !=0){
            System.out.println("Both numbers are different");
        } else {
            System.out.println("The Given numbers are same");
        }
    }

    public static void main(String[] args) {
        int A = 4, B = 4;

        BitwiseXORProblems bxp = new BitwiseXORProblems();
        bxp.swap(A, B);
        bxp.areDifferent(A, B);
    }
    
}
