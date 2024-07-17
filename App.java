public class App {
    public static void main(String [] args){
        System.out.println("\n\nStarting...");

        Config.init();
        String input = Menu.Main();
        Router.RouteMain(input);
    }
}
