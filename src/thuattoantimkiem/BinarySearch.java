package thuattoantimkiem;

public class BinarySearch {
    public static int[] list = {1, 2, 5, 7, 8, 10, 22, 25, 79, 81, 88, 99};

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 25));
    }
}
