package offer;

import java.util.HashMap;

public class FirstAppearingOnce {
    StringBuffer sb = new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch){
        sb.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(map.get(c) == null)
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        for(int i = 0; i < sb.length(); i++){
            if(map.get(sb.charAt(i)) == 1)
                return sb.charAt(i);
        }
        return '#';
    }
}
