public class Fibonacci {
    public static int findFibonacci(int n){
        if (n==0) return n;
        int a = 1;
        int b = 1;
        int temp = 1;
        int i = 2;
        while (i < n){
            temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        return temp;
    }
}
