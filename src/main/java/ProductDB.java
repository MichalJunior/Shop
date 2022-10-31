import java.util.*;

public class ProductDB {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    HashMap<Product, Integer> availableProducts = new HashMap<>();

    public void printListOfAvailableProducts() {
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
        System.out.println(availableProducts);
        availableProducts.clear();
    }

    public void addProduct() {

        switch (scanner.nextInt()) {
            case 1 -> {
                GUI.askUserForQuantity();
                Product.COMPUTER.quantity += scanner2.nextInt();
                GUI.printAddComputer();
            }
            case 2 -> {
                GUI.askUserForQuantity();
                Product.MOUSE.quantity += scanner2.nextInt();
                GUI.printAddMouse();
            }
            case 3 -> {
                GUI.askUserForQuantity();
                Product.KEYBOARD.quantity += scanner2.nextInt();
                GUI.printAddKeyboard();
            }
            case 4 -> {
                GUI.askUserForQuantity();
                Product.MONITOR.quantity += scanner2.nextInt();
                GUI.printAddMonitor();
            }
            case 5 -> {
                GUI.askUserForQuantity();
                Product.HARDRIVE.quantity += scanner2.nextInt();
                GUI.printAddHardrive();
            }
            case 6 -> {
                GUI.askUserForQuantity();
                Product.PENDRIVE.quantity += scanner2.nextInt();
                GUI.printAddPendrive();
            }
            default -> GUI.printNothingAdded();
        }
    }

    public void buyProduct() {
        Scanner scanner2 = new Scanner(System.in);


        switch (scanner.nextInt()) {
            case 1 -> {
                GUI.askUserForQuantity();
                int quantity = scanner2.nextInt();
                if (quantity <= Product.COMPUTER.quantity) {
                    Product.COMPUTER.quantity -= quantity;
                    GUI.printSuccesfullyBought("computer", quantity, quantity * Product.COMPUTER.prize);
                } else GUI.unsuccesfullyBought();
            }
            case 2 -> {
                GUI.askUserForQuantity();
                int quantity = scanner2.nextInt();
                if (quantity <= Product.MOUSE.quantity) {
                    Product.MOUSE.quantity -= quantity;
                    GUI.printSuccesfullyBought("mouse", quantity, quantity * Product.MOUSE.prize);
                } else GUI.unsuccesfullyBought();
            }
            case 3 -> {
                GUI.askUserForQuantity();
                int quantity = scanner2.nextInt();
                if (quantity <= Product.KEYBOARD.quantity) {
                    Product.KEYBOARD.quantity -= quantity;
                    GUI.printSuccesfullyBought("keyboard", quantity, quantity * Product.KEYBOARD.prize);
                } else GUI.unsuccesfullyBought();
            }
            case 4 -> {
                GUI.askUserForQuantity();
                int quantity = scanner2.nextInt();
                if (quantity <= Product.MONITOR.quantity) {
                    Product.MONITOR.quantity -= quantity;
                    GUI.printSuccesfullyBought("monitor", quantity, quantity * Product.MONITOR.prize);
                } else GUI.unsuccesfullyBought();
            }
            case 5 -> {
                GUI.askUserForQuantity();
                int quantity = scanner2.nextInt();
                if (quantity <= Product.HARDRIVE.quantity) {
                    Product.HARDRIVE.quantity -= quantity;
                    GUI.printSuccesfullyBought("hardrive", quantity, quantity * Product.HARDRIVE.prize);
                } else GUI.unsuccesfullyBought();
            }
            case 6 -> {
                GUI.askUserForQuantity();
                int quantity = scanner2.nextInt();
                if (quantity <= Product.PENDRIVE.quantity) {
                    Product.PENDRIVE.quantity -= quantity;
                    GUI.printSuccesfullyBought("pendrive", quantity, quantity * Product.PENDRIVE.prize);
                } else GUI.unsuccesfullyBought();

            }

            default -> System.out.println("--Wrong credentials--");
        }
    }

    public enum Product {
        COMPUTER(5000, 123, 3),
        MOUSE(120, 123, 0),
        KEYBOARD(300, 124, 5),
        MONITOR(600, 125, 0),
        HARDRIVE(800, 126, 0),
        PENDRIVE(30, 127, 10);
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
