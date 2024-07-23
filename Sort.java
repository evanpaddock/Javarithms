import java.util.Arrays;
import java.util.function.Function;

public abstract class Sort {

    public static int timesRan = 0;
    
    public static Boolean sorted = false;

    public static void Run(Function<Integer[], Void> IntegerSort, Function<String[], Void> StringSort) {
        String arrayType = Menu.GetArrayType();

        Object[] items = Config.arrays.get(arrayType);

        System.out.println("Starting list... \n\n" + Arrays.toString(items));

        if(items[0] instanceof Integer){
            IntegerSort.apply(((Integer []) items));
        }else{
            StringSort.apply((String []) items);
        }

    }

    public static void Swap(int unfavoredIndex, int favoredIndex, Object[] items){
        System.out.println(Arrays.toString(items));
        Object temp = items[unfavoredIndex];
        items[unfavoredIndex] = items[favoredIndex];
        items[favoredIndex] = temp;
    }
}
