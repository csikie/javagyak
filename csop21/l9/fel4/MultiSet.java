import java.util.HashMap;

public class MultiSet {
    private HashMap<String, Integer> data;

    public MultiSet() {
        data = new HashMap<>();
    }

    public MultiSet(HashMap<String, Integer> data) {
        this.data = new HashMap<>(data);
    }

    public HashMap<String, Integer> getData() {
        // return data;
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
        HashMap<String, Integer> result = new HashMap<>();

        for (String key : data.keySet()) {
            if (other.data.containsKey(key)) {
                result.put(key, Math.min(data.get(key), other.data.get(key)));
            }
        }

        return new MultiSet(result);
    }

    public String toString() {
        return data.toString();
    }
}
