package orlovich.breadFactory.myUtility;

import orlovich.property.userException.ConservatorIsEmptyException;
import orlovich.property.userException.ConservatorOverflowException;

public class Conservator<T> {

    private static final int DEFAULT_SIZE = 40;
    private Object[] objects;
    private int size;
    private int length;

    public Conservator(int capacity) {
        if (capacity > 0) {
            size = capacity;
            objects = new Object[size];
        } else {
            new IllegalArgumentException("Illegal capacity storage");
        }
    }

    public Conservator() {
        this(DEFAULT_SIZE);
    }

    public void add(T t) {
        if (t == null) throw new NullPointerException();
        if (length == size - 1) throw new ConservatorOverflowException();
        objects[++length] = t;
    }

    public <T> T get() {
        if (length == 0) throw new ConservatorIsEmptyException();
        return (T) objects[length--];
    }


}
