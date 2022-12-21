package thuantoansapxep;

public class BubbleSort {
    static int[] list = {1, 23, 79, 45, 32, 3, 99, 34, 26};
    static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = list.length; j < list.length - 1; j--) {
                if(list[j - 1] > list[j]) {
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
    public static void main(String[] args) {
        System.out.println("Mảng sau khi sắp xếp là:");
        bubbleSort(list);
    }
}
