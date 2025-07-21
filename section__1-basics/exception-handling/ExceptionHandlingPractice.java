
class ArithematicOperation{

    public int findDivision(int dividend, int divisor){

        try{
            int result = dividend / divisor;

            return result;
        } catch(ArithmeticException e){
            System.out.println("Caught an exception: "+ e);
            return 0;
        } finally{
            System.out.println("I am going to runanyway");
        }
    }

    public void checkSalary(int salary){
        final int minSalary = 10000;
        if (salary < minSalary){
            throw new ArithmeticException("The minimum salary cannot be less than "+minSalary);
        }

        System.out.println("Your salary is as per guidelines.");
    }
}

public class ExceptionHandlingPractice {

    public static void main(String[] args) {
        
        // Class instances
        ArithematicOperation ae = new ArithematicOperation();

        // Performing division operation
        int a = 20;
        int b = 10;

        System.out.println("Result: "+ae.findDivision(a, b));

        // Verify the salary
        ae.checkSalary(9000);
    }
    
}
