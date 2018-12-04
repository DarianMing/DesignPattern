package pattern.adapter.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable sourceable = new Decorator(source);
        sourceable.method();
    }
}
