import java.util.Random;

public class DataGenerator {

    public static final int RANDOM = 0;
    public static final int NEARLY_SORTED = 1;
    public static final int REVERSED = 2;
    public static final int FEW_UNIQUE = 3;

    public static int[] generateData(int n, int type) {

        DataGenerator generator = new DataGenerator();

        int[] data = new int[n];
        switch (type) {
        case RANDOM:
            generator.fillList(data, 1, 1);
            generator.shuffle(data);
            break;
        case NEARLY_SORTED:
            generator.fillList(data, 1, 1);
            generator.shuffleLight(data);
            break;
        case REVERSED:
            generator.fillList(data, n, -1);
            break;
        case FEW_UNIQUE:
            generator.fillRepeatList(data);
            generator.shuffle(data);
            break;
        }
        return data;
    }

    private void fillList(int[] list, int start, int increment) {
        for (int i = 0; i < list.length; i++) {
            list[i] = start;
            start += increment;
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

    private void shuffle(int[] list) {
        Random rnd = new Random();
        int index, aux;
        for (int i = list.length - 1; i > 0; i--) {
            index = rnd.nextInt(i + 1);
            aux = list[index];
            list[index] = list[i];
            list[i] = aux;
        }
    }

    private void shuffleLight(int[] list) {
        Random rnd = new Random();
        int index, aux, range = 3;
        for (int i = list.length - 1; i > 0; i -= range) {
            index = rnd.nextInt(i) + 1;
            aux = list[index];
            list[index] = list[index - 1];
            list[index - 1] = aux;
        }
    }

}