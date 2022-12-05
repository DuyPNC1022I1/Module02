package Vonglap;

import java.util.Scanner;

public class Tinhtienlaichovay {
    public static void main(String[] args) {
        double soTienGui = 1.0;
        int soThangGui = 1;
        double tiLeLaiSuat = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào số tiền gửi: ");
        soTienGui = input.nextDouble();
        System.out.println("Nhập vào số tháng gửi: ");
        soThangGui = input.nextInt();
        System.out.println("Nhập lãi suất: ");
        tiLeLaiSuat = input.nextDouble();

        double soTienLai = 0;
        for (int i = 0; i < soThangGui; i++) {
            soTienLai += soTienGui * (tiLeLaiSuat / 100) / 12 * soThangGui;
        }
        System.out.println("Lãi suất tiền gửi là: " + soTienLai);
    }
}

