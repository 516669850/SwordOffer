package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        String result = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : numbers){
            list.add(num);
        }
        Collections.sort(list,new Comparator<Integer>(){
            public int compare(Integer str1,Integer str2){
                String s1 = str1 + "" + str2;
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);
            }
        });
        for(int num : list){
            result += num;
        }
        return result;
    }
}
