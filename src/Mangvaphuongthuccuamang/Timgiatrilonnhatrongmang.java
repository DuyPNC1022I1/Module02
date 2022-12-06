package Mangvaphuongthuccuamang;

import sun.applet.Main;

import java.util.Scanner;

public class Timgiatrilonnhatrongmang {
    public static void main(String[] args) {
        // Nhập vào giá trị tài sản của các tỷ phú thế giới ( Đơn vị tỉ đô)
        Scanner input = new Scanner(System.in);
        int size;
        int[] arrayAsset;

        // Kiểm tra kích thước mảng có lớn hơn 20?
        do {
            System.out.println("Input size of arrayAsset");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Not found");
            }
        } while (size > 20);

        // Nhập vào giá trị từng phần tử của mảng arrayAsset
        arrayAsset = new int[size]; // Khởi tạo mảng arrayAsset với size phần tử
        for (int i = 0; i < arrayAsset.length; i++) {
            System.out.println("Input asset value: " +"\t" + (i + 1));
            arrayAsset[i] = input.nextInt();
        }
        //Tìm giá trị lớn nhất trong mảng
        int max = arrayAsset[0];
        for (int i = 0; i < arrayAsset.length; i++) {
            if (arrayAsset[i]>max) {
                max = arrayAsset[i];
            }
        }
        System.out.println("Max of arrayAsset is: " + max);
    }
}
