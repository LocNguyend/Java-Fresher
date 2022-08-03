package JavaFresherDay10.Exercise.ProductMangement;

import JavaFresherDay10.Exercise.ProductMangement.Model.Product;
import JavaFresherDay10.Exercise.ProductMangement.ProductController.ProductController;
import JavaFresherDay10.Exercise.ProductMangement.Repo.ProductRepo;
import JavaFresherDay10.Exercise.ProductMangement.View.ProductView;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class TestProductMangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController controller = new ProductController();
        ProductView view = new ProductView();
        ProductRepo repo = new ProductRepo();

        System.out.println("input write: ");
        view.setWriteFile(scanner.nextLine());
        System.out.println("input read: ");
        view.setReadFile(scanner.nextLine());

        controller.addProduct();
        controller.addProduct();
        controller.printProducts();

        //controller.printProducts();
        System.out.println(controller.searchByID(2));

        repo.writeToFile(view.getWriteFile(), controller.allProduct());
        System.out.println("----------------------------------------");
        List<Product> readProducts = new ArrayList<>();
        readProducts = repo.readDataFromFile(view.getReadFile());
        System.out.println(readProducts);
    }
}
