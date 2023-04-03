public class Main {
    public static void main(String[] args) {
        System.out.print("Add meg a szamossagot: ");
        int n = Integer.parseInt(System.console().readLine());
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Add meg a szamot: ");
            array[i] = Double.parseDouble(System.console().readLine());
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / array.length;

        double[] diffFromAvg = new double[5];
        for (int i = 0; i < array.length; i++) {
            diffFromAvg[i] = Math.abs(avg - array[i]);
        }

        int minIdx = 0;
        for (int i = 1; i < diffFromAvg.length; i++) {
            if (diffFromAvg[minIdx] > diffFromAvg[i]) {
                minIdx = i;
            }
        }

        System.out.println("Avg: " + avg + " nearest: " + array[minIdx]);
    }
}
