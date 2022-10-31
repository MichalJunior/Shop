import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductDB productDB = new ProductDB();

        GUI.printIntroducing();
        while (true) {
            GUI.printMENU();
            switch (scanner.nextInt()) {
                case 1 ->productDB.printListOfAvailableProducts();
                case 2 -> {
                    GUI.printBuyAnnouncement();
                    GUI.printProductsPanel();
                    productDB.buyProduct();
                }
                case 3 -> {
                    GUI.printAddingAnnouncement();
                    GUI.printProductsPanel();
                    productDB.addProduct();
                }
                case 4 -> System.exit(0);
            }
        }
    }
}




