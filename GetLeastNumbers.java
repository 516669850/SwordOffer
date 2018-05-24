package offer;

import java.util.ArrayList;

public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k > input.length)
            return list;
        quickSort(input,0,input.length - 1);
        for(int i = 0; i < k; i++){
            list.add(input[i]);
        }
        return list;
    }
    private void quickSort(int[] arr,int low,int high){
        if(low < high){
            int middle = getMiddle(arr,low,high);
            quickSort(arr,low,middle-1);
            quickSort(arr,middle+1,high);
        }
    }
    private int getMiddle(int[] arr,int low,int high){
        int temp = arr[low];
        while(low < high){
            while(low < high && arr[high] >= temp)
                high--;
            arr[low] = arr[high];
            while(low < high && arr[low] < temp)
                low++;
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
}
