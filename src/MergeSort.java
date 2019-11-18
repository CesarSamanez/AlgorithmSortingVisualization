
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class MergeSort extends JPanel {

    int[] data;
    int xloc = 40, yloc = 490, width = 13;
    int selected = 0;
    long TotalTime = 0;

    public MergeSort(int size) {
        data = new int[size];
    }

    public void run(int tipoOrdenamiento, int size) {
        JFrame myFrame = new JFrame();
        MergeSort myClass = new MergeSort(size);

        myFrame.setTitle("MergeSort Algorithm");
        myFrame.setSize(1000, 535);
        myFrame.setVisible(true);
        //     myFrame.setLocationRelativeTo(null);

        myClass.fill();
        if (tipoOrdenamiento == 2) {
            myClass.casiOrdenado();
        } else if (tipoOrdenamiento == 3) {
            myClass.reversa();
        }
        myFrame.add(myClass);
        myClass.mergesort(myClass.data);
        System.out.println("Merge Sort");
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

    public int[] mergesort(int[] data) {
        int i, j, k;
        try {
            Thread.sleep(6);
        } catch (Exception ex) {
        }
        repaint();
        if (data.length > 1) {

            int nElementosIzq = data.length / 2;
            int nElementosDer = data.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElementosDer];

            for (i = 0; i < nElementosIzq; i++) {
                selected = i;
                repaint();
                arregloIzq[i] = data[i];
            }
            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                selected = i;
                repaint();
                arregloDer[i - nElementosIzq] = data[i];
            }
            arregloIzq = mergesort(arregloIzq);
            arregloDer = mergesort(arregloDer);
            i = 0;
            j = 0;
            k = 0;

            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    selected = j;
                    repaint();
                    data[i] = arregloIzq[j];
                    i++;
                    j++;
                    selected = k;
                    repaint();
                    try {
                        Thread.sleep(6);
                    } catch (Exception ex) {
                    }
                    repaint();
                } else {
                    selected = i;
                    repaint();
                    data[i] = arregloDer[k];
                    i++;
                    k++;
                    selected = k;
                    repaint();
                    try {
                        Thread.sleep(6);
                    } catch (Exception ex) {
                    }
                    repaint();
                }

            }

            while (arregloIzq.length != j) {
                selected = i;
                repaint();
                selected = k;
                repaint();
                data[i] = arregloIzq[j];
                i++;
                j++;
                try {
                    Thread.sleep(6);
                } catch (Exception ex) {
                }
                repaint();
            }
            while (arregloDer.length != k) {
                selected = i;
                repaint();
                selected = k;
                repaint();
                data[i] = arregloDer[k];
                i++;
                k++;
                try {
                    Thread.sleep(6);
                } catch (Exception ex) {
                }
                repaint();
            }
        }
        return data;

    }

    public void fill() {
        for (int x = 0; x < data.length - 1; x++) {
            data[x] = (int) (Math.random() * 500) + 1;
            repaint();
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
