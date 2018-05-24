package offer;

public class replaceSpace {
    public String replaceSpace(StringBuffer str) {
        int spaceNum = 0;
        int oldLength = str.length();
        for(int i = 0; i < oldLength; i++){
            if(str.charAt(i) == ' ')
                spaceNum++;
        }

        int newLength = oldLength + 2 * spaceNum;
        str.setLength(newLength);
        int newIndex = newLength - 1;

        for(int i = oldLength - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                str.setCharAt(newIndex--,'0');
                str.setCharAt(newIndex--,'2');
                str.setCharAt(newIndex--,'%');
            }else{
                str.setCharAt(newIndex--,str.charAt(i));
            }
        }
        return str.toString();
    }
}
