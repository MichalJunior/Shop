public class GUI {
    public static void printIntroducing(){
        System.out.println("-----------------Welcome in my virtual shop--------------");
    }
    public static void printMENU() {
        System.out.print("""
                +------MENU-----+
                1.View list of products
                2.Buy product
                3.Exit
                4.Add product
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

    public static void printAddingAnnouncement() {
        System.out.println("-----What product would you add?-----");
    }

    public static void printAddComputer() {
        System.out.println("+++computer added to shop+++");
    }

    public static void printAddMouse() {
        System.out.println("+++mouse added to shop+++");
    }

    public static void printAddKeyboard() {
        System.out.println("+++keyboard added to shop+++");
    }

    public static void printAddMonitor() {
        System.out.println("+++monitor added to shop+++");
    }

    public static void printAddHardrive() {
        System.out.println("+++hardrive added to shop+++");
    }

    public static void printAddPendrive() {
        System.out.println("+++pendrive added to shop+++");
    }

    public static void printNothingAdded() {
        System.out.println("---Nothing added---");
    }


    public static void printBuyAnnouncement() {
        System.out.println("--- what product would you buy? ---");
    }

    public static void printSuccesfullyBought(String nameProduct, int quantity, int result) {
        System.out.println("Successfully Bought " + nameProduct + " x" + quantity + " = " + result + "PLN");
    }
    public static void askUserForQuantity() {
        System.out.print("Number of products?:");
    }
    public static void unsuccesfullyBought(){
        System.out.println("***  -----------  number higher than available  ----------- ***");
    }
}

