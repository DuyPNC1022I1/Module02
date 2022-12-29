package MiniTest04;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CategoryManager implements Serializable {
    private ArrayList<Category> categoryManager;
    private  int idAuto = 0;

    public CategoryManager() {
        categoryManager = new ArrayList<Category>();
    }

    public Category creatCategory(Scanner scanner) {
        System.out.println("Enter Information of Category: ");
        int id = -1;
        if (categoryManager.isEmpty()){
            id = idAuto + 1;
        }
        else {
            id = categoryManager.size() + 1;
        }
        System.out.println("Enter name of Category: ");
        String name = scanner.nextLine();
        return new Category(id, name);
    }

    //Hiển thị sản phẩm
    public void displayCategory() {
        if (!categoryManager.isEmpty()) {
            for (int i = 0; i < categoryManager.size(); i++) {
                System.out.println(categoryManager.get(i));
            }
        } else {
            System.out.println("Not exist Category in list");
        }
    }

    //Thêm loại sản phẩm
    public void addCategoryProduct(Scanner scanner) {
        categoryManager.add(creatCategory(scanner));
        displayCategory();
    }

    public int searchIdCategory(Scanner scanner) {
        System.out.println("Enter id to search: ");
        int id = -1;
        int index = -1;
        boolean flag = false;
        boolean check =  true;
        do {
            try {
                id = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format, re-check");;
            }
        }
        while (check);
        for (int i = 0; i < categoryManager.size(); i++) {
            if (id == categoryManager.get(i).getId()) {
                flag = true;
                index = i;
            }
        }
        if (!flag) {
            System.out.println("Can't find the same id");
            searchIdCategory(scanner);
        }
        return index;
    }

    //Xóa sản phẩm theo Id
    public void deleteCategoryById(Scanner scanner) {
        int indexDelete = searchIdCategory(scanner);
        if (indexDelete != -1) {
            categoryManager.remove(indexDelete);
            displayCategory();
        }
    }

    //Sửa loại sản phẩm theo Id
    public void updateCategoryById(Scanner scanner) {
        int indexRewrite = searchIdCategory(scanner);
        if (indexRewrite != -1) {
            System.out.println("Enter information to rewrite Category: ");
            for (int i = 0; i < categoryManager.size(); i++) {
                if (i == indexRewrite) {
                    System.out.println("Enter new name of Category");
                    String name = scanner.nextLine();
                    categoryManager.get(i).setName(name);
                }
            }
        }
        displayCategory();
    }

    public Category getCategoryById(int idCategory) {
        for (Category category : categoryManager) {
            if (category.getId() == idCategory) {
                return category;
            }
        }
        return null;
    }
}
