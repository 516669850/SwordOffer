package offer;

public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        int high = array.length - 1;
        int low = 0;
        while(low < high){
            int mid = (low + high)>>>1;
            if(array[mid] < array[high]){
                high = mid;
            }else if(array[mid] == array[high]){
                high--;
            }else{
                low = mid + 1;
            }
        }
        return array[low];
    }
}
