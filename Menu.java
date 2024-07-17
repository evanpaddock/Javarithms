import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);

    private static String input = "";

    public static String Main() {
        @SuppressWarnings("unchecked")
        List<String> validMainMenuOptions = (List<String>) Config.arrays.get("ValidMainMenuOptions");

        String[] menuOptions = {"1. Bubble Sort", "2. Binary Search", "-1. Exit"};

        input = MenuTemplate(menuOptions, validMainMenuOptions);
        
        return input;
    }

    public static String GetArrayType() {

        String[] menuOptions = {"1. String", "2. Integer"};

        List<String> validMenuOptions = Arrays.asList("1","2");

        input = MenuTemplate(menuOptions, validMenuOptions);

        switch (input) {
            case "1":
                input = "String";
                break;
            case "2":
                input = "Integer";
                break;
        }

        return input;
    }

    private static String MenuTemplate(String[] menuOptions, List<String> validMenuoptions){
        StringBuilder sbf = new StringBuilder("Please select the number which represents your option.\n\n");
        
        for(String option : menuOptions){
            sbf.append(option + "\n");
        }
        
        do {
            System.out.println(sbf);
            input = sc.nextLine();
        } while (!IsValidInput(input,validMenuoptions));

        return input;
    }

    public static Boolean IsValidInput(String input, List<String> validOptions){
        return validOptions.contains(input);
    }
}
