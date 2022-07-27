package JavaFresherDay8.Exercise.ProductLinkedList;

public class TestProductManagerLinkedlist {

    public static void main(String[] args) {

        ProductManagerLinkedlist products = new ProductManagerLinkedlist();
        products.addProduct(new Product(1,"aaa",100000,"mau xanh dai duong"));
        products.addProduct(new Product(2,"bbb",1300000,"mau xanh la duong"));
        products.addProduct(new Product(3,"ccc",500000,"mau xanh non duong"));
        products.addProduct(new Product(58,"Loc",582001,"doc than"));

        //Test findALl
        System.out.println("Test find all: ");
        products.findAll();
        System.out.println("--------------------------------------");


        //test remove by id
        System.out.println("Test remove by ID: ");
        products.removebyIDProduct(2);
        products.findAll();
        System.out.println("---------------------------------------");

        //test update by ID
        System.out.println("Test update by ID: ");
        products.updatebyIDProduct(58, "Da co con cho");
        products.findAll();
        System.out.println("----------------------------------------");

        //test find by name
        System.out.println("Test find by name: ");
        System.out.println(products.findbyName("lOc"));
        System.out.println("-----------------------------------------");

        //test sort
        System.out.println("Sort ascending: ");
        products.addProduct(new Product(19,"Bim Bim",171198,"doc than"));
        products.sortAscending();
        products.findAll();
        System.out.println("Sort descending: ");
        products.sortDescending();
        products.findAll();
    }
}
