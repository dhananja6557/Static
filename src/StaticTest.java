public class StaticTest {
    static int age;
    static void show() {
        System.out.println("This is static method");
    }
    public static void main(String[] args) {
        age = 25;
        System.out.println("Age is " + age);
        show();
    }
}
