package JavaFresherDay10.Exercise.ProductMangement.ProductController;

import JavaFresherDay10.Exercise.ProductMangement.Model.Product;
import JavaFresherDay10.Exercise.ProductMangement.Repo.ProductRepo;
import JavaFresherDay10.Exercise.ProductMangement.View.ProductView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    Scanner scanner = new Scanner(System.in);

    private List<Product> products = new ArrayList<>();
    //public ProductRepo productRepo;
    public ProductView view;

    public void addProduct(){
        int id = (products.size() > 0) ? (products.size() + 1) : 1;
        String name = inputName();
        String manufacturer = inputManufacturer();
        double price = inputPrice();
        scanner.nextLine();
        String description = inputDescription();
        Product product = new Product(id,name,manufacturer,price,description);
        products.add(product);
        //productRepo.writeToFile(view.getWriteFile(), products);
    }

    public List<Product> allProduct(){
        return products;
    }

    private String inputDescription() {
        System.out.println("Input des: ");
        return scanner.nextLine();
    }

    private double inputPrice() {
        System.out.println("In put price: ");
        return scanner.nextDouble();
    }

    private String inputManufacturer(){
        System.out.println("Input manu: ");
        return scanner.nextLine();
    }
    private String inputName() {
        System.out.println("Input name: ");
        return scanner.nextLine();
    }


    public void printProducts(){
        for (Product p : products){
            System.out.println(p.toString());
        }
        //productRepo.writeToFile(view.writeFile, products);
    }

    public Product searchByID(int id){
        Product res = new Product();
        for (int i = 0; i<products.size(); i++){
            if(products.get(i).getID() == id){
                res = products.get(i);
                break;
            }
        }
        //productRepo.writeToFile(view.writeFile, products);
        return res;
    }
}
