package offer;

import java.util.ArrayList;

public class printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(start << 1 < rows && start << 1 < cols){
            printCore(matrix,rows,cols,start,list);
            start++;
        }
        return list;
    }
    private void printCore(int[][] matrix,int rows,int cols,int start,ArrayList<Integer> list){
        int endX = cols - 1 - start;
        int endY = rows - 1 - start;

        for(int i = start; i <= endX; i++)
            list.add(matrix[start][i]);
        if(start < endY){
            for(int i = start + 1; i <= endY; i++){
                list.add(matrix[i][endX]);
            }
        }
        if(start < endX && start < endY){
            for(int i = endX - 1; i >= start; i--){
                list.add(matrix[endY][i]);
            }
        }
        if(start < endX && start + 1 < endY){
            for(int i = endY - 1; i > start; i--){
                list.add(matrix[i][start]);
            }
        }
    }
}
