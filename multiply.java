package offer;

public class multiply {
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        int temp = 1;
        B[0] = 1;
        for(int i = 1; i < length; i++){
            B[i] = B[i - 1] * A[i - 1];
        }
        for(int i = length - 1; i >= 0; i--){
            B[i] *= temp;
            temp *= A[i];
        }
        return B;
    }
}
