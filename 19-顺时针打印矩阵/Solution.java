import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        
        int m = matrix.length;
        if(m == 0)    return ret;
        int n = matrix[0].length;
        if(n == 0)    return ret;
        
        int sx = 0, ex = n - 1, sy = 0, ey = m - 1;
        while(true){
            // 右
            for(int x = sx; x <= ex; x++) {
                ret.add(matrix[sy][x]);
            }
            sy++;
            if(sy > ey)    break;

            // 下
            for(int y = sy; y <= ey; y++){
                ret.add(matrix[y][ex]);
            }
            ex--;
            if(sx > ex)    break;

            // 左
            for(int x = ex; x >= sx; x--) {
                ret.add(matrix[ey][x]);
            }
            ey--;
            if(sy > ey)    break;

            // 上
            for(int y = ey; y >= sy; y--) {
                ret.add(matrix[y][sx]);
            }
            sx++;
            if(sx > ex)    break;
        }
        
        return ret;
    }
}