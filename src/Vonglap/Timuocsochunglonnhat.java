package Vonglap;

import java.util.Scanner;

public class Timuocsochunglonnhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int number1 = input.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int number2 = input.nextInt();
        int uocchunglonnhat = 0;
        if ((number1 == 0)&&(number2 == 0)) {
            System.out.println("Hai số đã cho không có USCLN");
        }
        else if ((number1 != 0)&&(number2 ==0)) {
            System.out.println("Ước chung lớn nhất là: " + Math.abs(number1));
        }
        else if ((number1 == 0)&&(number2 !=0)) {
            System.out.println("Ước chung lớn nhất là: " + Math.abs(number2));
        }
        else {
            for (int i = 1; i <= number1 && i <= number2; i++) {
                if ((number1 % i == 0) && (number2 % i == 0)) {
                    uocchunglonnhat = i;
                }
            }
            System.out.println("Ước chung lớn nhất của 2 số đã cho là: " + uocchunglonnhat);
        }
    }
}

