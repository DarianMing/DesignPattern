package pattern.adapter.memento;

public class Test {

    public static void main(String[] args) {
        Original original = new Original("egg");

        Storage storage = new Storage(original.cereteMemento());

        System.out.println("初始化状态为：" + original.cereteMemento());
        original.setValue("niu");
        System.out.println("修改好后状态为：" + original.cereteMemento());

        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后状态为：" + original.getValue());
    }
}
