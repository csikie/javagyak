package util;

import java.util.Arrays;

public class IntVector {
    int[] numbers;

    public IntVector(int[] numbers) {
        this.numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[i] = numbers[i];
        }
        // Arrays.copyOf(numbers, numbers.length);
    }

    public void add(int n) {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] += n;
    }

    public String toString() {
        return Arrays.toString(numbers);
    }
}