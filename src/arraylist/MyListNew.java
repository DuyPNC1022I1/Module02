package arraylist;

import java.util.Arrays;

public class MyListNew<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyListNew() {
    }

    public MyListNew(int capacity) {
        elements = new Object[capacity];
    }
    public void ensureCapacity(int minCapacity) { //Tăng kích thước mảng
        elements = Arrays.copyOf(elements, minCapacity);
    }
    public void add(int index, E element){
        if (size == elements.length) {

        }
    }
}
