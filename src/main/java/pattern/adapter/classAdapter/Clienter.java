package pattern.adapter.classAdapter;


public class Clienter {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter();
        ps2.isPs2();
    }
}
