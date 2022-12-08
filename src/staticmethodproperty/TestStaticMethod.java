package staticmethodproperty;

public class TestStaticMethod {
    public static void main(String[] args) {
        // Gọi phương thức change trong lớp staticmethod
        staticmethod.change();

        //Tạo đối tượng mới thông qua lớp staticmethod
        staticmethod test1 = new staticmethod(2, "Quân");
        staticmethod test2 = new staticmethod(1, "Nam");
        staticmethod test3 = new staticmethod(3, "Ngọc");

        //Gọi hàm display()
        test1.display();
        test2.display();
        test3.display();
    }
}
