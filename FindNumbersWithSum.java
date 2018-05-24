package offer;

import java.util.ArrayList;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int low = 0;
        int high = array.length - 1;
        while(low < high){
            if(array[low] + array[high] == sum){
                list.add(array[low]);
                list.add(array[high]);
                break;
            }
            else if(array[low] + array[high] < sum)
                low++;
            else
                high--;
        }
        return list;
    }
}
