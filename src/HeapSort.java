
import java.util.*;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class HeapSort extends JPanel {

    int[] data;
    int selected = 0;
    int xloc = 40, yloc = 490, width = 13;
    long TotalTime = 0;

    public HeapSort(int size) {
        data = new int[size];
    }

    public void run(int tipoOrdenamiento, int size) {

        JFrame myFrame = new JFrame();
        HeapSort myHeap = new HeapSort(size);

        myFrame.setTitle("HeapSort Algorithm");
        //    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000, 535);
        myFrame.setVisible(true);
        //    myFrame.setLocationRelativeTo(null);

        myHeap.fill();
        if (tipoOrdenamiento == 2) {
            myHeap.casiOrdenado();
        } else if (tipoOrdenamiento == 3) {
            myHeap.reversa();
        }
        myFrame.add(myHeap);
        myHeap.sort(myHeap.data);
        System.out.println("Heap Sort");

    }

    public void fill() {
        Random ran = new Random();
        for (int x = 0; x < data.length - 1; x++) {
            data[x] = ran.nextInt(400) + 1;
            repaint();
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

    public void casiOrdenado() {
        for (int i = 0; i < data.length; i++) {
            if (i == data.length - 1) {
                break;
            }
            if (i % 5 == 0) {
                Arrays.sort(data, i, i + 3);
            }
        }

    }

    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            selected = i;
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            try {
                Thread.sleep(30);
            } catch (Exception ex) {
            }

            repaint();
            heapify(arr, i, 0);
        }
    }

    public void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        if (l < n && arr[l] > arr[largest]) {

            largest = l;
            selected = l;
            try {
                Thread.sleep(30);
            } catch (Exception e) {

            }
            repaint();

        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
            selected = r;
            try {
                Thread.sleep(30);
            } catch (Exception e) {

            }
            repaint();
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
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

}
