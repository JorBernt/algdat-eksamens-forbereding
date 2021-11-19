<h1 align="center">Quicksort</h1>

<p style="border: black">
Quicksort er en av de mest effektive sorteringsalgoritmene. Den har ikke den beste best case
kjøretiden, men en av de beste gjennomsnittlig kjøretider.

Time complexity:

| Best       | Avg        | Worst  |
|------------|------------|--------|
| O(nlog(n)) | O(nlog(n)) | O(n^2) |

Space complexity: O(log(n))

</p>


## Hvordan den fungerer
 
    Quicksort bruker partisjonering for å sortere. Partisjonering er å velge en skilleverdi i et array, 
    og flytte alle verdier lavere enn skilleverdien til venstre, og høyere til høyre 
    (eller omvent om det skal sorteres synkende. 
    Deretter dele arrayet i to med skilleverdien som skillepunkt. 

    QuickSort partisjonerer rekursivt på partisjonene, slik at listen til slutt
    er delt opp i 2 verdier som da vil sorteres med den siste skilleverdi flyttingen.
    Når alle partisjonene slåes sammen igjen er da listen sortert.

## Pseudo kode

    quicksort(array, start, end) {
        if(start >= end) return // array er ferdig sortert, avslutt rekursjon
        
        pivot = partition(array, start, (start + end) / 2, end) // Partisjonerer arrayet, og returnerer indeks til pivotverdi

        quicksort(array, start, mid - 1) //Rekursivt kaller med ny partisjon, start til skilleverdi
        quicksort(array, mid + 1, end) //Rekursivt kaller med ny partisjon, skilleverdi til slutten
    }

    partition(array, start, mid, end) {
        pivot = array[mid] // Velger siste verdi som skilleverdi (det er helt valgfritt hvilken indeks)
        swap array[mid] and array[end]
        lastIndex = end--
        while(start < end) {
            while(array[start] < pivot && start <= end) start++
            while(array[end] > pivot && end > start) end--
            swap array[start] and array[end]
        }
        swap array[start] and array[lastIndex] //flytter skilleverdi til indeksen hvor start og end møtes,
                                               //da er skilleverdi på riktig sortert indeks 
        return start //returnerer indeks til skilleverdi
    }
    
