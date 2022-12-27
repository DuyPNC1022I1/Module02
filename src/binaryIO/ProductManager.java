package binaryIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements Serializable {
    private final ArrayList<Products> product;

    public ProductManager() {
        product = new ArrayList<>();
    }

    public ArrayList<Products> getProduct() {
        return product;
    }

    //Hiển thị sản phẩm
    public void show() {
        if (!product.isEmpty()) {
            System.out.println("List product is: ");
            for (int i = 0; i < product.size(); i++) {
                System.out.println(product.get(i));
            }
        }
        else {
            System.out.println("Not exist product in list");
        }
    }

    //Tạo sản phẩm:
    public Products creatProduct(Scanner scanner) {
        System.out.println("Enter information of product: ");
        int id = -1;
        String name = null;
        String producer = null;
        int price = -1;
        try {
            System.out.println("Enter id of product: ");
            id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter name of product: ");
            name = scanner.nextLine();
            System.out.println("Enter producer of product: ");
            producer = scanner.nextLine();
            System.out.println("Enter price of product: ");
            price = Integer.parseInt(scanner.nextLine());

        } catch (ArithmeticException| NumberFormatException e) {
            e.printStackTrace();
        }
        return new Products(id, name, producer, price);
    }

    //Thêm sản phẩm
    public void addProduct(Scanner scanner) {
        product.add(creatProduct(scanner));
        show();
    }

    //Tìm kiếm thông tin sản phẩm (Theo name)
    public void searchProduct(Scanner scanner) {
        System.out.println("Enter your nameSearch: ");
        String nameSearch = scanner.nextLine();
        boolean flag = true;
        if(!product.isEmpty()) {
            for (int i = 0; i < product.size(); i++) {
                if (product.get(i).getName().toLowerCase().equals(nameSearch.toLowerCase())) {
                    flag = true;
                    System.out.println("Product search is: " + product.get(i));
                }
            }
            if (!flag) {
                System.out.println("No have product");
            }
        }
        else {
            System.out.println("Not exist product in list");
        }
    }
    //Ghi thông tin nhập lưu vào file
    public void writeToFile(String nameFile) {
        try {
            FileOutputStream out = new FileOutputStream(nameFile);
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
            outputStream.writeObject(product);
            outputStream.close();
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
