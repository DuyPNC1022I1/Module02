package MiniTest03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    //Hiển thị danh sách học viên
    public static void displayStudent(ArrayList<Student> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Thông tin sinh viên thứ " + (i+1) + " là: " + array.get(i));
        }
    }
    //Tạo một học viên
    public static Student creatStudent(ArrayList<ClassRoom> array, Scanner scanner) {
        System.out.println("Nhập vào id học viên:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên học viên");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi học viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính học viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ học viên");
        String address = scanner.nextLine();
        System.out.println("Chọn lớp học viên");
        ClassRoom classRoom = chooseClassRoom(array, scanner);
        return new Student(id, name, age, gender, address, classRoom);
    }

    public static ClassRoom chooseClassRoom (ArrayList<ClassRoom> array, Scanner scanner) {
        System.out.println("1. C08");
        System.out.println("2. C09");
        System.out.println("3. C10");
        System.out.println("4. Lớp khác");
        System.out.println("Nhập vào lựa chọn của bạn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return array.get(0);
            case 2:
                return array.get(1);
            case 3:
                return array.get(2);
            case 4:
                ClassRomManager.addClassRoom(array, scanner);
                return array.get(array.size() - 1);
        }
        return null;
    }
    //Thêm 1 học viên
    public static void addStudent (ArrayList<Student> array, ArrayList<ClassRoom> array1, Scanner scanner) {
        array.add(creatStudent(array1, scanner));
        displayStudent(array);
    }

    //Tìm theo id => Sử dụng cho chức năng xóa 1 học viên + sửa thông tin theo id
    public static int searchIdStudent (ArrayList<Student> array, Scanner scanner) {
        System.out.println("Nhập vào ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            if (((array.get(i)).getId()) == id) {
                flag = true;
                index = i;
            }
        }
        if (!flag){
            System.out.println(" Không tìm thấy sinh viên có ID vừa nhập!");
        }
        return index;
    }
    //Xóa 1 học viên theo id
    public static void deleteStudent(ArrayList<Student> array, Scanner scanner) {
        array.remove(searchIdStudent(array, scanner));
        System.out.println("Danh sách học viên sau khi xóa là: ");
        displayStudent(array);
    }
    //Hiển thị danh sách học viên theo id
    public static void displayStudentById (ArrayList<Student> array, Scanner scanner) {
        System.out.println("Hiển thị danh sách học viên theo ID: ");
        int indexDisplaybyId = searchIdStudent(array, scanner);
        for (int i = 0; i < array.size(); i++) {
            if (i == indexDisplaybyId) {
                System.out.println(array.get(i));
            }
        }
    }
    //Sửa thông tin học viên theo id
    public static void rewriteInformatioOfStudentById(ArrayList<Student> array,ArrayList<ClassRoom> arrayClassRoom, Scanner scanner) {
        System.out.println("Sửa thông tin học viên theo ID: ");
        int indexRewriteInformation = searchIdStudent(array, scanner);
        for (int i = 0; i < array.size(); i++) {
            if(i == indexRewriteInformation) {
                System.out.println("Sửa thông tin ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                array.get(i).setId(id);
                System.out.println("Sửa thông tin tên học viên: ");
                String name = scanner.nextLine();
                array.get(i).setName(name);
                System.out.println("Sửa thông tin tuổi học viên: ");
                int age = Integer.parseInt(scanner.nextLine());
                array.get(i).setAge(age);
                System.out.println("Sửa thông tin giới tính học viên");
                String gender = scanner.nextLine();
                array.get(i).setGender(gender);
                System.out.println("Sửa thông tin tên địa chỉ của học viên");
                String address = scanner.nextLine();
                array.get(i).setAddress(address);
                System.out.println("Sửa thông tin lớp học của học viên");
                chooseClassRoom(arrayClassRoom, scanner);
            }
        }
        displayStudent(array);
    }
    //Hiển thị danh sách học viên theo lớp học
    public static void displayStudentByClass (ArrayList<Student> array, ArrayList<ClassRoom> arrayClass, Scanner scanner) {
        System.out.println("Chọn tên lớp học muốn hiển thị học viên: ");
        String nameDisplay = chooseClassRoom(arrayClass, scanner).getName();
        int index = 0;
        boolean flag = false;
        System.out.println("Danh sách học viên trong lớp vừa nhập là: ");
        for (int i = 0; i < array.size(); i++) {
            if (nameDisplay.equals(array.get(i).getClassRoom().getName())) {
                flag = true;
                index = i;
                System.out.println(array.get(index));
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy tên học viên có lớp id vừa nhập");
        }
    }
    //Tìm kiếm học viên theo tên gần đúng
    public static void searchStudentByName(ArrayList<Student> array, Scanner scanner) {
        System.out.println("Nhập vào tên cần tìm");
        String nameSearch = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getName().toLowerCase().contains(nameSearch.toLowerCase())){
                flag = true;
                System.out.println("Thông tin học vin có tên vừa nhập là: " + array.get(i));
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy sinh viên có tên vừa nhập");
        }
    }
}
