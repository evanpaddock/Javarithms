import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    static private Integer timesRan;
    static private Boolean sorted;

    @SuppressWarnings("unchecked")
    public static void run() {
        String arrayType = Menu.GetArrayType();

        var items = Config.arrays.get(arrayType);

        var testItem = items.get(0);

        System.out.println("Starting list... \n\n" + items.toString());

        if(testItem instanceof Integer){
            IntegerSort((List<Integer>) items);
        }
        else{
            StringSort((List<String>) items);
        }

    }

    private static void IntegerSort(List<Integer> items) {
        timesRan = 0;
        sorted = false;

        while(!sorted){
            sorted = true;
            for (Integer i = 0; i < items.size()-1; i++) {
                if(items.get(i) > items.get(i+1)){
                    items = (List<Integer>) Swap(i, i+1, items.toArray());
                    sorted=false;
                    timesRan++;
                }
            }
        }
        
        System.out.println("Times ran: " + timesRan + "\nFinal Result: " + items.toString());
    }

    private static void StringSort(List<String> items) {
        timesRan = 0;
        sorted = false;

        while(!sorted){
            sorted = true;
            for (Integer i = 0; i < items.size()-1; i++) {
                if(items.get(i).compareTo(items.get(i+1)) > 0){
                    items = (List<String>) Swap(i, i+1, items.toArray());
                    sorted=false;
                    timesRan++;
                }
            }
        }
        
        System.out.println("Times ran: " + timesRan + "\nFinal Result: " + items.toString());
        
    }

    private static List<?> Swap(Integer smallerIndex, Integer largerIndex, Object[] items){
        var tmp = items[smallerIndex];
        items[smallerIndex] = items[largerIndex];
        items[largerIndex] = tmp;

        return Arrays.asList(items);
    }
}
