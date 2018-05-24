package offer;

import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int low = 1;
        int high = 2;
        int mid = (sum + 1) / 2;
        int sumArr = low + high;
        while(low < mid){
            if(sumArr == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = low; i <= high; i++)
                    list.add(i);
                result.add(list);
            }
            while(sumArr > sum && low < mid){
                sumArr -= low;
                low++;
                if(sumArr == sum){
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int i = low; i <= high; i++)
                        list.add(i);
                    result.add(list);
                }
            }
            high++;
            sumArr += high;
        }
        return result;
    }
}
