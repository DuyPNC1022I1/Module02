import MiniTest2.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>(); // tạo biến student có kiểu dữ liệu là ArrayList<Student>
        student.add(new Student());
        student.add(new Student());
        student.add(new Student());
        student.set(1, new Student("Duy", 30, "Male", "Hanoi", 10));
        System.out.println("Hiển thị độ dài mảng student là:" + student.size());
        System.out.println("Hiển thị thông tin của phần tử mảng" + student.get(1));
        System.out.println(student.isEmpty());
    }
}
