import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.stream.Stream;

public class Config {

    public static Hashtable<String, Object []> arrays;
    
    public static void init() {
        try {
            File myObj = new File("config.txt");
            Scanner myReader = new Scanner(myObj);

            String data = myReader.nextLine();
            String[] splitData = data.split("#");
            
            Integer [] arrayOne = Stream.of(splitData[0].split(",")).map(Integer::valueOf).toArray(Integer[]::new);

            arrays = new Hashtable<String, Object []>();
            arrays.put("Integer", arrayOne);
            arrays.put("String", splitData[1].split(" "));
            arrays.put("ValidMainMenuOptions", splitData[2].split(" "));

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    
}
