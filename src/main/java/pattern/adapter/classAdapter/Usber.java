package pattern.adapter.classAdapter;

public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("USB 接口");
    }
}
