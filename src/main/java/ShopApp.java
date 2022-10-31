import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        ProductDB productDB = new ProductDB();

        while (true) {
            GUI.printMENU();
            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println(productDB.viewListOfProducts());
                }
                case 2 -> productDB.buyProduct();
                case 3 -> System.exit(0);
                case 4 -> productDB.addProduct();


            }


        }
    }
}




