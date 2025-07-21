package strings;

public class StringImplementation {

    public static String itrim(byte[] value){

        int len = value.length;

        int st = 0, end = len - 1;

        // trip trailing whitespaces
        while (st<end && ((value[st] & 0xff) <=' ')){
            st++;
        }

        // remove leading whitespaces
        while(st<end && ((value[end - 1] & 0xff) <= ' ')){
            end --;
        }

        return ((st>0) || (end< value.length))? newString(value, st, end): null;

    }
    
}
