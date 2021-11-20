<h1 align="center">MergeSort</h1>

<p style="border: black">
MergeSort er en veldig effektiv algoritme for store lister, men er ikke
en in-place sorteringsalgoritme. Den oppretter flere hjelpetabeller.
Den bruker alltid nLog(n) tid, uansett hvordan listen ser ut, da
den gjør de samme stegene uansett.

Time complexity:

| Best       | Avg        | Worst  |
|------------|------------|--------|
| O(nlog(n)) | O(nlog(n)) | O(nlog(n)) |

Space complexity: O(n)

</p>


## Hvordan den fungerer
 
    Mergesort begynne ved å dele opp arrayet i to, også kalle seg selv rekursivt på de to halvdelene.
    Når alle elementene til slutt er delt opp i individuelle element i sub-arrays, så flettes de sammen.
    Når det kun er to individuelle elementer som flettes sammen, settes det minste først.
    Det gjør at når to sub-arrays med størrelse > 1 flettes sammen, er de sortert hver for seg.
    Da kan man flette de sammen ved å bruke samme metode, en peker på hver subarray, og flett det
    minste elementet inn først. Når alt er flettet sammen er arrayet sortert.

## Pseudo kode
    //array b er en tom hjelpetabell, av størrelsen a/2, siden ingen hjelpetabell vil være større en halve
    mergeSort(array a, array b, from, to) {
        //Finn midtpunktet av arrayet
        midPoint = (from + to) / 2
        //Kaller rekursivt på venstre del, deler 
        mergeSort(a, b, from, mid) 
        //Kaller rekursivt på høyre del
        mergeSort(a, b, mid, to)
        //Fletter delene sammen
        merge(a, b, from, midPoint, to)
    }

    merge(array a, array b, from, mid, to) {
        //Intervallet [from, mid) skal kopieres fra a til b, men siden b starter på 0, så må vi finne sluttindeksen til b.
        elementsInLeftArray = mid - from
        copy a[from,mid) to b[0, elementsInLeftArray)
        loop through the elements and insert smallest element first into a
    }
    
