
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class QuickSort extends JPanel {

    int[] data;
    int selected = 0;
    int xloc = 40, yloc = 490, width = 13;
    long TotalTime = 0;

    public QuickSort(int size) {
        data = new int[size];
    }

    public void run(int tipoOrdenamiento, int size) {
        JFrame myFrame = new JFrame();
        QuickSort myQuickSort = new QuickSort(size);

        myFrame.setTitle("QuickSort Algorithm");
        //   myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000, 535);
        myFrame.setVisible(true);
        //   myFrame.setLocationRelativeTo(null);

        if (tipoOrdenamiento == 1) {
            //Random
            myQuickSort.fillShuffle();
        } else if (tipoOrdenamiento == 2) {
            //Nearly sorted
            myQuickSort.fillNearlySorted();
        } else if (tipoOrdenamiento == 3) {
            //Reversa
            myQuickSort.fillShuffle();
            myQuickSort.reversa();
        } else {
            //Few Unique
            myQuickSort.fillRepeatList(data);
        }
        myFrame.add(myQuickSort);
        myQuickSort.sort(myQuickSort.data, 0, myQuickSort.data.length - 1);
        System.out.println("Quick Sort");
    }

    public void fillShuffle() {

        for (int x = 0; x < data.length; x++) {
            data[x] = (x) * 10 + 1;
        }
        shuffle(data);
    }

    public void shuffle(int[] list) {
        Random rnd = new Random();
        int index, aux;
        for (int i = list.length - 1; i > 0; i--) {
            index = rnd.nextInt(i + 1);
            aux = list[index];
            list[index] = list[i];
            list[i] = aux;
            repaint();
        }
    }

    public void fillNearlySorted() {

        for (int x = 0; x < data.length; x++) {
            data[x] = (x) * 10 + 1;
        }
        shuffleLight(data);
    }

    private void shuffleLight(int[] list) {
        Random rnd = new Random();
        int index, aux, range = 5;
        for (int i = list.length - 1; i > 0; i -= range) {
            index = rnd.nextInt(i) + 1;
            aux = list[index];
            list[index] = list[index - 1];
            list[index - 1] = aux;
        }
    }

    public void reversa() {
        Arrays.sort(data);
        int[] auxReversa = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            auxReversa[i] = data[data.length - i - 1];
        }
        data = auxReversa;
    }

    private void fillRepeatList(int[] list) {
        int range = 4;
        int partial = list.length / range;
        for (int i = 0; i < range; i++) {
            int limit = i == range - 1 ? list.length : partial * (i + 1);
            for (int j = partial * i; j < limit; j++) {
                list[j] = partial * (i + 1);
            }
        }
    }

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        selected = i;
        for (int j = low; j < high; j++) {
            selected = j;
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            try {
                Thread.sleep(7);
            } catch (Exception ex) {
            }

            repaint();
        }
        try {
            Thread.sleep(7);
        } catch (Exception ex) {
        }

        repaint();

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        selected = i + 1;
        arr[i + 1] = arr[high];
        arr[high] = temp;
        try {
            Thread.sleep(7);
        } catch (Exception ex) {
        }

        repaint();
        return i + 1;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(0, 0, 1000, 500);
        draw(g);
    }

    public void draw(Graphics g) {
        for (int x = 0; x < data.length; x++) {
            if (selected == x) {
                g.setColor(Color.blue);
            } else {
                g.setColor(Color.white);
            }
            xloc += width + 1;
            g.fillRect(xloc, yloc - data[x], width, data[x]);
        }
        xloc = 40;
    }

    public void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
			now at right place */
            int pi = partition(arr, low, high);
            selected = pi;
            try {
                Thread.sleep(8);
            } catch (Exception ex) {
            }

            repaint();
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

}
