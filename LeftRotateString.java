package offer;

public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str.length() == 0)
            return "";
        StringBuffer sb = new StringBuffer();
        int length = str.length();
        int factN = n % length;
        sb.append(str.substring(factN,length));
        sb.append(str.substring(0,factN));
        return sb.toString();
    }
}
