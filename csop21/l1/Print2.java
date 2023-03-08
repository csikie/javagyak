public class Print2 {
    public static void main(String[] args) {
        int from = Integer.parseInt(System.console().readLine());
        int to = Integer.parseInt(System.console().readLine());

        for (int i = from; i < to; i++) {
            System.out.println(i/2.0);
        }
    }
}
