import java.util.ArrayList;

public class Main {

    public static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> data) {
        ArrayList<String> result = new ArrayList<>();

        for (String elem : data) {
            if (!elem.isEmpty() && elem.charAt(0) == elem.charAt(elem.length() - 1)) {
                result.add(elem);
            }
        }

        return result;
    }

    public static ArrayList<String> removeStrDifferBeginningAndEnding(ArrayList<String> data) {
        // (param1, param2) -> { fv torzs }
        // (param1, param2) -> { ... return valami; }
        // (param1, param2) -> param1
        data.removeIf((elem) -> elem.isEmpty() || elem.charAt(0) != elem.charAt(elem.length() - 1));

        return data;
    }

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("java");
        data.add("c++");
        data.add("");
        data.add("ada");
        data.add("javascript");

        System.out.println(getStrSameBeginningAndEnding(data));
        System.out.println(removeStrDifferBeginningAndEnding(data));
    }
}
