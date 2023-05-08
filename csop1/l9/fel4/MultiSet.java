import java.util.HashMap;
import java.util.HashSet;

public class MultiSet {
    private HashMap<String, Integer> data;

    public MultiSet() {
        data = new HashMap<>();
    }

    public MultiSet(HashMap<String, Integer> data) {
        this.data = new HashMap<>(data);
    }

    public HashMap<String, Integer> getData() {
        return new HashMap<>(data);
    }

    public void put(String elem) {
        if (data.containsKey(elem)) {
            int mult = data.get(elem);
            data.put(elem, mult+1);
        } else {
            data.put(elem, 1);
        }
    }

    public MultiSet intersect(MultiSet other) {
        HashMap<String, Integer> res = new HashMap<>();

        for (String key : data.keySet()) {
            if (other.data.containsKey(key)) {
                res.put(key, Math.min(data.get(key), other.data.get(key)));
            }
        }

        return new MultiSet(res);
    }

    public String toString() {
        return data.toString();
    }
}
