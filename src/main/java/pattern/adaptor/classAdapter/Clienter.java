package pattern.adaptor.classAdapter;

//https://www.cnblogs.com/V1haoge/p/6479118.html
public class Clienter {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter();
        ps2.isPs2();
    }
}
