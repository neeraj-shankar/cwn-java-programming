public class StringToIntegerConversion {
    static int convertToInteger(String s){
        /*
         * Key Idea:
         * Since every character in java is represented by its ascii value.
         * we also know that ascii value of integer 0 to 9 is represented the number value itself
         * 
         * The difference between equilavlent integer value and corrsponsind string is 48
         */
        
         // handle case when string is empty
         if (s.length() == 0){
            System.out.println("The given string is empty.");
            return -1;
         }

         
        // handle the case when given input is not a valid integer that 
        // outside the reference of integers 
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)> '9' || s.charAt(i)< '0'){
                System.out.println("The given string cannot be converted to integer: ");
                System.out.println(s.charAt(i) + " is not a valid integer.");
                return -1;
            }
        }
        for (int i=0; i<s.length(); i++){
            int current = s.charAt(i);
                int eqInt = current - 48;
                System.out.print(eqInt);
        }
        System.out.println();
        

        return 1;
    }

    public static void main(String[] args) {
        String s = "1";

        convertToInteger(s);

    }
}
