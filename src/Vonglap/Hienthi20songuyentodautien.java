package Vonglap;

import java.util.Scanner;

public class Hienthi20songuyentodautien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int count = 0; // đếm số số nguyên tố
        int number = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (count < n) {
            if (isPrimeNumber(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    // Check so nguyen to
    public static boolean isPrimeNumber(int n) {
        boolean flag = true;
        // Check so nguyen to khi n < 2
        if (n < 2) {
            flag = false;
        }
        // check so nguyen to khi n >= 2
        else {
            for (int i = 2; i < n ; i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            return flag;
        }
        return flag;
    }
}
