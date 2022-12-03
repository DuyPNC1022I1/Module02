package IntroductiontoJava;

import java.util.Scanner;

public class Ungdungchuyensothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi tại đây: ");
        int number = scanner.nextInt();
        if ((number >= 0) && (number < 10)) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eigh");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (number < 20) {
            int hangDonVi = number - 10;
            switch (hangDonVi) {
                case 0:
                    System.out.println("Ten");
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirtteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sisteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if ((number > 20) && (number < 100)) {
            int hangChuc = number / 10;
            int hangDonvi = number - hangChuc * 10;
            switch (hangChuc) {
                case 2:
                    switch (hangDonvi) {
                        case 1:
                            System.out.println("Twemty One");
                            break;
                        case 2:
                            System.out.println("Twemty Two");
                            break;
                        case 3:
                            System.out.println("Twemty Three");
                            break;
                        case 4:
                            System.out.println("Twemty Four");
                            break;
                        case 5:
                            System.out.println("Twemty Five");
                            break;
                        case 6:
                            System.out.println("Twemty Six");
                            break;
                        case 7:
                            System.out.println("Twemty Seven");
                            break;
                        case 8:
                            System.out.println("Twemty Eigh");
                            break;
                        case 9:
                            System.out.println("Twemty Nine");
                            break;
                    }
            }
        }
//        Tương tự với 3 chữ số
    }
}
