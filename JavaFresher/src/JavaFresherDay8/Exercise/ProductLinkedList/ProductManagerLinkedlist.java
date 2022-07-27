package JavaFresherDay8.Exercise.ProductLinkedList;

import java.util.*;

public class ProductManagerLinkedlist {
    private LinkedList<Product> productLinkedList = new LinkedList<>();

    void addProduct(Product proc){
        productLinkedList.add(proc);
    }

    void removebyIDProduct(int id){
        int index = 0;
        for (int i = 0; i < productLinkedList.size(); i++){
            if (productLinkedList.get(i).getId() == id){
                index = i;
            }
        }
        productLinkedList.remove(index);
    }

    void updatebyIDProduct(int id, String des){
        for (Product iter : productLinkedList){
            if (iter.getId() == id){
                iter.setDescription(des);
            }
        }
    }

    void findAll(){
        for (Product iter : productLinkedList){
            System.out.println(iter.toString());
        }
    }

    Product findbyName(String name){
        for (Product iter : productLinkedList){
            if (iter.getName().equalsIgnoreCase(name)){
                return iter;
            }
        }
        return null;
    }

    void sortAscending(){
        Collections.sort(productLinkedList, new PriceComparator());
    }

    void sortDescending(){
        Comparator priceComparator = Collections.reverseOrder(new PriceComparator());
        Collections.sort(productLinkedList, priceComparator);
    }
}
