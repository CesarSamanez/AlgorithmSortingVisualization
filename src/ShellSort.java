
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class ShellSort extends JPanel {

    int[] data;
    int selected = 0;
    int xloc = 40, yloc = 490, width = 13;
    long TotalTime = 0;

    public ShellSort(int size) {
        data = new int[size];
    }

    public void run(int tipoOrdenamiento, int size) {
        JFrame myFrame = new JFrame();
        ShellSort myShellSort = new ShellSort(size);

        myFrame.setTitle("ShellSort Algorithm");
        //    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000, 535);
        myFrame.setVisible(true);
        //   myFrame.setLocationRelativeTo(null);

        myShellSort.fill();

        if (tipoOrdenamiento == 2) {
            myShellSort.casiOrdenado();
        } else if (tipoOrdenamiento == 3) {
            myShellSort.reversa();
        }
        myFrame.add(myShellSort);
        myShellSort.sort(myShellSort.data);
        System.out.println("Shell Sort");
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

    public void sort(int data[]) {
        for (int intervalo = data.length / 2; intervalo > 0; intervalo /= 2) {
            selected = intervalo;
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            }
            repaint();

            for (int i = intervalo; i < this.data.length; i += 1) {
                selected = i;
                int temp = data[i];
                try {
                    Thread.sleep(10);
                } catch (Exception ex) {
                }
                repaint();

                int j;
                for (j = i; j >= intervalo && data[j - intervalo] > temp; j -= intervalo) {
                    data[j] = data[j - intervalo];

                }
                data[j] = temp;
                selected = j;
                try {
                    Thread.sleep(10);
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
