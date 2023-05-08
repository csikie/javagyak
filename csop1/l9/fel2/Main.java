import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> data) {
        ArrayList<String> res = new ArrayList<>();

        for (String elem : data) {
            if (!elem.isEmpty() && elem.charAt(0) == elem.charAt(elem.length()-1)) {
                res.add(elem);
            }
        }

        return res;
    }

    static void removeStrDifferBeginningAndEnding(ArrayList<String> data) {
        // (param1, ... , param_n) -> { fv torzs }
        // (param1, ... , param_n) -> (...)

        data.removeIf((elem) -> elem.isEmpty() 
            || elem.charAt(0) != elem.charAt(elem.length() - 1));
    }

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("ada");
        data.add("java");
        data.add("python");
        data.add("c++");

        System.out.println(data);
        System.out.println(getStrSameBeginningAndEnding(data));
        removeStrDifferBeginningAndEnding(data);
        System.out.println(data);
    }
}
