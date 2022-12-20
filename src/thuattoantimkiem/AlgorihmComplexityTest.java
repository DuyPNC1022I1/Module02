package thuattoantimkiem;

import java.util.Scanner;

public class AlgorihmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int[] arrayChar = new int[255];
        for (int i = 0; i < input.length(); i++) {
            int ascii = (int) input.charAt(i);
            arrayChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (arrayChar[j] > max) {
                max = arrayChar[j];
                character = (char) j;
            }
            System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
        }
    }
}

