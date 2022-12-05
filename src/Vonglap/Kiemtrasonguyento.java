package Vonglap;

import java.util.Scanner;

public class Kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số bất kỳ tại đây");
        int number = scanner.nextInt();
        if (number < 2 ) {
            System.out.println(number + " Không phải là số nguyên tố");
        }
        else {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number + " Là số nguyên tố");
            }
            else {
                System.out.println(number + "Không là số nguyên tố");
            }
        }
    }
}
