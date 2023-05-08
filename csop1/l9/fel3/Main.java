import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static void minToFront(ArrayList<Integer> data) {
        Integer min = Collections.min(data);
        data.remove(min);
        data.add(0, min);
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(4, 65, 45, 44, 76, 2, 98, 72));

        System.out.println(data);
        minToFront(data);
        System.out.println(data);
    }
}
