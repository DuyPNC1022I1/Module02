package MiniTest03;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMiniTest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ClassRoom> arrayClassRoom = new ArrayList<>();
        ArrayList<Student> arrayStudent = new ArrayList<>();
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm 1 lớp học");
            System.out.println("2. Xóa 1 lớp học theo id");
            System.out.println("3. Hiển thị danh sách lớp học");
            System.out.println("4. Hiển thị thông tin lớp học theo id");
            System.out.println("5. Sửa thông tin lớp học theo id");
            System.out.println("6. Thêm 1 học viên");
            System.out.println("7. Xóa 1 học viên theo id");
            System.out.println("8. Hiển thị danh sách học viên theo id");
            System.out.println("9. Hiển thị danh sách học viên theo lớp học");
            System.out.println("10. Sửa thông tin học viên theo id");
            System.out.println("11. Tìm kiếm học viên theo tên gần đúng");
            System.out.println("0: Thoát khỏi chương trình");
            System.out.println("Nhập vào lựa chọn của bạn (0~11): ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch(choose) {
                case 1:
                    ClassRomManager.addClassRoom(arrayClassRoom, scanner);
                    break;
                case 2:
                    ClassRomManager.deleteClasRoom(arrayClassRoom, scanner);
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách lớp học: ");
                    ClassRomManager.displayClassRoom(arrayClassRoom);
                    break;
                case 4:
                    ClassRomManager.displayClassById(arrayClassRoom, scanner);
                    break;
                case 5:
                    ClassRomManager.rewriteInformationOfClassById(arrayClassRoom, scanner);
                    break;
                case 6:
                    StudentManager.addStudent(arrayStudent, arrayClassRoom, scanner);
                    break;
                case 7:
                    StudentManager.deleteStudent(arrayStudent, scanner);
                    break;
                case 8:
                    StudentManager.displayStudentById(arrayStudent, scanner);
                    break;
                case 9:
                    StudentManager.displayStudentByClass(arrayStudent, arrayClassRoom, scanner);
                    break;
                case 10:
                    StudentManager.rewriteInformatioOfStudentById(arrayStudent, arrayClassRoom, scanner);
                    break;
                case 11:
                    StudentManager.searchStudentByName(arrayStudent, scanner);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng lựa chọn lại 0~11");
            }
        }
        while (true);
    }
}
