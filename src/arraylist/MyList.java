package arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0; // size thể hiện số phần tử trong danh sách
    private static final int default_Capacity = 10; // capacity thể hiện số phần tử tối đa trong danh sách
    private Object[] element; // mảng element chứa các phần tử trong danh sách

    public MyList() {
        element = new Object[default_Capacity]; // Khởi tạo mảng element có độ dài Capacity, kiểu dữ liệu Object
    }

    public void ensureCapa() { // Tăng kích thước mảng
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize); // x2 kích thước mảng ban đầu: chứa thêm phần tử
    }

    public void add(E e) { // Thêm phần tử e vào mảng
        if (size == element.length) { // Nếu độ dài mảng = số phần tử đang chứa trong mảng ( mảng full phần tử)
            ensureCapa(); // Thì tiến hành tăng kích thước mảng (x2)
        }
        element[size++] = e; // e được thêm vào vị trí (size + 1) trong mảng
    }

    public E get(int i) { // lấy ra phần tử ở vị trí thứ i
        if (i >= size || i < 0) { // Nếu i > số phần tử trong mảng hoặc i < 0
            throw new IndexOutOfBoundsException("Index: " + i + ",size" + i); //Thì chỉ ra rằng i không nằm trong phạm vi số lượng phần tử mảng
        }
        return (E) element[i]; // trả về phần tử ở vị trí thứ i + ép kiểu tường minh Object về E
    }
}

