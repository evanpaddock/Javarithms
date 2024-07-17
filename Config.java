import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Config {

    public static Hashtable<String, List<?>> arrays;
    
    public static void init() {
        try {
            File myObj = new File("config.txt");
            Scanner myReader = new Scanner(myObj);

            String data = myReader.nextLine();
            String[] splitData = data.split("#");
            
            List<Integer> arrayOne = Arrays.asList(Stream.of(splitData[0].split(",")).map(Integer::valueOf).toArray(Integer[]::new));

            arrays = new Hashtable<String, List<?>>();
            arrays.put("Integer", arrayOne);
            arrays.put("String", Arrays.asList(splitData[1].split(" ")));
            arrays.put("ValidMainMenuOptions",  Arrays.asList(splitData[2].split(" ")));

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    
}
