package pattern.adapter.factoryMethod.patternOne;

public class SMSSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is SMSSender");
    }
}
