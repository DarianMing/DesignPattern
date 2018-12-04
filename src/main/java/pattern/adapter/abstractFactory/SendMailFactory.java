package pattern.adapter.abstractFactory;

public class SendMailFactory implements Provicer {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
