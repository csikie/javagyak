import java.util.HashMap;

public class Bag<T> {
    private HashMap<T, Integer> map;

    public Bag() {
        map = new HashMap<>();
    }

    public void add(T elem) {
        Integer mult = map.get(elem);

        if (mult == null) {
            map.put(elem, 1);
        } else {
            map.put(elem, mult + 1);
        }
    }

    public int countOf(T elem) {
        Integer mult = map.get(elem);

        if (mult == null) {
            return 0;
        }

        return mult;
    }

    public void remove(T elem) throws NotInBagException {
        Integer mult = map.remove(elem);

        if (mult == null) {
            throw new NotInBagException("Elem not present in the bag.");
        }

        if (mult != 1) {
            map.put(elem, mult - 1);
        }
    }

    public String toString() {
        return map.toString();
    }
}
