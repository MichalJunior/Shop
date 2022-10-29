import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDB {
    Scanner scanner = new Scanner(System.in);

     public List<Product> productList = new ArrayList<>();

     ProductDB(){

     }



    public List<Product> viewListOfProducts() {
        return productList;
    }



    public void addProduct(String name) {
        switch (scanner.nextLine()) {
            case "computer" -> productList.add(Product.COMPUTER);
            case "mouse" -> productList.add(Product.MOUSE);
            case "keyboard" -> productList.add(Product.KEYBOARD);
            case "monitor" -> productList.add(Product.MONITOR);
            case "hardrive" -> productList.add(Product.HARDRIVE);
            case "pendrive" -> productList.add(Product.PENDRIVE);
        }

    }
    public enum Product {
        COMPUTER(5000,123),
        MOUSE(120,123),
        KEYBOARD(300,124),
        MONITOR(600,125),
        HARDRIVE(800,126),
        PENDRIVE(30,127);
        int prize;
        int keyProduct;


        Product(int prize, int keyProduct) {
            this.prize = prize;
            this.keyProduct = keyProduct;
        }

    }


}
