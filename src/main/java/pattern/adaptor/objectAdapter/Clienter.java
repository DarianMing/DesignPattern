package pattern.adaptor.objectAdapter;

import pattern.adaptor.classAdapter.Ps2;
import pattern.adaptor.classAdapter.Usber;

public class Clienter {

    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.isPs2();
    }
}
