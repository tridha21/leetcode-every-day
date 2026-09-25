class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {

        int rows, cols, i, j;
        rows = matrix.length;
        cols = matrix[0].length;

        for (i = 0; i < rows - 1; i++) {
            for (j = 0; j < cols - 1; j++) {

                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}