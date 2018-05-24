package offer;

public class NumberOf1 {
    public int NumberOf1(int n) {
        int result = 0;
        int flag = 1;
        while(flag != 0){
            if((n & flag) != 0){
                result++;
            }
            flag = flag << 1;
        }
        return result;
    }
}
