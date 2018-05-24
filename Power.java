package offer;

public class Power {
    public double Power(double base, int exponent) {
        if(base == 0 && exponent == 0){
            throw new RuntimeException("0的0次方无意义");
        }else if(exponent == 0){
            return 1;
        }else if(base == 0){
            return 0;
        }

        if(exponent > 0){
            return PowerCore(base,exponent);
        }else{
            return 1 / PowerCore(base,-exponent);
        }
    }
    public static double PowerCore(double base,int exponent){
        if(exponent == 0){
            return 1;
        }
        double result = PowerCore(base,exponent >> 1);
        result *= result;
        if(exponent % 2 == 1){
            return result * base;
        }else{
            return result;
        }
    }
}
