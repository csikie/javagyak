import java.util.HashMap;

public class Bag<T> {
    private HashMap<T, Integer> data;

    public Bag() {
        data = new HashMap<>();
    }

    public void add(T elem) {
        Integer mult = data.get(elem);

        if (mult == null) {
            data.put(elem, 1);
        } else {
            data.put(elem, mult + 1);
        }
    }

    public int countOf(T elem) {
        Integer mult = data.get(elem);

        if (mult == null) {
            return 0;
        }

        return mult;
    }

    public void remove(T elem) throws NotInBagException {
        Integer mult = data.remove(elem);

        if (mult == null) {
            throw new NotInBagException("Elem (" + elem + ") is not in the Bag.");
        }

        if (mult != 1) {
            data.put(elem, mult - 1);
        } 
    }

    public String toString() {
        return data.toString();
    }
}
