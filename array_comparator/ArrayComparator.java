package array_comparator;

public class ArrayComparator {
    public static <A, B> boolean compareArrays(A[] array1, B[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1.getClass() != array2.getClass()) {
                return false;
            }
        }
        return true;
    }
}
