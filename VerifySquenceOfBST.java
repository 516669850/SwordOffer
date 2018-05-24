package offer;

public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        return isBST(sequence,0,sequence.length-1);
    }
    public boolean isBST(int[] sequence,int left,int right){
        if(left >= right)
            return true;
        int root = sequence[right];
        int i = left;
        while(i < right && sequence[i] < root) i++;
        for(int j = i; j < right; j++){
            if(sequence[j] < root)
                return false;
        }
        return isBST(sequence,left,i-1) && isBST(sequence,i,right-1);
    }
}
