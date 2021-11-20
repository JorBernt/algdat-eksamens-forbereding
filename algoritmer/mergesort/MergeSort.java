package mergesort;

public class MergeSort {
    public static void mergeSort(int[] a) {
        int[] b = new int[a.length / 2];    // en hjelpetabell for flettingen
        mergeSort(a, b, 0, a.length);  // kaller metoden over
    }

    private static void mergeSort(int[] a, int[] b, int from, int to) {
        if (to - from <= 1) return;
        int midPoint = (from + to) / 2;
        //Deler arrayet opp i små arrays, for å så å "flette" de sammen igjen sortert.
        mergeSort(a, b, from, midPoint);
        mergeSort(a, b, midPoint, to);
        merge(a, b, from, midPoint, to);
    }

    private static void merge(int[] a, int[] b, int from, int mid, int to) {
        int elementsInLeftArray = mid - from;
        System.arraycopy(a, from, b, 0, elementsInLeftArray); //Kopier elementsInLeftArray fra array a til b
        int i = 0, j = mid, k = from;
        while (i < elementsInLeftArray && j < to)
            a[k++] = b[i] < a[j] ? b[i++] : a[j++]; //Fletter inn elementene fra a og b, velger den minste av de for hver indeks.
        while (i < elementsInLeftArray) a[k++] = b[i++]; //Legger til evt. resterende del av array b.
    }

}
