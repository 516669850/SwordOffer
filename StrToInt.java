package offer;

public class StrToInt {
    public int StrToInt(String str) {
        if(str.equals(""))
            return 0;
        int pre = 1;
        if(str.charAt(0) == '-')
            pre = -1;
        int result = 0;
        int i = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
        for(; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c < 48 || c > 57)
                return 0;
            else
                result = 10 * result + c - 48;
        }
        return pre*result;
    }
}
