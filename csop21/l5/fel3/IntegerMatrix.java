/**
 * @author NAME
 * @version 2.0
 * @since 1.0
 */

/**
 * <p> Store the 1d array to the matrix.</p>
 * @version 2.0
 * @since 1.0
 */
public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

    /**
     * <p> Create a matrix from the 1D array.</p>
     * @param rowNum number of rows
     * @param colNum number of coloumns
     * @param linearData 1D array
     * @throws IllegalArgumentException asdasd
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
        StringBuilder sb = new StringBuilder();
        String rowDelim = "";
        String colDelim = "";

        for (int[] row : data) {
            sb.append(rowDelim);
            rowDelim = ";";
            for (int num : row) {
                sb.append(colDelim);
                colDelim = ",";
                sb.append(num);
            }
            colDelim = "";
        }

        return sb.toString();
    }
}
