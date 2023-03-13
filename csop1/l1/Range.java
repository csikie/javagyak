public class Range {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        for (int i = a; i <= b; i++) {
            System.out.println(i/2.0);
        }
    }
}
