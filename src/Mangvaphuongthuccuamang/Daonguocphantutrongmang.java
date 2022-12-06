package Mangvaphuongthuccuamang;

import java.util.Scanner;

public class Daonguocphantutrongmang {
    public static void main(String[] args) {
        // Khai bao bien + nhap + kiem tra kich thuoc mang
        int size; // Khai bao size mang
        int[] array; // Khai bao mang can dao nguoc phan tu array
        Scanner input = new Scanner(System.in); // Khoi tao doi tuong input
        // Kiem tra kich thuoc size cua mang co vuot qua 20?
        do {
            System.out.println("Enter a size");
            size = input.nextInt();
            if (size > 20) {  // Dieu kien kich thuoc mang phai nho hon 20
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20); // Lap lai qua trinh nhap size neu dieu kien kich thuoc mang > 20
        // Nhap cac gia tri cho tung phan tu cua mang
        array = new int[size]; // Khoi tao mang array voi kieu du lieu int + size phan tu
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element: " + i + 1);
            array[i] = input.nextInt();
        }
        // In ra mang da nhap
        System.out.println("Element in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        // Dao nguoc thu tu cac phan tu trong mang
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        // In ra mang sau khi da dao nguoc thu tu cac phan tu
        System.out.println("Reverse array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
