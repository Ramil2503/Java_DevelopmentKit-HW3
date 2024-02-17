package array_comparator;

public class Main {
    public static void main(String[] args) {
        String[] array1 = new String[] {"aaa", "aavfsdv"};
        String[] array2 = new String[] {"aaa", "adfsf"};

        Double[] array3 = new Double[] {234.0};
        Double[] array4 = new Double[] {234.0, 34534.4};

        System.out.println(ArrayComparator.compareArrays(array1, array2));
        System.out.println(ArrayComparator.compareArrays(array3, array4));
    }
}