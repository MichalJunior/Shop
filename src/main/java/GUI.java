public class GUI {
    public static void printMENU() {
        System.out.print("""
                -----welcome in my computer shop-----\s
                1.View list of products
                2.Buy product
                3.Exit
                4.Add product
                Insert your choice:\s""");
    }

    public static void printAddingPanel() {
        System.out.print("""
                What product would you add?
                1.computer
                2.mouse
                3.keyboard
                4.monitor
                5.hardrive
                6.pendrive
                Insert your choice:""");
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


}
