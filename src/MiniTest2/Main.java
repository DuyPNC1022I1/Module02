package MiniTest2;

import java.util.Scanner;

import static MiniTest2.StudentManager.*;

public class Main {
    public static void main(String[] args) {
        //Tạo danh sách sinh viên
        Scanner input = new Scanner(System.in);
        Student[] arrayStudent = {};
        //Tạo Menu
        do {
            System.out.println("Menu");
            System.out.println("1. Tạo danh sách sinh viên: ");
            System.out.println("2. Thêm phần tử vào mảng danh sách sinh viên");
            System.out.println("3. Hiển thị tất cả các sinh viên");
            System.out.println("4. Hiển thị sinh viên có điểm cao nhất");
            System.out.println("5. Hiển thị sinh viên có điểm thấp nhất");
            System.out.println("6. Thêm 1 sinh viên vào mảng và hiển thị mảng mới ");
            System.out.println("7. Xóa 1 sinh viên trong mảng theo tên");
            System.out.println("8. Tìm kiếm sinh viên theo tên");
            System.out.println("9. Hiển thị tất cả các sinh viên theo giới tính");
            System.out.println("0. Thoát khỏi chương trình ");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    arrayStudent = creatArrayStudent(3);
                    break;
                case 2:
                    addStudentinArray(arrayStudent);
                    break;
                case 3:
                    display(arrayStudent);
                    break;
                case 4:
                    displayMaxScoreOfStudent(arrayStudent);
                    break;
                case 5:
                    displayMinScoreOfStudent(arrayStudent);
                    break;
                case 6:
                    addStudent(arrayStudent, 4);
                    break;
                case 7:
                    deleleStudentInArray(arrayStudent, 2);
                    break;
                case 8:
                    searchName(arrayStudent);
                    break;
                case 9:
                    displayStudentbyGender(arrayStudent);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn");
            }
        }
        while (true);
    }
}
