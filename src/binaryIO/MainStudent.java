package binaryIO;

import java.io.*;
import java.util.ArrayList;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Quân", "Hanoi"));
        students.add(new Student(2, "Nam", "Hanoi"));
        students.add(new Student(3, "Ngọc", "Hanoi"));
        writeToFile("D:\\Module 02\\Baitapmodule02\\src\\binaryIO\\FileStudent", students);
        ArrayList<Student> students1 = readToFile("D:\\Module 02\\Baitapmodule02\\src\\binaryIO\\FileStudent");
        for (int i = 0; i < students1.size(); i++) {
            System.out.println(students1.get(i));
        }
    }
    public static void writeToFile(String path, ArrayList<Student> Student) { //Ghi danh sách học viên vào trong file nhị phân
        try {
            FileOutputStream out = new FileOutputStream(path); //Ghi dữ liệu file -> định dạng byte
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
            outputStream.writeObject(Student);
            outputStream.close();
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readToFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            students = (ArrayList<Student>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

}

