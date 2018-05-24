package offer;

public class movingCount {
    public int movingCount(int threshold, int rows, int cols){
        boolean[][] visited = new boolean[rows][cols];
        return moving(threshold,rows,cols,0,0,visited);
    }
    public int moving(int threshold,int rows,int cols,int r,int c,boolean[][] visited){
        if(r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || getSum(r) + getSum(c) > threshold)
            return 0;
        visited[r][c] = true;
        return moving(threshold,rows,cols,r-1,c,visited)
                + moving(threshold,rows,cols,r,c-1,visited)
                + moving(threshold,rows,cols,r+1,c,visited)
                + moving(threshold,rows,cols,r,c+1,visited)
                + 1;
    }
    public int getSum(int t){
        int count = 0;
        while(t != 0){
            count += t % 10;
            t /= 10;
        }
        return count;
    }
}
