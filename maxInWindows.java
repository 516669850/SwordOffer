package offer;

import java.util.ArrayList;

public class maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>();
        if(size <= 0 || num == null || size > num.length)
            return list;
        for(int i = 0; i <= num.length - size; i++){
            int max = num[i];
            for(int j = i + 1; j < i + size; j++){
                if(num[j] > max)
                    max = num[j];
            }
            list.add(max);
        }
        return list;
    }
}
