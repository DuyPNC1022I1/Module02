package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào giá trị x: ");
        int x = input.nextInt();
        System.out.println("Nhập vào giá trị y: ");
        int y = input.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculator(x, y);
    }

    void calculator(int x, int y) {
        try {
            System.out.println("Phép nhân: " + x * y);
            System.out.println("Phép chia:" + x / y);
            System.out.println("Phép cộng: " + x + y);
            System.out.println("Phép trừ: " + (x - y));
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
