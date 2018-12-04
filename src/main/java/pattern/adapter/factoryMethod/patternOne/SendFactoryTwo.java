package pattern.adapter.factoryMethod.patternOne;

public class SendFactoryTwo {

    public static Sender produceMail () {
        return new MailSender();
    }

    public static Sender produceSMS () {
        return new SMSSender();
    }
}
