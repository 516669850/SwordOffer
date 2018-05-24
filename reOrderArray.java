package offer;

import java.util.ArrayList;

public class reOrderArray {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                oddList.add(array[i]);
            }else{
                evenList.add(array[i]);
            }
        }
        int oddListSize = oddList.size();
        int evenListSize = evenList.size();
        if(!oddList.isEmpty()){
            for(int i = 0; i < oddListSize; i++){
                array[i] = oddList.get(i);
            }
        }

        if(!evenList.isEmpty()){
            for(int i = 0; i < evenListSize; i++){
                array[i + oddListSize] = evenList.get(i);
            }
        }
    }
}
