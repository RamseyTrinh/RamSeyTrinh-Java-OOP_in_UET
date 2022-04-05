import java.util.List;

public class Week11<T> {
    
    /**
     * method.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    T x = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, x);
                }
            }
        }
        return list;
    }
}
