package offer;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {
    public static int FirstNotRepeatingChar(String str) {
        int length = str.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < length;i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        int pos = -1;
        for(int i = 0;i < length;i++){
            char c = str.charAt(i);
            if(map.get(c) == 1) return i;
        }
        return pos;
    }
    public static void main(String[] args){
        System.out.print(FirstNotRepeatingChar("aac"));
    }
}
