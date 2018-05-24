package offer;

public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0)
            return 0;
        int[] arr = new int[index];
        arr[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for(int i = 1;i < index;i++){
            arr[i] = min(arr[index2] * 2,arr[index3] * 3,arr[index5] * 5);
            if(arr[index2] * 2 == arr[i])
                index2++;
            if(arr[index3] * 3 == arr[i])
                index3++;
            if(arr[index5] * 5 == arr[i])
                index5++;
        }
        return arr[index - 1];
    }
    private int min(int num1,int num2,int num3){
        int min = num1 <= num2 ? num1 : num2;
        return min <= num3 ? min : num3;
    }
}
