package pattern.adapter.memento;

public class Test {

    public static void main(String[] args) {
        //创建原始类
        Original original = new Original("egg");
        //创建备忘录
        Storage storage = new Storage(original.cereteMemento());
        //修改原始类的状态
        System.out.println("初始化状态为：" + original.cereteMemento());
        original.setValue("niu");
        System.out.println("修改好后状态为：" + original.cereteMemento());
        //回复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后状态为：" + original.getValue());
    }
}
