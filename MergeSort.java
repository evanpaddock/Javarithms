import java.util.Arrays;
import java.util.function.Function;

public class MergeSort extends Sort{
    public static void Sort() {
        MergeSort.Run(items -> {
            IntegerSort((Integer[]) items, 0, items.length);
            return null;
        }, items -> {
            StringSort((String[]) items, 0, items.length);
            return null;
        });
    }

    private static void IntegerSort(Integer [] items, Integer leftIndex, Integer rightIndex) {
        timesRan = 0;
        
        if(leftIndex < rightIndex){
            timesRan++;
            
            Integer middleIndex = (leftIndex + (rightIndex-1)) /2;

            IntegerSort(items, leftIndex, middleIndex);
            IntegerSort(items, middleIndex + 1, rightIndex);

            Merge(items, leftIndex, middleIndex, rightIndex, args -> {
                if((Integer) args[0] <= (Integer) args[1]){
                    return true;
                }
                return false;
            });

        }
    }

    private static void StringSort(String [] items, Integer leftIndex, Integer rightIndex) {
        timesRan = 0;
        
        if(leftIndex < rightIndex){
            timesRan++;
            
            Integer middleIndex = (leftIndex + (rightIndex-1)) /2;

            StringSort(items, leftIndex, middleIndex);
            StringSort(items, middleIndex + 1, rightIndex);

            Merge(items, leftIndex, middleIndex, rightIndex, args -> {
                if(((String) args[0]).compareTo((String) args[1]) < 0){
                    return true;
                }
                return false;
            });

        }
    }

    private static void Merge(Object[] items, Integer leftIndex, Integer middleIndex, Integer rightIndex, Function<Object[], Boolean> Compare){
        Integer firstArraySize = middleIndex - leftIndex + 1;
        Integer secondArraysize = rightIndex - middleIndex;

        Object [] arrayOne = new Object[firstArraySize];
        Object [] arrayTwo = new Object[secondArraysize];

        for (Integer i = 0; i < firstArraySize; i++) {
            arrayOne[i] = items[leftIndex+i];
        }
        for (Integer i = 0; i < firstArraySize; i++) {
            arrayTwo[i] = items[middleIndex+1+i];
        }

        Integer i = 0, j = 0, k=1;

        while (i < firstArraySize && j < secondArraysize) {
            if (Compare.apply(new Object[]{arrayOne[i], arrayTwo[j]})) {
                items[k] = arrayOne[i];
                i++;
            }
            else {
                items[k] = arrayTwo[j];
                j++;
            }
            k++;
        }

        while (i < firstArraySize) {
            items[k] = arrayOne[i];
            i++;
            k++;
        }
    
        while (j < secondArraysize) {
            items[k] = arrayTwo[j];
            j++;
            k++;
        }

    }

    
}
