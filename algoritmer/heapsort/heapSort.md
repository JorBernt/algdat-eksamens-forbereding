<h1 align="center">HeapSort</h1>

<p style="border: black">
Heapsort er en svært effektiv sorteringsalgoritme, som sorterer in-place.

Time complexity:

| Best       | Avg        | Worst  |
|------------|------------|--------|
| O(nlog(n)) | O(nlog(n)) | O(nlog(n)) |

Space complexity: O(1)

</p>

## Hvordan den fungerer

    Heapsort fungerer ved å "heapify" et array, slik at verdiene ligger sortert i forhold til et 
    minimum/maksimums-tre. 

## Pseudo kode

```
    Heapify(A as array, n as int, i as int)
    {
        max = i
        leftchild = 2i + 1
        rightchild = 2i + 2
        if (leftchild <= n) and (A[i] < A[leftchild])
            max = leftchild
        else
            max = i
        if (rightchild <= n) and (A[max]  > A[rightchild])
            max = rightchild
        if (max != i)
            swap(A[i], A[max])
            Heapify(A, n, max)
        }
        
    Heapsort(A as array)
    {
        n = length(A)
        for i = n/2 downto 1   
            Heapify(A, n ,i)
        
        for i = n downto 2
            exchange A[1] with A[i]
            A.heapsize = A.heapsize - 1
            Heapify(A, i, 0)
}
```
