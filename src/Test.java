import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 6, 4, 9, 10};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(args[0]);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            for (int i = 0; i < a.length; i++) {
                dataOutputStream.writeInt(a[i]); //Ghi dữ liệu kiểu int
                dataOutputStream.close();
            }
        }
        catch (IOException e ) {
            e.getMessage();
        }
    }
}

