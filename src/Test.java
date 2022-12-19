import MiniTest03.ClassRoom;
import MiniTest2.Student;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.set(2, 5);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + "\t");
        }
    }
}
