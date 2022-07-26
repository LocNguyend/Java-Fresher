package JavaFresherDay8.Exercise.ProductArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {

    ArrayList<Product> products = new ArrayList<>();

    //them san pham
    public void add(Product proc){
        products.add(proc);
    }

    //sua thong tin san pham theo id
    public void updatebyID(int id, String des){
        for (Product i : products){
            if (i.getId() == id) {
                i.setDescription(des);
            }
        }
    }

    //xoa san pham theo id
    public void removebyID(int id){
        int index = 0;
        for (int i = 0; i < products.size(); i++){
                if (products.get(i).getId() == id){
                    index = i;
                }
        }
        products.remove(index);
    }

    //hien thi danh sach san pham
    public void findAll(){
        for (Product i : products){
            System.out.println(i.toString());
        }
    }

    //tim kiem san pham theo ten
    public Product findbyName(String name){
        for (Product i : products){
            if(i.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return null;
    }

    //sap xep san pham tang dan
    public void sortAscendingOrder(){
        Collections.sort(products,new PriceComparator());
    }

    public void sortDescendingOrder(){
        Comparator priceComparator = Collections.reverseOrder(new PriceComparator());
        Collections.sort(products, priceComparator);
    }

}
