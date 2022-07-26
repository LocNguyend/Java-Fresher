package JavaFresherDay8.Exercise.ProductArrayList;

import java.util.ArrayList;

public class TestProductManager {

    public static void printProducts(ProductManager list){
        list.findAll();
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1,"aaa",100000,"mau xanh dai duong"));
        productManager.add(new Product(2,"bbb",1300000,"mau xanh la duong"));
        productManager.add(new Product(3,"ccc",500000,"mau xanh non duong"));

        printProducts(productManager);
        System.out.println("-----------------------------------");

        //Tim kiem theo ten
        System.out.println("Tim kiem theo ten");
        System.out.println(productManager.findbyName("Bbb"));
        System.out.println("-----------------------------------");

        //Update theo id va xoa theo id
        System.out.println("Thay doi des theo ID");
        productManager.updatebyID(2,"mau xanh non chuoi");
        printProducts(productManager);
        System.out.println("------------------------------------");

        //Remove by id
        System.out.println("Remove theo ID");
        productManager.removebyID(1);
        printProducts(productManager);
        System.out.println("------------------------------------");

        productManager.add(new Product(1,"aaa",100000,"mau xanh dai duong"));

        //Sap xep tang dan
        System.out.println("Sap xep tang dan theo gia");
        productManager.sortAscendingOrder();
        printProducts(productManager);
        System.out.println("-------------------------------------");

        //Sap xep giam dan
        System.out.println("Sap xep giam dan theo gia");
        productManager.sortDescendingOrder();
        printProducts(productManager);
        System.out.println("-------------------------------------");

    }
}
