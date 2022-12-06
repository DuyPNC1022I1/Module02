import java.util.Scanner;

public class Main {
    //public: quy định về phạm vi sử dụng của thành phần được đánh dấu
    //static: từ khóa quy định thành phần static, là thành phần thuộc về lớp
    //void: kiểu dữ liệu trả về của phương thức
    //main: tên của phương thức
    //String[] args: tham số của phương thức;
    //args = arguments; String[]: kiểu dữ liệu mảng String

    //javac Demo: chuyển từ mã .java => .class
    //java Demo.class: chạy file bytecode của Java trong cmd
    //psvm / main / public static void main(String[] args): được gọi là siêu main của 1 chương trình Java
    //là thành phần được JVM tìm đến đầu tiên khi khởi chạy chương trình Java
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in); //Tạo đối tượng input thuộc lớp Scanner để thực hiện nhập dữ liệu từ bàn phím
        System.out.println("Nhập vào...");
    }

    public static void printArray(int[] array) {
        for ( int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}