import MiniTest2.Student;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Vietnam");
        queue.offer("America");
        queue.offer("Japan");
        queue.offer("Korea");
        System.out.println(queue);
    }
}
