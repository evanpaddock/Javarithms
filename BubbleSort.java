import java.util.Arrays;

public class BubbleSort extends Sort {

    public static void Sort() {
        BubbleSort.Run(items -> {
            IntegerSort((Integer[]) items);
            return null; // Since IntegerSort returns void, we return null here
        }, items -> {
            StringSort((String[]) items);
            return null; // Similarly, StringSort returns void, so we return null here
        });
    }

    private static void IntegerSort(Integer [] items) {
        timesRan = 0;
        sorted = false;

        while(!sorted){
            sorted = true;
            for (int i = 0; i < items.length-1; i++) {
                if(items[i] > items[i+1]){
                    Swap(i, i+1, items);
                    sorted=false;
                    timesRan++;
                }
            }
        }
    
        System.out.println("Times ran: " + timesRan + "\nFinal Result: " + Arrays.toString(items));
    }

    private static void StringSort(String [] items) {
        timesRan = 0;
        sorted = false;

        while(!sorted){
            sorted = true;
            for (Integer i = 0; i < items.length-1; i++) {
                if(items[i].compareTo(items[i+1]) > 0){
                    Swap(i, i+1, items);
                    sorted=false;
                    timesRan++;
                }
            }
        }
        
        System.out.println("Times ran: " + timesRan + "\nFinal Result: " + Arrays.toString(items));
        
    }
}
