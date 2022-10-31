import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDB {
    Scanner scanner = new Scanner(System.in);

    public List<Product> productList = new ArrayList<>();

    ProductDB() {

    }


    public List<Product> viewListOfProducts() {
        return productList;
    }


    public void buyProduct(){


    }


    public void addProduct() {
        System.out.print("What product would you add?\n1.computer\n2.mouse\n3.keyboard\n4.monitor\n5.hardrive" +
                "\n6.pendrive\nInsert your choice:");
        switch (scanner.nextInt()) {
            case 1 -> {
                productList.add(Product.COMPUTER);
                GUI.printAddComputer();
            }
            case 2 -> {
                productList.add(Product.MOUSE);
               GUI.printAddMouse();
            }
            case 3 -> {
                productList.add(Product.KEYBOARD);
                GUI.printAddKeyboard();

            }
            case 4 -> {
                productList.add(Product.MONITOR);
                GUI.printAddMonitor();

            }
            case 5 -> {
                productList.add(Product.HARDRIVE);
                GUI.printAddHardrive();

            }
            case 6 -> {
                productList.add(Product.PENDRIVE);
                GUI.printAddPendrive();

            }default -> System.out.println("---Nothing added---");
        }

    }

    public enum Product {
        COMPUTER(5000, 123),
        MOUSE(120, 123),
        KEYBOARD(300, 124),
        MONITOR(600, 125),
        HARDRIVE(800, 126),
        PENDRIVE(30, 127);
        int prize;
        int keyProduct;


        Product(int prize, int keyProduct) {
            this.prize = prize;
            this.keyProduct = keyProduct;
        }

    }


}
