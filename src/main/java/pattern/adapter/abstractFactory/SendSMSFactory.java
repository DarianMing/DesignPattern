package pattern.adapter.abstractFactory;

public class SendSMSFactory implements Provicer{

    @Override
    public Sender produce() {
        return new SMSSender();
    }
}
