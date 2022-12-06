package Mangvaphuongthuccuamang;

import java.util.Scanner;

public class Timgiatrimintrongmang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Khởi tạo mảng
        System.out.println("Nhập vào size của mảng ");
        int size = input.nextInt();
        int[] array = new int[size];

        //Nhập giá trị cho từng phần tử vào mảng
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: ");
            array[i] = input.nextInt();
        }
        //Tìm giá trị nhỏ nhất của mảng vừa nhập:
        int index1 = checkMin(array);
        System.out.println("Giá trị nhỏ nhất của mảng vừa nhập là: " + array[index1]);
    }

    public static int checkMin(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
