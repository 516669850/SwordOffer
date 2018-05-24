package offer;

public class NumberOf1Between1AndN {
    public int NumberOf1Between1AndN(int n) {
    int count = 0;
    for(int i = 1; i <= n; i *= 10){
        int a = n / i;
        int b = n % i;
        count +=  (a + 8) / 10 * i + (a % 10 == 1? (b + 1) : 0);
    }
    return count;
}

}
