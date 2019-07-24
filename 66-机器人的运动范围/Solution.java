public class Solution {
    private boolean[][] isVisited;
    public int movingCount(int threshold, int rows, int cols)
    {
        if (threshold < 0 || rows < 1 || cols < 1) {
            return 0;
        }
        
        isVisited = new boolean[rows][cols];
        
        return movingCount(threshold, rows, cols, 0, 0);
    }
    
    public int movingCount(int threshold, int rows, int cols, int row, int col) {
        if (row <0 || row >= rows || col < 0 || col >= cols) {
            return 0;
        }
        
        if (!isVisited[row][col]) {
            isVisited[row][col] = true;
            if (sAdd(row, col) <= threshold) {
                return 1 + movingCount(threshold, rows, cols, row + 1, col)
                         + movingCount(threshold, rows, cols, row - 1, col)
                         + movingCount(threshold, rows, cols, row, col + 1)
                         + movingCount(threshold, rows, cols, row, col - 1);
            }
        }
        
        return 0;
    }
    
    public int sAdd(int a, int b) {
        return sSum(a) + sSum(b);
    }
    
    public int sSum(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        
        return sum;
    }
}