package Vonglap;

public class Hienthicacsonguyentonhohon100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            if (isPrimeNumber1(number)) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
    //Check số nguyên tố
    public static boolean isPrimeNumber1(int n) {
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
                    break;
                }
            }
            return flag;
        }
        return flag;
    }
}
