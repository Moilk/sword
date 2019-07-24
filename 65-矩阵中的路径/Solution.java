public class Solution {
    boolean[] isVisited = null;
    
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (matrix == null || matrix.length == 0
            || rows < 1 || cols < 1 ||
            str == null || str.length == 0) {
            return false;
        }
        
        isVisited = new boolean[rows * cols];
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (hasPath(matrix, rows, cols, row, col, str, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean hasPath(char[] matrix, int rows, int cols, int row, int col, char[] str, int start) {
        if (start >= str.length) {
            return true;
        }
        
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return false;
        }

        int pos = row * cols + col;
        boolean ok = false;
        if (matrix[pos] == str[start] && !isVisited[pos]) {
            isVisited[pos] = true;
            ok = hasPath(matrix, rows, cols, row + 1, col, str, start + 1)
                || hasPath(matrix, rows, cols, row - 1, col, str, start + 1)
                || hasPath(matrix, rows, cols, row, col + 1, str, start + 1)
                || hasPath(matrix, rows, cols, row, col - 1, str, start + 1);
            if (!ok) {
                    isVisited[pos] = false;
            }
            return ok;
        }
                
        return false;
    }
}