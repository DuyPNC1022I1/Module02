
package IntroductiontoJava;

import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm muốn kiểm tra: ");
        int year = scanner.nextInt();
        if (((year%4==0)&&(year%100 !=0)) || ((year%100==0)&&(year%400==0))) {
            System.out.println("Năm vừa nhập là năm nhuận.");
        }
        else {
            System.out.println("Năm vừa nhập không là năm nhuận");
        }
    }
}
