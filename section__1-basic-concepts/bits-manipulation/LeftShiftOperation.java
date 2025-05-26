
public class LeftShiftOperation {

    public void solve(){

        int num = 1; // 00001
        int result = num<<3; // sets the 4th bit (from right)
        System.out.println("New Number: "+ result);

    }

    public static void main(String[] args) {
        
        LeftShiftOperation lso = new LeftShiftOperation();
        lso.solve();
    }
    
}
