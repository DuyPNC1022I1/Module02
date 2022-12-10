package IntroductiontoJava;

import java.util.Scanner;

public class Tinhchisocannangcothe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào cân nặng: ");
        double weight = scanner.nextDouble();
        System.out.println("Nhập vào chiều cao: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if ((bmi >= 18.5) && (bmi < 25.0)) {
            System.out.println("Normal");
        } else if ((bmi >= 25.0) && (bmi < 30.0)) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
