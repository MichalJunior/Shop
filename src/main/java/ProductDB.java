import java.util.*;

public class ProductDB {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    HashMap<Product, Integer> availableProducts = new HashMap<>();

    public void viewMapOfProducts() {
        if (Product.COMPUTER.quantity > 0) {
            availableProducts.put(Product.COMPUTER, Product.COMPUTER.quantity);
        }
        if (Product.MOUSE.quantity > 0) {
            availableProducts.put(Product.MOUSE, Product.MOUSE.quantity);
        }
        if (Product.KEYBOARD.quantity > 0) {
            availableProducts.put(Product.KEYBOARD, Product.KEYBOARD.quantity);
        }
        if (Product.HARDRIVE.quantity > 0) {
            availableProducts.put(Product.HARDRIVE, Product.HARDRIVE.quantity);
        }
        if (Product.MONITOR.quantity > 0) {
            availableProducts.put(Product.HARDRIVE, Product.HARDRIVE.quantity);
        }
        if (Product.PENDRIVE.quantity > 0) {
            availableProducts.put(Product.PENDRIVE, Product.PENDRIVE.quantity);
        }
        System.out.println("/////Available products/////\n" + availableProducts);
    }

    public void addProduct() {
        GUI.printAddingAnnouncement();
        GUI.printProductsPanel();
        switch (scanner.nextInt()) {
            case 1 -> {
                Product.COMPUTER.quantity++;
                GUI.printAddComputer();
            }
            case 2 -> {
                Product.MOUSE.quantity++;
                GUI.printAddMouse();
            }
            case 3 -> {
                Product.KEYBOARD.quantity++;
                GUI.printAddKeyboard();

            }
            case 4 -> {
                Product.MONITOR.quantity++;
                GUI.printAddMonitor();

            }
            case 5 -> {
                Product.HARDRIVE.quantity++;
                GUI.printAddHardrive();

            }
            case 6 -> {
                Product.PENDRIVE.quantity++;
                GUI.printAddPendrive();

            }
            default -> GUI.printNothingAdded();
        }

    }
    public void buyProduct() {
        GUI.printBuyAnnouncement();
        GUI.printProductsPanel();
        switch (scanner.nextInt()) {
            case 1 -> {
                Product.COMPUTER.quantity--;
                GUI.printBoughtComputer();
            }
            case 2 -> {
                Product.MOUSE.quantity--;
                GUI.printBoughtMouse();
            }
            case 3 -> {
                Product.KEYBOARD.quantity--;
                GUI.printBoughtKeyboard();

            }
            case 4 -> {
                Product.MONITOR.quantity--;
                GUI.printBoughtMonitor();

            }
            case 5 -> {
                Product.HARDRIVE.quantity--;
                GUI.printBoughtHardrive();

            }
            case 6 -> {
                Product.PENDRIVE.quantity--;
                GUI.printBoughtPendrive();

            }




        }

    }


    public enum Product {
        COMPUTER(5000, 123, 3),
        MOUSE(120, 123, 0),
        KEYBOARD(300, 124, 5),
        MONITOR(600, 125, 0),
        HARDRIVE(800, 126, 0),
        PENDRIVE(30, 127, 0);
        final int prize;
        final int keyProduct;
        int quantity;


        Product(int prize, int keyProduct, int quantity) {
            this.prize = prize;
            this.keyProduct = keyProduct;
            this.quantity = quantity;
        }

    }


}
