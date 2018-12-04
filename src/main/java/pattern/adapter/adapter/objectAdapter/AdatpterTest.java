package pattern.adapter.adapter.objectAdapter;

import pattern.adapter.adapter.classAdapter.Source;
import pattern.adapter.adapter.classAdapter.Targetable;

public class AdatpterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
