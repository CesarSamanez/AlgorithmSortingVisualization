
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

        if (tipoOrdenamiento == 1) {
            //Random
            myInsertion.fillShuffle();
        } else if (tipoOrdenamiento == 2) {
            //Nearly sorted
            myInsertion.fillNearlySorted();
        } else if (tipoOrdenamiento == 3) {
            //Reversa
            myInsertion.fillShuffle();
            myInsertion.reversa();
        } else {
            //Few Unique
            myInsertion.fillRepeatList(data);
        }
        myFrame.add(myInsertion);
        myInsertion.sort(myInsertion.data);

        System.out.println("Insertion Sort");
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
