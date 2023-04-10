package util;

import java.util.Arrays;

public class IntVector {
    int[] numbers;

    public IntVector(int[] numbers) {
        this.numbers = numbers;
    }

    public void add(int n) {
        for (int i = 0; i < numbers.length-1; i++)
            numbers[i] += n;
    }

    public String toString() {
        return Arrays.toString(numbers);
    }
}