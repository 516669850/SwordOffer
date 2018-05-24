package offer;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    private ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if(str != null && str.length() > 0){
            helper(str.toCharArray(),0);
            Collections.sort(list);
        }
        return list;
    }
    public void helper(char[] arr,int index){
        if(index == arr.length - 1){
            String val = String.valueOf(arr);
            if(!list.contains(val))
                list.add(val);
        }else{
            for(int i = index; i < arr.length; i++){
                swap(arr,index,i);
                helper(arr,index + 1);
                swap(arr,index,i);
            }
        }
    }
    public void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
