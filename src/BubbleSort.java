
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class BubbleSort extends JPanel {

    int selected = 0;
    int[] data;
    int xloc = 40, yloc = 490, width = 13;

    public BubbleSort(int size) {
        data = new int[size];
    }

    public void run(int tipoOrdenamiento, int size) {

        JFrame myFrame = new JFrame();
        BubbleSort myBubbleSort = new BubbleSort(size);

        if (tipoOrdenamiento == 1) {
            //Random
            myBubbleSort.Random();
        } else if (tipoOrdenamiento == 2) {
            //Nearly sorted
            myBubbleSort.casiOrdenado();
        } else if (tipoOrdenamiento == 3) {
            //Reversa
            myBubbleSort.Random();
            myBubbleSort.reversa();
        } else {
            //Few Unique
            myBubbleSort.fillRepeatList(data);
        }

        myFrame.setTitle("BubbleSort Algorithm");
        //myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000, 535);
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);

        myFrame.add(myBubbleSort);
        myBubbleSort.sort();
    }

    public void Random() {
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

    public void casiOrdenado() {

        for (int x = 0; x < data.length; x++) {
            data[x] = (x) * 10 + 1;
        }
        shuffleLight(data);
    }

    public void reversa() {
        Arrays.sort(data);
        int[] auxReversa = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            auxReversa[i] = data[data.length - i - 1];
        }
        data = auxReversa;
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

    public void sort() {
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data.length - 1; y++) {
                int tmp = 0;
                int next = y + 1;
                if (data[y] > data[next]) {
                    selected = y;
                    tmp = data[next];
                    data[next] = data[y];
                    data[y] = tmp;
                }
                try {
                    Thread.sleep(30);
                } catch (Exception ex) {
                }

                repaint();
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

}
