package MiniTest03;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRomManager{
    //Tạo 1 lớp học
    public static ClassRoom creatClassRoom(Scanner scanner) {
        System.out.println("Nhập vào id lớp học: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên lớp học: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tên trường học: ");
        String nameSchool = scanner.nextLine();
        return new ClassRoom(id, name, nameSchool);
    }
    //Thêm 1 lớp học vào mảng 'danh sách lớp'
    public static void addClassRoom(ArrayList<ClassRoom> array, Scanner scanner) {
        array.add(creatClassRoom(scanner));
        displayClassRoom(array);
    }

    //Hiển thị danh sách lớp học
    public static void displayClassRoom (ArrayList<ClassRoom> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Thông tin lớp học thứ " + (i + 1) + "là: " + array.get(i));
        }
    }

    //Tìm theo id -> Sử dụng cho chức năng hiển thị, xóa, sửa thông tin theo id
    public static int searchID (ArrayList<ClassRoom> array, Scanner scanner) {
        System.out.println("Nhập vào id: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            if(((array.get(i)).getId()) == id) {
                flag = true;
                index = i;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy lớp có id vừa nhập!");
        }
        return index;
    }
    //Xóa 1 lớp học theo id
    public static void deleteClasRoom(ArrayList<ClassRoom> array, Scanner scanner) {
        array.remove(searchID(array, scanner));
        System.out.println("Danh sách lớp học sau khi xóa là: ");
        displayClassRoom(array);
    }

    //Hiển thị danh sách lớp học theo id
    public static void displayClassById(ArrayList<ClassRoom> array, Scanner scanner) {
        System.out.println("Hiển thị danh sách lớp học theo id: ");
        int indexDisplay = searchID(array, scanner);
        for (int i = 0; i < array.size(); i++) {
            if(i == indexDisplay) {
                System.out.println("Thông tin lớp học thứ có id vừa nhập là: " + array.get(i));
            }
        }
    }

    //Sửa thông tin lớp học theo id
    public static void rewriteInformationOfClassById(ArrayList<ClassRoom> array, Scanner scanner) {
        System.out.println("Sửa thông tin theo id: ");
        int indexRewrite = searchID(array, scanner);
        for (int i = 0; i < array.size(); i++) {
            if (i == indexRewrite) {
                System.out.println("Sửa thông tin id:");
                int id = Integer.parseInt(scanner.nextLine());
                array.get(i).setId(id);
                System.out.println("Sửa thông tin tên lớp:");
                String name = scanner.nextLine();
                array.get(i).setName(name);
                System.out.println("Sửa thông tin tên trường: ");
                String schoolName = scanner.nextLine();
                array.get(i).setSchoolName(schoolName);
            }
        }
        displayClassRoom(array);
    }
}
