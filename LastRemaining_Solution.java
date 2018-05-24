package offer;

import java.util.LinkedList;

public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int index = -1;
        while(list.size() > 1){
            index = (index + m) % list.size();
            list.remove(index--);
        }
        return list.size() == 1 ? list.getFirst() : -1;
    }
}
