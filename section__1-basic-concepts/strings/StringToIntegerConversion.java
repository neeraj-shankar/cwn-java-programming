public class StringToIntegerConversion {
    static int convertToInteger(String s){
        /*
         * Approach:
         * Since every character in java is represented by its ascii value.
         * we also know that ascii value of integer 0 to 9 is represented the number value itself
         * 
         * If we subtract the given character with itself and 
         */
                
        for (int i=0; i<s.length(); i++){
            int current = s.charAt(i);
            if (current >= '0' && current <='9'){
                int eqInt = s.charAt(i) - s.charAt(i) + i;
                System.out.print(eqInt);
            }
        }
        System.out.println();
        

        return 1;
    }

    public static void main(String[] args) {
        String s = "123ab$";

        convertToInteger(s);

    }
}
