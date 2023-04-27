public class Static {
    int multiply(int a, int b) {
        return a * b;
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static void abc(int a, int b) {
        System.out.println(a + b);
    }
}
class Test {
    public static void main(String[] args) {
        Static s = new Static();
        System.out.println("Multiply Test " + s.multiply(4,8));
        System.out.println("Sum Test " + Static.sum(4,8));
        Static.abc(4,8);
    }
}