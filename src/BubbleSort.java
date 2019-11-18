
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

        myBubbleSort.fill();
        if (tipoOrdenamiento == 2) {
            myBubbleSort.casiOrdenado();
        } else if (tipoOrdenamiento == 3) {
            myBubbleSort.reversa();
        }
        myFrame.setTitle("BubbleSort Algorithm");
        //     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000, 535);
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);

        myFrame.add(myBubbleSort);
        myBubbleSort.sort();
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
