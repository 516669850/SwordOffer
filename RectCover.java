package offer;

public class RectCover {
    public int RectCover(int target) {
        if(target < 4)
            return target;
        int num1 = 2;
        int num2 = 3;
        int result = 0;
        for(int i = 4; i <= target; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}
