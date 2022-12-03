package IntroductiontoJava;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD muốn chuyển đổi tại đây: ");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println("Giá trị VNĐ sau khi chuyển đổi là: " + vnd + "VNĐ");
    }
}
