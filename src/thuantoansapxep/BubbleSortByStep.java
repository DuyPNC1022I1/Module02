package thuantoansapxep;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        //Nhập vào độ dài phần tử
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        //Nhập vào từng phần tử cho mảng số nguyên
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input element of array: ");
            array[i] = input.nextInt();
        }

        //Hiển thị mảng số nguyên vừa nhập
        System.out.println("Array before sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        //Hiển thị mảng số nguyên sau khi sắp xếp:
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        boolean flag = true;
        for (int i = 0; (i < array.length - 1) && flag; i++) {
            flag = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("Step sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }
}
