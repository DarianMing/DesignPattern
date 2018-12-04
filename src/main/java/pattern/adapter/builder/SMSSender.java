package pattern.adapter.builder;

public class SMSSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is SMSSender");
    }
}
