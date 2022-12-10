package Mangvaphuongthuccuamang;

import java.util.Scanner;

public class Timgiatritrongmang {
    public static void main(String[] args) {
        String[] students = {"Nam", "Quan", "Minh"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                flag = true;
                System.out.println(name + " is postion of the array students: " + i);
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found");
        }
    }
}
