package arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0; // size thể hiện số phần tử trong danh sách
    private static final int default_Capacity = 10; // capacity thể hiện số phần tử tối đa trong danh sách
    private Object[] element; // mảng element chứa các phần tử trong danh sách

    public MyList() {
        element = new Object[default_Capacity];
    }

    public void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size + 1] = e;
    }

    ;

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ",size" + i);
        }
        return (E) element[i];
    }
}

