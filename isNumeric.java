package offer;

public class isNumeric {
    public boolean isNumeric(char[] str) {
        try{
            Double.parseDouble(new String(str));
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
