
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

        if (tipoOrdenamiento == 1) {
            //Random
            myShellSort.fillShuffle();
        } else if (tipoOrdenamiento == 2) {
            //Nearly sorted
            myShellSort.fillNearlySorted();
        } else if (tipoOrdenamiento == 3) {
            //Reversa
            myShellSort.fillShuffle();
            myShellSort.reversa();
        } else {
            //Few Unique
            myShellSort.fillRepeatList(data);
        }
        myFrame.add(myShellSort);
        myShellSort.sort(myShellSort.data);
        System.out.println("Shell Sort");
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
