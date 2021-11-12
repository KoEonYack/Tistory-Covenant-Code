package covenant.junit5;

public class DoSomething {

    public static void func() {
        throw new RuntimeException("some exception message...");
    }

    public static void func2() {
        throw new SomeException("some exception message...");
    }
}
