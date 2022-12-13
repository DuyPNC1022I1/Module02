package MiniTest2;

import java.util.Scanner;

public class StudentManager extends Student {

    //Tạo 1 mảng các sinh viên có n sinh viên
    public static Student[] creatArrayStudent(int n) {
        //Nhập vào các phần tử mảng:
        return new Student[n];
    }

    //Thêm các phần tử Sinh viên vào mảng arrayStudent
    public static Student creatStudent() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào tên sinh viên: ");
        String name = in.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Nhập vào giới tính sinh viên: ");
        String gender = in.nextLine();
        System.out.println("Nhập vào địa chỉ sinh viên: " );
        String address = in.nextLine();
        System.out.println("Nhập vào điểm trung bình sinh viên: ");
        int avgScore = in.nextInt();
        return new Student(name, age, gender, address, avgScore);
    }

    public static void addStudentinArray(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = creatStudent();
            System.out.println("Thông tin sinh viên thứ " + i + "là: "+ array[i]);
        }
    }

    //Hiển thị tất cả danh sách sinh viên
    public static void display(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Thông tin sinh viên thứ" + ( i + 1) + "là: " + array[i]);
        }
    }

    //Hiển thị sinh viên có điểm cao nhất
    public static void displayMaxScoreOfStudent(Student[] array) {
        int maxScore = array[0].getAvgScore();
        for (Student student : array) {
            if (maxScore < student.getAvgScore()) {
                maxScore = student.getAvgScore();
            }
        }
        for (Student student : array) {
            if (student.getAvgScore() == maxScore) {
                System.out.println("Sinh viên có điểm cao nhất là: " + student);
            }
        }
    }

    //Tìm điểm thấp nhất
    public static void displayMinScoreOfStudent(Student[] array) {
        int minScore = array[0].getAvgScore();
        for (Student student : array) {
            if (minScore > student.getAvgScore()) {
                minScore = student.getAvgScore();
            }
        }
        for (Student student : array) {
            if (student.getAvgScore() == minScore) {
                System.out.println("Sinh viên có điểm thấp nhất là: " + student);
            }
        }
    }

    //Thêm 1 sinh viên vào mảng
    public static void addStudent(Student[] array, int n) {
        Student[] newArray = new Student[n];
        if (newArray.length - 1 >= 0) System.arraycopy(array, 0, newArray, 0, newArray.length - 1);
        newArray[n] = creatStudent();
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Thông tin sinh viên thứ" + i + "là: " + "\t" + newArray[i]);
        }
    }
    //Xóa 1 sinh viên trong mảng
    public static void deleleStudentInArray(Student[] array, int n) {
        Student[] newArrayAfterDelete = new Student[n];
        System.out.println("Danh sách sinh viên sau khi thay đổi: Xóa 1 sinh viên là: ");
        //Nhập vào từ bàn phím tên sinh viên cần xóa;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào tên sinh viên cần xóa");
        String nameDelete = in.nextLine();
        //Tiến hành xóa
        int indexDelete = 0;
        for (int i = 0; i < array.length; i++) {
            if (nameDelete.equals(array[i].getName())) {
                indexDelete = i;
            }
        }
        for (Student student : newArrayAfterDelete) {
            if (nameDelete.equals(student.getName())) {
                System.arraycopy(array, 0, newArrayAfterDelete, 0, indexDelete);
                System.arraycopy(array, indexDelete + 1, newArrayAfterDelete, indexDelete, (newArrayAfterDelete.length - 1 - indexDelete));
            }
        }
        System.out.println("Danh sách sinh viên sau khi xóa là: ");
        for (Student student : newArrayAfterDelete) {
            System.out.println(student);
        }
    }
    //Tìm tên sinh viên + hiển thị
    public static void searchName(Student[] array) {
        //Nhập từ bàn phím tên cần tìm:
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm tại đây: ");
        String nameSearch = input.nextLine();
        //Tìm sinh viên có tên giống từ khóa tìm kiếm:
        boolean flag = false;
        for (Student student : array) {
            if (nameSearch.equals(student.getName())) {
                flag = true;
                System.out.println("Sinh viên có tên giống từ khóa cần tìm là: " + student);
            }
        }
        if(!flag) {
            System.out.println("Không tìm thấy sinh viên nào có tên vừa nhập!");
        }
    }
    
    //Tìm sinh viên theo giới tính
    public static void displayStudentbyGender(Student[] array) {
        String genderSearch = "Male";
        for (int i = 0; i < array.length; i++) {
            if (genderSearch.equals(array[i].getGender())) {
                System.out.println("Sinh viên có giới tính Male là" + i + array[i]);
            } else {
                System.out.println("Sinh viên có giới tính Female là: " + i + array[i]);
            }
        }
    }
}
