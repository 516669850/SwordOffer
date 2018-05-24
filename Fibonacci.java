package offer;

public class Fibonacci {
    public int Fibonacci(int n) {
        if(n < 2){
            return n;
        }
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        for(int i = 2; i <= n; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}
