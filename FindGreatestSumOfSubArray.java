package offer;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int curSum = 0;
        int maxSum = -2147483648;
        for(int num : array){
            if(curSum <= 0)
                curSum = num;
            else
                curSum += num;
            if(curSum > maxSum)
                maxSum = curSum;
        }
        return maxSum;
    }
}
