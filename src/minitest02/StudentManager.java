package minitest02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //Tạo mảng với n = 5 phần tử, Nhập vào các phần tử cho mảng
        Student[] arrayStudent = new Student[5];
        arrayStudent[0] = new Student("Peter", 18, "Ha noi", "Male", 10);
        arrayStudent[1] = new Student("Tom", 18, "Ha noi", "FeMale", 9);
        arrayStudent[2] = new Student("Bop", 18, "Ha noi", "Male", 7);
        arrayStudent[3] = new Student("John", 18, "Ha noi", "Male", 8);
        arrayStudent[4] = new Student("Jack", 18, "Ha noi", "Male", 10);

        //Hiển thị tất cả sinh viên:
        for (int i = 0; i < arrayStudent.length; i++) {
            System.out.println("Thông tin sinh viên thứ" + i + "là: " +"\t" + arrayStudent[i]);
        }

        //Hiển thị sinh viên có điểm cao nhất:
        //Tìm điểm cao nhất
        int maxScore = arrayStudent[0].getScoreAverage();
        for (int i = 0; i < arrayStudent.length; i++) {
            if (maxScore < arrayStudent[i].getScoreAverage()) {
                maxScore = arrayStudent[i].getScoreAverage();
            }
        }
        System.out.println("Điểm cao nhất lớp là: " + maxScore);
        //Tìm sinh viên có điểm cao nhất
        for (int i = 0; i < arrayStudent.length; i++) {
            int index;
            if (arrayStudent[i].getScoreAverage() == maxScore) {
                index = i;
                System.out.println("Sinh viên có điểm cao nhất là: " + arrayStudent[index]);
            }
        }

        //Hiển thị sinh viên có điểm thấp nhất:
        //Tìm điểm thấp nhất
        int minScore = arrayStudent[0].getScoreAverage();
        for (int i = 0; i < arrayStudent.length; i++) {
            if (minScore > arrayStudent[i].getScoreAverage()) {
                minScore = arrayStudent[i].getScoreAverage();
            }
        }
        System.out.println("Điểm thấp nhất lớp là: " + minScore);
        //Tìm sinh viên có điểm thấp nhất
        for (int i = 0; i < arrayStudent.length; i++) {
            int index;
            if (arrayStudent[i].getScoreAverage() == minScore) {
                index = i;
                System.out.println("Sinh viên có điểm thấp nhất là: " + arrayStudent[index]);
            }
        }

        //Tìm sinh viên theo tên
        //Nhập từ bàn phím tên cần tìm:
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm tại đây: ");
        String nameSearch = input.nextLine();
        //Tìm sinh viên có tên giống từ khóa tìm kiếm:
        boolean flag = false;
        for (int i = 0; i < arrayStudent.length; i++) {
            if (nameSearch.equals(arrayStudent[i].getName())) {
               flag = true;
                System.out.println("Sinh viên có tên giống từ khóa cần tìm là: " + arrayStudent[i]);
            }
        }
        if(!flag) {
            System.out.println("Không tìm thấy sinh viên nào có tên như vậy!");
        }

        //Hiển thị tất cả các sinh viên theo giới tính:
        String genderSearch = "Male";
        System.out.println("Danh sách sinh viên theo giới tính là: ");
        for (int i = 0; i < arrayStudent.length; i++) {
            if(genderSearch.equals(arrayStudent[i].getGender())) {
                flag = true;
                System.out.println("Sinh viên có giới tính Male là" + i + arrayStudent[i]);
            }
            else {
                System.out.println("Sinh viên có giới tính Female là: " + i + arrayStudent[i]);
            }
        }

        //Thêm 1 sinh viên vào mảng:
        System.out.println("Danh sách sinh viên sau khi thay đổi: thêm 1 sinh viên là: ");
        Student[] newArray = new Student[6];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = arrayStudent[i];
        }
        newArray[5] = new Student("Bin", 20, "Ha noi", "Male", 10);
        //Hiển thị test mảng mới ra màn hình:
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Thông tin sinh viên thứ" + i + "là: " + "\t" + newArray[i]);
        }
        
        // Xóa 1 sinh viên
        System.out.println("Danh sách sinh viên sau khi thay đổi: Xóa 1 sinh viên là: ");
        //Nhập vào từ bàn phím tên sinh viên cần xóa
        Student[] newArrayAfterDelete = new Student[4];
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào tên sinh viên cần xóa");
        String nameDelete = in.nextLine();
        //Tiến hành xóa
        int indexDelete;
        for (int i = 0; i < arrayStudent.length; i++) {
            if (nameDelete.equals(arrayStudent[i].getName())) {
                flag = true;
                indexDelete = i;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy sinh viên có tên vừa nhập!");
        }
    }
}
