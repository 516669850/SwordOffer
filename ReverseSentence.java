package offer;

public class ReverseSentence {
    public String ReverseSentence(String str) {
        int length = str.length();
        if(str.trim().equals(""))
            return str;
        StringBuffer sb = new StringBuffer();
        String[] arr = str.split(" ");
        for(int i = arr.length - 1; i >=0 ; i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        String result = sb.toString();
        return result.substring(0,result.length() - 1);
    }
}
