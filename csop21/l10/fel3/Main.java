import java.util.Arrays;

public class Main {
    // lathatosag <T> visszateresi ertek method() {}
    // public <T> void swap(T[] data, int a, int b) {

    // }

    public static <T> void swap(T[] data, int a, int b) {
        T temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    public static void main(String[] args) {
        Integer[] data1 = {1,2,3,4,5};
        Double[] data2 = {1.5,2.5,3.5,4.5,5.5};

        System.out.println(Arrays.toString(data1));
        swap(data1, 0, 1);
        System.out.println(Arrays.toString(data1));

        System.out.println(Arrays.toString(data2));
        swap(data2, 0, 1);
        System.out.println(Arrays.toString(data2));
    }
}
