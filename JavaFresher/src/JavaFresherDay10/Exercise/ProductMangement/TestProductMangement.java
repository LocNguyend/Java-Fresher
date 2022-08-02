package JavaFresherDay10.Exercise.ProductMangement;

import JavaFresherDay10.Exercise.ProductMangement.ProductController.ProductController;
import JavaFresherDay10.Exercise.ProductMangement.View.ProductView;

import java.util.Scanner;


public class TestProductMangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController controller = new ProductController();
        ProductView view = new ProductView();

        System.out.println("input write: ");
        view.setWriteFile(scanner.nextLine());

        controller.addProduct();
        controller.addProduct();
        controller.printProducts();

        //controller.printProducts();
        System.out.println(controller.searchByID(2));
    }
}
