package minitestreload;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] arrayStudent = {};
        do {
            System.out.println("MENU");
            System.out.println("1. Tạo mảng danh sách sinh viên có n sinh viên");
            System.out.println("2. Hiển thị tất cả các sinh viên");
            System.out.println("3. Hiển thị sinh viên có điểm cao nhất");
            System.out.println("4. Hiển thị sinh viên có điểm thấp nhất");
            System.out.println("5. Thêm 1 sinh viên vào danh sách");
            System.out.println("6. Xóa 1 sinh viên trong danh sách theo tên");
            System.out.println("7. Tìm kiếm sinh viên theo tên");
            System.out.println("8. Hiển thị tất cả các sinh viên theo giới tính");
            System.out.println("Vui lòng nhập lựa chọn của bạn (0~8)");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    StudentManager.creatArrayStudent(3);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn: 0~8");
            }
        }
        while (true);
    }
}
