package IntroductiontoJava;

import java.util.Scanner;

// ax + b = 0
// x = -b / a;
public class Giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double result = (c - b) / a;
            System.out.printf("Phương trình có nghiệm duy nhất là: " + result);
        }
        else {
            if (b == c) {
                System.out.print("Phương trình vô nghiệm");
            }
            else {
                System.out.print("Với mọi a là nghiệm của phương trình");
            }
        }
    }
}
