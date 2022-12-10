package minitestweek01;

import java.util.Scanner;

public class TestMiniTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào n là số phần tử của mảng: ");
        int n = input.nextInt();

        //Tạo mảng chứa danh sách n sản phẩm:
        Products[] array = new Products[n]; // Chú ý: n = 5 nếu tạo 5 sản phẩm. Nếu n> 5 trong bài này phát sinh lỗi khi tìm sản phẩm

        //Nhập vào thông tin từng sản phẩm cho mảng ( 5 sản phẩm đầu tiên trong mảng)
        array[0] = new Products(1, "Milk", 1000, 1, "USD");
        array[1] = new Products(2, "Soda", 2000, 3, "USD");
        array[2] = new Products(3, "Coffee", 5000, 2, "USD");
        array[3] = new Products(4, "Beer", 3000, 1, "USD");
        array[4] = new Products(5, "Water", 7000, 2, "USD");

        //Tìm sản phẩm theo tên:
        //Phần nhập thông tin tên sản phẩm cần tìm
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào tên sản phẩm cần tìm: ");
        String nameSearch = in.nextLine();
        //Tìm sản phẩm
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (nameSearch.equals(array[i].name)) {
                flag = true;
                System.out.println("Sản phẩm cần tìm là " + array[i].name + "\t" + "với thông tin chi tiết là: " + array[i]);
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        //Tính tổng giá của tất cả sản phẩm:
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].prime;
        }
        System.out.println("Tổng giá trị của tất cả sản phẩm là: " + sum + "\t" + "USD");
    }
}
