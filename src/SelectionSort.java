
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort extends JPanel {

    int data[];
    int selected = 0;
    int xloc = 40, yloc = 490, width = 13;
    long TotalTime = 0;

    public SelectionSort(int size) {
        data = new int[size];
    }

    public void run(int tipoOrdenamiento, int size) {
        JFrame myFrame = new JFrame();
        SelectionSort mySelectionSort = new SelectionSort(size);

        myFrame.setTitle("SelectionSort Algorithm");
        //   myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000, 535);
        myFrame.setVisible(true);
        //    myFrame.setLocationRelativeTo(null);

        mySelectionSort.fill();
        if (tipoOrdenamiento == 2) {
            mySelectionSort.casiOrdenado();
        } else if (tipoOrdenamiento == 3) {
            mySelectionSort.reversa();
        }
        myFrame.add(mySelectionSort);
        mySelectionSort.sort(mySelectionSort.data);
        System.out.println("Selection Sort");
    }

    public void fill() {
        Random random = new Random();
        for (int x = 0; x < data.length - 1; x++) {
            data[x] = random.nextInt(400) + 1;
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

    public void sort(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            int min_idx = i;
            selected = i;
            try {
                Thread.sleep(15);
            } catch (Exception ex) {
            }
            repaint();
            for (int j = i + 1; j < data.length; j++) {
                selected = j;
                if (data[j] < data[min_idx]) {
                    min_idx = j;
                    try {
                        Thread.sleep(15);
                    } catch (Exception ex) {
                    }
                    repaint();
                }
            }

            int temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
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
