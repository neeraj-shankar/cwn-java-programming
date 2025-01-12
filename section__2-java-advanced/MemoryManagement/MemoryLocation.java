public class MemoryLocation {
    public static void main(String[] args) {
        Integer a = 42;
        Integer b = 42;

        System.out.println("a identity hash: " + System.identityHashCode(a));
        System.out.println("b identity hash: " + System.identityHashCode(b));

        // Checking object equality
        System.out.println("a == b: " + (a == b)); // true because of caching for small integers

        String str = "Hello";
        System.out.println("str identity hash: " + System.identityHashCode(str));
    }
}
