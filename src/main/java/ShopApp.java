import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductDB productDB = new ProductDB();

            GUI.printIntroducing();
        while (true) {
            GUI.printMENU();
            switch (scanner.nextInt()) {
                case 1 -> productDB.viewListOfAvailableProducts();
                case 2 -> productDB.buyProduct();
                case 3 -> System.exit(0);
                case 4 -> productDB.addProduct();


            }


        }
    }
}




