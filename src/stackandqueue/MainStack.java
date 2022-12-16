package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack);
        //Lấy lần lượt n phần tử từ stack:
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        //Đảo ngược chuỗi sử dụng Stack
        Stack<String> wStack = new Stack<>();
        String mWord = "mWord";
        String[] arrayMword = mWord.split("", 5);
        for (int i = 0; i < arrayMword.length ; i++) {
            wStack.push(arrayMword[i]);
        }
        //Nối mWord vào cuối chuỗi mới outp
        Stack<String> outP = new Stack<>();
        for (int i = 0; i < arrayMword.length ; i++) {
            outP.push(arrayMword[i]);
        }
    }
}
