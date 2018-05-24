package offer;

public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index < 7) return index;
        int[] arr = new int[index];
        arr[0] = 1;
        int t2 = 0,t3 = 0,t5 = 0;
        for(int i = 1; i < index; i++){
            arr[i] = getMin(arr[t2] << 1,arr[t3] * 3,arr[t5] * 5);
            if(arr[i] == arr[t2] << 1) ++t2;
            if(arr[i] == arr[t3] * 3) ++t3;
            if(arr[i] == arr[t5] * 5) ++t5;
        }
        return arr[index - 1];
    }
    public static int getMin(int num1,int num2,int num3){
        int min;
        if(num1 < num2){
            min = num1;
        }else min = num2;
        if(min > num3) min = num3;
        return min;
    }
}
