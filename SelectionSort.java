import java.util.Arrays;

public class SelectionSort extends Sort{

    public static void Sort() {
        String arrayType = Menu.GetArrayType();

        var items = Config.arrays.get(arrayType);

        var testItem = items[0];

        System.out.println("Starting list... \n\n" + Arrays.toString(items));

        if(testItem instanceof Integer){
            IntegerSort((Integer []) items);
        }else{
            StringSort((String []) items);
        }

    }

    public static void IntegerSort(Integer [] items) {
        timesRan = 0;

        for (int i = 0; i < items.length - 1; i++) {
            int smallestIndex = i;
            timesRan++;

            for (int j = 0; j < items.length; j++) {
                if(items[smallestIndex] < items[j]){
                    smallestIndex = j;
                }
            }

            if(smallestIndex != i){Swap(i, smallestIndex, items);}
        }
        
        System.out.println("Times ran: " + timesRan + "\nFinal Result: " + items.toString());
    }

    public static void StringSort(String [] items) {
        timesRan = 0;

        for (int i = 0; i < items.length - 1; i++) {
            int smallestIndex = i;
            timesRan++;

            for (int j = 0; j < items.length; j++) {
                if(items[smallestIndex].compareTo(items[j]) > 0){
                    smallestIndex = j;
                }
            }

            if(smallestIndex != i){Swap(i, smallestIndex, items);}
        }
        
        System.out.println("Times ran: " + timesRan + "\nFinal Result: " + items.toString());
    }
}
