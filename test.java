public class test {

    public static void solve(){

        String s = 123 + "abc";
        System.out.println(s);

        String s1 = "/home///../.../cx/./";
        String[] strArr = s1.split("/");
        for (String item: strArr){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        solve();
    }
    
}
