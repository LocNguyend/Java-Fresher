package JavaFresherDay10.Exercise.ProductMangement.Repo;

import JavaFresherDay10.Exercise.ProductMangement.Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    public void writeToFile(String path,List<Product> products){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }
}
