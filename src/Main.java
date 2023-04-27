public class Main {
    static int a = 10;
    static int b;
    static int c;
    static {
        System.out.println("1st Block");
        b = a + 10;
    }
    static {
        System.out.println("2nd Block");
        c = a + 20;
    }
    static void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    public static void main(String[] args) {
        show();
    }
}
