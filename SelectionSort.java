import java.util.Arrays;

public class SelectionSort extends Sort{

    public static void Sort() {
        BubbleSort.Run(items -> {
            IntegerSort((Integer[]) items);
            return null; // Since IntegerSort returns void, we return null here
        }, items -> {
            StringSort((String[]) items);
            return null; // Similarly, StringSort returns void, so we return null here
        });
    }

    public static void IntegerSort(Integer [] items) {
        timesRan = 0;

        for (int i = 0; i < items.length - 1; i++) {
            int smallestIndex = i;
            timesRan++;

            for (int j = i+1; j < items.length; j++) {
                if(items[smallestIndex] > items[j]){
                    smallestIndex = j;
                }
            }

            if(smallestIndex != i){Swap(i, smallestIndex, items);}
        }
        
        System.out.println("Times ran: " + timesRan + "\nFinal Result: " + Arrays.toString(items));
    }

    public static void StringSort(String [] items) {
        timesRan = 0;

        for (int i = 0; i < items.length - 1; i++) {
            int smallestIndex = i;
            timesRan++;

            for (int j = i+1; j < items.length; j++) {
                if(items[smallestIndex].compareTo(items[j]) > 0){
                    smallestIndex = j;
                }
            }

            if(smallestIndex != i){Swap(i, smallestIndex, items);}
        }
        
        System.out.println("Times ran: " + timesRan + "\nFinal Result: " + Arrays.toString(items));
    }
}
