package quicksort;

import java.util.Comparator;

public class QuickSort {

    public static <T> void quickSort(T[] array, Comparator<T> c) {
        quickSort(array, 0, array.length - 1, c);
    }

    private static <T> void quickSort(T[] array, int left, int right, Comparator<T> c) {
        if(left >= right) return;
        int pivot = partition(array, left, right, (left + right) / 2, c);
        quickSort(array, left, pivot - 1, c);
        quickSort(array, pivot + 1, right, c);
    }

    private static <T> int partition(T[] array, int left, int right, int index, Comparator<T> c) {
        T pivot = array[index];
        swap(array, right, index);
        int lastIndex = right--;
        while (left < right) {
            while (c.compare(array[left], pivot) < 0 && left <= right) left++;
            while (c.compare(array[right], pivot) > 0 && left < right) right--;
            if(left < right)
                swap(array, left++, right--);
        }
        swap(array, left, lastIndex);
        return left;
    }

    private static <T> void swap(T[] array, int from, int to) {
        T temp = array[to];
        array[to] = array[from];
        array[from] = temp;
    }
}
