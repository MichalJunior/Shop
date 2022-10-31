import java.util.HashMap;

public class GUI {
    public static void printIntroducing() {
        System.out.println("-----------------Welcome in my virtual shop--------------");
    }

    public static void printMENU() {
        System.out.print("""
                +----------------------------MENU---------------------------+
                1.View list of products
                2.Buy product
                3.Add product
                4.Exit
                Insert your choice:\s""");
    }

    public static void printProductsPanel() {
        System.out.print("""
                1.computer
                2.mouse
                3.keyboard
                4.monitor
                5.hardrive
                6.pendrive
                Insert your choice:""");
    }

    public static void printAvailableProducts(HashMap<ProductDB.Product, Integer> availableProducts) {
        System.out.println("---available products " + availableProducts);
    }

    public static void printAddingAnnouncement() {
        System.out.println("-----What product would you add?-----");
    }

    public static void printAddProductToDB(String product) {
        System.out.println("+++"+product+" added to shop+++");
    }


    public static void printNothingAdded() {
        System.out.println("---Nothing added---");
    }


    public static void printBuyAnnouncement() {
        System.out.println("--- what product would you buy? ---");
    }

    public static void printSuccessfullyBought(String nameProduct, int quantity, int result) {
        System.out.println("Successfully Bought " + nameProduct + " x " + quantity + " = " + result + "PLN");
    }

    public static void askUserForQuantity() {
        System.out.print("Number of products?:");
    }

    public static void unsuccessfullyBought() {
        System.out.println(" -----------  number higher than available,try again ----------- ");
    }


}

