package iotextfile;
import java.io.*;

public class HuongDanJavaIO {
    public static void main(String[] args) {
        try {
            //file,;
            //Tạo file mới
            File file = new File("D:\\Module 02\\Baitapmodule02\\src\\iotextfile\\Test.txt");
            file.mkdir(); //Tạo file
            System.out.println(file.getAbsolutePath()); //Hiển thị đường dẫn file: getAbsolutePath()

            //Ghi file sử dụng FileWrite
//            FileWriter writer = new FileWriter("Test.txt"); //Mở file để ghi, hoặc:
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello1");
            bufferedWriter.write("Hello2");
            bufferedWriter.close();

            //Đọc file sử dụng FileRead
            FileReader read = new FileReader(file); //Nối FileReader với một file text
            BufferedReader reader = new BufferedReader(read); //Nối BufferedReader với FileReader
            String line = null;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
