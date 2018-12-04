package pattern.adapter.iterator;

public class MyCollection implements Collection {

    String[] string = {"A" , "B" , "C" , "D" , "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int index) {
        return string[index];
    }

    @Override
    public int size() {
        return string.length;
    }
}
