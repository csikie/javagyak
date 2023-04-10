/**
 * @author Csiki Erik
 * @version 2.0
 * @since 1.0
 */

public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

    /**
     * <p>Creates a instance of IntegerMatrix.</p>
     * @param rowNum number of rows
     * @param colNum number of cols
     * @param linearData datas in 1D array
     * @throws IllegalArgumentException throw the exception, when rowNum times colNum not equal the linearData's length.
     */
    public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
        if (rowNum*colNum != linearData.length) {
            throw new IllegalArgumentException();
        }

        this.rowNum = rowNum;
        this.colNum = colNum;
        data = new int[rowNum][colNum];

        for (int i = 0; i < linearData.length; i++) {
            int row = i / colNum;
            int col = i % colNum;
            data[row][col] = linearData[i];
        }

    }

    public String toString1() {
        String s = "";
        String rowDelim = "";
        String colDelim = "";

        for (int[] row : data) {
            s += rowDelim;
            rowDelim = ";";
            for (int num : row) {
                s += colDelim;
                colDelim = ",";
                s += num;
            }
            colDelim = "";
        }

        return s;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        String rowDelim = "";
        String colDelim = "";

        for (int[] row : data) {
            s.append(rowDelim);
            rowDelim = ";";
            for (int num : row) {
                s.append(colDelim);
                colDelim = ",";
                s.append(num);
            }
            colDelim = "";
        }

        return s.toString();
    }
}