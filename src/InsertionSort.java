
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class InsertionSort extends JPanel {

    int[] data;
    int selected = 0;
    int xloc = 40, yloc = 490, width = 13;
    long TotalTime = 0;

    public InsertionSort(int size) {
        data = new int[size];
    }

    public void run(int tipoOrdenamiento, int size) {
        JFrame myFrame = new JFrame();
        InsertionSort myInsertion = new InsertionSort(size);

        myFrame.setTitle("InsertionSort Algorithm");
        //   myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000, 535);
        myFrame.setVisible(true);
        //    myFrame.setLocationRelativeTo(null);

        myInsertion.fill();
        if (tipoOrdenamiento == 2) {
            myInsertion.casiOrdenado();
        } else if (tipoOrdenamiento == 3) {
            myInsertion.reversa();
        }
        myFrame.add(myInsertion);
        myInsertion.sort(myInsertion.data);

        System.out.println("Insertion Sort");
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

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            selected = i;
            int key = arr[i];
            int j = i - 1;
            try {
                Thread.sleep(15);
            } catch (Exception ex) {
            }

            repaint();
            while (j >= 0 && arr[j] > key) {
                selected = j;
                arr[j + 1] = arr[j];
                j = j - 1;
                try {
                    Thread.sleep(15);
                } catch (Exception ex) {
                }

                repaint();
            }
            arr[j + 1] = key;
        }
    }

}
