package offer;

import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum {
    public int MoreThanHalfNum(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : array){
            if(map.get(num) != null){
                map.put(num,map.get(num) + 1);
            }else{
                map.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > array.length >> 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}
