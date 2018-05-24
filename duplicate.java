package offer;

import java.util.HashMap;

public class duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length < 2)
            return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        for(; i < length; i++){
            if(map.get(numbers[i]) == null){
                map.put(numbers[i],1);
            }else{
                duplication[0] = numbers[i];
                return true;
            }
        }
        if(i == length)
            return false;
        return true;
    }
}
