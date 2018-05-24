package offer;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length == 1){
            return;
        }
        int sum = array[0];
        for(int i = 1; i < array.length ; i++){
            sum ^= array[i];
        }
        int index = 0;
        for(;index < 32;index++){
            if((sum & (1 << index)) != 0)
                break;
        }
        for(int i = 0; i < array.length ; i++){
            if((array[i] & (1 << index)) == 0)
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }
}
