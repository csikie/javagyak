public class Main {
    public static void main(String[] args) {
        System.out.print("N: ");
        int n = Integer.parseInt(System.console().readLine());
        double[] elems = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("number: ");
            elems[i] = Double.parseDouble(System.console().readLine());
        }

        double sum = 0;
        for (int i = 0; i < elems.length; i++) {
            sum += elems[i];
        }
        double avg = sum / elems.length;

        double[] diffFromAvg = new double[n];
        for (int i = 0; i < diffFromAvg.length; i++) {
            diffFromAvg[i] = Math.abs(avg - elems[i]);
        }

        int minIdx = 0;
        for (int i = 1; i < diffFromAvg.length; i++) {
            if (diffFromAvg[minIdx] > diffFromAvg[i]) {
                minIdx = i;
            }
        }

        System.out.println("avg: " + avg + " nearest: " + elems[minIdx]);
    }
}
