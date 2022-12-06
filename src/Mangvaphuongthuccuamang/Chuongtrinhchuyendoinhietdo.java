package Mangvaphuongthuccuamang;

import java.util.Scanner;

public class Chuongtrinhchuyendoinhietdo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Input choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println(FahrenheittoCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Input celsius: ");
                    celsius = input.nextDouble();
                    System.out.println(CelsiustoFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }


    // Chuyển F -> C
    public static double FahrenheittoCelsius (double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    // Chuyển C -> F
    public static double CelsiustoFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
