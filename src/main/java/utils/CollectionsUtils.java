package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class CollectionsUtils {

    /*
     *   Filtering list of objects
     * */

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList();
        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }


}
