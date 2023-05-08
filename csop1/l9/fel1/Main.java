import java.util.LinkedList;

class Main {
    public static LinkedList<Integer> divisors(int num) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(divisors(2));
        System.out.println(divisors(7));
        System.out.println(divisors(42));
    }
}