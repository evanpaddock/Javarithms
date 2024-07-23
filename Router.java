public class Router {
    public static void RouteMain(String input) {
        switch (input) {
            case "-1":
                System.out.println("\nExiting Program...");
                break;
            case "1":
                input = Menu.Sorts();
                RouteSorts(input);
                break;
            case "2":
                System.out.println("In Binary Search.");
                break;
            default:
                break;
        }
    }

    private static void RouteSorts(String input) {
        switch (input) {
            case "1":
                BubbleSort.Sort();
                break;
            case "2":
                SelectionSort.Sort();
                break;
            default:
                break;
        }
    }
}
