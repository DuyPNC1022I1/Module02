package MiniTest04;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements Serializable {
    private ArrayList<Product> productManager;
    private CategoryManager categoryManager;
    private int idAuto = 0;

    public ProductManager(CategoryManager categoryManager) {
        this.productManager = new ArrayList<>();
        this.categoryManager = categoryManager;
    }

    //Hiển thị danh sách sản phẩm
    public void displayProductManager() {
        if (!productManager.isEmpty()) {
            for (Product product : productManager) {
                System.out.println(product);
            }
        } else {
            System.out.println("Not exist Product in list");
        }
    }

    public Product creatProduct(Scanner scanner) {
        System.out.println("Creat new product: ");
        int id = -1;
        String name = null;
        int price = -1;
        int quantity = -1;
        Category category = null;
        boolean check = true;
        do {
            try {
                if (productManager.isEmpty()) {
                    id = idAuto + 1;
                } else {
                    id = productManager.size() + 1;
                }
                System.out.println("Enter name of product: ");
                name = scanner.nextLine();
                System.out.println("Enter price of product: ");
                price = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter quantity of product: ");
                quantity = Integer.parseInt(scanner.nextLine());
                try {
                    System.out.println("Choose category of product: ");
                    category = choiceCategory(scanner);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Index out of 'listCategory.length', re-enter");
                }
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format, re-enter!!!");
            }
        }
        while (check);
        return new Product(id, name, price, quantity, category);
    }

    public Category choiceCategory(Scanner scanner) {
        Category category;
        System.out.println("Enter choice category by id: ");
        int idCategory = 0;
        boolean check = true;
        do {
            try {
                idCategory = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format, re-enter");
            }
        }
        while (check);
        if (idCategory != 0) {
            category = this.categoryManager.getCategoryById(idCategory);
        } else {
            category = this.categoryManager.creatCategory(scanner);
            categoryManager.addCategoryProduct(scanner);
        }
        if (category != null) {
            return category;
        } else {
            return choiceCategory(scanner);
        }
    }

    //Thêm sản phẩm
    public void addProduct(Scanner scanner) {
        productManager.add(creatProduct(scanner));
        displayProductManager();
    }

    public int searchIdOfProduct(Scanner scanner) {
        System.out.println("Enter id to search:");
        int index = -1;
        int idToSearch = -1;
        boolean check = true;
        do {
            try {
                idToSearch = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        while (check);
        boolean flag = false;
        for (int i = 0; i < productManager.size(); i++) {
            if (productManager.get(i).getId() == idToSearch) {
                index = i;
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Can't find the same id");
            searchIdOfProduct(scanner);
        }
        return index;
    }

    //Xóa sản phẩm theo id
    public void deleteById(Scanner scanner) {
        int indexToDelete = searchIdOfProduct(scanner);
        if (indexToDelete != -1) {
            productManager.remove(indexToDelete);
            displayProductManager();
        }
    }

    //Sửa sản phẩm theo id
    public void updateProductById(Scanner scanner) {
        int indexToRewrite = searchIdOfProduct(scanner);
        if (indexToRewrite != -1) {
            System.out.println("Enter information to rewrite product ");
            for (int i = 0; i < productManager.size(); i++) {
                if (i == indexToRewrite) {
                    boolean check = true;
                    do {
                        try {
                            System.out.println("Enter new name of product: ");
                            String name = scanner.nextLine();
                            productManager.get(i).setName(name);
                            System.out.println("Enter new price of product: ");
                            int price = Integer.parseInt(scanner.nextLine());
                            productManager.get(i).setPrice(price);
                            System.out.println("Enter quantity of product: ");
                            int quantity = Integer.parseInt(scanner.nextLine());
                            productManager.get(i).setQuantity(quantity);
                            System.out.println("Choose category of product: ");
                            Category category = choiceCategory(scanner);
                            productManager.get(i).setCategory(category);
                            check = false;
                        } catch (NumberFormatException e) {
                            System.out.println("Wrong format, re-enter");
                        }
                    }
                    while (check);
                }
            }
            displayProductManager();
        }
    }

    //Hiển thị sản phẩm có giá cao nhất
    public void displayProductByMaxPrice() {
        int indexMax = 0;
        System.out.println("Product have max Price is: ");
        for (int i = 0; i < productManager.size(); i++) {
            if (productManager.get(i).getPrice() > productManager.get(indexMax).getPrice()) {
                indexMax = i;
            }
        }
        System.out.println(productManager.get(indexMax));
    }

    //Hiển thị sản phẩm có giá thấp nhất
    public void displayProductByMinPrice() {
        int indexMin = 0;
        for (int i = 0; i < productManager.size(); i++) {
            if (productManager.get(i).getPrice() < productManager.get(indexMin).getPrice()) {
                indexMin = i;
            }
        }
        System.out.println("Product have min Price is: ");
        System.out.println(productManager.get(indexMin));
    }

    //Hiển thị sản phẩm có quantity lớn nhất
    public void displayProductByQuantityMax() {
        int indexQuantityMax = 0;
        for (int i = 0; i < productManager.size(); i++) {
            if (productManager.get(i).getQuantity() > productManager.get(indexQuantityMax).getQuantity()) {
                indexQuantityMax = i;
            }
        }
        System.out.println("Product have Max Quantity is: ");
        System.out.println(productManager.get(indexQuantityMax));
    }

    //Hiển thị sản phẩm có quantity nhỏ nhất
    public void displayProductByQuantityMin() {
        int indexQuantityMin = 0;
        for (int i = 0; i < productManager.size(); i++) {
            if (productManager.get(i).getQuantity() > productManager.get(indexQuantityMin).getQuantity()) {
                indexQuantityMin = i;
            }
        }
        System.out.println("Product have Max Quantity is: ");
        System.out.println(productManager.get(indexQuantityMin));
    }

    //Tìm kiếm sản phẩm theo tên gần đúng
    public void searchProductByName(Scanner scanner) {
        System.out.println("Enter name of Product to search");
        String nameToSearch = scanner.nextLine();
        System.out.println("Product have the same name is: ");
        if (!productManager.isEmpty()) {
            boolean flag = false;
            for (Product product : productManager) {
                if (product.getName().toLowerCase().contains(nameToSearch.toLowerCase())) {
                    System.out.println(product);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Can't find the same name");
            }
        } else {
            System.out.println("Search fail because 'Not exist Category in list'");
        }
    }

    //Tìm kiếm sản phẩm theo khoảng giá
    public void searchProductByPrice(Scanner scanner) {
        System.out.println("Enter price to search");
        boolean check = true;
        do {
            try {
                System.out.println("Enter price upper");
                int priceUpper = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter price lower");
                int priceLower = Integer.parseInt(scanner.nextLine());
                boolean flag = false;
                if (!productManager.isEmpty()) {
                    for (Product product : productManager) {
                        if (product.getPrice() >= priceLower && product.getPrice() <= priceUpper) {
                            flag = true;
                            System.out.println(product);
                        }
                    }
                    if (!flag) {
                        System.out.println("No products found for this price");
                    }
                } else {
                    System.out.println("Search fail because 'Not exist Category in list");
                }
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format, re-enter");
            }
        }
        while (check);
    }

    //Tìm kiếm sản phẩm theo loại
    public void searchProductByCategory(Scanner scanner) {
        System.out.println("Enter category to search: ");
        Category category = choiceCategory(scanner);
        boolean flag = false;
        if (!productManager.isEmpty()) {
            for (Product product : productManager) {
                if (product.getCategory().equals(category)) {
                    flag = true;
                    System.out.println(product);
                }
            }
            if (!flag) {
                System.out.println("No products found for this category");
            }
        } else {
            System.out.println("Search fail because 'Not exist Category in list");
        }

    }

    //Tạo sản phẩm candy
    public Candy creatCandy(Scanner scanner) {
        System.out.println("Creat new product Candy: ");
        int id = -1;
        String name = null;
        int price = -1;
        int quantity = -1;
        Category category = null;
        int weight = -1;
        boolean check = true;
        do {
            try {
                if (productManager.isEmpty()) {
                    id = idAuto + 1;
                } else {
                    id = productManager.size() + 1;
                }
                System.out.println("Enter name of product Candy: ");
                name = scanner.nextLine();
                System.out.println("Enter price of product Candy: ");
                price = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter quantity of product Candy: ");
                quantity = Integer.parseInt(scanner.nextLine());
                System.out.println("Choose category of product Candy: ");
                category = choiceCategory(scanner);
                System.out.println("Enter weight of product Candy: ");
                weight = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format, re-enter");
            }
        }
        while (check);
        return new Candy(id, name, price, quantity, category, weight);
    }

    public void addCandyToProductManager(Scanner scanner) {
        productManager.add((Product) creatCandy(scanner));
        displayProductManager();
    }

    //Hiển thị danh sách sản phẩm là Candy
    public void displayProductIsCandy() {
        for (Product product : productManager) {
            if (product instanceof Candy) {
                System.out.println(product);
            }
            else {
                System.out.println("Not have product is Candy");
            }
        }
    }

    //Hiển thị sản phẩm là candy + có weight lớn nhất
    public void displayCandyByMaxWeight() {
        ArrayList<Candy> arrayCandy = new ArrayList<>();
        int indexWeightMax = 0;
        for (int i = 0; i < productManager.size(); i++) {
            if (productManager.get(i) instanceof Candy) {
                arrayCandy.add((Candy) productManager.get(i));
            }
        }
        for (int i = 0; i < arrayCandy.size(); i++) {
            if (arrayCandy.get(i).getWeight() > arrayCandy.get(indexWeightMax).getWeight()) {
                indexWeightMax = i;
            }
        }
        System.out.println(productManager.get(indexWeightMax));
    }

    //Tạo sản phẩm Drinks
    public Drinks creatDrinks(Scanner scanner) {
        System.out.println("Creat new product Drinks: ");
        int id = -1;
        String name = null;
        int price = -1;
        int quantity = -1;
        Category category = null;
        int volume = -1;
        String bootleType = null;
        boolean check = true;
        do {
            try {
                if (productManager.isEmpty()) {
                    id = idAuto + 1;
                } else {
                    id = productManager.size() + 1;
                }
                System.out.println("Enter name of product Drinks: ");
                name = scanner.nextLine();
                System.out.println("Enter price of product Drinks: ");
                price = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter quantity of product Drinks: ");
                quantity = Integer.parseInt(scanner.nextLine());
                System.out.println("Choose category of product Drinks: ");
                category = choiceCategory(scanner);
                System.out.println("Enter volume of product Drinks: ");
                volume = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter bottleType of product Drinks ");
                bootleType = scanner.nextLine();
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format, re-enter");
            }
        }
        while (check);
        return new Drinks(id, name, price, quantity, category, volume, bootleType);
    }

    //Thêm sản phẩm Drinks vào productManager
    public void addDrink(Scanner scanner) {
        productManager.add((Product) creatDrinks(scanner));
        displayProductManager();
    }

    //Hiển thị danh sách sản phẩm là Drinks
    public void displayDrinks() {
        for (Product product : productManager) {
            if (product instanceof Drinks) {
                System.out.println(product);
            }
            else {
                System.out.println("Not have product is Drinks");
            }
        }
    }

    //Hiển thị danh sách sản phẩm là Drinks + theo bottleType
    public void displayDrinksByBottleType(Scanner scanner) {
        System.out.println("Enter bottleType to display");
        String bottleTypeToDisplay = scanner.nextLine();
        boolean flag = false;
        for (Product product : productManager) {
            if (product instanceof Drinks) {
                if (((Drinks) product).getBottleType().equals(bottleTypeToDisplay)) {
                    System.out.println(product);
                    flag = true;
                }
            }
        }
        if (!flag)
            System.out.println("No products found for this bottleType");
    }

    //Hiển thị sản phẩm là Drinks có bootleType là thủy tinh và có giá lớn nhất trong đó
    public void displayDrinkByBootleAndPrice() {
        int indexPriceMax = 0;
        for (int i = 0; i < productManager.size(); i++) {
            if (productManager.get(i) instanceof Drinks) {
                if (((Drinks) productManager.get(i)).getBottleType().toLowerCase().equals("Glass".toLowerCase())) {
                    if (productManager.get(i).getPrice() > productManager.get(indexPriceMax).getPrice()) {
                        indexPriceMax = i;
                        System.out.println(productManager.get(indexPriceMax));
                    }
                } else {
                    System.out.println("Can't find product the same price");
                }
            }
        }
    }

    //Ghi dữ liệu vào file
    public void writeToFile(String nameFile) {
        try {
            FileOutputStream out = new FileOutputStream(nameFile);
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
            outputStream.writeObject(productManager);
            outputStream.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Đọc dữ liệu file
    public ArrayList<ProductManager> readToFile(String nameFile) {
        ArrayList<ProductManager> read = new ArrayList<>();
        try {
            FileInputStream input = new FileInputStream(nameFile);
            ObjectInputStream inputStream = new ObjectInputStream(input);
            read = (ArrayList<ProductManager>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return read;
    }
}
