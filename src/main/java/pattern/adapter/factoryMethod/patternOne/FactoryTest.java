package pattern.adapter.factoryMethod.patternOne;

//工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法
//模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，
//第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，
// 我们会选用第三种——静态工厂方法模式。
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("mail");
        sender.Send();
        sender = sendFactory.produce("sms");
        sender.Send();

        SendFactoryOne factoryOne = new SendFactoryOne();
        Sender sender1 = factoryOne.produceMail();
        sender1.Send();
        sender1 = factoryOne.produceSMS();
        sender1.Send();

        Sender sender2 = SendFactoryTwo.produceMail();
        sender2.Send();
        sender2 = SendFactoryTwo.produceSMS();
        sender2.Send();
    }
}
