package pattern.adapter.iterator;

public interface Iterator {

    //前移
    Object previous();

    //后移
    Object next();

    boolean hasNext();

    //获取第一个元素
    Object first();
}
