package Mangvaphuongthuccuamang;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập kích thước mảng array1: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Nhập kích thước mảng array2: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];

        // Nhập phần tử cho mảng array1
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập giá trị cho phần tử" + i + "của mảng array1");
            array1[i] = input.nextInt();
        }
        //Nhập phần tử cho mảng array2
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập giá trị cho phần tử" + i + "của mảng array1");
            array2[i] = input.nextInt();
        }
        //Tạo mảng 3 có kích thước bẳng mảng 1 + 2
        int[] array3 = new int[size1+size2];
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = size1; i <array3.length ; i++) {
            array3[i] = array2[i-size1];
        }
        //In ra mảng array3;
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
