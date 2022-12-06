package Mangvaphuongthuccuamang;

import java.util.Scanner;

public class Xoaphantukhoimang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner input = new Scanner(System.in);
        // Nhập phần tử cần xóa
        System.out.println("Nhập phần tử cần xóa: ");
        int number = input.nextInt();

        //Xóa phần tử trong mảng
        int index_del = check(array, number);
        for (int i = index_del; i < array.length; i++) {
            if (i + 1 < array.length) {
                array[i] = array[i + 1];
            }
            else {
                array[array.length -1 ] = 0;
            }
        }
        // In ra mảng sau khi thay đổi:
        System.out.println("Mảng mới sau khi xóa phần tử là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +"\t");
        }
    }

    // Tạo hàm check number có xuất hiện trong mảng arr??
    public static int check(int[] arr, int number) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}
