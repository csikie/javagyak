// row = i / colNum
// col = i % colNum
class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

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