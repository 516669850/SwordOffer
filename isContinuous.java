package offer;

public class isContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length != 5)
            return false;
        sort(numbers);
        int numOfZero = 0;
        int inter = 0;
        for(int num : numbers){
            if(num == 0)
                numOfZero++;
        }
        for(int i = numOfZero; i < numbers.length - 1; i++){
            if(numbers[i] == numbers[i + 1])
                return false;
            inter += numbers[i + 1] - numbers[i] - 1;
        }
        if(inter > numOfZero)
            return false;
        return true;
    }
    private void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
