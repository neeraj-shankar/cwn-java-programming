/*
 * Demonstration of Polymorphism.
 */

public class Calculator {

    public static int add(int x, int y){
        /*
         * Takes two integer numbers and returns their sum.
         */

        return x + y;
    }

    public static double add(double x, double y){
        /*
         * Takes two double numbers and return their sum as double.
         * 
         */
        return x + y;
    }
    public static int add(int x, int y, int z){
        /*
         * Takes three int numbers and return their sum in int format.
         */
        return x + y + z;
    }

    // public static double add(int x, int y, int z){
    //     /*
    //      * Takes three int numbers and return their sum in double format.
    //      * However, this method would not work as it has same name and parameter count and type as above method. 
    //      * Changing only return type is not allowing to overload.
    //      * 
    //      */

    //     return (double)(x + y + z);
    // }

    public static void main(String[] args) {
        int a = 10, b = 20;
        double x = 10, y = 20;

        System.out.println("Total int sum: "+add(a, b));
        System.out.println("Total double sum: "+add(x, y));
        System.out.println("Thre numbers int sum: "+add(b, a, b));
    }
    
}
