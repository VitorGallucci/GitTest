public class Main {
    public static void main(String[] args) {
        sayHelloManyTime(5);
    }

    public static void sayHello () {
        System.out.println("Hello world!!");
    }

    public static void sayHelloManyTime (int times) {
        for (int i = 0; i < times; i++) {
            sayHello();
        }
    }

}