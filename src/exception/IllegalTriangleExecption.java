package exception;

import java.util.Scanner;

public class IllegalTriangleExecption {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập vào cạnh thứ 1: ");
            int a = input.nextInt();
            System.out.println("Nhập vào cạnh thứ 2:");
            int b = input.nextInt();
            System.out.println("Nhập vào cạnh thứ 3: ");
            int c = input.nextInt();
            checkTriangle(a, b, c);
    }
    public static void checkTriangle(int a, int b, int c) {
            if (a < 0 | b < 0 | c < 0 | ((a + b) < c) | ((a + c) < b) | ((b + c) < a)) {
                throw new ArithmeticException("a, b, c không là 3 cạnh của tam giác");
            }
            else {
                System.out.println("a, b, c là 3 cạnh của tam giác");
            }
    }
}
