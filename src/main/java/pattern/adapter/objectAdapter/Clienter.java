package pattern.adapter.objectAdapter;

import pattern.adapter.classAdapter.Ps2;
import pattern.adapter.classAdapter.Usber;

public class Clienter {

    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.isPs2();
    }
}
