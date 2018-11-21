package pattern.adaptor.interfaceAdapter;

public class Ashili extends Adapter {


    @Override
    public void a() {
        System.out.println("实现a方法被调用");
    }

    @Override
    public void d() {
        System.out.println("实现b方法被调用");
    }
}