package Mangvaphuongthuccuamang;

import java.util.Scanner;

public class Timphantulonnhattrongmanghaichieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào row của mảng array: ");
        int row = input.nextInt();
        System.out.println("Nhập vào col của mảng array: ");
        int col = input.nextInt();

        // Khởi tạo mảng 2 chiều array
        int[][] array = new int[row][col];
        int max = array[0][0];
        int index1 = 0;
        int index2 = 0;

        //Nhập vào từng phần tử của mảng array + in ra phần tử max
        System.out.println("Nhập vào từng phẩn tử của mảng array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập vào phần tử thứ " + "[" + i + "]" + "[" + j + "]");
                array[i][j] = input.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là max: "+ max + "Có tọa độ là " + "[" + index1 + "]" + "[" + index2+ "]" );
    }
}
