import java.util.Scanner;

public class RunnerFibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int result = Fibonacci.findFibonacci(i);

        System.out.println("fib(" + i + ") = " + result);
        for (int n = 1; n <= i; n++){
            System.out.println(Fibonacci.findFibonacci(n));
        }
    }
}
