## Fragen

#### 1. Implementieren Sie Selection Sort und Quicksort in Python.
- [*Selectionsort*](https://github.com/JohanaHe/Uebungsblatt8/blob/51ff4d79d531e602e2a9e3910b9bb90161204e8e/Selectionsort_Python/SelectionSort.py)
- [*Quicksort*](https://github.com/JohanaHe/Uebungsblatt8/blob/51ff4d79d531e602e2a9e3910b9bb90161204e8e/Quicksort_Python/QuickSort.py)
#### 2. Erläutern Sie kurz die Rolle des Pivot-Elements. Wie wird das Pivot-Element in Ihrer Implementierung gewählt?
Die Laufzeit ist stark von der Wahl des Pivot-Elements abhängig. Das liegt daran, dass die zu sortierende Sequenz durch das Pivot-Element in zwei kleinere zu sortierende Sequenzen eingeteilt wird. Nur wenn diese Aufteilung möglichst gleich erfolgt, kann eine schnellere Laufzeit garantiert werden. 
<br> In unserer Implementierung wird immer das rechteste Element als Privot-Element ausgewählt. Das ist nicht immer die optimale Wahl, jedoch aber einfacher zu programmieren. 

#### 3. Gibt es für Ihre Implementierungen von Selection Sort und Quicksort worst-case Eingaben? Falls ja, welche?
- *Selectionsort:* Eine worst-case Eingabe für diesen Sortieralgorithmus wäre ein Array, das bereits in absteigender Reihenfolge sortiert ist, da wir in aufsteigende Reihenfolge sortieren. Somit müssen am meisten Vertauschungen und Vergleiche erfolgen. 
- *Quicksort:* Dadurch, dass wir immer das rechteste Element der zu sortierenden Sequenz als Pivot-Element wählen, gibt es eine worst-case Eingabe. Diese wäre ein Array, welches beispielsweise bereits aufsteigend oder absteigend sortiert ist. Das heißt, dass wenn das Pivot-Element immer entweder dem kleinsten oder dem größten Element der zu sortierenden Sequenz entspricht, die worst-case Laufzeit herauskommt. 

#### 4. Testen Sie die Korrektheit Ihrer Implementierungen anhand von verschiedenen Testfällen. Erläutern Sie kurz, wie Sie diese Testfälle gewählt haben.
- *Selectionsort:* siehe [Tests für Selectionsort](https://github.com/JohanaHe/Uebungsblatt8/blob/0ac1a5e7019de1b3d1e46408e6b48d92019cd48f/Selectionsort_Python/SelectionSortTest.py)
<br> Die Testfälle decken zum einen die Randfälle ab, dass das Eingabe-Array bereits sortiert ist/nur 1 Element besitzt oder leer ist. Zum anderen gibt es einen weiteren Test, um die Sortierfunktion anhand einer unsortierten Sequenz zu testen. 
- *Quicksort:* siehe [Tests für Quicksort](https://github.com/JohanaHe/Uebungsblatt8/blob/0ac1a5e7019de1b3d1e46408e6b48d92019cd48f/Quicksort_Python/QuickSortTest.py)
<br> Die Testfälle entsprechen den Testfällen für Selectionsort. 
