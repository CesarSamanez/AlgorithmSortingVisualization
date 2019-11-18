
public class Hilo extends Thread {

    Thread thread;
    String algoritmo = "";
    int tipoOrdenamiento;
    int size;

    public Hilo(String algoritmo, int tipoOrdenamiento, int size) {
        this.size = size;
        this.algoritmo = algoritmo;
        this.tipoOrdenamiento = tipoOrdenamiento;
        thread = new Thread(this, algoritmo);
    }

    public void run() {
        elige();
    }

    public void elige() {
        if (algoritmo.equalsIgnoreCase("BubbleSort")) {
            BubbleSort myBubble = new BubbleSort(size);
            myBubble.run(tipoOrdenamiento, size);
        } else if (algoritmo.equalsIgnoreCase("HeapSort")) {
            HeapSort myHeapSort = new HeapSort(size);
            myHeapSort.run(tipoOrdenamiento, size);
        } else if (algoritmo.equalsIgnoreCase("InsertionSort")) {
            InsertionSort myInsertionSort = new InsertionSort(size);
            myInsertionSort.run(tipoOrdenamiento, size);
        } else if (algoritmo.equalsIgnoreCase("MergeSort")) {
            MergeSort myMergeSort = new MergeSort(size);
            myMergeSort.run(tipoOrdenamiento, size);
        } else if (algoritmo.equalsIgnoreCase("QuickSort")) {
            QuickSort myQuickSort = new QuickSort(size);
            myQuickSort.run(tipoOrdenamiento, size);
        } else if (algoritmo.equalsIgnoreCase("SelectionSort")) {
            SelectionSort mySelectionSort = new SelectionSort(size);
            mySelectionSort.run(tipoOrdenamiento, size);
        } else if (algoritmo.equalsIgnoreCase("ShellSort")) {
            ShellSort myShellSort = new ShellSort(size);
            myShellSort.run(tipoOrdenamiento, size);
        }
    }
    
}
