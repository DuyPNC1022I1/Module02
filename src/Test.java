import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        boolean check = true;
        do {
            try {
                choice = Integer.parseInt(input.nextLine());
                check = false;
            }
            catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
        while (check);
    }
}

