import java.util.*;
import java.util.function.BiFunction;

public class ProductDB {
    Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();
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
    }

//  public static Map<Product, Integer> productsAndQuantity = new HashMap<>();

////  ProductDB() {
//   productList.add(Product.COMPUTER);
//   productList.add(Product.MOUSE);

//  }
//    for (Product product : productList) {
//        if (productList.contains(product)) {
//            if (!productsAndQuantity.containsKey(product)) {
//                productsAndQuantity.put(product, product.quantity++);
//            }
//            if (productsAndQuantity.containsKey(product)) {
//
//                productsAndQuantity.compute(product, (key, val)
//                        -> (val == null) ? 1 : val + 1);
//
//            }
//        }
//
//    }
//    public void viewMapOfProducts() {
//        Map<Product, Integer> productsAndQuantity = new HashMap<>();
//        for (Product product:productList) {
//            if(productList.contains(product)){
//
//            }
//
//        }
//
//        System.out.println(productList);
//        System.out.println(productsAndQuantity);
//
//    }

//// public Map<Product, Integer> buyProduct() {

// }

//    public void addProduct() {
//        GUI.printAddingPanel();
//        switch (scanner.nextInt()) {
//            case 1 -> {
//                productList.add(Product.COMPUTER);
//                GUI.printAddComputer();
//            }
//            case 2 -> {
//                productList.add(Product.MOUSE);
//                GUI.printAddMouse();
//            }
//            case 3 -> {
//                productList.add(Product.KEYBOARD);
//                GUI.printAddKeyboard();
//
//            }
//            case 4 -> {
//                productList.add(Product.MONITOR);
//                GUI.printAddMonitor();
//
//            }
//            case 5 -> {
//                productList.add(Product.HARDRIVE);
//                GUI.printAddHardrive();
//
//            }
//            case 6 -> {
//                productList.add(Product.PENDRIVE);
//                GUI.printAddPendrive();
//
//            }
//            default -> GUI.printNothingAdded();
//        }
//
//    }

    public enum Product {
        COMPUTER(5000, 123, 0),
        MOUSE(120, 123, 0),
        KEYBOARD(300, 124, 0),
        MONITOR(600, 125, 0),
        HARDRIVE(800, 126, 0),
        PENDRIVE(30, 127, 0);
        int prize;
        int keyProduct;
        int quantity;


        Product(int prize, int keyProduct, int quantity) {
            this.prize = prize;
            this.keyProduct = keyProduct;
            this.quantity = quantity;
        }

    }


}
