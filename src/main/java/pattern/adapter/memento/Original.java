package pattern.adapter.memento;

public class Original {

    private String value;

    public Original (String vlaue) {
        this.value = vlaue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento cereteMemento () {
        return new Memento(value);
    }

    public void restoreMemento (Memento memento) {
        this.value = memento.getValue();
    }
}
