package insertion_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(ArrayList<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            int j = i;
            while (j > 0 && array.get(j) < array.get(j - 1)) {
                Integer temp = array.get(j - 1);
                array.set(j - 1, array.get(j));
                array.set(j, temp);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(11, 2, 3, 9, 5, 6, 21, 54, 6, 5, 8));
        insertionSort(arrayList);
        arrayList.forEach(integer -> System.out.print(integer + "\t"));
    }
}
