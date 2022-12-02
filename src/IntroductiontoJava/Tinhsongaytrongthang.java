package IntroductiontoJava;

import java.util.Scanner;

public class Tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng muốn tìm: ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("Tháng vừa nhập có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng vừa nhập có 31 ngày");
                break;
            default:
                System.out.println("Tháng vưa nhập có 30 ngày");
        }
    }
}