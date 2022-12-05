package Vonglap;

import java.util.Scanner;

public class Hienthicacloaihinh {
    public static void main(String[] args) {
//        Hình chữ nhật 3 dòng - 7 cột
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        Hình tam giác vuông, cạnh vuông ở botton-left
        for (int i = 0; i < 5; i++) {
            for ( int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        Hình tam giác vuông, cạnh vuông ở top-left
        for (int i = 5; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}