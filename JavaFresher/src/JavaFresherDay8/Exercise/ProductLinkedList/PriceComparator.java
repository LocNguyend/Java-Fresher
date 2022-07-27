package JavaFresherDay8.Exercise.ProductLinkedList;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getPrice() > p2.getPrice()){
            return 1;
        }else if(p1.getPrice() == p2.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }
}
