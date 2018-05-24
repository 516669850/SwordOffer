package offer;

public class Find {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0){
            return false;
        }
        int rows = array.length;
        int cols = array[0].length;
        int i = 0;
        int j = cols-1;

        while(i < rows && j >= 0){
            if(array[i][j] == target){
                return true;
            }
            else if(array[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;

    }
}
