public class Router {
    public static void RouteMain(String input) {
        switch (input) {
            case "-1":
                System.out.println("\nExiting Program...");
                break;
            case "1":
                BubbleSort.run();
                break;
            case "2":
                System.out.println("In Binary Search.");
                break;
            default:
                break;
        }
    }
}
