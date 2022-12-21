package thuantoansapxep;

public class SelectionSort {
    public static int[] array = {1, 3, 2, 9, 3, 6, 7};
    public static void main(String[] args) {
        selectionSort(array);
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            int min = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                array[indexMin] = array[i];
                array[i] = min;
            }
        }
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
