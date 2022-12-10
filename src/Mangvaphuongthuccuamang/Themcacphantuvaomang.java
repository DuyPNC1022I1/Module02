package Mangvaphuongthuccuamang;

import java.util.Scanner;

public class Themcacphantuvaomang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào số cần chèn vào mảng");
        int x = input.nextInt();

        System.out.println("Nhập vào vị trí index vào mảng");
        int index = input.nextInt();

        System.out.println("Nhập vào độ dài n của mảng array ");
        int n = input.nextInt();
        int[] array = new int[n];
        //Duyệt mảng, nhập vào giá trị cho từng phần tử trong mảng
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào giá trị phần tử thứ: " + i);
            array[i] = input.nextInt();
        }
        //Tạo mảng mới
        int[] arrayNew = new int[n+1];
        // Copy phần từ của mảng arr -> mảng arrayNew
        for (int i = 0; i < index ; i++) {
            arrayNew[i] = array[i];
        }
        arrayNew[index] = x;

        for (int i = index+1; i < arrayNew.length; i++) {
            arrayNew[i] = array[i-1];
        }
        // Hiển thị mảng mới đã tạo ra màn hình
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i] + "\t");
        }
    }
}
