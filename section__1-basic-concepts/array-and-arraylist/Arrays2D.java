class BasicsOf2DArray{

    // static array initialization
    private int [][] numbersMatrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    protected void display(){
        // Row-wise traversal
        for (int i = 0; i < numbersMatrix.length; i++) { // Iterate over rows
            for (int j = 0; j < numbersMatrix[i].length; j++) { // Iterate over columns
                System.out.print(numbersMatrix[i][j] + " ");
            }
            System.out.println();
        }        
    }

    public void Search2DArray() {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    System.out.println("Found " + target + " at position (" + i + ", " + j + ")");
                }
            }
        }

        if (!found) {
            System.out.println("Element not found!");
        }
    }
    
}


public class Arrays2D {
    public static void main(String[] args) {
        
        // Create BasicOf2DArray class instance
        BasicsOf2DArray basicsOf2DArray = new BasicsOf2DArray();
        basicsOf2DArray.display();
        basicsOf2DArray.Search2DArray();
    }
}
