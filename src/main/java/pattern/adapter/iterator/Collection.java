package pattern.adapter.iterator;

public interface Collection {

    Iterator iterator();

    /*取得集合元素*/
    Object get(int index);

    /*取得集合大小*/
    int size();

}
