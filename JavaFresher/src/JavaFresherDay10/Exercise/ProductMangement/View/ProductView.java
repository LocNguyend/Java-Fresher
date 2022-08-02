package JavaFresherDay10.Exercise.ProductMangement.View;

import JavaFresherDay10.Exercise.ProductMangement.Model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public String writeFile;
    public String readFile;

    public void printProduct(List<Product> products){
        for (Product p : products){
            System.out.println(p.toString());
        }
    }


    public String getWriteFile() {
        return writeFile;
    }

    public void setWriteFile(String writeFile) {
        this.writeFile = writeFile;
    }

    public String getReadFile() {
        return readFile;
    }

    public void setReadFile(String readFile) {
        this.readFile = readFile;
    }
}
