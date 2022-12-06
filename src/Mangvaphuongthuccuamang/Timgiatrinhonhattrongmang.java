package Mangvaphuongthuccuamang;

public class Timgiatrinhonhattrongmang {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 9, 12, 33, 56};
        int index = minValue(arr);
        System.out.println("Phần tử có giá trị nhỏ nhất: " + arr[index]);
    }
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

}
