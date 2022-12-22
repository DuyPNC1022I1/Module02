package exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your number:");
        int index = input.nextInt();
        int[] arrayTest = createRandom();
        try {
            System.out.println(arrayTest[index]);
        } catch (Exception e) {
            System.out.println("Over index limit");
        }
    }

    public static int[] createRandom() {
        Random number = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(100);
        }
        return array;
    }
}
