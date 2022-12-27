package binaryIO;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager(); //Tạo đối tượng producManager hứng thông tin từ lớp ProductManager
        do {
            System.out.println("MENU");
            System.out.println("1. Add product to file");
            System.out.println("2. Display product");
            System.out.println("3. Search product by name");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (ArithmeticException e) {
                e.printStackTrace();
            }
            switch (choice) {
                case 1:
                    productManager.addProduct(scanner);
                    productManager.writeToFile("D:\\Module 02\\Baitapmodule02\\src\\binaryIO\\FileProduct");
                    break;
                case 2:
                    productManager.show();
                    break;
                case 3:
                    productManager.searchProduct(scanner);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("You need choose: 0~3");
            }
        }
        while (true);
    }
}
