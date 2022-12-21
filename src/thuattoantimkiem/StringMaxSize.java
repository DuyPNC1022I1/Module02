package thuattoantimkiem;

import java.util.LinkedList;
import java.util.Scanner;

public class StringMaxSize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        //Sắp xếp chuỗi tăng dần
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            //Add phần tử vào mảng max + clear phần tử mảng list
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        // Hiển thị chuỗi tăng dần dài nhất
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

